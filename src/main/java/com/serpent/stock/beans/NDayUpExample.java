package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class NDayUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NDayUpExample() {
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

        public Criteria andPkTwoUpIsNull() {
            addCriterion("pk_two_up is null");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpIsNotNull() {
            addCriterion("pk_two_up is not null");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpEqualTo(Integer value) {
            addCriterion("pk_two_up =", value, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpNotEqualTo(Integer value) {
            addCriterion("pk_two_up <>", value, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpGreaterThan(Integer value) {
            addCriterion("pk_two_up >", value, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_two_up >=", value, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpLessThan(Integer value) {
            addCriterion("pk_two_up <", value, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpLessThanOrEqualTo(Integer value) {
            addCriterion("pk_two_up <=", value, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpIn(List<Integer> values) {
            addCriterion("pk_two_up in", values, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpNotIn(List<Integer> values) {
            addCriterion("pk_two_up not in", values, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpBetween(Integer value1, Integer value2) {
            addCriterion("pk_two_up between", value1, value2, "pkTwoUp");
            return (Criteria) this;
        }

        public Criteria andPkTwoUpNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_two_up not between", value1, value2, "pkTwoUp");
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

        public Criteria andCurrCloseIsNull() {
            addCriterion("curr_close is null");
            return (Criteria) this;
        }

        public Criteria andCurrCloseIsNotNull() {
            addCriterion("curr_close is not null");
            return (Criteria) this;
        }

        public Criteria andCurrCloseEqualTo(String value) {
            addCriterion("curr_close =", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseNotEqualTo(String value) {
            addCriterion("curr_close <>", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseGreaterThan(String value) {
            addCriterion("curr_close >", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseGreaterThanOrEqualTo(String value) {
            addCriterion("curr_close >=", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseLessThan(String value) {
            addCriterion("curr_close <", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseLessThanOrEqualTo(String value) {
            addCriterion("curr_close <=", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseLike(String value) {
            addCriterion("curr_close like", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseNotLike(String value) {
            addCriterion("curr_close not like", value, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseIn(List<String> values) {
            addCriterion("curr_close in", values, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseNotIn(List<String> values) {
            addCriterion("curr_close not in", values, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseBetween(String value1, String value2) {
            addCriterion("curr_close between", value1, value2, "currClose");
            return (Criteria) this;
        }

        public Criteria andCurrCloseNotBetween(String value1, String value2) {
            addCriterion("curr_close not between", value1, value2, "currClose");
            return (Criteria) this;
        }

        public Criteria andNDayPctIsNull() {
            addCriterion("n_day_pct is null");
            return (Criteria) this;
        }

        public Criteria andNDayPctIsNotNull() {
            addCriterion("n_day_pct is not null");
            return (Criteria) this;
        }

        public Criteria andNDayPctEqualTo(String value) {
            addCriterion("n_day_pct =", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctNotEqualTo(String value) {
            addCriterion("n_day_pct <>", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctGreaterThan(String value) {
            addCriterion("n_day_pct >", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctGreaterThanOrEqualTo(String value) {
            addCriterion("n_day_pct >=", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctLessThan(String value) {
            addCriterion("n_day_pct <", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctLessThanOrEqualTo(String value) {
            addCriterion("n_day_pct <=", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctLike(String value) {
            addCriterion("n_day_pct like", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctNotLike(String value) {
            addCriterion("n_day_pct not like", value, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctIn(List<String> values) {
            addCriterion("n_day_pct in", values, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctNotIn(List<String> values) {
            addCriterion("n_day_pct not in", values, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctBetween(String value1, String value2) {
            addCriterion("n_day_pct between", value1, value2, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andNDayPctNotBetween(String value1, String value2) {
            addCriterion("n_day_pct not between", value1, value2, "nDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctIsNull() {
            addCriterion("five_day_pct is null");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctIsNotNull() {
            addCriterion("five_day_pct is not null");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctEqualTo(String value) {
            addCriterion("five_day_pct =", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctNotEqualTo(String value) {
            addCriterion("five_day_pct <>", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctGreaterThan(String value) {
            addCriterion("five_day_pct >", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctGreaterThanOrEqualTo(String value) {
            addCriterion("five_day_pct >=", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctLessThan(String value) {
            addCriterion("five_day_pct <", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctLessThanOrEqualTo(String value) {
            addCriterion("five_day_pct <=", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctLike(String value) {
            addCriterion("five_day_pct like", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctNotLike(String value) {
            addCriterion("five_day_pct not like", value, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctIn(List<String> values) {
            addCriterion("five_day_pct in", values, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctNotIn(List<String> values) {
            addCriterion("five_day_pct not in", values, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctBetween(String value1, String value2) {
            addCriterion("five_day_pct between", value1, value2, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andFiveDayPctNotBetween(String value1, String value2) {
            addCriterion("five_day_pct not between", value1, value2, "fiveDayPct");
            return (Criteria) this;
        }

        public Criteria andUpCountIsNull() {
            addCriterion("up_count is null");
            return (Criteria) this;
        }

        public Criteria andUpCountIsNotNull() {
            addCriterion("up_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpCountEqualTo(Integer value) {
            addCriterion("up_count =", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotEqualTo(Integer value) {
            addCriterion("up_count <>", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountGreaterThan(Integer value) {
            addCriterion("up_count >", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_count >=", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountLessThan(Integer value) {
            addCriterion("up_count <", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountLessThanOrEqualTo(Integer value) {
            addCriterion("up_count <=", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountIn(List<Integer> values) {
            addCriterion("up_count in", values, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotIn(List<Integer> values) {
            addCriterion("up_count not in", values, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountBetween(Integer value1, Integer value2) {
            addCriterion("up_count between", value1, value2, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotBetween(Integer value1, Integer value2) {
            addCriterion("up_count not between", value1, value2, "upCount");
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