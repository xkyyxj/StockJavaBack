package com.serpent.stock.calculator;

import com.serpent.stock.beans.FlowUp;
import com.serpent.stock.beans.StockBaseInfo;
import com.serpent.stock.mapper.EmaValueMapper;
import com.serpent.stock.mapper.FlowUpMapper;
import com.serpent.stock.mapper.StockBaseInfoMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 从长久的横盘过程当中醒过来的股票，类似于002006这只股于2021年的走势
 * 大致思路：
 * 1. 在很长一段时间内（规定一下），股票的最高价和最低价之间的差距顶多有多少（比如：（最高价-最低价）/最低价不超过10%）
 * 2. 股票突破了以往的最高价，然后后面还是上涨的走势，可以考虑了
 * 3. 多少比例内的交易日的盈利百分比的绝对值在4%以内。
 * 3. 这种如果都类似于002006的话，那么应该有一个启动的过程，我们可以主要把握住“主浪”
 *
 * Important -- 可以作为长期持仓的一个判定
 *
 * Important && TODO -- 似乎不太合适，因为在大幅上涨之前的话，其实涨跌幅波动幅度也是比较大的，所以我们这样看：
 * 当前价格突破了多少天的历史最高价，以此作为OK的标志。突破的天数越多，那么就越OK
 */
@Component
public class LongSleepWakeCalculator implements ICalculator {

    public static final int MAX_NUM = 400;
    public static final int LIMIT_NUM = 60;
    // TODO -- 这样的分析是否会有问题？
    public static final int ANA_NUMBER = 200;
    public static final double LIMIT_WIN_PCT = 0.04;

    @Resource
    private StockBaseInfoMapper baseInfoMapper;
    @Resource
    private EmaValueMapper emaValueMapper;
    @Resource
    private FlowUpMapper flowUpMapper;

    @Override
    public void calculate(String ts_code) {
        nextVersionCalculate(ts_code);
    }

    public void preVersionCalculate(String ts_code) {
        // TODO -- finish it!!
        List<StockBaseInfo> allInfos = baseInfoMapper.queryLastFewDayInfo(ts_code, ANA_NUMBER);
        if(allInfos == null || allInfos.size() == 0) {
            return;
        }

        int exceedLimitNum = 0;
        double minPrice = Double.MAX_VALUE, maxPrice = 0, sumPrice = 0;
        for(StockBaseInfo baseInfo : allInfos) {
            if(Math.abs(baseInfo.getPctChg()) > LIMIT_WIN_PCT) {
                ++exceedLimitNum;
            }
            sumPrice += baseInfo.getClose();
            maxPrice = Math.max(maxPrice, baseInfo.getClose());
            minPrice = Math.max(minPrice, baseInfo.getClose());
        }
        // 判定是否超过最大值
        double deltaPct = (maxPrice - minPrice) / maxPrice;
        if(deltaPct > 0.1) {
            return;
        }
        double exceedPct = (double)exceedLimitNum / allInfos.size();
        if(exceedPct > 0.08) {
            return;
        }

        // 即当前价格相比于横盘过程价格的平均值，是否有了10%的突破
        double avePrice = sumPrice / allInfos.size();
        double pct = (allInfos.get(0).getClose() - avePrice) / avePrice;
        if(pct > 0.01) {
            // TODO -- 将结果插入到数据库当中
        }
    }

    // 当前价格突破了多少天的历史最高价，以此作为OK的标志。突破的天数越多，那么就越OK
    public void nextVersionCalculate(String ts_code) {
        List<StockBaseInfo> allInfos = baseInfoMapper.queryLastFewDayInfo(ts_code, MAX_NUM);
        if(allInfos == null || allInfos.size() == 0) {
            return;
        }
        StockBaseInfo info = allInfos.remove(0);
        double startClose = info.getClose();
        int lowDays = 0;
        for(StockBaseInfo baseInfo : allInfos) {
            if(baseInfo.getClose() < startClose) {
                ++lowDays;
            } else {
                break;
            }
        }

        // 如果符合要求，插入到数据库当中去
        if(lowDays >= LIMIT_NUM) {
            FlowUp flowUp = new FlowUp();
            flowUp.setTsCode(ts_code);
            flowUp.setFlowDays(lowDays);
            flowUp.setInPrice(startClose);
            flowUp.setInDate(info.getTradeDate());
            flowUpMapper.insert(flowUp);
        }
    }
}
