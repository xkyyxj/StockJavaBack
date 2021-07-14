package com.serpent.stock.dto;

public class TimeInfo {
    private String stockName;
    private Double todayOpen;
    private Double lastClose;
    private Double currPrice;
    private Double todayMaxPrice;
    private Double todayMinPrice;
    private Double buy1;
    private Double sold1;
    private Double dealNum;         // 成交股票数
    private Double dealMny;         // 成交金额
    private Double[] buyNum;        // 买方买1到买5的买入数量
    private Double[] buyPrice;      // 买方买1到买5的价格
    private Double[] soldNum;       // 卖方卖1到卖5的卖出数量
    private Double[] soldPrice;     // 卖方卖1到卖5的卖出价格
    private String currTime;        // 发生时间

    public TimeInfo() {
        this.buyNum = new Double[5];
        this.buyPrice = new Double[5];
        this.soldNum = new Double[5];
        this.soldPrice = new Double[5];
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getTodayOpen() {
        return todayOpen;
    }

    public void setTodayOpen(Double todayOpen) {
        this.todayOpen = todayOpen;
    }

    public Double getLastClose() {
        return lastClose;
    }

    public void setLastClose(Double lastClose) {
        this.lastClose = lastClose;
    }

    public Double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Double currPrice) {
        this.currPrice = currPrice;
    }

    public Double getTodayMaxPrice() {
        return todayMaxPrice;
    }

    public void setTodayMaxPrice(Double todayMaxPrice) {
        this.todayMaxPrice = todayMaxPrice;
    }

    public Double getTodayMinPrice() {
        return todayMinPrice;
    }

    public void setTodayMinPrice(Double todayMinPrice) {
        this.todayMinPrice = todayMinPrice;
    }

    public Double getBuy1() {
        return buy1;
    }

    public void setBuy1(Double buy1) {
        this.buy1 = buy1;
    }

    public Double getSold1() {
        return sold1;
    }

    public void setSold1(Double sold1) {
        this.sold1 = sold1;
    }

    public Double getDealNum() {
        return dealNum;
    }

    public void setDealNum(Double dealNum) {
        this.dealNum = dealNum;
    }

    public Double getDealMny() {
        return dealMny;
    }

    public void setDealMny(Double dealMny) {
        this.dealMny = dealMny;
    }

    public Double[] getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Double[] buyNum) {
        this.buyNum = buyNum;
    }

    public Double[] getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double[] buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double[] getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Double[] soldNum) {
        this.soldNum = soldNum;
    }

    public Double[] getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(Double[] soldPrice) {
        this.soldPrice = soldPrice;
    }

    public String getCurrTime() {
        return currTime;
    }

    public void setCurrTime(String currTime) {
        this.currTime = currTime;
    }
}
