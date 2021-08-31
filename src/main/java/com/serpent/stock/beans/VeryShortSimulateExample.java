package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class VeryShortSimulateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VeryShortSimulateExample() {
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

        public Criteria andPkShortIsNull() {
            addCriterion("pk_short is null");
            return (Criteria) this;
        }

        public Criteria andPkShortIsNotNull() {
            addCriterion("pk_short is not null");
            return (Criteria) this;
        }

        public Criteria andPkShortEqualTo(Integer value) {
            addCriterion("pk_short =", value, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortNotEqualTo(Integer value) {
            addCriterion("pk_short <>", value, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortGreaterThan(Integer value) {
            addCriterion("pk_short >", value, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_short >=", value, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortLessThan(Integer value) {
            addCriterion("pk_short <", value, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortLessThanOrEqualTo(Integer value) {
            addCriterion("pk_short <=", value, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortIn(List<Integer> values) {
            addCriterion("pk_short in", values, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortNotIn(List<Integer> values) {
            addCriterion("pk_short not in", values, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortBetween(Integer value1, Integer value2) {
            addCriterion("pk_short between", value1, value2, "pkShort");
            return (Criteria) this;
        }

        public Criteria andPkShortNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_short not between", value1, value2, "pkShort");
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

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(String value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(String value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(String value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(String value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(String value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLike(String value) {
            addCriterion("in_time like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotLike(String value) {
            addCriterion("in_time not like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<String> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<String> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(String value1, String value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(String value1, String value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
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

        public Criteria andOutPriceIsNull() {
            addCriterion("out_price is null");
            return (Criteria) this;
        }

        public Criteria andOutPriceIsNotNull() {
            addCriterion("out_price is not null");
            return (Criteria) this;
        }

        public Criteria andOutPriceEqualTo(Double value) {
            addCriterion("out_price =", value, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceNotEqualTo(Double value) {
            addCriterion("out_price <>", value, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceGreaterThan(Double value) {
            addCriterion("out_price >", value, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("out_price >=", value, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceLessThan(Double value) {
            addCriterion("out_price <", value, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceLessThanOrEqualTo(Double value) {
            addCriterion("out_price <=", value, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceIn(List<Double> values) {
            addCriterion("out_price in", values, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceNotIn(List<Double> values) {
            addCriterion("out_price not in", values, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceBetween(Double value1, Double value2) {
            addCriterion("out_price between", value1, value2, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutPriceNotBetween(Double value1, Double value2) {
            addCriterion("out_price not between", value1, value2, "outPrice");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(String value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(String value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(String value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(String value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(String value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(String value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLike(String value) {
            addCriterion("out_time like", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotLike(String value) {
            addCriterion("out_time not like", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<String> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<String> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(String value1, String value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(String value1, String value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
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