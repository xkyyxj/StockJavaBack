package com.serpent.stock.beans;

public class SimulateInfo {
    private Integer pkSimulate;

    private String tsCode;

    private Double inPrice;

    private String inDate;

    private Double pct1;

    private Double pct2;

    private Double pct3;

    private Double pct4;

    private Double pct5;

    private Double pct15;

    private Double pct30;

    private String inType;

    public Integer getPkSimulate() {
        return pkSimulate;
    }

    public void setPkSimulate(Integer pkSimulate) {
        this.pkSimulate = pkSimulate;
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode == null ? null : tsCode.trim();
    }

    public Double getInPrice() {
        return inPrice;
    }

    public void setInPrice(Double inPrice) {
        this.inPrice = inPrice;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    public Double getPct1() {
        return pct1;
    }

    public void setPct1(Double pct1) {
        this.pct1 = pct1;
    }

    public Double getPct2() {
        return pct2;
    }

    public void setPct2(Double pct2) {
        this.pct2 = pct2;
    }

    public Double getPct3() {
        return pct3;
    }

    public void setPct3(Double pct3) {
        this.pct3 = pct3;
    }

    public Double getPct4() {
        return pct4;
    }

    public void setPct4(Double pct4) {
        this.pct4 = pct4;
    }

    public Double getPct5() {
        return pct5;
    }

    public void setPct5(Double pct5) {
        this.pct5 = pct5;
    }

    public Double getPct15() {
        return pct15;
    }

    public void setPct15(Double pct15) {
        this.pct15 = pct15;
    }

    public Double getPct30() {
        return pct30;
    }

    public void setPct30(Double pct30) {
        this.pct30 = pct30;
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType == null ? null : inType.trim();
    }
}