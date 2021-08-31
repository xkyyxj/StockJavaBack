package com.serpent.stock.analyzer.intime;

import com.google.gson.Gson;
import com.serpent.stock.analyzer.BaseAnalyzer;
import com.serpent.stock.analyzer.SimulateBuyCallback;
import com.serpent.stock.analyzer.StockCallbackInfo;
import com.serpent.stock.beans.*;
import com.serpent.stock.dto.TimeAnaInfo;
import com.serpent.stock.mapper.FlowUpMapper;
import com.serpent.stock.mapper.NDayUpMapper;
import com.serpent.stock.mapper.SimulateInfoMapper;
import com.serpent.stock.mapper.StockBaseInfoMapper;
import io.netty.util.Timeout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class SimulateBuyAnalyzer extends BaseAnalyzer {

    private final NDayUpMapper nDayUpMapper;
    private final StockBaseInfoMapper baseInfoMapper;
    private SimulateInfoMapper simulateInfoMapper;
    private FlowUpMapper flowUpMapper;
    private final RedisTemplate redisTemplate;
    private final Gson gson;
    private HashMap<String, StockBaseInfo> code2VO;
    private String currDateStr;
    private SimulateBuyCallback simulateBuyCallback;

    public SimulateBuyAnalyzer(NDayUpMapper nDayUpMapper, StockBaseInfoMapper baseInfoMapper, FlowUpMapper flowUpMapper,
                               SimulateInfoMapper simulateInfoMapper, SimulateBuyCallback simulateBuyCallback,
                               @Qualifier("stringRedisTemplate") RedisTemplate redisTemplate, Gson gson) {
        this.nDayUpMapper = nDayUpMapper;
        this.baseInfoMapper = baseInfoMapper;
        this.flowUpMapper = flowUpMapper;
        this.simulateInfoMapper = simulateInfoMapper;
        this.redisTemplate = redisTemplate;
        this.gson = gson;
        code2VO = new HashMap<>();
        this.appendCallback(simulateBuyCallback);

        refreshData();
    }

    public void refreshData() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        currDateStr = format.format(date);
        List<String> tsCodes = new ArrayList<>();
        // 从n_day_up以及flow_up当中选取最新的数据，然后加入到备选当中来
        List<String> days = nDayUpMapper.queryLatestDay("" + 1);
        NDayUpExample example = new NDayUpExample();
        NDayUpExample.Criteria criteria = example.createCriteria();
        criteria.andInDateGreaterThanOrEqualTo(days.get(days.size() - 1));
        List<NDayUp> nDayUps = nDayUpMapper.selectByExample(example);
        if(nDayUps != null && nDayUps.size() > 0) {
            for(NDayUp nDayUp : nDayUps) {
                tsCodes.add(nDayUp.getTsCode());
            }
        }

        FlowUpExample flowUpExample = new FlowUpExample();
        FlowUpExample.Criteria criteria1 = flowUpExample.createCriteria();
        criteria1.andInDateGreaterThanOrEqualTo(days.get(0));
        List<FlowUp> flowUps = flowUpMapper.selectByExample(flowUpExample);
        if(flowUps != null && flowUps.size() > 0) {
            for(FlowUp flowUp : flowUps) {
                tsCodes.add(flowUp.getTsCode());
            }
        }

        List<StockBaseInfo> baseInfos = baseInfoMapper.queryLastDayInfos(tsCodes);
        if(baseInfos != null && baseInfos.size() > 0) {
            for(StockBaseInfo baseInfo : baseInfos) {
                if(baseInfo.getPctChg() > 9.8) {
                    code2VO.put(baseInfo.getTsCode(), baseInfo);
                }
            }
        }
    }

    @Override
    public void run(Timeout timeout) throws Exception {
        System.out.println("simualte buy");
        StockCallbackInfo callbackInfo = new StockCallbackInfo();
        List<StockCallbackInfo.InfoItem> buyItems = new ArrayList<>();
        callbackInfo.setTradeDate(currDateStr);
        // 昨日涨停的，然后今天买入处理一下
        for(String key : code2VO.keySet()) {
            String redisKey = key + "_j";
            String redisContent = (String) redisTemplate.opsForValue().get(redisKey);
            if(!StringUtils.hasText(redisContent)) {
                continue;
            }
            TimeAnaInfo anaInfo = gson.fromJson(redisContent, TimeAnaInfo.class);
            if(anaInfo == null) {
                continue;
            }
            // FIXME -- 如果是上涨或者是开盘价格比较高，买入
            TimeAnaInfo.KeyPoint startPoint = anaInfo.getKey_points().get(0);
            TimeAnaInfo.KeyPoint recentPoint = anaInfo.getKey_points().get(anaInfo.getKey_points().size() - 1);

            StockCallbackInfo.InfoItem item = new StockCallbackInfo.InfoItem();
            item.setCurrPrice(recentPoint.getPrice());
            item.setTsCode(anaInfo.getTs_code());
            if(anaInfo.getDirection() == TimeAnaInfo.UP) {
                item.setInfo("涨停上涨");
                buyItems.add(item);
            } else if(recentPoint.getPrice() > code2VO.get(key).getClose()) {
                item.setInfo("涨停高开");
                buyItems.add(item);
            } else if(recentPoint.getPrice() > code2VO.get(key).getClose() && anaInfo.getDirection() == TimeAnaInfo.UP) {
                item.setInfo("涨停高开上涨");
                buyItems.add(item);
            }
        }
        callbackInfo.setBuyItems(buyItems);

        this.callback(callbackInfo);
        timer.newTimeout(this, 2, TimeUnit.SECONDS);
    }
}
