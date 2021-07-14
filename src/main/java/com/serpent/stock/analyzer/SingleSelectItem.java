package com.serpent.stock.analyzer;

public class SingleSelectItem {

    public static final Integer ALWAYS_UP = 1;
    public static final Integer ALWAYS_DOWN = 2;
    public static final Integer DOWN_THEN_UP = 3;
    public static final Integer UP_THEN_DOWN = 4;
    public static final Integer WAVE = 5;           // 抖动

    private String tsCode;
    private Double selectClose;         // 实时分析程序的收盘价
    private Double fiveDayUpPct;        // 五日上涨幅度
    private Double twoDayUpPct;         // 两日上涨幅度
    private Double lastDayUpPct;        // 比昨天收盘价上涨多少百分比
    private Double todayMinPrice;
    private Double todayMaxPrice;       // 当日最高价
    private Integer lineType;           // 今日价格走势

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode;
    }

    public Double getSelectClose() {
        return selectClose;
    }

    public void setSelectClose(Double selectClose) {
        this.selectClose = selectClose;
    }

    public Double getFiveDayUpPct() {
        return fiveDayUpPct;
    }

    public void setFiveDayUpPct(Double fiveDayUpPct) {
        this.fiveDayUpPct = fiveDayUpPct;
    }

    public Double getTwoDayUpPct() {
        return twoDayUpPct;
    }

    public void setTwoDayUpPct(Double twoDayUpPct) {
        this.twoDayUpPct = twoDayUpPct;
    }

    public Double getLastDayUpPct() {
        return lastDayUpPct;
    }

    public void setLastDayUpPct(Double lastDayUpPct) {
        this.lastDayUpPct = lastDayUpPct;
    }

    public Double getTodayMinPrice() {
        return todayMinPrice;
    }

    public void setTodayMinPrice(Double todayMinPrice) {
        this.todayMinPrice = todayMinPrice;
    }

    public Double getTodayMaxPrice() {
        return todayMaxPrice;
    }

    public void setTodayMaxPrice(Double todayMaxPrice) {
        this.todayMaxPrice = todayMaxPrice;
    }

    public Integer getLineType() {
        return lineType;
    }

    public void setLineType(Integer lineType) {
        this.lineType = lineType;
    }
}
