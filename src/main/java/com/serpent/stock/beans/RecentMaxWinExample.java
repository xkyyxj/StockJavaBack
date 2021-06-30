package com.serpent.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class RecentMaxWinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecentMaxWinExample() {
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

        public Criteria andPkRecentWinIsNull() {
            addCriterion("pk_recent_win is null");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinIsNotNull() {
            addCriterion("pk_recent_win is not null");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinEqualTo(Integer value) {
            addCriterion("pk_recent_win =", value, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinNotEqualTo(Integer value) {
            addCriterion("pk_recent_win <>", value, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinGreaterThan(Integer value) {
            addCriterion("pk_recent_win >", value, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_recent_win >=", value, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinLessThan(Integer value) {
            addCriterion("pk_recent_win <", value, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinLessThanOrEqualTo(Integer value) {
            addCriterion("pk_recent_win <=", value, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinIn(List<Integer> values) {
            addCriterion("pk_recent_win in", values, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinNotIn(List<Integer> values) {
            addCriterion("pk_recent_win not in", values, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinBetween(Integer value1, Integer value2) {
            addCriterion("pk_recent_win between", value1, value2, "pkRecentWin");
            return (Criteria) this;
        }

        public Criteria andPkRecentWinNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_recent_win not between", value1, value2, "pkRecentWin");
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

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andLastCloseIsNull() {
            addCriterion("last_close is null");
            return (Criteria) this;
        }

        public Criteria andLastCloseIsNotNull() {
            addCriterion("last_close is not null");
            return (Criteria) this;
        }

        public Criteria andLastCloseEqualTo(Double value) {
            addCriterion("last_close =", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotEqualTo(Double value) {
            addCriterion("last_close <>", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseGreaterThan(Double value) {
            addCriterion("last_close >", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseGreaterThanOrEqualTo(Double value) {
            addCriterion("last_close >=", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseLessThan(Double value) {
            addCriterion("last_close <", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseLessThanOrEqualTo(Double value) {
            addCriterion("last_close <=", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseIn(List<Double> values) {
            addCriterion("last_close in", values, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotIn(List<Double> values) {
            addCriterion("last_close not in", values, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseBetween(Double value1, Double value2) {
            addCriterion("last_close between", value1, value2, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotBetween(Double value1, Double value2) {
            addCriterion("last_close not between", value1, value2, "lastClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseIsNull() {
            addCriterion("first_close is null");
            return (Criteria) this;
        }

        public Criteria andFirstCloseIsNotNull() {
            addCriterion("first_close is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCloseEqualTo(Double value) {
            addCriterion("first_close =", value, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseNotEqualTo(Double value) {
            addCriterion("first_close <>", value, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseGreaterThan(Double value) {
            addCriterion("first_close >", value, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseGreaterThanOrEqualTo(Double value) {
            addCriterion("first_close >=", value, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseLessThan(Double value) {
            addCriterion("first_close <", value, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseLessThanOrEqualTo(Double value) {
            addCriterion("first_close <=", value, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseIn(List<Double> values) {
            addCriterion("first_close in", values, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseNotIn(List<Double> values) {
            addCriterion("first_close not in", values, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseBetween(Double value1, Double value2) {
            addCriterion("first_close between", value1, value2, "firstClose");
            return (Criteria) this;
        }

        public Criteria andFirstCloseNotBetween(Double value1, Double value2) {
            addCriterion("first_close not between", value1, value2, "firstClose");
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