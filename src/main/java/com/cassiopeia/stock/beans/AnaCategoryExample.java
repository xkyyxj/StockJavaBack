package com.cassiopeia.stock.beans;

import java.util.ArrayList;
import java.util.List;

public class AnaCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnaCategoryExample() {
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

        public Criteria andPkCategoryIsNull() {
            addCriterion("pk_category is null");
            return (Criteria) this;
        }

        public Criteria andPkCategoryIsNotNull() {
            addCriterion("pk_category is not null");
            return (Criteria) this;
        }

        public Criteria andPkCategoryEqualTo(Integer value) {
            addCriterion("pk_category =", value, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryNotEqualTo(Integer value) {
            addCriterion("pk_category <>", value, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryGreaterThan(Integer value) {
            addCriterion("pk_category >", value, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_category >=", value, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryLessThan(Integer value) {
            addCriterion("pk_category <", value, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("pk_category <=", value, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryIn(List<Integer> values) {
            addCriterion("pk_category in", values, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryNotIn(List<Integer> values) {
            addCriterion("pk_category not in", values, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryBetween(Integer value1, Integer value2) {
            addCriterion("pk_category between", value1, value2, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_category not between", value1, value2, "pkCategory");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaIsNull() {
            addCriterion("pk_tablemeta is null");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaIsNotNull() {
            addCriterion("pk_tablemeta is not null");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaEqualTo(Integer value) {
            addCriterion("pk_tablemeta =", value, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaNotEqualTo(Integer value) {
            addCriterion("pk_tablemeta <>", value, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaGreaterThan(Integer value) {
            addCriterion("pk_tablemeta >", value, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_tablemeta >=", value, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaLessThan(Integer value) {
            addCriterion("pk_tablemeta <", value, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaLessThanOrEqualTo(Integer value) {
            addCriterion("pk_tablemeta <=", value, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaIn(List<Integer> values) {
            addCriterion("pk_tablemeta in", values, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaNotIn(List<Integer> values) {
            addCriterion("pk_tablemeta not in", values, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaBetween(Integer value1, Integer value2) {
            addCriterion("pk_tablemeta between", value1, value2, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkTablemetaNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_tablemeta not between", value1, value2, "pkTablemeta");
            return (Criteria) this;
        }

        public Criteria andPkParentIsNull() {
            addCriterion("pk_parent is null");
            return (Criteria) this;
        }

        public Criteria andPkParentIsNotNull() {
            addCriterion("pk_parent is not null");
            return (Criteria) this;
        }

        public Criteria andPkParentEqualTo(Integer value) {
            addCriterion("pk_parent =", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotEqualTo(Integer value) {
            addCriterion("pk_parent <>", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentGreaterThan(Integer value) {
            addCriterion("pk_parent >", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_parent >=", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentLessThan(Integer value) {
            addCriterion("pk_parent <", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentLessThanOrEqualTo(Integer value) {
            addCriterion("pk_parent <=", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentIn(List<Integer> values) {
            addCriterion("pk_parent in", values, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotIn(List<Integer> values) {
            addCriterion("pk_parent not in", values, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentBetween(Integer value1, Integer value2) {
            addCriterion("pk_parent between", value1, value2, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_parent not between", value1, value2, "pkParent");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
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