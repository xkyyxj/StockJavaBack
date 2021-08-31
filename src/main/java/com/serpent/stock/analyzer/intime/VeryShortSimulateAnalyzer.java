package com.serpent.stock.analyzer.intime;

import com.google.gson.Gson;
import com.serpent.stock.analyzer.BaseAnalyzer;
import com.serpent.stock.beans.StockList;
import com.serpent.stock.beans.StockListExample;
import com.serpent.stock.beans.VeryShortSimulate;
import com.serpent.stock.dto.TimeAnaInfo;
import com.serpent.stock.mapper.CurrHoldMapper;
import com.serpent.stock.mapper.StockListMapper;
import com.serpent.stock.mapper.VeryShortSimulateMapper;
import com.serpent.stock.utils.DateUtils;
import io.netty.util.Timeout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 基本逻辑如下：
 * 如果是下跌了超过了百分之1的话，那么考虑卖出，但是这只股票是值得长期持有的，只不过是今天他会下跌，我不想损失那部分钱而已
 * 当它开始重新上涨的时候，我会重新买入它
 */
@Component
public class VeryShortSimulateAnalyzer extends BaseAnalyzer {

    public static final double DOWN_SOLD_PCT = 0.01; // 高位下跌了1%，那么就卖出了
    public static final double UP_BUY_PCT = 0.01; // 低位上涨了超过0.5%，那么就买入

    private List<String> tsCodes = new ArrayList<>();
    // TODO -- 因此，只买一次就好了，如果今天买过了，就不要操作了，不然的话，没那么些钱啊
    private HashMap<String, List<VeryShortSimulate>> holdInfos = new HashMap<>();
    private HashMap<String, Boolean> alreadyBuyFlag = new HashMap<>();

    private final VeryShortSimulateMapper simulateMapper;
    private final CurrHoldMapper currHoldMapper;
    private final RedisTemplate redisTemplate;
    private final StockListMapper listMapper;
    private final Gson gson;

    public VeryShortSimulateAnalyzer(VeryShortSimulateMapper simulateMapper, CurrHoldMapper currHoldMapper,
                                     @Qualifier("stringRedisTemplate") RedisTemplate redisTemplate,
                                     StockListMapper listMapper) {
        this.simulateMapper = simulateMapper;
        this.currHoldMapper = currHoldMapper;
        this.redisTemplate = redisTemplate;
        this.listMapper = listMapper;
        this.gson = new Gson();
        refreshData();
    }

    public void refreshData() {
        // 查询昨天的买入信息
        Date date = new Date();
        date = DateUtils.getPreDay(date);
        String dateStr = DateUtils.formatDate("yyyyMMdd", date);
        List<VeryShortSimulate> infos = simulateMapper.queryBeforeNoSoldInfos(dateStr);
        if(infos == null) {
            return;
        }

        StockListExample listExample = new StockListExample();
        StockListExample.Criteria criteria = listExample.createCriteria();
        List<String> inMarket = new ArrayList<>();
        inMarket.add("主板");
        inMarket.add("中小板");
        criteria.andMarketIn(inMarket);
        List<StockList> retList = listMapper.selectByExample(listExample);
        for(StockList listItem : retList) {
            tsCodes.add(listItem.getTsCode());
        }

        /*for(VeryShortSimulate info : infos) {
            String tsCode = info.getTsCode();
            List<VeryShortSimulate> tempList = holdInfos.get(tsCode);
            if(tempList == null) {
                tempList = new ArrayList<>();
                holdInfos.put(tsCode, tempList);
            }
            tempList.add(info);
            if(!tsCodes.contains(tsCode)) {
                tsCodes.add(tsCode);
            }
        }

        // 查询所有的需要考虑的TsCode
        List<CurrHold> holdInfos = currHoldMapper.selectCurrHold();
        if(holdInfos == null) {
            return;
        }

        for(CurrHold hold : holdInfos) {
            if(!tsCodes.contains(hold.getTsCode())) {
                tsCodes.add(hold.getTsCode());
            }
        }*/
    }

    @Override
    public void run(Timeout timeout) throws Exception {
        for(String tsCode : tsCodes) {
            String redisKey = tsCode + "_j";
            String redisContent = (String) redisTemplate.opsForValue().get(redisKey);
            if(!StringUtils.hasText(redisContent)) {
                continue;
            }
            TimeAnaInfo anaInfo = gson.fromJson(redisContent, TimeAnaInfo.class);
            // 如果是从高位开始下跌了，那么就卖出好了，顺带计算一下百分比
            List<TimeAnaInfo.KeyPoint> keyPoints = anaInfo.getKey_points();
            if(keyPoints == null || keyPoints.size() == 0) {
                continue;
            }

            double maxPrice = Double.MIN_VALUE, minPrice = Double.MAX_VALUE;
            for(TimeAnaInfo.KeyPoint point : keyPoints) {
                maxPrice = Math.max(maxPrice, point.getPrice());
                minPrice = Math.min(minPrice, point.getPrice());
            }

            TimeAnaInfo.KeyPoint latestInfo = keyPoints.get(keyPoints.size() - 1);
            double latestPrice = keyPoints.get(keyPoints.size() - 1).getPrice();
            if(latestInfo.getType() == TimeAnaInfo.DOWN) {
                double winPct = (latestPrice - maxPrice) / maxPrice;
                if(winPct < 0 && Math.abs(winPct) >= DOWN_SOLD_PCT) {
                    soldStock(tsCode, latestInfo);
                }
            } else if(latestInfo.getType() == TimeAnaInfo.UP) {
                double winPct = (latestPrice - minPrice) / minPrice;
                if(winPct >= UP_BUY_PCT) {
                    buyStock(tsCode, latestInfo);
                }
            }
        }
        timer.newTimeout(this, 2, TimeUnit.SECONDS);
    }

    /**
     * 卖出操作
     * @param tsCode
     * @param latestInfo
     */
    private void soldStock(String tsCode, TimeAnaInfo.KeyPoint latestInfo) {
        List<VeryShortSimulate> stocks = holdInfos.get(tsCode);
        if(stocks == null) {
            return;
        }

        for(VeryShortSimulate stock : stocks) {
            double inPrice = stock.getInPrice();
            double winPct = (latestInfo.getPrice() - inPrice) / inPrice;
            stock.setWinPct(winPct);
            stock.setOutPrice(latestInfo.getPrice());
            stock.setOutTime(latestInfo.getTime());
            simulateMapper.updateByPrimaryKeySelective(stock);
        }
    }

    /**
     * 买入股票
     * @param tsCode
     * @param latestInfo
     */
    private void buyStock(String tsCode, TimeAnaInfo.KeyPoint latestInfo) {
        if(alreadyBuyFlag.getOrDefault(tsCode, false)) {
            return;
        }
        VeryShortSimulate info = new VeryShortSimulate();
        info.setInPrice(latestInfo.getPrice());
        info.setInTime(latestInfo.getTime());
        info.setTsCode(tsCode);
        simulateMapper.insert(info);
        alreadyBuyFlag.put(tsCode, true);
    }
}
