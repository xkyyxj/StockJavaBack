package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class StockListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockListExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTsCodeIsNull() {
            addCriterion("ts_code is null");
            return (Criteria) this;
        }

        public Criteria andTsCodeIsNotNull() {
            addCriterion("ts_code is not null");
            return (Criteria) this;
        }

        public Criteria andTsCodeEqualTo(String value) {
            addCriterion("ts_code =", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeNotEqualTo(String value) {
            addCriterion("ts_code <>", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeGreaterThan(String value) {
            addCriterion("ts_code >", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_code >=", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeLessThan(String value) {
            addCriterion("ts_code <", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeLessThanOrEqualTo(String value) {
            addCriterion("ts_code <=", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeLike(String value) {
            addCriterion("ts_code like", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeNotLike(String value) {
            addCriterion("ts_code not like", value, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeIn(List<String> values) {
            addCriterion("ts_code in", values, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeNotIn(List<String> values) {
            addCriterion("ts_code not in", values, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeBetween(String value1, String value2) {
            addCriterion("ts_code between", value1, value2, "tsCode");
            return (Criteria) this;
        }

        public Criteria andTsCodeNotBetween(String value1, String value2) {
            addCriterion("ts_code not between", value1, value2, "tsCode");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNull() {
            addCriterion("enname is null");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNotNull() {
            addCriterion("enname is not null");
            return (Criteria) this;
        }

        public Criteria andEnnameEqualTo(String value) {
            addCriterion("enname =", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotEqualTo(String value) {
            addCriterion("enname <>", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThan(String value) {
            addCriterion("enname >", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("enname >=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThan(String value) {
            addCriterion("enname <", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThanOrEqualTo(String value) {
            addCriterion("enname <=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLike(String value) {
            addCriterion("enname like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotLike(String value) {
            addCriterion("enname not like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameIn(List<String> values) {
            addCriterion("enname in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotIn(List<String> values) {
            addCriterion("enname not in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameBetween(String value1, String value2) {
            addCriterion("enname between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotBetween(String value1, String value2) {
            addCriterion("enname not between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("market is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("market is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(String value) {
            addCriterion("market =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(String value) {
            addCriterion("market <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(String value) {
            addCriterion("market >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(String value) {
            addCriterion("market >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(String value) {
            addCriterion("market <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(String value) {
            addCriterion("market <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLike(String value) {
            addCriterion("market like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotLike(String value) {
            addCriterion("market not like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<String> values) {
            addCriterion("market in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<String> values) {
            addCriterion("market not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(String value1, String value2) {
            addCriterion("market between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(String value1, String value2) {
            addCriterion("market not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andListStatusIsNull() {
            addCriterion("list_status is null");
            return (Criteria) this;
        }

        public Criteria andListStatusIsNotNull() {
            addCriterion("list_status is not null");
            return (Criteria) this;
        }

        public Criteria andListStatusEqualTo(String value) {
            addCriterion("list_status =", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotEqualTo(String value) {
            addCriterion("list_status <>", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusGreaterThan(String value) {
            addCriterion("list_status >", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusGreaterThanOrEqualTo(String value) {
            addCriterion("list_status >=", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLessThan(String value) {
            addCriterion("list_status <", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLessThanOrEqualTo(String value) {
            addCriterion("list_status <=", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLike(String value) {
            addCriterion("list_status like", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotLike(String value) {
            addCriterion("list_status not like", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusIn(List<String> values) {
            addCriterion("list_status in", values, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotIn(List<String> values) {
            addCriterion("list_status not in", values, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusBetween(String value1, String value2) {
            addCriterion("list_status between", value1, value2, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotBetween(String value1, String value2) {
            addCriterion("list_status not between", value1, value2, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListDateIsNull() {
            addCriterion("list_date is null");
            return (Criteria) this;
        }

        public Criteria andListDateIsNotNull() {
            addCriterion("list_date is not null");
            return (Criteria) this;
        }

        public Criteria andListDateEqualTo(String value) {
            addCriterion("list_date =", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotEqualTo(String value) {
            addCriterion("list_date <>", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThan(String value) {
            addCriterion("list_date >", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThanOrEqualTo(String value) {
            addCriterion("list_date >=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThan(String value) {
            addCriterion("list_date <", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThanOrEqualTo(String value) {
            addCriterion("list_date <=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLike(String value) {
            addCriterion("list_date like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotLike(String value) {
            addCriterion("list_date not like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateIn(List<String> values) {
            addCriterion("list_date in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotIn(List<String> values) {
            addCriterion("list_date not in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateBetween(String value1, String value2) {
            addCriterion("list_date between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotBetween(String value1, String value2) {
            addCriterion("list_date not between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateIsNull() {
            addCriterion("delist_date is null");
            return (Criteria) this;
        }

        public Criteria andDelistDateIsNotNull() {
            addCriterion("delist_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelistDateEqualTo(String value) {
            addCriterion("delist_date =", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotEqualTo(String value) {
            addCriterion("delist_date <>", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateGreaterThan(String value) {
            addCriterion("delist_date >", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateGreaterThanOrEqualTo(String value) {
            addCriterion("delist_date >=", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateLessThan(String value) {
            addCriterion("delist_date <", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateLessThanOrEqualTo(String value) {
            addCriterion("delist_date <=", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateLike(String value) {
            addCriterion("delist_date like", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotLike(String value) {
            addCriterion("delist_date not like", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateIn(List<String> values) {
            addCriterion("delist_date in", values, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotIn(List<String> values) {
            addCriterion("delist_date not in", values, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateBetween(String value1, String value2) {
            addCriterion("delist_date between", value1, value2, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotBetween(String value1, String value2) {
            addCriterion("delist_date not between", value1, value2, "delistDate");
            return (Criteria) this;
        }

        public Criteria andIsHsIsNull() {
            addCriterion("is_hs is null");
            return (Criteria) this;
        }

        public Criteria andIsHsIsNotNull() {
            addCriterion("is_hs is not null");
            return (Criteria) this;
        }

        public Criteria andIsHsEqualTo(String value) {
            addCriterion("is_hs =", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsNotEqualTo(String value) {
            addCriterion("is_hs <>", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsGreaterThan(String value) {
            addCriterion("is_hs >", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsGreaterThanOrEqualTo(String value) {
            addCriterion("is_hs >=", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsLessThan(String value) {
            addCriterion("is_hs <", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsLessThanOrEqualTo(String value) {
            addCriterion("is_hs <=", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsLike(String value) {
            addCriterion("is_hs like", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsNotLike(String value) {
            addCriterion("is_hs not like", value, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsIn(List<String> values) {
            addCriterion("is_hs in", values, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsNotIn(List<String> values) {
            addCriterion("is_hs not in", values, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsBetween(String value1, String value2) {
            addCriterion("is_hs between", value1, value2, "isHs");
            return (Criteria) this;
        }

        public Criteria andIsHsNotBetween(String value1, String value2) {
            addCriterion("is_hs not between", value1, value2, "isHs");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNull() {
            addCriterion("exchange is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNotNull() {
            addCriterion("exchange is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEqualTo(String value) {
            addCriterion("exchange =", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotEqualTo(String value) {
            addCriterion("exchange <>", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThan(String value) {
            addCriterion("exchange >", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("exchange >=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThan(String value) {
            addCriterion("exchange <", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThanOrEqualTo(String value) {
            addCriterion("exchange <=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLike(String value) {
            addCriterion("exchange like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotLike(String value) {
            addCriterion("exchange not like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeIn(List<String> values) {
            addCriterion("exchange in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotIn(List<String> values) {
            addCriterion("exchange not in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeBetween(String value1, String value2) {
            addCriterion("exchange between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotBetween(String value1, String value2) {
            addCriterion("exchange not between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andCurrTypeIsNull() {
            addCriterion("curr_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrTypeIsNotNull() {
            addCriterion("curr_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrTypeEqualTo(String value) {
            addCriterion("curr_type =", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeNotEqualTo(String value) {
            addCriterion("curr_type <>", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeGreaterThan(String value) {
            addCriterion("curr_type >", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("curr_type >=", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeLessThan(String value) {
            addCriterion("curr_type <", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeLessThanOrEqualTo(String value) {
            addCriterion("curr_type <=", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeLike(String value) {
            addCriterion("curr_type like", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeNotLike(String value) {
            addCriterion("curr_type not like", value, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeIn(List<String> values) {
            addCriterion("curr_type in", values, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeNotIn(List<String> values) {
            addCriterion("curr_type not in", values, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeBetween(String value1, String value2) {
            addCriterion("curr_type between", value1, value2, "currType");
            return (Criteria) this;
        }

        public Criteria andCurrTypeNotBetween(String value1, String value2) {
            addCriterion("curr_type not between", value1, value2, "currType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}