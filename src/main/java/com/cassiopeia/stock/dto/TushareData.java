package com.cassiopeia.stock.dto;

import java.util.List;

public class TushareData {

    private String request_id;
    private Integer code;
    private String msg;
    private Data data;

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private List<String> fields;
        private List<List<Object>> items;

        public List<String> getFields() {
            return fields;
        }

        public void setFields(List<String> fields) {
            this.fields = fields;
        }

        public List<List<Object>> getItems() {
            return items;
        }

        public void setItems(List<List<Object>> items) {
            this.items = items;
        }
    }

}
