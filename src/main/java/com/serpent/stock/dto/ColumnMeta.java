package com.serpent.stock.dto;

public class ColumnMeta {

    private String pkColumn;
    private String displayName;
    private String columnType;
    private String columnName;
    private String isPrimary;
    private Integer displayOrder;

    public String getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(String pkColumn) {
        this.pkColumn = pkColumn;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
}
