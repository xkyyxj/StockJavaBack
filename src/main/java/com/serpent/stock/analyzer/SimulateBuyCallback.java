package com.serpent.stock.analyzer;

import com.serpent.stock.beans.SimulateInfo;
import com.serpent.stock.mapper.SimulateInfoMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;

/**
 * 模拟买入程序，将程序发出的买入信号记录到数据库当中
 * 定期分析程序的买入信号是否真的盈利，盈利百分比
 * Important 原来才知道Component注解默认是单例的
 */
@Component
public class SimulateBuyCallback implements StockCallback {

    private final SimulateInfoMapper simulateInfoMapper;
    // TODO -- 在考虑不要重复买入，但是似乎也不是不行，后面再看吧，暂时还是不让重复买入吧
    private HashSet<String> todayBuyStocks;

    public SimulateBuyCallback(SimulateInfoMapper simulateInfoMapper) {
        this.simulateInfoMapper = simulateInfoMapper;
        todayBuyStocks = new HashSet<>();
    }

    private SimulateInfo convertFromCallbackInfo(StockCallbackInfo info, StockCallbackInfo.InfoItem item) {
        SimulateInfo ret = new SimulateInfo();
        ret.setInDate(info.getTradeDate());
        ret.setInType(item.getInfo());
        ret.setInPrice(item.getCurrPrice());
        ret.setTsCode(item.getTsCode());
        return ret;
    }

    @Override
    public void callback(StockCallbackInfo info) {
        List<StockCallbackInfo.InfoItem> buyItems = info.getBuyItems();
        if(buyItems == null || buyItems.size() == 0) {
            return;
        }

        // 将买入信息插入到库里面
        for(StockCallbackInfo.InfoItem item : buyItems) {
            if(!todayBuyStocks.add(item.getTsCode())) {
                // 重复的值不重复买入
                continue;
            }
            SimulateInfo tempVal = convertFromCallbackInfo(info, item);
            simulateInfoMapper.insert(tempVal);
        }
    }
}
