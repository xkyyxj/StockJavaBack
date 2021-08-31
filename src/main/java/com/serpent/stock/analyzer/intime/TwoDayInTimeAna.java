package com.serpent.stock.analyzer.intime;

import com.google.gson.Gson;
import com.serpent.stock.analyzer.BaseAnalyzer;
import com.serpent.stock.analyzer.SimulateBuyCallback;
import com.serpent.stock.analyzer.StockCallbackInfo;
import com.serpent.stock.beans.NDayUp;
import com.serpent.stock.beans.NDayUpExample;
import com.serpent.stock.beans.StockBaseInfo;
import com.serpent.stock.beans.StockBaseInfoExample;
import com.serpent.stock.dto.TimeAnaInfo;
import com.serpent.stock.mapper.NDayUpMapper;
import com.serpent.stock.mapper.StockBaseInfoMapper;
import io.netty.util.Timeout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 两日上涨的股票的额实时分析，根据上涨的顺序，然后确定是否可以买入
 */
@Component
public class TwoDayInTimeAna extends BaseAnalyzer {

    public static final String DEFAULT_ANA_DAYS = "3";

    private final NDayUpMapper nDayUpMapper;
    private final StockBaseInfoMapper baseInfoMapper;
    private final RedisTemplate redisTemplate;
    private final Gson gson;

    private List<NDayUp> nDayUps;
    private HashMap<String, NDayUp> tsCodeMap;
    private HashMap<String, List<StockBaseInfo>> baseInfos;
    private String beginDate; // 分析的开始日期

    public TwoDayInTimeAna(NDayUpMapper nDayUpMapper, StockBaseInfoMapper baseInfoMapper,
                           SimulateBuyCallback simulateBuy,
                           @Qualifier("stringRedisTemplate") RedisTemplate _redisTemplate) {
        tsCodeMap = new HashMap<>();
        this.nDayUpMapper = nDayUpMapper;
        this.baseInfoMapper = baseInfoMapper;
        redisTemplate = _redisTemplate;
        gson = new Gson();

        // 增加回调函数
        // appendCallback(simulateBuy);

        baseInfos = new HashMap<>();
        refreshData();
    }

    // 刷新数据(目前可以分析最近三天的情况)
    private void refreshData() {
        List<String> days = nDayUpMapper.queryLatestDay(DEFAULT_ANA_DAYS);
        if(days == null || days.size() == 0) {
            throw new RuntimeException("N天上涨没有数据，是不是忘了执行程序了？");
        }
        NDayUpExample example = new NDayUpExample();
        NDayUpExample.Criteria criteria = example.createCriteria();
        criteria.andInDateGreaterThanOrEqualTo(days.get(days.size() - 1));
        nDayUps = nDayUpMapper.selectByExample(example);
        // 做下排序操作（涨幅越高index越小）
        nDayUps.sort((NDayUp one, NDayUp two) -> {
            if(one.getFiveDayPct() == two.getFiveDayPct()) {
                return 0;
            }
            return one.getFiveDayPct() > two.getFiveDayPct() ? 1 : -1;
        });
        beginDate = days.get(days.size() - 1);
        // TODO -- finish Map
    }

    @Override
    public void run(Timeout timeout) throws Exception {
        StockCallbackInfo callbackInfo = new StockCallbackInfo();
        List<StockCallbackInfo.InfoItem> buyItems = new ArrayList<>();
        //TreeSet<AnalyzeResult> needBuyStocks = new TreeSet<>();
        // 第一步：从redis当中取出相关的实时分析结果
        for(NDayUp nDayUp : nDayUps) {
            String redisKey = nDayUp.getTsCode() + "_j";
            String redisContent = (String) redisTemplate.opsForValue().get(redisKey);
            if(!StringUtils.hasText(redisContent)) {
                continue;
            }
            TimeAnaInfo anaInfo = gson.fromJson(redisContent, TimeAnaInfo.class);
            AnalyzeResult analyzeResult = upStock(anaInfo);
            if(analyzeResult.suggestType == BUY) {
                //needBuyStocks.add(analyzeResult);

                List<TimeAnaInfo.KeyPoint> keyPoints = anaInfo.getKey_points();
                StockCallbackInfo.InfoItem ret = new StockCallbackInfo.InfoItem();
                ret.setTsCode(analyzeResult.tsCode);
                ret.setCurrPrice(keyPoints.get(keyPoints.size() - 1).getPrice());
                ret.setWinPct(keyPoints.get(keyPoints.size() - 1).getWin_pct());
                ret.setInfo("From Two Day Ana");
                buyItems.add(ret);
            }
        }

        callbackInfo.setBuyItems(buyItems);
        callback(callbackInfo);

        // 从中挑选前十只输出到界面上去？
        timer.newTimeout(this, 2, TimeUnit.SECONDS);
    }

    private AnalyzeResult upStock(TimeAnaInfo anaInfo) {
        AnalyzeResult result = new AnalyzeResult();
        result.suggestType = NOTHING;
        String tsCode = anaInfo.getTs_code();
        result.tsCode = tsCode;
        List<StockBaseInfo> tempBaseInfo = baseInfos.get(tsCode);
        if(tempBaseInfo == null) {
            tempBaseInfo = queryStockBaseInfo(tsCode, beginDate);
            baseInfos.put(tsCode, tempBaseInfo);
        }

        // 查看是否是上涨状态，然后做出判定是否买入
        List<TimeAnaInfo.KeyPoint> keyPoints = anaInfo.getKey_points();
        if(keyPoints == null || keyPoints.size() == 0) {
            return result;
        }

        double minWinPct = Double.MAX_VALUE;
        double maxWinPct = Double.MIN_VALUE;
        for(TimeAnaInfo.KeyPoint point : keyPoints) {
            minWinPct = Math.min(point.getWin_pct(), minWinPct);
            maxWinPct = Math.max(point.getWin_pct(), maxWinPct);
        }

        // 最后一个转折点的情况如何
        TimeAnaInfo.KeyPoint lastPoint = keyPoints.get(keyPoints.size() - 1);
        double lastWinPct = lastPoint.getWin_pct();
        if(lastWinPct <= minWinPct) {
            return result;
        }

        if(lastWinPct > minWinPct && anaInfo.getDirection() == TimeAnaInfo.UP) {
            result.suggestType = BUY;
            return result;
        }
        return result;
    }

    private void downStock() {

    }

    // ------------------------ 辅助函数 ---------------------------------------------
    private List<StockBaseInfo> queryStockBaseInfo(String tsCode, String beginDate) {
        StockBaseInfoExample example = new StockBaseInfoExample();
        StockBaseInfoExample.Criteria criteria = example.createCriteria();
        criteria.andTsCodeEqualTo(tsCode);
        criteria.andTradeDateGreaterThanOrEqualTo(beginDate);
        return baseInfoMapper.selectByExample(example);
    }
}
