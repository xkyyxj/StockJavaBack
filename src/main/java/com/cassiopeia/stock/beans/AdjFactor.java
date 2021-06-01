package com.cassiopeia.stock.beans;

import com.cassiopeia.stock.dto.TushareData;

import java.util.ArrayList;
import java.util.List;

public class AdjFactor extends AdjFactorKey {
    private Double adjFactor;

    public Double getAdjFactor() {
        return adjFactor;
    }

    public void setAdjFactor(Double adjFactor) {
        this.adjFactor = adjFactor;
    }

    public static List<AdjFactor> convertFromTushareData(TushareData data) {
        if(data == null) {
            return new ArrayList<>();
        }

        TushareData.Data realData = data.getData();
        if(realData.getItems() == null || realData.getItems().size() == 0) {
            return new ArrayList<>();
        }
        List<List<Object>> items = realData.getItems();
        List<AdjFactor> retList = new ArrayList<>(items.size());
        for(List<Object> singleItem : items) {
            AdjFactor tempValue = new AdjFactor();
            tempValue.setTsCode((String) singleItem.get(0));
            tempValue.setTradeDate((String) singleItem.get(1));
            tempValue.setAdjFactor((Double) singleItem.get(2));
            retList.add(tempValue);
        }
        return retList;
    }
}