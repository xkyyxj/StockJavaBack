package com.serpent.stock.dto;

import java.util.List;

public class CommonTableInfoDTO {

    private Integer operateType;
    private List<String> columns;
    private List<Object> data;

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
