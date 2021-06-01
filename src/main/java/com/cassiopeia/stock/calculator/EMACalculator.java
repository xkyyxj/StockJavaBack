package com.cassiopeia.stock.calculator;

import com.cassiopeia.stock.beans.EmaValue;
import com.cassiopeia.stock.beans.EmaValueExample;
import com.cassiopeia.stock.beans.StockBaseInfo;
import com.cassiopeia.stock.beans.StockBaseInfoExample;
import com.cassiopeia.stock.mapper.EmaValueMapper;
import com.cassiopeia.stock.mapper.StockBaseInfoMapper;
import com.cassiopeia.stock.utils.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class EMACalculator implements Runnable {

    private ConcurrentLinkedQueue<StockBaseInfo> queue;

    public EMACalculator(ConcurrentLinkedQueue<StockBaseInfo> baseInfos) {
        this.queue = baseInfos;
    }

    private static final int[] EMA_FIELD = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 35, 40, 45, 50, 55, 60};

    public static void calculate(StockBaseInfo baseInfo, EmaValue emaValue) {
        List<StockBaseInfo> baseInfos = new ArrayList<>();
        StockBaseInfoMapper mapper = (StockBaseInfoMapper) BeanUtils.getBeanByName("stockBaseInfoMapper");
        EmaValue retValue = new EmaValue();
        retValue.setTsCode(baseInfo.getTsCode());
        retValue.setTradeDate(baseInfo.getTradeDate());
        for(int field : EMA_FIELD) {
            Double value = calculateField(baseInfo, emaValue, field, mapper, baseInfos);
            retValue.setEmaValue(field, value);
        }
    }

    private static Double calculateField(StockBaseInfo baseInfo, EmaValue emaValue, int field, StockBaseInfoMapper mapper, List<StockBaseInfo> baseInfos) {
        if(emaValue == null || emaValue.getEmaValue(field) == null) {
            // 没有值，特殊计算
            if(baseInfos.size() == 0) {
                StockBaseInfoExample example = new StockBaseInfoExample();
                StockBaseInfoExample.Criteria criteria = example.createCriteria();
                ArrayList<String> values = new ArrayList<>();
                values.add(baseInfo.getTsCode());
                criteria.andTsCodeIn(values);
                List<StockBaseInfo> tempBaseInfo = mapper.selectByExample(example);
                if(tempBaseInfo != null && tempBaseInfo.size() > 0) {
                    baseInfos.addAll(tempBaseInfo);
                }
            }
            if(baseInfos.size() < field) {
                return null;
            } else {
                double sumVal = baseInfos.stream().mapToDouble(StockBaseInfo::getClose).sum();
                return sumVal / field;
            }

        } else {
            return (emaValue.getEmaValue(field) * (field + 1) + baseInfo.getClose() * 2) / (field + 1);
        }
    }

    @Override
    public void run() {
        StockBaseInfo baseInfo = null;
        while(!Thread.currentThread().isInterrupted() || !queue.isEmpty()) {
            baseInfo= queue.poll();
            if(baseInfo == null) {
                continue;
            }
            // 查询最后的EmaValue
            EmaValueMapper emaMapper = (EmaValueMapper) BeanUtils.getBeanByName("emaValueMapper");
            EmaValueExample example = new EmaValueExample();
            EmaValueExample.Criteria criteria = example.createCriteria();
            criteria.andTsCodeEqualTo(baseInfo.getTsCode());
            criteria.limitCount(1);
            List<EmaValue> retValue = emaMapper.selectByExample(example);
            calculate(baseInfo, retValue != null && retValue.size() > 0 ? retValue.get(0) : null);
        }
    }
}
