package com.serpent.stock.dto;

import java.util.HashMap;

public class QueryInfo {

    private String ts_code;
    private String begin_date;
    private String end_date;
    private HashMap<String, Object> userParam;

    public String getTs_code() {
        return ts_code;
    }

    public void setTs_code(String ts_code) {
        this.ts_code = ts_code;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public HashMap<String, Object> getUserParam() {
        return userParam;
    }

    public void setUserParam(HashMap<String, Object> userParam) {
        this.userParam = userParam;
    }
}
