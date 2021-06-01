package com.cassiopeia.stock.dto;

import java.util.List;

public class AdjFactorWebBean {

    private String request_id;
    private Integer code;
    private String msg;
    private Data data;

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
