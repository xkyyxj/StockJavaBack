package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class SimulateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimulateInfoExample() {
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

        public Criteria andPkSimulateIsNull() {
            addCriterion("pk_simulate is null");
            return (Criteria) this;
        }

        public Criteria andPkSimulateIsNotNull() {
            addCriterion("pk_simulate is not null");
            return (Criteria) this;
        }

        public Criteria andPkSimulateEqualTo(Integer value) {
            addCriterion("pk_simulate =", value, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateNotEqualTo(Integer value) {
            addCriterion("pk_simulate <>", value, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateGreaterThan(Integer value) {
            addCriterion("pk_simulate >", value, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_simulate >=", value, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateLessThan(Integer value) {
            addCriterion("pk_simulate <", value, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateLessThanOrEqualTo(Integer value) {
            addCriterion("pk_simulate <=", value, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateIn(List<Integer> values) {
            addCriterion("pk_simulate in", values, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateNotIn(List<Integer> values) {
            addCriterion("pk_simulate not in", values, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateBetween(Integer value1, Integer value2) {
            addCriterion("pk_simulate between", value1, value2, "pkSimulate");
            return (Criteria) this;
        }

        public Criteria andPkSimulateNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_simulate not between", value1, value2, "pkSimulate");
            return (Criteria) this;
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

        public Criteria andInPriceIsNull() {
            addCriterion("in_price is null");
            return (Criteria) this;
        }

        public Criteria andInPriceIsNotNull() {
            addCriterion("in_price is not null");
            return (Criteria) this;
        }

        public Criteria andInPriceEqualTo(Double value) {
            addCriterion("in_price =", value, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceNotEqualTo(Double value) {
            addCriterion("in_price <>", value, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceGreaterThan(Double value) {
            addCriterion("in_price >", value, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("in_price >=", value, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceLessThan(Double value) {
            addCriterion("in_price <", value, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceLessThanOrEqualTo(Double value) {
            addCriterion("in_price <=", value, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceIn(List<Double> values) {
            addCriterion("in_price in", values, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceNotIn(List<Double> values) {
            addCriterion("in_price not in", values, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceBetween(Double value1, Double value2) {
            addCriterion("in_price between", value1, value2, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInPriceNotBetween(Double value1, Double value2) {
            addCriterion("in_price not between", value1, value2, "inPrice");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(String value) {
            addCriterion("in_date =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(String value) {
            addCriterion("in_date <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(String value) {
            addCriterion("in_date >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(String value) {
            addCriterion("in_date >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(String value) {
            addCriterion("in_date <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(String value) {
            addCriterion("in_date <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLike(String value) {
            addCriterion("in_date like", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotLike(String value) {
            addCriterion("in_date not like", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<String> values) {
            addCriterion("in_date in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<String> values) {
            addCriterion("in_date not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(String value1, String value2) {
            addCriterion("in_date between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(String value1, String value2) {
            addCriterion("in_date not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andPct1IsNull() {
            addCriterion("pct1 is null");
            return (Criteria) this;
        }

        public Criteria andPct1IsNotNull() {
            addCriterion("pct1 is not null");
            return (Criteria) this;
        }

        public Criteria andPct1EqualTo(Double value) {
            addCriterion("pct1 =", value, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1NotEqualTo(Double value) {
            addCriterion("pct1 <>", value, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1GreaterThan(Double value) {
            addCriterion("pct1 >", value, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1GreaterThanOrEqualTo(Double value) {
            addCriterion("pct1 >=", value, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1LessThan(Double value) {
            addCriterion("pct1 <", value, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1LessThanOrEqualTo(Double value) {
            addCriterion("pct1 <=", value, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1In(List<Double> values) {
            addCriterion("pct1 in", values, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1NotIn(List<Double> values) {
            addCriterion("pct1 not in", values, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1Between(Double value1, Double value2) {
            addCriterion("pct1 between", value1, value2, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct1NotBetween(Double value1, Double value2) {
            addCriterion("pct1 not between", value1, value2, "pct1");
            return (Criteria) this;
        }

        public Criteria andPct2IsNull() {
            addCriterion("pct2 is null");
            return (Criteria) this;
        }

        public Criteria andPct2IsNotNull() {
            addCriterion("pct2 is not null");
            return (Criteria) this;
        }

        public Criteria andPct2EqualTo(Double value) {
            addCriterion("pct2 =", value, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2NotEqualTo(Double value) {
            addCriterion("pct2 <>", value, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2GreaterThan(Double value) {
            addCriterion("pct2 >", value, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2GreaterThanOrEqualTo(Double value) {
            addCriterion("pct2 >=", value, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2LessThan(Double value) {
            addCriterion("pct2 <", value, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2LessThanOrEqualTo(Double value) {
            addCriterion("pct2 <=", value, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2In(List<Double> values) {
            addCriterion("pct2 in", values, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2NotIn(List<Double> values) {
            addCriterion("pct2 not in", values, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2Between(Double value1, Double value2) {
            addCriterion("pct2 between", value1, value2, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct2NotBetween(Double value1, Double value2) {
            addCriterion("pct2 not between", value1, value2, "pct2");
            return (Criteria) this;
        }

        public Criteria andPct3IsNull() {
            addCriterion("pct3 is null");
            return (Criteria) this;
        }

        public Criteria andPct3IsNotNull() {
            addCriterion("pct3 is not null");
            return (Criteria) this;
        }

        public Criteria andPct3EqualTo(Double value) {
            addCriterion("pct3 =", value, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3NotEqualTo(Double value) {
            addCriterion("pct3 <>", value, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3GreaterThan(Double value) {
            addCriterion("pct3 >", value, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3GreaterThanOrEqualTo(Double value) {
            addCriterion("pct3 >=", value, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3LessThan(Double value) {
            addCriterion("pct3 <", value, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3LessThanOrEqualTo(Double value) {
            addCriterion("pct3 <=", value, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3In(List<Double> values) {
            addCriterion("pct3 in", values, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3NotIn(List<Double> values) {
            addCriterion("pct3 not in", values, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3Between(Double value1, Double value2) {
            addCriterion("pct3 between", value1, value2, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct3NotBetween(Double value1, Double value2) {
            addCriterion("pct3 not between", value1, value2, "pct3");
            return (Criteria) this;
        }

        public Criteria andPct4IsNull() {
            addCriterion("pct4 is null");
            return (Criteria) this;
        }

        public Criteria andPct4IsNotNull() {
            addCriterion("pct4 is not null");
            return (Criteria) this;
        }

        public Criteria andPct4EqualTo(Double value) {
            addCriterion("pct4 =", value, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4NotEqualTo(Double value) {
            addCriterion("pct4 <>", value, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4GreaterThan(Double value) {
            addCriterion("pct4 >", value, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4GreaterThanOrEqualTo(Double value) {
            addCriterion("pct4 >=", value, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4LessThan(Double value) {
            addCriterion("pct4 <", value, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4LessThanOrEqualTo(Double value) {
            addCriterion("pct4 <=", value, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4In(List<Double> values) {
            addCriterion("pct4 in", values, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4NotIn(List<Double> values) {
            addCriterion("pct4 not in", values, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4Between(Double value1, Double value2) {
            addCriterion("pct4 between", value1, value2, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct4NotBetween(Double value1, Double value2) {
            addCriterion("pct4 not between", value1, value2, "pct4");
            return (Criteria) this;
        }

        public Criteria andPct5IsNull() {
            addCriterion("pct5 is null");
            return (Criteria) this;
        }

        public Criteria andPct5IsNotNull() {
            addCriterion("pct5 is not null");
            return (Criteria) this;
        }

        public Criteria andPct5EqualTo(Double value) {
            addCriterion("pct5 =", value, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5NotEqualTo(Double value) {
            addCriterion("pct5 <>", value, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5GreaterThan(Double value) {
            addCriterion("pct5 >", value, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5GreaterThanOrEqualTo(Double value) {
            addCriterion("pct5 >=", value, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5LessThan(Double value) {
            addCriterion("pct5 <", value, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5LessThanOrEqualTo(Double value) {
            addCriterion("pct5 <=", value, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5In(List<Double> values) {
            addCriterion("pct5 in", values, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5NotIn(List<Double> values) {
            addCriterion("pct5 not in", values, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5Between(Double value1, Double value2) {
            addCriterion("pct5 between", value1, value2, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct5NotBetween(Double value1, Double value2) {
            addCriterion("pct5 not between", value1, value2, "pct5");
            return (Criteria) this;
        }

        public Criteria andPct15IsNull() {
            addCriterion("pct15 is null");
            return (Criteria) this;
        }

        public Criteria andPct15IsNotNull() {
            addCriterion("pct15 is not null");
            return (Criteria) this;
        }

        public Criteria andPct15EqualTo(Double value) {
            addCriterion("pct15 =", value, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15NotEqualTo(Double value) {
            addCriterion("pct15 <>", value, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15GreaterThan(Double value) {
            addCriterion("pct15 >", value, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15GreaterThanOrEqualTo(Double value) {
            addCriterion("pct15 >=", value, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15LessThan(Double value) {
            addCriterion("pct15 <", value, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15LessThanOrEqualTo(Double value) {
            addCriterion("pct15 <=", value, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15In(List<Double> values) {
            addCriterion("pct15 in", values, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15NotIn(List<Double> values) {
            addCriterion("pct15 not in", values, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15Between(Double value1, Double value2) {
            addCriterion("pct15 between", value1, value2, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct15NotBetween(Double value1, Double value2) {
            addCriterion("pct15 not between", value1, value2, "pct15");
            return (Criteria) this;
        }

        public Criteria andPct30IsNull() {
            addCriterion("pct30 is null");
            return (Criteria) this;
        }

        public Criteria andPct30IsNotNull() {
            addCriterion("pct30 is not null");
            return (Criteria) this;
        }

        public Criteria andPct30EqualTo(Double value) {
            addCriterion("pct30 =", value, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30NotEqualTo(Double value) {
            addCriterion("pct30 <>", value, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30GreaterThan(Double value) {
            addCriterion("pct30 >", value, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30GreaterThanOrEqualTo(Double value) {
            addCriterion("pct30 >=", value, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30LessThan(Double value) {
            addCriterion("pct30 <", value, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30LessThanOrEqualTo(Double value) {
            addCriterion("pct30 <=", value, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30In(List<Double> values) {
            addCriterion("pct30 in", values, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30NotIn(List<Double> values) {
            addCriterion("pct30 not in", values, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30Between(Double value1, Double value2) {
            addCriterion("pct30 between", value1, value2, "pct30");
            return (Criteria) this;
        }

        public Criteria andPct30NotBetween(Double value1, Double value2) {
            addCriterion("pct30 not between", value1, value2, "pct30");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNull() {
            addCriterion("in_type is null");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNotNull() {
            addCriterion("in_type is not null");
            return (Criteria) this;
        }

        public Criteria andInTypeEqualTo(String value) {
            addCriterion("in_type =", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotEqualTo(String value) {
            addCriterion("in_type <>", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThan(String value) {
            addCriterion("in_type >", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThanOrEqualTo(String value) {
            addCriterion("in_type >=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThan(String value) {
            addCriterion("in_type <", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThanOrEqualTo(String value) {
            addCriterion("in_type <=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLike(String value) {
            addCriterion("in_type like", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotLike(String value) {
            addCriterion("in_type not like", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeIn(List<String> values) {
            addCriterion("in_type in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotIn(List<String> values) {
            addCriterion("in_type not in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeBetween(String value1, String value2) {
            addCriterion("in_type between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotBetween(String value1, String value2) {
            addCriterion("in_type not between", value1, value2, "inType");
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