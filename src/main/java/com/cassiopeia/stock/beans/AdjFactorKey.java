package com.cassiopeia.stock.beans;

public class AdjFactorKey {
    private String tsCode;

    private String tradeDate;

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }
}