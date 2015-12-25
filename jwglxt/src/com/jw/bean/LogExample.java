package com.jw.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logid is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logid is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logid =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logid <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logid >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logid >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logid <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logid <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logid in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logid not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logid between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logid not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andCmethodIsNull() {
            addCriterion("cmethod is null");
            return (Criteria) this;
        }

        public Criteria andCmethodIsNotNull() {
            addCriterion("cmethod is not null");
            return (Criteria) this;
        }

        public Criteria andCmethodEqualTo(String value) {
            addCriterion("cmethod =", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodNotEqualTo(String value) {
            addCriterion("cmethod <>", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodGreaterThan(String value) {
            addCriterion("cmethod >", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodGreaterThanOrEqualTo(String value) {
            addCriterion("cmethod >=", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodLessThan(String value) {
            addCriterion("cmethod <", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodLessThanOrEqualTo(String value) {
            addCriterion("cmethod <=", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodLike(String value) {
            addCriterion("cmethod like", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodNotLike(String value) {
            addCriterion("cmethod not like", value, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodIn(List<String> values) {
            addCriterion("cmethod in", values, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodNotIn(List<String> values) {
            addCriterion("cmethod not in", values, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodBetween(String value1, String value2) {
            addCriterion("cmethod between", value1, value2, "cmethod");
            return (Criteria) this;
        }

        public Criteria andCmethodNotBetween(String value1, String value2) {
            addCriterion("cmethod not between", value1, value2, "cmethod");
            return (Criteria) this;
        }

        public Criteria andLoglevelIsNull() {
            addCriterion("loglevel is null");
            return (Criteria) this;
        }

        public Criteria andLoglevelIsNotNull() {
            addCriterion("loglevel is not null");
            return (Criteria) this;
        }

        public Criteria andLoglevelEqualTo(String value) {
            addCriterion("loglevel =", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelNotEqualTo(String value) {
            addCriterion("loglevel <>", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelGreaterThan(String value) {
            addCriterion("loglevel >", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelGreaterThanOrEqualTo(String value) {
            addCriterion("loglevel >=", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelLessThan(String value) {
            addCriterion("loglevel <", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelLessThanOrEqualTo(String value) {
            addCriterion("loglevel <=", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelLike(String value) {
            addCriterion("loglevel like", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelNotLike(String value) {
            addCriterion("loglevel not like", value, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelIn(List<String> values) {
            addCriterion("loglevel in", values, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelNotIn(List<String> values) {
            addCriterion("loglevel not in", values, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelBetween(String value1, String value2) {
            addCriterion("loglevel between", value1, value2, "loglevel");
            return (Criteria) this;
        }

        public Criteria andLoglevelNotBetween(String value1, String value2) {
            addCriterion("loglevel not between", value1, value2, "loglevel");
            return (Criteria) this;
        }

        public Criteria andOperateuserIsNull() {
            addCriterion("operateuser is null");
            return (Criteria) this;
        }

        public Criteria andOperateuserIsNotNull() {
            addCriterion("operateuser is not null");
            return (Criteria) this;
        }

        public Criteria andOperateuserEqualTo(String value) {
            addCriterion("operateuser =", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserNotEqualTo(String value) {
            addCriterion("operateuser <>", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserGreaterThan(String value) {
            addCriterion("operateuser >", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserGreaterThanOrEqualTo(String value) {
            addCriterion("operateuser >=", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserLessThan(String value) {
            addCriterion("operateuser <", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserLessThanOrEqualTo(String value) {
            addCriterion("operateuser <=", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserLike(String value) {
            addCriterion("operateuser like", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserNotLike(String value) {
            addCriterion("operateuser not like", value, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserIn(List<String> values) {
            addCriterion("operateuser in", values, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserNotIn(List<String> values) {
            addCriterion("operateuser not in", values, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserBetween(String value1, String value2) {
            addCriterion("operateuser between", value1, value2, "operateuser");
            return (Criteria) this;
        }

        public Criteria andOperateuserNotBetween(String value1, String value2) {
            addCriterion("operateuser not between", value1, value2, "operateuser");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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