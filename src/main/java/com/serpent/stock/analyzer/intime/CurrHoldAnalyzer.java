package com.serpent.stock.analyzer.intime;

import com.google.gson.Gson;
import com.serpent.stock.analyzer.BaseAnalyzer;
import com.serpent.stock.analyzer.StockCallbackInfo;
import com.serpent.stock.beans.CurrHold;
import com.serpent.stock.dto.TimeAnaInfo;
import com.serpent.stock.mapper.CurrHoldMapper;
import io.netty.util.Timeout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 当前持仓的实时分析
 */
@Component
public class CurrHoldAnalyzer extends BaseAnalyzer {

    public static final double LAST_RATE = 0.25;

    private List<CurrHold> currHoldList;
    private final RedisTemplate redisTemplate;
    private final Gson gson = new Gson();

    private final CurrHoldMapper holdMapper;

    public CurrHoldAnalyzer(CurrHoldMapper _holdMapper, @Qualifier("stringRedisTemplate") RedisTemplate _redisTemplate) {
        this.redisTemplate = _redisTemplate;
        holdMapper = _holdMapper;
        // TODO
        refreshData();
    }

    /**
     * 刷新需要查询的数据
     */
    private void refreshData() {
        currHoldList = holdMapper.selectCurrHold();
        currHoldList = currHoldList == null ? new ArrayList<>() : currHoldList;
    }

    @Override
    public void run(Timeout timeout) throws Exception {
        boolean hasSomething = false;
        StockCallbackInfo callbackInfo = new StockCallbackInfo();
        for(CurrHold hold : currHoldList) {
//            String redisKey = convertCode2RedisKey(hold.getTsCode());
            String redisKey = hold.getTsCode() + "_j";
            String content = (String) redisTemplate.opsForValue().get(redisKey);
            TimeAnaInfo anaInfo = gson.fromJson(content, TimeAnaInfo.class);
            if(downToDead(hold, anaInfo) == SOLD) {
                StockCallbackInfo.InfoItem item = new StockCallbackInfo.InfoItem();
                item.setTsCode(hold.getTsCode());
                item.setCurrPrice(anaInfo.getKey_points().get(anaInfo.getKey_points().size() - 1).getPrice());
                item.setWinPct((item.getCurrPrice() - hold.getHoldPrice()) / hold.getHoldPrice());
                callbackInfo.getInfos().add(item);
                hasSomething = true;
            }
        }

        if(hasSomething) {
            callback(callbackInfo);
        }
        timer.newTimeout(this, 2, TimeUnit.SECONDS);
    }

    /**
     * 当价格当处于下跌走势的时候我们应该怎么处理
     */
    private void downRule(CurrHold holdInfo, TimeAnaInfo anaInfo) {

    }

    /**
     * 当处于下降走势并且跌落到了不能忍受的地步的时候，我们就可以考虑迈出了
     * @param holdInfo
     * @param anaInfo
     */
    private int downToDead(CurrHold holdInfo, TimeAnaInfo anaInfo) {
        if(anaInfo == null) {
            return HOLD;
        }
        double maxWinRate = holdInfo.getMaxWinPct();
        List<TimeAnaInfo.KeyPoint> points = anaInfo.getKey_points();
        double lastPrice = points.get(points.size() - 1).getPrice();
        double curr_win_rate = (lastPrice - holdInfo.getHoldPrice()) / holdInfo.getHoldPrice();
        // 如果是盈利比最高的盈利还高，那么就不管了,证明正在赚钱
        if(curr_win_rate > maxWinRate) {
            return HOLD;
        }

        // 当前盈利的百分比相比于最高回落了多少
        double downRate = (maxWinRate - curr_win_rate) / maxWinRate;
        if(downRate > LAST_RATE) {
            return SOLD;
        }

        return HOLD;
    }
}
