package com.jw.bean;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScnameIsNull() {
            addCriterion("scname is null");
            return (Criteria) this;
        }

        public Criteria andScnameIsNotNull() {
            addCriterion("scname is not null");
            return (Criteria) this;
        }

        public Criteria andScnameEqualTo(String value) {
            addCriterion("scname =", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotEqualTo(String value) {
            addCriterion("scname <>", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameGreaterThan(String value) {
            addCriterion("scname >", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameGreaterThanOrEqualTo(String value) {
            addCriterion("scname >=", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLessThan(String value) {
            addCriterion("scname <", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLessThanOrEqualTo(String value) {
            addCriterion("scname <=", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLike(String value) {
            addCriterion("scname like", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotLike(String value) {
            addCriterion("scname not like", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameIn(List<String> values) {
            addCriterion("scname in", values, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotIn(List<String> values) {
            addCriterion("scname not in", values, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameBetween(String value1, String value2) {
            addCriterion("scname between", value1, value2, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotBetween(String value1, String value2) {
            addCriterion("scname not between", value1, value2, "scname");
            return (Criteria) this;
        }

        public Criteria andScaddressIsNull() {
            addCriterion("scaddress is null");
            return (Criteria) this;
        }

        public Criteria andScaddressIsNotNull() {
            addCriterion("scaddress is not null");
            return (Criteria) this;
        }

        public Criteria andScaddressEqualTo(String value) {
            addCriterion("scaddress =", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotEqualTo(String value) {
            addCriterion("scaddress <>", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressGreaterThan(String value) {
            addCriterion("scaddress >", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressGreaterThanOrEqualTo(String value) {
            addCriterion("scaddress >=", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressLessThan(String value) {
            addCriterion("scaddress <", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressLessThanOrEqualTo(String value) {
            addCriterion("scaddress <=", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressLike(String value) {
            addCriterion("scaddress like", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotLike(String value) {
            addCriterion("scaddress not like", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressIn(List<String> values) {
            addCriterion("scaddress in", values, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotIn(List<String> values) {
            addCriterion("scaddress not in", values, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressBetween(String value1, String value2) {
            addCriterion("scaddress between", value1, value2, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotBetween(String value1, String value2) {
            addCriterion("scaddress not between", value1, value2, "scaddress");
            return (Criteria) this;
        }

        public Criteria andSctelephoneIsNull() {
            addCriterion("sctelephone is null");
            return (Criteria) this;
        }

        public Criteria andSctelephoneIsNotNull() {
            addCriterion("sctelephone is not null");
            return (Criteria) this;
        }

        public Criteria andSctelephoneEqualTo(String value) {
            addCriterion("sctelephone =", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneNotEqualTo(String value) {
            addCriterion("sctelephone <>", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneGreaterThan(String value) {
            addCriterion("sctelephone >", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("sctelephone >=", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneLessThan(String value) {
            addCriterion("sctelephone <", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneLessThanOrEqualTo(String value) {
            addCriterion("sctelephone <=", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneLike(String value) {
            addCriterion("sctelephone like", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneNotLike(String value) {
            addCriterion("sctelephone not like", value, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneIn(List<String> values) {
            addCriterion("sctelephone in", values, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneNotIn(List<String> values) {
            addCriterion("sctelephone not in", values, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneBetween(String value1, String value2) {
            addCriterion("sctelephone between", value1, value2, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andSctelephoneNotBetween(String value1, String value2) {
            addCriterion("sctelephone not between", value1, value2, "sctelephone");
            return (Criteria) this;
        }

        public Criteria andScwebsiteIsNull() {
            addCriterion("scwebsite is null");
            return (Criteria) this;
        }

        public Criteria andScwebsiteIsNotNull() {
            addCriterion("scwebsite is not null");
            return (Criteria) this;
        }

        public Criteria andScwebsiteEqualTo(String value) {
            addCriterion("scwebsite =", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteNotEqualTo(String value) {
            addCriterion("scwebsite <>", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteGreaterThan(String value) {
            addCriterion("scwebsite >", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("scwebsite >=", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteLessThan(String value) {
            addCriterion("scwebsite <", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteLessThanOrEqualTo(String value) {
            addCriterion("scwebsite <=", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteLike(String value) {
            addCriterion("scwebsite like", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteNotLike(String value) {
            addCriterion("scwebsite not like", value, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteIn(List<String> values) {
            addCriterion("scwebsite in", values, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteNotIn(List<String> values) {
            addCriterion("scwebsite not in", values, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteBetween(String value1, String value2) {
            addCriterion("scwebsite between", value1, value2, "scwebsite");
            return (Criteria) this;
        }

        public Criteria andScwebsiteNotBetween(String value1, String value2) {
            addCriterion("scwebsite not between", value1, value2, "scwebsite");
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