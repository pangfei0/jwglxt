package com.jw.bean;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andBuildingnumIsNull() {
            addCriterion("buildingnum is null");
            return (Criteria) this;
        }

        public Criteria andBuildingnumIsNotNull() {
            addCriterion("buildingnum is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingnumEqualTo(String value) {
            addCriterion("buildingnum =", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumNotEqualTo(String value) {
            addCriterion("buildingnum <>", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumGreaterThan(String value) {
            addCriterion("buildingnum >", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumGreaterThanOrEqualTo(String value) {
            addCriterion("buildingnum >=", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumLessThan(String value) {
            addCriterion("buildingnum <", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumLessThanOrEqualTo(String value) {
            addCriterion("buildingnum <=", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumLike(String value) {
            addCriterion("buildingnum like", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumNotLike(String value) {
            addCriterion("buildingnum not like", value, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumIn(List<String> values) {
            addCriterion("buildingnum in", values, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumNotIn(List<String> values) {
            addCriterion("buildingnum not in", values, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumBetween(String value1, String value2) {
            addCriterion("buildingnum between", value1, value2, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andBuildingnumNotBetween(String value1, String value2) {
            addCriterion("buildingnum not between", value1, value2, "buildingnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomnum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomnum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(String value) {
            addCriterion("roomnum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(String value) {
            addCriterion("roomnum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(String value) {
            addCriterion("roomnum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {
            addCriterion("roomnum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(String value) {
            addCriterion("roomnum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(String value) {
            addCriterion("roomnum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLike(String value) {
            addCriterion("roomnum like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotLike(String value) {
            addCriterion("roomnum not like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<String> values) {
            addCriterion("roomnum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<String> values) {
            addCriterion("roomnum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(String value1, String value2) {
            addCriterion("roomnum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(String value1, String value2) {
            addCriterion("roomnum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridIsNull() {
            addCriterion("roomteacherid is null");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridIsNotNull() {
            addCriterion("roomteacherid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridEqualTo(Integer value) {
            addCriterion("roomteacherid =", value, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridNotEqualTo(Integer value) {
            addCriterion("roomteacherid <>", value, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridGreaterThan(Integer value) {
            addCriterion("roomteacherid >", value, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomteacherid >=", value, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridLessThan(Integer value) {
            addCriterion("roomteacherid <", value, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("roomteacherid <=", value, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridIn(List<Integer> values) {
            addCriterion("roomteacherid in", values, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridNotIn(List<Integer> values) {
            addCriterion("roomteacherid not in", values, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridBetween(Integer value1, Integer value2) {
            addCriterion("roomteacherid between", value1, value2, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andRoomteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("roomteacherid not between", value1, value2, "roomteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridIsNull() {
            addCriterion("cleanteacherid is null");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridIsNotNull() {
            addCriterion("cleanteacherid is not null");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridEqualTo(Integer value) {
            addCriterion("cleanteacherid =", value, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridNotEqualTo(Integer value) {
            addCriterion("cleanteacherid <>", value, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridGreaterThan(Integer value) {
            addCriterion("cleanteacherid >", value, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("cleanteacherid >=", value, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridLessThan(Integer value) {
            addCriterion("cleanteacherid <", value, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("cleanteacherid <=", value, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridIn(List<Integer> values) {
            addCriterion("cleanteacherid in", values, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridNotIn(List<Integer> values) {
            addCriterion("cleanteacherid not in", values, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridBetween(Integer value1, Integer value2) {
            addCriterion("cleanteacherid between", value1, value2, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andCleanteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("cleanteacherid not between", value1, value2, "cleanteacherid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemakr2IsNull() {
            addCriterion("remakr2 is null");
            return (Criteria) this;
        }

        public Criteria andRemakr2IsNotNull() {
            addCriterion("remakr2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemakr2EqualTo(String value) {
            addCriterion("remakr2 =", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2NotEqualTo(String value) {
            addCriterion("remakr2 <>", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2GreaterThan(String value) {
            addCriterion("remakr2 >", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2GreaterThanOrEqualTo(String value) {
            addCriterion("remakr2 >=", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2LessThan(String value) {
            addCriterion("remakr2 <", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2LessThanOrEqualTo(String value) {
            addCriterion("remakr2 <=", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2Like(String value) {
            addCriterion("remakr2 like", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2NotLike(String value) {
            addCriterion("remakr2 not like", value, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2In(List<String> values) {
            addCriterion("remakr2 in", values, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2NotIn(List<String> values) {
            addCriterion("remakr2 not in", values, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2Between(String value1, String value2) {
            addCriterion("remakr2 between", value1, value2, "remakr2");
            return (Criteria) this;
        }

        public Criteria andRemakr2NotBetween(String value1, String value2) {
            addCriterion("remakr2 not between", value1, value2, "remakr2");
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