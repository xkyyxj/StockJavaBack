package com.serpent.stock.analyzer;

import java.util.ArrayList;
import java.util.List;

public class ConsoleCallback implements StockCallback {
    @Override
    public void callback(StockCallbackInfo info) {
        List<StockCallbackInfo.InfoItem> soldItems = info.getSoldItems();
        soldItems = soldItems != null ? soldItems : new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append("需要卖出的股票有：");
        for(StockCallbackInfo.InfoItem item : soldItems) {
            builder.append(item.getTsCode());
        }
        builder.append("\r\n");

        List<StockCallbackInfo.InfoItem> buyItems = info.getBuyItems();
        buyItems = buyItems == null ? new ArrayList<>() : buyItems;
        builder.append("需要买入的股票有：");
        for(StockCallbackInfo.InfoItem item : buyItems) {
            builder.append(item.getTsCode());
        }
        builder.append("\r\n");
        System.out.println(builder.toString());
    }
}
