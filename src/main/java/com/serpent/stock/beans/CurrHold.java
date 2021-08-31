package com.serpent.stock.beans;

public class CurrHold {
    private Integer pkCurrHold;

    private String tsCode;

    private Double holdPrice;

    private String firstHoldDay;

    private Integer holdNum;

    private Double winPct;

    private Double maxWinPct;

    private Double minWinPct;

    public Integer getPkCurrHold() {
        return pkCurrHold;
    }

    public void setPkCurrHold(Integer pkCurrHold) {
        this.pkCurrHold = pkCurrHold;
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }

    public Double getHoldPrice() {
        return holdPrice;
    }

    public void setHoldPrice(Double holdPrice) {
        this.holdPrice = holdPrice;
    }

    public String getFirstHoldDay() {
        return firstHoldDay;
    }

    public void setFirstHoldDay(String firstHoldDay) {
        this.firstHoldDay = firstHoldDay == null ? null : firstHoldDay.trim();
    }

    public Integer getHoldNum() {
        return holdNum;
    }

    public void setHoldNum(Integer holdNum) {
        this.holdNum = holdNum;
    }

    public Double getWinPct() {
        return winPct;
    }

    public void setWinPct(Double winPct) {
        this.winPct = winPct;
    }

    public Double getMaxWinPct() {
        return maxWinPct;
    }

    public void setMaxWinPct(Double maxWinPct) {
        this.maxWinPct = maxWinPct;
    }

    public Double getMinWinPct() {
        return minWinPct;
    }

    public void setMinWinPct(Double minWinPct) {
        this.minWinPct = minWinPct;
    }
}