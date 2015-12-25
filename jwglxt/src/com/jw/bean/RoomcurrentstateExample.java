package com.jw.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomcurrentstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomcurrentstateExample() {
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

        public Criteria andRcsidIsNull() {
            addCriterion("rcsid is null");
            return (Criteria) this;
        }

        public Criteria andRcsidIsNotNull() {
            addCriterion("rcsid is not null");
            return (Criteria) this;
        }

        public Criteria andRcsidEqualTo(Integer value) {
            addCriterion("rcsid =", value, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidNotEqualTo(Integer value) {
            addCriterion("rcsid <>", value, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidGreaterThan(Integer value) {
            addCriterion("rcsid >", value, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcsid >=", value, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidLessThan(Integer value) {
            addCriterion("rcsid <", value, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidLessThanOrEqualTo(Integer value) {
            addCriterion("rcsid <=", value, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidIn(List<Integer> values) {
            addCriterion("rcsid in", values, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidNotIn(List<Integer> values) {
            addCriterion("rcsid not in", values, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidBetween(Integer value1, Integer value2) {
            addCriterion("rcsid between", value1, value2, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRcsidNotBetween(Integer value1, Integer value2) {
            addCriterion("rcsid not between", value1, value2, "rcsid");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomid is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomid =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomid <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomid >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomid >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomid <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomid <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomid in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomid not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomid between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomid not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andNetstateIsNull() {
            addCriterion("netstate is null");
            return (Criteria) this;
        }

        public Criteria andNetstateIsNotNull() {
            addCriterion("netstate is not null");
            return (Criteria) this;
        }

        public Criteria andNetstateEqualTo(Integer value) {
            addCriterion("netstate =", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateNotEqualTo(Integer value) {
            addCriterion("netstate <>", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateGreaterThan(Integer value) {
            addCriterion("netstate >", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("netstate >=", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateLessThan(Integer value) {
            addCriterion("netstate <", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateLessThanOrEqualTo(Integer value) {
            addCriterion("netstate <=", value, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateIn(List<Integer> values) {
            addCriterion("netstate in", values, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateNotIn(List<Integer> values) {
            addCriterion("netstate not in", values, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateBetween(Integer value1, Integer value2) {
            addCriterion("netstate between", value1, value2, "netstate");
            return (Criteria) this;
        }

        public Criteria andNetstateNotBetween(Integer value1, Integer value2) {
            addCriterion("netstate not between", value1, value2, "netstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateIsNull() {
            addCriterion("playstate is null");
            return (Criteria) this;
        }

        public Criteria andPlaystateIsNotNull() {
            addCriterion("playstate is not null");
            return (Criteria) this;
        }

        public Criteria andPlaystateEqualTo(Integer value) {
            addCriterion("playstate =", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateNotEqualTo(Integer value) {
            addCriterion("playstate <>", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateGreaterThan(Integer value) {
            addCriterion("playstate >", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("playstate >=", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateLessThan(Integer value) {
            addCriterion("playstate <", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateLessThanOrEqualTo(Integer value) {
            addCriterion("playstate <=", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateIn(List<Integer> values) {
            addCriterion("playstate in", values, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateNotIn(List<Integer> values) {
            addCriterion("playstate not in", values, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateBetween(Integer value1, Integer value2) {
            addCriterion("playstate between", value1, value2, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateNotBetween(Integer value1, Integer value2) {
            addCriterion("playstate not between", value1, value2, "playstate");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidIsNull() {
            addCriterion("playmovieid is null");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidIsNotNull() {
            addCriterion("playmovieid is not null");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidEqualTo(Integer value) {
            addCriterion("playmovieid =", value, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidNotEqualTo(Integer value) {
            addCriterion("playmovieid <>", value, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidGreaterThan(Integer value) {
            addCriterion("playmovieid >", value, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidGreaterThanOrEqualTo(Integer value) {
            addCriterion("playmovieid >=", value, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidLessThan(Integer value) {
            addCriterion("playmovieid <", value, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidLessThanOrEqualTo(Integer value) {
            addCriterion("playmovieid <=", value, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidIn(List<Integer> values) {
            addCriterion("playmovieid in", values, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidNotIn(List<Integer> values) {
            addCriterion("playmovieid not in", values, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidBetween(Integer value1, Integer value2) {
            addCriterion("playmovieid between", value1, value2, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andPlaymovieidNotBetween(Integer value1, Integer value2) {
            addCriterion("playmovieid not between", value1, value2, "playmovieid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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