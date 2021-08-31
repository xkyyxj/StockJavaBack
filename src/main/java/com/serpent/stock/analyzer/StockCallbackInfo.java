package com.serpent.stock.analyzer;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * 当实时分析产生结果的时候，就会做一个回调函数的调用，这个类是回调函数的参数
 */
public class StockCallbackInfo {

    public StockCallbackInfo() {
        infos = new ArrayList<>();
        buyItems = new ArrayList<>();
        soldItems = new ArrayList<>();
    }

    public static StockCallbackInfo fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, StockCallbackInfo.class);
    }

    public static class InfoItem {
        private String tsCode;
        private double currPrice;
        private double winPct;
        private String info;

        public String getTsCode() {
            return tsCode;
        }

        public void setTsCode(String tsCode) {
            this.tsCode = tsCode;
        }

        public double getCurrPrice() {
            return currPrice;
        }

        public void setCurrPrice(double currPrice) {
            this.currPrice = currPrice;
        }

        public double getWinPct() {
            return winPct;
        }

        public void setWinPct(double winPct) {
            this.winPct = winPct;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    private List<InfoItem> infos;
    private List<InfoItem> buyItems;
    private List<InfoItem> soldItems;
    private String tradeDate;
    private String fromType;

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public List<InfoItem> getBuyItems() {
        return buyItems;
    }

    public void setBuyItems(List<InfoItem> buyItems) {
        this.buyItems = buyItems;
    }

    public List<InfoItem> getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(List<InfoItem> soldItems) {
        this.soldItems = soldItems;
    }

    public List<InfoItem> getInfos() {
        return infos;
    }

    public void setInfos(List<InfoItem> infos) {
        this.infos = infos;
    }
}
