package com.serpent.stock.beans;

public class NDayUp {
    private Integer pkTwoUp;

    private String tsCode;

    private String currClose;

    private double nDayPct;

    private double fiveDayPct;

    private Integer upCount;

    private String inDate;

    public Integer getPkTwoUp() {
        return pkTwoUp;
    }

    public void setPkTwoUp(Integer pkTwoUp) {
        this.pkTwoUp = pkTwoUp;
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }

    public String getCurrClose() {
        return currClose;
    }

    public void setCurrClose(String currClose) {
        this.currClose = currClose == null ? null : currClose.trim();
    }

    public double getnDayPct() {
        return nDayPct;
    }

    public void setnDayPct(double nDayPct) {
        this.nDayPct = nDayPct;
    }

    public double getFiveDayPct() {
        return fiveDayPct;
    }

    public void setFiveDayPct(double fiveDayPct) {
        this.fiveDayPct = fiveDayPct;
    }

    public Integer getUpCount() {
        return upCount;
    }

    public void setUpCount(Integer upCount) {
        this.upCount = upCount;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }
}