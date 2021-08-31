package com.serpent.stock.beans;

public class FlowUp {
    private Integer pkUp;

    private String tsCode;

    private Integer flowDays;

    private String inDate;

    private Double inPrice;

    public Integer getPkUp() {
        return pkUp;
    }

    public void setPkUp(Integer pkUp) {
        this.pkUp = pkUp;
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }

    public Integer getFlowDays() {
        return flowDays;
    }

    public void setFlowDays(Integer flowDays) {
        this.flowDays = flowDays;
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
}