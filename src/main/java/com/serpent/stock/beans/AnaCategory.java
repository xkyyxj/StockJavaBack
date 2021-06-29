package com.serpent.stock.beans;

public class AnaCategory {
    private Integer pkCategory;

    private Integer pkTablemeta;

    private Integer pkParent;

    private String categoryName;

    public Integer getPkCategory() {
        return pkCategory;
    }

    public void setPkCategory(Integer pkCategory) {
        this.pkCategory = pkCategory;
    }

    public Integer getPkTablemeta() {
        return pkTablemeta;
    }

    public void setPkTablemeta(Integer pkTablemeta) {
        this.pkTablemeta = pkTablemeta;
    }

    public Integer getPkParent() {
        return pkParent;
    }

    public void setPkParent(Integer pkParent) {
        this.pkParent = pkParent;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }
}