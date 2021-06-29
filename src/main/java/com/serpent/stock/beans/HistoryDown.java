package com.serpent.stock.beans;

public class HistoryDown {
    private Integer pkHistoryDown;

    private String tsCode;

    private String inDate;

    private Double inPrice;

    private Integer historyLen;

    private Double deltaPct;

    private Double hisDownPrice;

    public Integer getPkHistoryDown() {
        return pkHistoryDown;
    }

    public void setPkHistoryDown(Integer pkHistoryDown) {
        this.pkHistoryDown = pkHistoryDown;
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    public Double getInPrice() {
        return inPrice;
    }

    public void setInPrice(Double inPrice) {
        this.inPrice = inPrice;
    }

    public Integer getHistoryLen() {
        return historyLen;
    }

    public void setHistoryLen(Integer historyLen) {
        this.historyLen = historyLen;
    }

    public Double getDeltaPct() {
        return deltaPct;
    }

    public void setDeltaPct(Double deltaPct) {
        this.deltaPct = deltaPct;
    }

    public Double getHisDownPrice() {
        return hisDownPrice;
    }

    public void setHisDownPrice(Double hisDownPrice) {
        this.hisDownPrice = hisDownPrice;
    }
}