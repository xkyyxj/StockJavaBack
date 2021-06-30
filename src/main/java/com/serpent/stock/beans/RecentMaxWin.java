package com.serpent.stock.beans;

public class RecentMaxWin {
    private Integer pkRecentWin;

    private String tsCode;

    private String inDate;

    private Double winPct;

    private Integer period;

    private Double lastClose;

    private Double firstClose;

    public Integer getPkRecentWin() {
        return pkRecentWin;
    }

    public void setPkRecentWin(Integer pkRecentWin) {
        this.pkRecentWin = pkRecentWin;
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

    public Double getWinPct() {
        return winPct;
    }

    public void setWinPct(Double winPct) {
        this.winPct = winPct;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Double getLastClose() {
        return lastClose;
    }

    public void setLastClose(Double lastClose) {
        this.lastClose = lastClose;
    }

    public Double getFirstClose() {
        return firstClose;
    }

    public void setFirstClose(Double firstClose) {
        this.firstClose = firstClose;
    }
}