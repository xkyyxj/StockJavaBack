package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class CurrHoldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrHoldExample() {
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

        public Criteria andPkCurrHoldIsNull() {
            addCriterion("pk_curr_hold is null");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldIsNotNull() {
            addCriterion("pk_curr_hold is not null");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldEqualTo(Integer value) {
            addCriterion("pk_curr_hold =", value, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldNotEqualTo(Integer value) {
            addCriterion("pk_curr_hold <>", value, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldGreaterThan(Integer value) {
            addCriterion("pk_curr_hold >", value, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_curr_hold >=", value, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldLessThan(Integer value) {
            addCriterion("pk_curr_hold <", value, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldLessThanOrEqualTo(Integer value) {
            addCriterion("pk_curr_hold <=", value, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldIn(List<Integer> values) {
            addCriterion("pk_curr_hold in", values, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldNotIn(List<Integer> values) {
            addCriterion("pk_curr_hold not in", values, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldBetween(Integer value1, Integer value2) {
            addCriterion("pk_curr_hold between", value1, value2, "pkCurrHold");
            return (Criteria) this;
        }

        public Criteria andPkCurrHoldNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_curr_hold not between", value1, value2, "pkCurrHold");
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

        public Criteria andHoldPriceIsNull() {
            addCriterion("hold_price is null");
            return (Criteria) this;
        }

        public Criteria andHoldPriceIsNotNull() {
            addCriterion("hold_price is not null");
            return (Criteria) this;
        }

        public Criteria andHoldPriceEqualTo(Double value) {
            addCriterion("hold_price =", value, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceNotEqualTo(Double value) {
            addCriterion("hold_price <>", value, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceGreaterThan(Double value) {
            addCriterion("hold_price >", value, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hold_price >=", value, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceLessThan(Double value) {
            addCriterion("hold_price <", value, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceLessThanOrEqualTo(Double value) {
            addCriterion("hold_price <=", value, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceIn(List<Double> values) {
            addCriterion("hold_price in", values, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceNotIn(List<Double> values) {
            addCriterion("hold_price not in", values, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceBetween(Double value1, Double value2) {
            addCriterion("hold_price between", value1, value2, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andHoldPriceNotBetween(Double value1, Double value2) {
            addCriterion("hold_price not between", value1, value2, "holdPrice");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayIsNull() {
            addCriterion("first_hold_day is null");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayIsNotNull() {
            addCriterion("first_hold_day is not null");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayEqualTo(String value) {
            addCriterion("first_hold_day =", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayNotEqualTo(String value) {
            addCriterion("first_hold_day <>", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayGreaterThan(String value) {
            addCriterion("first_hold_day >", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayGreaterThanOrEqualTo(String value) {
            addCriterion("first_hold_day >=", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayLessThan(String value) {
            addCriterion("first_hold_day <", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayLessThanOrEqualTo(String value) {
            addCriterion("first_hold_day <=", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayLike(String value) {
            addCriterion("first_hold_day like", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayNotLike(String value) {
            addCriterion("first_hold_day not like", value, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayIn(List<String> values) {
            addCriterion("first_hold_day in", values, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayNotIn(List<String> values) {
            addCriterion("first_hold_day not in", values, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayBetween(String value1, String value2) {
            addCriterion("first_hold_day between", value1, value2, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andFirstHoldDayNotBetween(String value1, String value2) {
            addCriterion("first_hold_day not between", value1, value2, "firstHoldDay");
            return (Criteria) this;
        }

        public Criteria andHoldNumIsNull() {
            addCriterion("hold_num is null");
            return (Criteria) this;
        }

        public Criteria andHoldNumIsNotNull() {
            addCriterion("hold_num is not null");
            return (Criteria) this;
        }

        public Criteria andHoldNumEqualTo(Integer value) {
            addCriterion("hold_num =", value, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumNotEqualTo(Integer value) {
            addCriterion("hold_num <>", value, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumGreaterThan(Integer value) {
            addCriterion("hold_num >", value, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hold_num >=", value, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumLessThan(Integer value) {
            addCriterion("hold_num <", value, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumLessThanOrEqualTo(Integer value) {
            addCriterion("hold_num <=", value, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumIn(List<Integer> values) {
            addCriterion("hold_num in", values, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumNotIn(List<Integer> values) {
            addCriterion("hold_num not in", values, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumBetween(Integer value1, Integer value2) {
            addCriterion("hold_num between", value1, value2, "holdNum");
            return (Criteria) this;
        }

        public Criteria andHoldNumNotBetween(Integer value1, Integer value2) {
            addCriterion("hold_num not between", value1, value2, "holdNum");
            return (Criteria) this;
        }

        public Criteria andWinPctIsNull() {
            addCriterion("win_pct is null");
            return (Criteria) this;
        }

        public Criteria andWinPctIsNotNull() {
            addCriterion("win_pct is not null");
            return (Criteria) this;
        }

        public Criteria andWinPctEqualTo(Double value) {
            addCriterion("win_pct =", value, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctNotEqualTo(Double value) {
            addCriterion("win_pct <>", value, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctGreaterThan(Double value) {
            addCriterion("win_pct >", value, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctGreaterThanOrEqualTo(Double value) {
            addCriterion("win_pct >=", value, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctLessThan(Double value) {
            addCriterion("win_pct <", value, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctLessThanOrEqualTo(Double value) {
            addCriterion("win_pct <=", value, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctIn(List<Double> values) {
            addCriterion("win_pct in", values, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctNotIn(List<Double> values) {
            addCriterion("win_pct not in", values, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctBetween(Double value1, Double value2) {
            addCriterion("win_pct between", value1, value2, "winPct");
            return (Criteria) this;
        }

        public Criteria andWinPctNotBetween(Double value1, Double value2) {
            addCriterion("win_pct not between", value1, value2, "winPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctIsNull() {
            addCriterion("max_win_pct is null");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctIsNotNull() {
            addCriterion("max_win_pct is not null");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctEqualTo(Double value) {
            addCriterion("max_win_pct =", value, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctNotEqualTo(Double value) {
            addCriterion("max_win_pct <>", value, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctGreaterThan(Double value) {
            addCriterion("max_win_pct >", value, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctGreaterThanOrEqualTo(Double value) {
            addCriterion("max_win_pct >=", value, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctLessThan(Double value) {
            addCriterion("max_win_pct <", value, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctLessThanOrEqualTo(Double value) {
            addCriterion("max_win_pct <=", value, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctIn(List<Double> values) {
            addCriterion("max_win_pct in", values, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctNotIn(List<Double> values) {
            addCriterion("max_win_pct not in", values, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctBetween(Double value1, Double value2) {
            addCriterion("max_win_pct between", value1, value2, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMaxWinPctNotBetween(Double value1, Double value2) {
            addCriterion("max_win_pct not between", value1, value2, "maxWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctIsNull() {
            addCriterion("min_win_pct is null");
            return (Criteria) this;
        }

        public Criteria andMinWinPctIsNotNull() {
            addCriterion("min_win_pct is not null");
            return (Criteria) this;
        }

        public Criteria andMinWinPctEqualTo(Double value) {
            addCriterion("min_win_pct =", value, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctNotEqualTo(Double value) {
            addCriterion("min_win_pct <>", value, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctGreaterThan(Double value) {
            addCriterion("min_win_pct >", value, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctGreaterThanOrEqualTo(Double value) {
            addCriterion("min_win_pct >=", value, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctLessThan(Double value) {
            addCriterion("min_win_pct <", value, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctLessThanOrEqualTo(Double value) {
            addCriterion("min_win_pct <=", value, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctIn(List<Double> values) {
            addCriterion("min_win_pct in", values, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctNotIn(List<Double> values) {
            addCriterion("min_win_pct not in", values, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctBetween(Double value1, Double value2) {
            addCriterion("min_win_pct between", value1, value2, "minWinPct");
            return (Criteria) this;
        }

        public Criteria andMinWinPctNotBetween(Double value1, Double value2) {
            addCriterion("min_win_pct not between", value1, value2, "minWinPct");
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