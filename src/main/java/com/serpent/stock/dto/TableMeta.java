package com.serpent.stock.dto;

import java.util.List;

public class TableMeta {

    private String pkTableMeta;
    private String tableName;
    private String isRedis;
    private List<ColumnMeta> columnMeta;

    public String getPkTableMeta() {
        return pkTableMeta;
    }

    public void setPkTableMeta(String pkTableMeta) {
        this.pkTableMeta = pkTableMeta;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIsRedis() {
        return isRedis;
    }

    public void setIsRedis(String isRedis) {
        this.isRedis = isRedis;
    }

    public List<ColumnMeta> getColumnMeta() {
        return columnMeta;
    }

    public void setColumnMeta(List<ColumnMeta> columnMeta) {
        this.columnMeta = columnMeta;
    }
}
