package com.cassiopeia.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class HistoryDownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryDownExample() {
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

        public Criteria andPkHistoryDownIsNull() {
            addCriterion("pk_history_down is null");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownIsNotNull() {
            addCriterion("pk_history_down is not null");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownEqualTo(Integer value) {
            addCriterion("pk_history_down =", value, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownNotEqualTo(Integer value) {
            addCriterion("pk_history_down <>", value, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownGreaterThan(Integer value) {
            addCriterion("pk_history_down >", value, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_history_down >=", value, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownLessThan(Integer value) {
            addCriterion("pk_history_down <", value, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownLessThanOrEqualTo(Integer value) {
            addCriterion("pk_history_down <=", value, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownIn(List<Integer> values) {
            addCriterion("pk_history_down in", values, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownNotIn(List<Integer> values) {
            addCriterion("pk_history_down not in", values, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownBetween(Integer value1, Integer value2) {
            addCriterion("pk_history_down between", value1, value2, "pkHistoryDown");
            return (Criteria) this;
        }

        public Criteria andPkHistoryDownNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_history_down not between", value1, value2, "pkHistoryDown");
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

        public Criteria andHistoryLenIsNull() {
            addCriterion("history_len is null");
            return (Criteria) this;
        }

        public Criteria andHistoryLenIsNotNull() {
            addCriterion("history_len is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryLenEqualTo(Integer value) {
            addCriterion("history_len =", value, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenNotEqualTo(Integer value) {
            addCriterion("history_len <>", value, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenGreaterThan(Integer value) {
            addCriterion("history_len >", value, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_len >=", value, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenLessThan(Integer value) {
            addCriterion("history_len <", value, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenLessThanOrEqualTo(Integer value) {
            addCriterion("history_len <=", value, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenIn(List<Integer> values) {
            addCriterion("history_len in", values, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenNotIn(List<Integer> values) {
            addCriterion("history_len not in", values, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenBetween(Integer value1, Integer value2) {
            addCriterion("history_len between", value1, value2, "historyLen");
            return (Criteria) this;
        }

        public Criteria andHistoryLenNotBetween(Integer value1, Integer value2) {
            addCriterion("history_len not between", value1, value2, "historyLen");
            return (Criteria) this;
        }

        public Criteria andDeltaPctIsNull() {
            addCriterion("delta_pct is null");
            return (Criteria) this;
        }

        public Criteria andDeltaPctIsNotNull() {
            addCriterion("delta_pct is not null");
            return (Criteria) this;
        }

        public Criteria andDeltaPctEqualTo(Double value) {
            addCriterion("delta_pct =", value, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctNotEqualTo(Double value) {
            addCriterion("delta_pct <>", value, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctGreaterThan(Double value) {
            addCriterion("delta_pct >", value, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctGreaterThanOrEqualTo(Double value) {
            addCriterion("delta_pct >=", value, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctLessThan(Double value) {
            addCriterion("delta_pct <", value, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctLessThanOrEqualTo(Double value) {
            addCriterion("delta_pct <=", value, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctIn(List<Double> values) {
            addCriterion("delta_pct in", values, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctNotIn(List<Double> values) {
            addCriterion("delta_pct not in", values, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctBetween(Double value1, Double value2) {
            addCriterion("delta_pct between", value1, value2, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andDeltaPctNotBetween(Double value1, Double value2) {
            addCriterion("delta_pct not between", value1, value2, "deltaPct");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceIsNull() {
            addCriterion("his_down_price is null");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceIsNotNull() {
            addCriterion("his_down_price is not null");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceEqualTo(Double value) {
            addCriterion("his_down_price =", value, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceNotEqualTo(Double value) {
            addCriterion("his_down_price <>", value, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceGreaterThan(Double value) {
            addCriterion("his_down_price >", value, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("his_down_price >=", value, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceLessThan(Double value) {
            addCriterion("his_down_price <", value, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceLessThanOrEqualTo(Double value) {
            addCriterion("his_down_price <=", value, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceIn(List<Double> values) {
            addCriterion("his_down_price in", values, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceNotIn(List<Double> values) {
            addCriterion("his_down_price not in", values, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceBetween(Double value1, Double value2) {
            addCriterion("his_down_price between", value1, value2, "hisDownPrice");
            return (Criteria) this;
        }

        public Criteria andHisDownPriceNotBetween(Double value1, Double value2) {
            addCriterion("his_down_price not between", value1, value2, "hisDownPrice");
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