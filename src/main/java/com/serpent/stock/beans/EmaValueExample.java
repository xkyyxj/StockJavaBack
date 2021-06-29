package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class EmaValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmaValueExample() {
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

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(String value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(String value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(String value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(String value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(String value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(String value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLike(String value) {
            addCriterion("trade_date like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotLike(String value) {
            addCriterion("trade_date not like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<String> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<String> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(String value1, String value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(String value1, String value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andEma3IsNull() {
            addCriterion("ema_3 is null");
            return (Criteria) this;
        }

        public Criteria andEma3IsNotNull() {
            addCriterion("ema_3 is not null");
            return (Criteria) this;
        }

        public Criteria andEma3EqualTo(Double value) {
            addCriterion("ema_3 =", value, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3NotEqualTo(Double value) {
            addCriterion("ema_3 <>", value, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3GreaterThan(Double value) {
            addCriterion("ema_3 >", value, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_3 >=", value, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3LessThan(Double value) {
            addCriterion("ema_3 <", value, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3LessThanOrEqualTo(Double value) {
            addCriterion("ema_3 <=", value, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3In(List<Double> values) {
            addCriterion("ema_3 in", values, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3NotIn(List<Double> values) {
            addCriterion("ema_3 not in", values, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3Between(Double value1, Double value2) {
            addCriterion("ema_3 between", value1, value2, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma3NotBetween(Double value1, Double value2) {
            addCriterion("ema_3 not between", value1, value2, "ema3");
            return (Criteria) this;
        }

        public Criteria andEma4IsNull() {
            addCriterion("ema_4 is null");
            return (Criteria) this;
        }

        public Criteria andEma4IsNotNull() {
            addCriterion("ema_4 is not null");
            return (Criteria) this;
        }

        public Criteria andEma4EqualTo(Double value) {
            addCriterion("ema_4 =", value, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4NotEqualTo(Double value) {
            addCriterion("ema_4 <>", value, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4GreaterThan(Double value) {
            addCriterion("ema_4 >", value, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_4 >=", value, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4LessThan(Double value) {
            addCriterion("ema_4 <", value, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4LessThanOrEqualTo(Double value) {
            addCriterion("ema_4 <=", value, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4In(List<Double> values) {
            addCriterion("ema_4 in", values, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4NotIn(List<Double> values) {
            addCriterion("ema_4 not in", values, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4Between(Double value1, Double value2) {
            addCriterion("ema_4 between", value1, value2, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma4NotBetween(Double value1, Double value2) {
            addCriterion("ema_4 not between", value1, value2, "ema4");
            return (Criteria) this;
        }

        public Criteria andEma5IsNull() {
            addCriterion("ema_5 is null");
            return (Criteria) this;
        }

        public Criteria andEma5IsNotNull() {
            addCriterion("ema_5 is not null");
            return (Criteria) this;
        }

        public Criteria andEma5EqualTo(Double value) {
            addCriterion("ema_5 =", value, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5NotEqualTo(Double value) {
            addCriterion("ema_5 <>", value, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5GreaterThan(Double value) {
            addCriterion("ema_5 >", value, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_5 >=", value, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5LessThan(Double value) {
            addCriterion("ema_5 <", value, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5LessThanOrEqualTo(Double value) {
            addCriterion("ema_5 <=", value, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5In(List<Double> values) {
            addCriterion("ema_5 in", values, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5NotIn(List<Double> values) {
            addCriterion("ema_5 not in", values, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5Between(Double value1, Double value2) {
            addCriterion("ema_5 between", value1, value2, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma5NotBetween(Double value1, Double value2) {
            addCriterion("ema_5 not between", value1, value2, "ema5");
            return (Criteria) this;
        }

        public Criteria andEma6IsNull() {
            addCriterion("ema_6 is null");
            return (Criteria) this;
        }

        public Criteria andEma6IsNotNull() {
            addCriterion("ema_6 is not null");
            return (Criteria) this;
        }

        public Criteria andEma6EqualTo(Double value) {
            addCriterion("ema_6 =", value, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6NotEqualTo(Double value) {
            addCriterion("ema_6 <>", value, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6GreaterThan(Double value) {
            addCriterion("ema_6 >", value, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_6 >=", value, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6LessThan(Double value) {
            addCriterion("ema_6 <", value, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6LessThanOrEqualTo(Double value) {
            addCriterion("ema_6 <=", value, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6In(List<Double> values) {
            addCriterion("ema_6 in", values, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6NotIn(List<Double> values) {
            addCriterion("ema_6 not in", values, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6Between(Double value1, Double value2) {
            addCriterion("ema_6 between", value1, value2, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma6NotBetween(Double value1, Double value2) {
            addCriterion("ema_6 not between", value1, value2, "ema6");
            return (Criteria) this;
        }

        public Criteria andEma7IsNull() {
            addCriterion("ema_7 is null");
            return (Criteria) this;
        }

        public Criteria andEma7IsNotNull() {
            addCriterion("ema_7 is not null");
            return (Criteria) this;
        }

        public Criteria andEma7EqualTo(Double value) {
            addCriterion("ema_7 =", value, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7NotEqualTo(Double value) {
            addCriterion("ema_7 <>", value, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7GreaterThan(Double value) {
            addCriterion("ema_7 >", value, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_7 >=", value, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7LessThan(Double value) {
            addCriterion("ema_7 <", value, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7LessThanOrEqualTo(Double value) {
            addCriterion("ema_7 <=", value, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7In(List<Double> values) {
            addCriterion("ema_7 in", values, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7NotIn(List<Double> values) {
            addCriterion("ema_7 not in", values, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7Between(Double value1, Double value2) {
            addCriterion("ema_7 between", value1, value2, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma7NotBetween(Double value1, Double value2) {
            addCriterion("ema_7 not between", value1, value2, "ema7");
            return (Criteria) this;
        }

        public Criteria andEma8IsNull() {
            addCriterion("ema_8 is null");
            return (Criteria) this;
        }

        public Criteria andEma8IsNotNull() {
            addCriterion("ema_8 is not null");
            return (Criteria) this;
        }

        public Criteria andEma8EqualTo(Double value) {
            addCriterion("ema_8 =", value, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8NotEqualTo(Double value) {
            addCriterion("ema_8 <>", value, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8GreaterThan(Double value) {
            addCriterion("ema_8 >", value, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_8 >=", value, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8LessThan(Double value) {
            addCriterion("ema_8 <", value, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8LessThanOrEqualTo(Double value) {
            addCriterion("ema_8 <=", value, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8In(List<Double> values) {
            addCriterion("ema_8 in", values, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8NotIn(List<Double> values) {
            addCriterion("ema_8 not in", values, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8Between(Double value1, Double value2) {
            addCriterion("ema_8 between", value1, value2, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma8NotBetween(Double value1, Double value2) {
            addCriterion("ema_8 not between", value1, value2, "ema8");
            return (Criteria) this;
        }

        public Criteria andEma9IsNull() {
            addCriterion("ema_9 is null");
            return (Criteria) this;
        }

        public Criteria andEma9IsNotNull() {
            addCriterion("ema_9 is not null");
            return (Criteria) this;
        }

        public Criteria andEma9EqualTo(Double value) {
            addCriterion("ema_9 =", value, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9NotEqualTo(Double value) {
            addCriterion("ema_9 <>", value, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9GreaterThan(Double value) {
            addCriterion("ema_9 >", value, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_9 >=", value, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9LessThan(Double value) {
            addCriterion("ema_9 <", value, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9LessThanOrEqualTo(Double value) {
            addCriterion("ema_9 <=", value, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9In(List<Double> values) {
            addCriterion("ema_9 in", values, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9NotIn(List<Double> values) {
            addCriterion("ema_9 not in", values, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9Between(Double value1, Double value2) {
            addCriterion("ema_9 between", value1, value2, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma9NotBetween(Double value1, Double value2) {
            addCriterion("ema_9 not between", value1, value2, "ema9");
            return (Criteria) this;
        }

        public Criteria andEma10IsNull() {
            addCriterion("ema_10 is null");
            return (Criteria) this;
        }

        public Criteria andEma10IsNotNull() {
            addCriterion("ema_10 is not null");
            return (Criteria) this;
        }

        public Criteria andEma10EqualTo(Double value) {
            addCriterion("ema_10 =", value, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10NotEqualTo(Double value) {
            addCriterion("ema_10 <>", value, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10GreaterThan(Double value) {
            addCriterion("ema_10 >", value, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_10 >=", value, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10LessThan(Double value) {
            addCriterion("ema_10 <", value, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10LessThanOrEqualTo(Double value) {
            addCriterion("ema_10 <=", value, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10In(List<Double> values) {
            addCriterion("ema_10 in", values, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10NotIn(List<Double> values) {
            addCriterion("ema_10 not in", values, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10Between(Double value1, Double value2) {
            addCriterion("ema_10 between", value1, value2, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma10NotBetween(Double value1, Double value2) {
            addCriterion("ema_10 not between", value1, value2, "ema10");
            return (Criteria) this;
        }

        public Criteria andEma11IsNull() {
            addCriterion("ema_11 is null");
            return (Criteria) this;
        }

        public Criteria andEma11IsNotNull() {
            addCriterion("ema_11 is not null");
            return (Criteria) this;
        }

        public Criteria andEma11EqualTo(Double value) {
            addCriterion("ema_11 =", value, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11NotEqualTo(Double value) {
            addCriterion("ema_11 <>", value, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11GreaterThan(Double value) {
            addCriterion("ema_11 >", value, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_11 >=", value, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11LessThan(Double value) {
            addCriterion("ema_11 <", value, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11LessThanOrEqualTo(Double value) {
            addCriterion("ema_11 <=", value, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11In(List<Double> values) {
            addCriterion("ema_11 in", values, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11NotIn(List<Double> values) {
            addCriterion("ema_11 not in", values, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11Between(Double value1, Double value2) {
            addCriterion("ema_11 between", value1, value2, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma11NotBetween(Double value1, Double value2) {
            addCriterion("ema_11 not between", value1, value2, "ema11");
            return (Criteria) this;
        }

        public Criteria andEma12IsNull() {
            addCriterion("ema_12 is null");
            return (Criteria) this;
        }

        public Criteria andEma12IsNotNull() {
            addCriterion("ema_12 is not null");
            return (Criteria) this;
        }

        public Criteria andEma12EqualTo(Double value) {
            addCriterion("ema_12 =", value, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12NotEqualTo(Double value) {
            addCriterion("ema_12 <>", value, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12GreaterThan(Double value) {
            addCriterion("ema_12 >", value, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_12 >=", value, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12LessThan(Double value) {
            addCriterion("ema_12 <", value, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12LessThanOrEqualTo(Double value) {
            addCriterion("ema_12 <=", value, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12In(List<Double> values) {
            addCriterion("ema_12 in", values, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12NotIn(List<Double> values) {
            addCriterion("ema_12 not in", values, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12Between(Double value1, Double value2) {
            addCriterion("ema_12 between", value1, value2, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma12NotBetween(Double value1, Double value2) {
            addCriterion("ema_12 not between", value1, value2, "ema12");
            return (Criteria) this;
        }

        public Criteria andEma13IsNull() {
            addCriterion("ema_13 is null");
            return (Criteria) this;
        }

        public Criteria andEma13IsNotNull() {
            addCriterion("ema_13 is not null");
            return (Criteria) this;
        }

        public Criteria andEma13EqualTo(Double value) {
            addCriterion("ema_13 =", value, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13NotEqualTo(Double value) {
            addCriterion("ema_13 <>", value, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13GreaterThan(Double value) {
            addCriterion("ema_13 >", value, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_13 >=", value, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13LessThan(Double value) {
            addCriterion("ema_13 <", value, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13LessThanOrEqualTo(Double value) {
            addCriterion("ema_13 <=", value, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13In(List<Double> values) {
            addCriterion("ema_13 in", values, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13NotIn(List<Double> values) {
            addCriterion("ema_13 not in", values, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13Between(Double value1, Double value2) {
            addCriterion("ema_13 between", value1, value2, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma13NotBetween(Double value1, Double value2) {
            addCriterion("ema_13 not between", value1, value2, "ema13");
            return (Criteria) this;
        }

        public Criteria andEma14IsNull() {
            addCriterion("ema_14 is null");
            return (Criteria) this;
        }

        public Criteria andEma14IsNotNull() {
            addCriterion("ema_14 is not null");
            return (Criteria) this;
        }

        public Criteria andEma14EqualTo(Double value) {
            addCriterion("ema_14 =", value, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14NotEqualTo(Double value) {
            addCriterion("ema_14 <>", value, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14GreaterThan(Double value) {
            addCriterion("ema_14 >", value, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_14 >=", value, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14LessThan(Double value) {
            addCriterion("ema_14 <", value, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14LessThanOrEqualTo(Double value) {
            addCriterion("ema_14 <=", value, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14In(List<Double> values) {
            addCriterion("ema_14 in", values, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14NotIn(List<Double> values) {
            addCriterion("ema_14 not in", values, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14Between(Double value1, Double value2) {
            addCriterion("ema_14 between", value1, value2, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma14NotBetween(Double value1, Double value2) {
            addCriterion("ema_14 not between", value1, value2, "ema14");
            return (Criteria) this;
        }

        public Criteria andEma15IsNull() {
            addCriterion("ema_15 is null");
            return (Criteria) this;
        }

        public Criteria andEma15IsNotNull() {
            addCriterion("ema_15 is not null");
            return (Criteria) this;
        }

        public Criteria andEma15EqualTo(Double value) {
            addCriterion("ema_15 =", value, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15NotEqualTo(Double value) {
            addCriterion("ema_15 <>", value, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15GreaterThan(Double value) {
            addCriterion("ema_15 >", value, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_15 >=", value, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15LessThan(Double value) {
            addCriterion("ema_15 <", value, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15LessThanOrEqualTo(Double value) {
            addCriterion("ema_15 <=", value, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15In(List<Double> values) {
            addCriterion("ema_15 in", values, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15NotIn(List<Double> values) {
            addCriterion("ema_15 not in", values, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15Between(Double value1, Double value2) {
            addCriterion("ema_15 between", value1, value2, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma15NotBetween(Double value1, Double value2) {
            addCriterion("ema_15 not between", value1, value2, "ema15");
            return (Criteria) this;
        }

        public Criteria andEma16IsNull() {
            addCriterion("ema_16 is null");
            return (Criteria) this;
        }

        public Criteria andEma16IsNotNull() {
            addCriterion("ema_16 is not null");
            return (Criteria) this;
        }

        public Criteria andEma16EqualTo(Double value) {
            addCriterion("ema_16 =", value, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16NotEqualTo(Double value) {
            addCriterion("ema_16 <>", value, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16GreaterThan(Double value) {
            addCriterion("ema_16 >", value, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_16 >=", value, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16LessThan(Double value) {
            addCriterion("ema_16 <", value, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16LessThanOrEqualTo(Double value) {
            addCriterion("ema_16 <=", value, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16In(List<Double> values) {
            addCriterion("ema_16 in", values, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16NotIn(List<Double> values) {
            addCriterion("ema_16 not in", values, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16Between(Double value1, Double value2) {
            addCriterion("ema_16 between", value1, value2, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma16NotBetween(Double value1, Double value2) {
            addCriterion("ema_16 not between", value1, value2, "ema16");
            return (Criteria) this;
        }

        public Criteria andEma17IsNull() {
            addCriterion("ema_17 is null");
            return (Criteria) this;
        }

        public Criteria andEma17IsNotNull() {
            addCriterion("ema_17 is not null");
            return (Criteria) this;
        }

        public Criteria andEma17EqualTo(Double value) {
            addCriterion("ema_17 =", value, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17NotEqualTo(Double value) {
            addCriterion("ema_17 <>", value, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17GreaterThan(Double value) {
            addCriterion("ema_17 >", value, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_17 >=", value, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17LessThan(Double value) {
            addCriterion("ema_17 <", value, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17LessThanOrEqualTo(Double value) {
            addCriterion("ema_17 <=", value, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17In(List<Double> values) {
            addCriterion("ema_17 in", values, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17NotIn(List<Double> values) {
            addCriterion("ema_17 not in", values, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17Between(Double value1, Double value2) {
            addCriterion("ema_17 between", value1, value2, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma17NotBetween(Double value1, Double value2) {
            addCriterion("ema_17 not between", value1, value2, "ema17");
            return (Criteria) this;
        }

        public Criteria andEma18IsNull() {
            addCriterion("ema_18 is null");
            return (Criteria) this;
        }

        public Criteria andEma18IsNotNull() {
            addCriterion("ema_18 is not null");
            return (Criteria) this;
        }

        public Criteria andEma18EqualTo(Double value) {
            addCriterion("ema_18 =", value, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18NotEqualTo(Double value) {
            addCriterion("ema_18 <>", value, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18GreaterThan(Double value) {
            addCriterion("ema_18 >", value, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_18 >=", value, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18LessThan(Double value) {
            addCriterion("ema_18 <", value, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18LessThanOrEqualTo(Double value) {
            addCriterion("ema_18 <=", value, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18In(List<Double> values) {
            addCriterion("ema_18 in", values, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18NotIn(List<Double> values) {
            addCriterion("ema_18 not in", values, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18Between(Double value1, Double value2) {
            addCriterion("ema_18 between", value1, value2, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma18NotBetween(Double value1, Double value2) {
            addCriterion("ema_18 not between", value1, value2, "ema18");
            return (Criteria) this;
        }

        public Criteria andEma19IsNull() {
            addCriterion("ema_19 is null");
            return (Criteria) this;
        }

        public Criteria andEma19IsNotNull() {
            addCriterion("ema_19 is not null");
            return (Criteria) this;
        }

        public Criteria andEma19EqualTo(Double value) {
            addCriterion("ema_19 =", value, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19NotEqualTo(Double value) {
            addCriterion("ema_19 <>", value, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19GreaterThan(Double value) {
            addCriterion("ema_19 >", value, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_19 >=", value, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19LessThan(Double value) {
            addCriterion("ema_19 <", value, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19LessThanOrEqualTo(Double value) {
            addCriterion("ema_19 <=", value, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19In(List<Double> values) {
            addCriterion("ema_19 in", values, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19NotIn(List<Double> values) {
            addCriterion("ema_19 not in", values, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19Between(Double value1, Double value2) {
            addCriterion("ema_19 between", value1, value2, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma19NotBetween(Double value1, Double value2) {
            addCriterion("ema_19 not between", value1, value2, "ema19");
            return (Criteria) this;
        }

        public Criteria andEma20IsNull() {
            addCriterion("ema_20 is null");
            return (Criteria) this;
        }

        public Criteria andEma20IsNotNull() {
            addCriterion("ema_20 is not null");
            return (Criteria) this;
        }

        public Criteria andEma20EqualTo(Double value) {
            addCriterion("ema_20 =", value, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20NotEqualTo(Double value) {
            addCriterion("ema_20 <>", value, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20GreaterThan(Double value) {
            addCriterion("ema_20 >", value, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_20 >=", value, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20LessThan(Double value) {
            addCriterion("ema_20 <", value, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20LessThanOrEqualTo(Double value) {
            addCriterion("ema_20 <=", value, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20In(List<Double> values) {
            addCriterion("ema_20 in", values, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20NotIn(List<Double> values) {
            addCriterion("ema_20 not in", values, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20Between(Double value1, Double value2) {
            addCriterion("ema_20 between", value1, value2, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma20NotBetween(Double value1, Double value2) {
            addCriterion("ema_20 not between", value1, value2, "ema20");
            return (Criteria) this;
        }

        public Criteria andEma21IsNull() {
            addCriterion("ema_21 is null");
            return (Criteria) this;
        }

        public Criteria andEma21IsNotNull() {
            addCriterion("ema_21 is not null");
            return (Criteria) this;
        }

        public Criteria andEma21EqualTo(Double value) {
            addCriterion("ema_21 =", value, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21NotEqualTo(Double value) {
            addCriterion("ema_21 <>", value, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21GreaterThan(Double value) {
            addCriterion("ema_21 >", value, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_21 >=", value, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21LessThan(Double value) {
            addCriterion("ema_21 <", value, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21LessThanOrEqualTo(Double value) {
            addCriterion("ema_21 <=", value, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21In(List<Double> values) {
            addCriterion("ema_21 in", values, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21NotIn(List<Double> values) {
            addCriterion("ema_21 not in", values, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21Between(Double value1, Double value2) {
            addCriterion("ema_21 between", value1, value2, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma21NotBetween(Double value1, Double value2) {
            addCriterion("ema_21 not between", value1, value2, "ema21");
            return (Criteria) this;
        }

        public Criteria andEma22IsNull() {
            addCriterion("ema_22 is null");
            return (Criteria) this;
        }

        public Criteria andEma22IsNotNull() {
            addCriterion("ema_22 is not null");
            return (Criteria) this;
        }

        public Criteria andEma22EqualTo(Double value) {
            addCriterion("ema_22 =", value, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22NotEqualTo(Double value) {
            addCriterion("ema_22 <>", value, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22GreaterThan(Double value) {
            addCriterion("ema_22 >", value, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_22 >=", value, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22LessThan(Double value) {
            addCriterion("ema_22 <", value, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22LessThanOrEqualTo(Double value) {
            addCriterion("ema_22 <=", value, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22In(List<Double> values) {
            addCriterion("ema_22 in", values, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22NotIn(List<Double> values) {
            addCriterion("ema_22 not in", values, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22Between(Double value1, Double value2) {
            addCriterion("ema_22 between", value1, value2, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma22NotBetween(Double value1, Double value2) {
            addCriterion("ema_22 not between", value1, value2, "ema22");
            return (Criteria) this;
        }

        public Criteria andEma23IsNull() {
            addCriterion("ema_23 is null");
            return (Criteria) this;
        }

        public Criteria andEma23IsNotNull() {
            addCriterion("ema_23 is not null");
            return (Criteria) this;
        }

        public Criteria andEma23EqualTo(Double value) {
            addCriterion("ema_23 =", value, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23NotEqualTo(Double value) {
            addCriterion("ema_23 <>", value, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23GreaterThan(Double value) {
            addCriterion("ema_23 >", value, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_23 >=", value, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23LessThan(Double value) {
            addCriterion("ema_23 <", value, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23LessThanOrEqualTo(Double value) {
            addCriterion("ema_23 <=", value, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23In(List<Double> values) {
            addCriterion("ema_23 in", values, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23NotIn(List<Double> values) {
            addCriterion("ema_23 not in", values, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23Between(Double value1, Double value2) {
            addCriterion("ema_23 between", value1, value2, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma23NotBetween(Double value1, Double value2) {
            addCriterion("ema_23 not between", value1, value2, "ema23");
            return (Criteria) this;
        }

        public Criteria andEma24IsNull() {
            addCriterion("ema_24 is null");
            return (Criteria) this;
        }

        public Criteria andEma24IsNotNull() {
            addCriterion("ema_24 is not null");
            return (Criteria) this;
        }

        public Criteria andEma24EqualTo(Double value) {
            addCriterion("ema_24 =", value, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24NotEqualTo(Double value) {
            addCriterion("ema_24 <>", value, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24GreaterThan(Double value) {
            addCriterion("ema_24 >", value, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_24 >=", value, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24LessThan(Double value) {
            addCriterion("ema_24 <", value, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24LessThanOrEqualTo(Double value) {
            addCriterion("ema_24 <=", value, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24In(List<Double> values) {
            addCriterion("ema_24 in", values, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24NotIn(List<Double> values) {
            addCriterion("ema_24 not in", values, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24Between(Double value1, Double value2) {
            addCriterion("ema_24 between", value1, value2, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma24NotBetween(Double value1, Double value2) {
            addCriterion("ema_24 not between", value1, value2, "ema24");
            return (Criteria) this;
        }

        public Criteria andEma25IsNull() {
            addCriterion("ema_25 is null");
            return (Criteria) this;
        }

        public Criteria andEma25IsNotNull() {
            addCriterion("ema_25 is not null");
            return (Criteria) this;
        }

        public Criteria andEma25EqualTo(Double value) {
            addCriterion("ema_25 =", value, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25NotEqualTo(Double value) {
            addCriterion("ema_25 <>", value, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25GreaterThan(Double value) {
            addCriterion("ema_25 >", value, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_25 >=", value, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25LessThan(Double value) {
            addCriterion("ema_25 <", value, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25LessThanOrEqualTo(Double value) {
            addCriterion("ema_25 <=", value, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25In(List<Double> values) {
            addCriterion("ema_25 in", values, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25NotIn(List<Double> values) {
            addCriterion("ema_25 not in", values, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25Between(Double value1, Double value2) {
            addCriterion("ema_25 between", value1, value2, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma25NotBetween(Double value1, Double value2) {
            addCriterion("ema_25 not between", value1, value2, "ema25");
            return (Criteria) this;
        }

        public Criteria andEma26IsNull() {
            addCriterion("ema_26 is null");
            return (Criteria) this;
        }

        public Criteria andEma26IsNotNull() {
            addCriterion("ema_26 is not null");
            return (Criteria) this;
        }

        public Criteria andEma26EqualTo(Double value) {
            addCriterion("ema_26 =", value, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26NotEqualTo(Double value) {
            addCriterion("ema_26 <>", value, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26GreaterThan(Double value) {
            addCriterion("ema_26 >", value, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_26 >=", value, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26LessThan(Double value) {
            addCriterion("ema_26 <", value, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26LessThanOrEqualTo(Double value) {
            addCriterion("ema_26 <=", value, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26In(List<Double> values) {
            addCriterion("ema_26 in", values, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26NotIn(List<Double> values) {
            addCriterion("ema_26 not in", values, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26Between(Double value1, Double value2) {
            addCriterion("ema_26 between", value1, value2, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma26NotBetween(Double value1, Double value2) {
            addCriterion("ema_26 not between", value1, value2, "ema26");
            return (Criteria) this;
        }

        public Criteria andEma27IsNull() {
            addCriterion("ema_27 is null");
            return (Criteria) this;
        }

        public Criteria andEma27IsNotNull() {
            addCriterion("ema_27 is not null");
            return (Criteria) this;
        }

        public Criteria andEma27EqualTo(Double value) {
            addCriterion("ema_27 =", value, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27NotEqualTo(Double value) {
            addCriterion("ema_27 <>", value, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27GreaterThan(Double value) {
            addCriterion("ema_27 >", value, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_27 >=", value, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27LessThan(Double value) {
            addCriterion("ema_27 <", value, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27LessThanOrEqualTo(Double value) {
            addCriterion("ema_27 <=", value, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27In(List<Double> values) {
            addCriterion("ema_27 in", values, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27NotIn(List<Double> values) {
            addCriterion("ema_27 not in", values, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27Between(Double value1, Double value2) {
            addCriterion("ema_27 between", value1, value2, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma27NotBetween(Double value1, Double value2) {
            addCriterion("ema_27 not between", value1, value2, "ema27");
            return (Criteria) this;
        }

        public Criteria andEma28IsNull() {
            addCriterion("ema_28 is null");
            return (Criteria) this;
        }

        public Criteria andEma28IsNotNull() {
            addCriterion("ema_28 is not null");
            return (Criteria) this;
        }

        public Criteria andEma28EqualTo(Double value) {
            addCriterion("ema_28 =", value, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28NotEqualTo(Double value) {
            addCriterion("ema_28 <>", value, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28GreaterThan(Double value) {
            addCriterion("ema_28 >", value, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_28 >=", value, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28LessThan(Double value) {
            addCriterion("ema_28 <", value, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28LessThanOrEqualTo(Double value) {
            addCriterion("ema_28 <=", value, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28In(List<Double> values) {
            addCriterion("ema_28 in", values, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28NotIn(List<Double> values) {
            addCriterion("ema_28 not in", values, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28Between(Double value1, Double value2) {
            addCriterion("ema_28 between", value1, value2, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma28NotBetween(Double value1, Double value2) {
            addCriterion("ema_28 not between", value1, value2, "ema28");
            return (Criteria) this;
        }

        public Criteria andEma29IsNull() {
            addCriterion("ema_29 is null");
            return (Criteria) this;
        }

        public Criteria andEma29IsNotNull() {
            addCriterion("ema_29 is not null");
            return (Criteria) this;
        }

        public Criteria andEma29EqualTo(Double value) {
            addCriterion("ema_29 =", value, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29NotEqualTo(Double value) {
            addCriterion("ema_29 <>", value, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29GreaterThan(Double value) {
            addCriterion("ema_29 >", value, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_29 >=", value, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29LessThan(Double value) {
            addCriterion("ema_29 <", value, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29LessThanOrEqualTo(Double value) {
            addCriterion("ema_29 <=", value, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29In(List<Double> values) {
            addCriterion("ema_29 in", values, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29NotIn(List<Double> values) {
            addCriterion("ema_29 not in", values, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29Between(Double value1, Double value2) {
            addCriterion("ema_29 between", value1, value2, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma29NotBetween(Double value1, Double value2) {
            addCriterion("ema_29 not between", value1, value2, "ema29");
            return (Criteria) this;
        }

        public Criteria andEma30IsNull() {
            addCriterion("ema_30 is null");
            return (Criteria) this;
        }

        public Criteria andEma30IsNotNull() {
            addCriterion("ema_30 is not null");
            return (Criteria) this;
        }

        public Criteria andEma30EqualTo(Double value) {
            addCriterion("ema_30 =", value, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30NotEqualTo(Double value) {
            addCriterion("ema_30 <>", value, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30GreaterThan(Double value) {
            addCriterion("ema_30 >", value, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_30 >=", value, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30LessThan(Double value) {
            addCriterion("ema_30 <", value, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30LessThanOrEqualTo(Double value) {
            addCriterion("ema_30 <=", value, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30In(List<Double> values) {
            addCriterion("ema_30 in", values, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30NotIn(List<Double> values) {
            addCriterion("ema_30 not in", values, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30Between(Double value1, Double value2) {
            addCriterion("ema_30 between", value1, value2, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma30NotBetween(Double value1, Double value2) {
            addCriterion("ema_30 not between", value1, value2, "ema30");
            return (Criteria) this;
        }

        public Criteria andEma35IsNull() {
            addCriterion("ema_35 is null");
            return (Criteria) this;
        }

        public Criteria andEma35IsNotNull() {
            addCriterion("ema_35 is not null");
            return (Criteria) this;
        }

        public Criteria andEma35EqualTo(Double value) {
            addCriterion("ema_35 =", value, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35NotEqualTo(Double value) {
            addCriterion("ema_35 <>", value, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35GreaterThan(Double value) {
            addCriterion("ema_35 >", value, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_35 >=", value, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35LessThan(Double value) {
            addCriterion("ema_35 <", value, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35LessThanOrEqualTo(Double value) {
            addCriterion("ema_35 <=", value, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35In(List<Double> values) {
            addCriterion("ema_35 in", values, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35NotIn(List<Double> values) {
            addCriterion("ema_35 not in", values, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35Between(Double value1, Double value2) {
            addCriterion("ema_35 between", value1, value2, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma35NotBetween(Double value1, Double value2) {
            addCriterion("ema_35 not between", value1, value2, "ema35");
            return (Criteria) this;
        }

        public Criteria andEma40IsNull() {
            addCriterion("ema_40 is null");
            return (Criteria) this;
        }

        public Criteria andEma40IsNotNull() {
            addCriterion("ema_40 is not null");
            return (Criteria) this;
        }

        public Criteria andEma40EqualTo(Double value) {
            addCriterion("ema_40 =", value, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40NotEqualTo(Double value) {
            addCriterion("ema_40 <>", value, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40GreaterThan(Double value) {
            addCriterion("ema_40 >", value, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_40 >=", value, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40LessThan(Double value) {
            addCriterion("ema_40 <", value, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40LessThanOrEqualTo(Double value) {
            addCriterion("ema_40 <=", value, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40In(List<Double> values) {
            addCriterion("ema_40 in", values, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40NotIn(List<Double> values) {
            addCriterion("ema_40 not in", values, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40Between(Double value1, Double value2) {
            addCriterion("ema_40 between", value1, value2, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma40NotBetween(Double value1, Double value2) {
            addCriterion("ema_40 not between", value1, value2, "ema40");
            return (Criteria) this;
        }

        public Criteria andEma45IsNull() {
            addCriterion("ema_45 is null");
            return (Criteria) this;
        }

        public Criteria andEma45IsNotNull() {
            addCriterion("ema_45 is not null");
            return (Criteria) this;
        }

        public Criteria andEma45EqualTo(Double value) {
            addCriterion("ema_45 =", value, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45NotEqualTo(Double value) {
            addCriterion("ema_45 <>", value, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45GreaterThan(Double value) {
            addCriterion("ema_45 >", value, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_45 >=", value, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45LessThan(Double value) {
            addCriterion("ema_45 <", value, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45LessThanOrEqualTo(Double value) {
            addCriterion("ema_45 <=", value, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45In(List<Double> values) {
            addCriterion("ema_45 in", values, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45NotIn(List<Double> values) {
            addCriterion("ema_45 not in", values, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45Between(Double value1, Double value2) {
            addCriterion("ema_45 between", value1, value2, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma45NotBetween(Double value1, Double value2) {
            addCriterion("ema_45 not between", value1, value2, "ema45");
            return (Criteria) this;
        }

        public Criteria andEma50IsNull() {
            addCriterion("ema_50 is null");
            return (Criteria) this;
        }

        public Criteria andEma50IsNotNull() {
            addCriterion("ema_50 is not null");
            return (Criteria) this;
        }

        public Criteria andEma50EqualTo(Double value) {
            addCriterion("ema_50 =", value, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50NotEqualTo(Double value) {
            addCriterion("ema_50 <>", value, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50GreaterThan(Double value) {
            addCriterion("ema_50 >", value, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_50 >=", value, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50LessThan(Double value) {
            addCriterion("ema_50 <", value, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50LessThanOrEqualTo(Double value) {
            addCriterion("ema_50 <=", value, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50In(List<Double> values) {
            addCriterion("ema_50 in", values, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50NotIn(List<Double> values) {
            addCriterion("ema_50 not in", values, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50Between(Double value1, Double value2) {
            addCriterion("ema_50 between", value1, value2, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma50NotBetween(Double value1, Double value2) {
            addCriterion("ema_50 not between", value1, value2, "ema50");
            return (Criteria) this;
        }

        public Criteria andEma55IsNull() {
            addCriterion("ema_55 is null");
            return (Criteria) this;
        }

        public Criteria andEma55IsNotNull() {
            addCriterion("ema_55 is not null");
            return (Criteria) this;
        }

        public Criteria andEma55EqualTo(Double value) {
            addCriterion("ema_55 =", value, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55NotEqualTo(Double value) {
            addCriterion("ema_55 <>", value, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55GreaterThan(Double value) {
            addCriterion("ema_55 >", value, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_55 >=", value, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55LessThan(Double value) {
            addCriterion("ema_55 <", value, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55LessThanOrEqualTo(Double value) {
            addCriterion("ema_55 <=", value, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55In(List<Double> values) {
            addCriterion("ema_55 in", values, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55NotIn(List<Double> values) {
            addCriterion("ema_55 not in", values, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55Between(Double value1, Double value2) {
            addCriterion("ema_55 between", value1, value2, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma55NotBetween(Double value1, Double value2) {
            addCriterion("ema_55 not between", value1, value2, "ema55");
            return (Criteria) this;
        }

        public Criteria andEma60IsNull() {
            addCriterion("ema_60 is null");
            return (Criteria) this;
        }

        public Criteria andEma60IsNotNull() {
            addCriterion("ema_60 is not null");
            return (Criteria) this;
        }

        public Criteria andEma60EqualTo(Double value) {
            addCriterion("ema_60 =", value, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60NotEqualTo(Double value) {
            addCriterion("ema_60 <>", value, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60GreaterThan(Double value) {
            addCriterion("ema_60 >", value, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60GreaterThanOrEqualTo(Double value) {
            addCriterion("ema_60 >=", value, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60LessThan(Double value) {
            addCriterion("ema_60 <", value, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60LessThanOrEqualTo(Double value) {
            addCriterion("ema_60 <=", value, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60In(List<Double> values) {
            addCriterion("ema_60 in", values, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60NotIn(List<Double> values) {
            addCriterion("ema_60 not in", values, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60Between(Double value1, Double value2) {
            addCriterion("ema_60 between", value1, value2, "ema60");
            return (Criteria) this;
        }

        public Criteria andEma60NotBetween(Double value1, Double value2) {
            addCriterion("ema_60 not between", value1, value2, "ema60");
            return (Criteria) this;
        }

        public Criteria limitCount(int count) {
            addCriterion(" limit " + count);
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