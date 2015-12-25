package com.jw.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTnumIsNull() {
            addCriterion("tnum is null");
            return (Criteria) this;
        }

        public Criteria andTnumIsNotNull() {
            addCriterion("tnum is not null");
            return (Criteria) this;
        }

        public Criteria andTnumEqualTo(String value) {
            addCriterion("tnum =", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotEqualTo(String value) {
            addCriterion("tnum <>", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumGreaterThan(String value) {
            addCriterion("tnum >", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumGreaterThanOrEqualTo(String value) {
            addCriterion("tnum >=", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumLessThan(String value) {
            addCriterion("tnum <", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumLessThanOrEqualTo(String value) {
            addCriterion("tnum <=", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumLike(String value) {
            addCriterion("tnum like", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotLike(String value) {
            addCriterion("tnum not like", value, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumIn(List<String> values) {
            addCriterion("tnum in", values, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotIn(List<String> values) {
            addCriterion("tnum not in", values, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumBetween(String value1, String value2) {
            addCriterion("tnum between", value1, value2, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnumNotBetween(String value1, String value2) {
            addCriterion("tnum not between", value1, value2, "tnum");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTsexIsNull() {
            addCriterion("tsex is null");
            return (Criteria) this;
        }

        public Criteria andTsexIsNotNull() {
            addCriterion("tsex is not null");
            return (Criteria) this;
        }

        public Criteria andTsexEqualTo(Integer value) {
            addCriterion("tsex =", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotEqualTo(Integer value) {
            addCriterion("tsex <>", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThan(Integer value) {
            addCriterion("tsex >", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsex >=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThan(Integer value) {
            addCriterion("tsex <", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThanOrEqualTo(Integer value) {
            addCriterion("tsex <=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexIn(List<Integer> values) {
            addCriterion("tsex in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotIn(List<Integer> values) {
            addCriterion("tsex not in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexBetween(Integer value1, Integer value2) {
            addCriterion("tsex between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotBetween(Integer value1, Integer value2) {
            addCriterion("tsex not between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTnationIsNull() {
            addCriterion("tnation is null");
            return (Criteria) this;
        }

        public Criteria andTnationIsNotNull() {
            addCriterion("tnation is not null");
            return (Criteria) this;
        }

        public Criteria andTnationEqualTo(Integer value) {
            addCriterion("tnation =", value, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationNotEqualTo(Integer value) {
            addCriterion("tnation <>", value, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationGreaterThan(Integer value) {
            addCriterion("tnation >", value, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationGreaterThanOrEqualTo(Integer value) {
            addCriterion("tnation >=", value, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationLessThan(Integer value) {
            addCriterion("tnation <", value, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationLessThanOrEqualTo(Integer value) {
            addCriterion("tnation <=", value, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationIn(List<Integer> values) {
            addCriterion("tnation in", values, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationNotIn(List<Integer> values) {
            addCriterion("tnation not in", values, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationBetween(Integer value1, Integer value2) {
            addCriterion("tnation between", value1, value2, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnationNotBetween(Integer value1, Integer value2) {
            addCriterion("tnation not between", value1, value2, "tnation");
            return (Criteria) this;
        }

        public Criteria andTnativeIsNull() {
            addCriterion("tnative is null");
            return (Criteria) this;
        }

        public Criteria andTnativeIsNotNull() {
            addCriterion("tnative is not null");
            return (Criteria) this;
        }

        public Criteria andTnativeEqualTo(String value) {
            addCriterion("tnative =", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeNotEqualTo(String value) {
            addCriterion("tnative <>", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeGreaterThan(String value) {
            addCriterion("tnative >", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeGreaterThanOrEqualTo(String value) {
            addCriterion("tnative >=", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeLessThan(String value) {
            addCriterion("tnative <", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeLessThanOrEqualTo(String value) {
            addCriterion("tnative <=", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeLike(String value) {
            addCriterion("tnative like", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeNotLike(String value) {
            addCriterion("tnative not like", value, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeIn(List<String> values) {
            addCriterion("tnative in", values, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeNotIn(List<String> values) {
            addCriterion("tnative not in", values, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeBetween(String value1, String value2) {
            addCriterion("tnative between", value1, value2, "tnative");
            return (Criteria) this;
        }

        public Criteria andTnativeNotBetween(String value1, String value2) {
            addCriterion("tnative not between", value1, value2, "tnative");
            return (Criteria) this;
        }

        public Criteria andTpolstatusIsNull() {
            addCriterion("tpolstatus is null");
            return (Criteria) this;
        }

        public Criteria andTpolstatusIsNotNull() {
            addCriterion("tpolstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTpolstatusEqualTo(Integer value) {
            addCriterion("tpolstatus =", value, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusNotEqualTo(Integer value) {
            addCriterion("tpolstatus <>", value, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusGreaterThan(Integer value) {
            addCriterion("tpolstatus >", value, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpolstatus >=", value, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusLessThan(Integer value) {
            addCriterion("tpolstatus <", value, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusLessThanOrEqualTo(Integer value) {
            addCriterion("tpolstatus <=", value, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusIn(List<Integer> values) {
            addCriterion("tpolstatus in", values, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusNotIn(List<Integer> values) {
            addCriterion("tpolstatus not in", values, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusBetween(Integer value1, Integer value2) {
            addCriterion("tpolstatus between", value1, value2, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTpolstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tpolstatus not between", value1, value2, "tpolstatus");
            return (Criteria) this;
        }

        public Criteria andTcardIsNull() {
            addCriterion("tcard is null");
            return (Criteria) this;
        }

        public Criteria andTcardIsNotNull() {
            addCriterion("tcard is not null");
            return (Criteria) this;
        }

        public Criteria andTcardEqualTo(String value) {
            addCriterion("tcard =", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardNotEqualTo(String value) {
            addCriterion("tcard <>", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardGreaterThan(String value) {
            addCriterion("tcard >", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardGreaterThanOrEqualTo(String value) {
            addCriterion("tcard >=", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardLessThan(String value) {
            addCriterion("tcard <", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardLessThanOrEqualTo(String value) {
            addCriterion("tcard <=", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardLike(String value) {
            addCriterion("tcard like", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardNotLike(String value) {
            addCriterion("tcard not like", value, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardIn(List<String> values) {
            addCriterion("tcard in", values, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardNotIn(List<String> values) {
            addCriterion("tcard not in", values, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardBetween(String value1, String value2) {
            addCriterion("tcard between", value1, value2, "tcard");
            return (Criteria) this;
        }

        public Criteria andTcardNotBetween(String value1, String value2) {
            addCriterion("tcard not between", value1, value2, "tcard");
            return (Criteria) this;
        }

        public Criteria andTaddressIsNull() {
            addCriterion("taddress is null");
            return (Criteria) this;
        }

        public Criteria andTaddressIsNotNull() {
            addCriterion("taddress is not null");
            return (Criteria) this;
        }

        public Criteria andTaddressEqualTo(String value) {
            addCriterion("taddress =", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotEqualTo(String value) {
            addCriterion("taddress <>", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressGreaterThan(String value) {
            addCriterion("taddress >", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressGreaterThanOrEqualTo(String value) {
            addCriterion("taddress >=", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressLessThan(String value) {
            addCriterion("taddress <", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressLessThanOrEqualTo(String value) {
            addCriterion("taddress <=", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressLike(String value) {
            addCriterion("taddress like", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotLike(String value) {
            addCriterion("taddress not like", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressIn(List<String> values) {
            addCriterion("taddress in", values, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotIn(List<String> values) {
            addCriterion("taddress not in", values, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressBetween(String value1, String value2) {
            addCriterion("taddress between", value1, value2, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotBetween(String value1, String value2) {
            addCriterion("taddress not between", value1, value2, "taddress");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
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

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
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