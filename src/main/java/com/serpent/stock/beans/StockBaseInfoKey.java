package com.serpent.stock.beans;

public class StockBaseInfoKey {
    private String tradeDate;

    private String tsCode;

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }
}