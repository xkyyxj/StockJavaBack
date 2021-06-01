package com.cassiopeia.stock.dto;

import java.util.List;

public class CommonTableData {

    private TableMeta meta;
    private List<Object[]> data;

    public TableMeta getMeta() {
        return meta;
    }

    public void setMeta(TableMeta meta) {
        this.meta = meta;
    }

    public List<Object[]> getData() {
        return data;
    }

    public void setData(List<Object[]> data) {
        this.data = data;
    }
}
