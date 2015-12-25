package com.jw.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSnumIsNull() {
            addCriterion("snum is null");
            return (Criteria) this;
        }

        public Criteria andSnumIsNotNull() {
            addCriterion("snum is not null");
            return (Criteria) this;
        }

        public Criteria andSnumEqualTo(String value) {
            addCriterion("snum =", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotEqualTo(String value) {
            addCriterion("snum <>", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThan(String value) {
            addCriterion("snum >", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThanOrEqualTo(String value) {
            addCriterion("snum >=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThan(String value) {
            addCriterion("snum <", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThanOrEqualTo(String value) {
            addCriterion("snum <=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLike(String value) {
            addCriterion("snum like", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotLike(String value) {
            addCriterion("snum not like", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumIn(List<String> values) {
            addCriterion("snum in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotIn(List<String> values) {
            addCriterion("snum not in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumBetween(String value1, String value2) {
            addCriterion("snum between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotBetween(String value1, String value2) {
            addCriterion("snum not between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(Integer value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(Integer value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(Integer value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(Integer value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(Integer value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<Integer> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<Integer> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(Integer value1, Integer value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(Integer value1, Integer value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSnationIsNull() {
            addCriterion("snation is null");
            return (Criteria) this;
        }

        public Criteria andSnationIsNotNull() {
            addCriterion("snation is not null");
            return (Criteria) this;
        }

        public Criteria andSnationEqualTo(Integer value) {
            addCriterion("snation =", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotEqualTo(Integer value) {
            addCriterion("snation <>", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationGreaterThan(Integer value) {
            addCriterion("snation >", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationGreaterThanOrEqualTo(Integer value) {
            addCriterion("snation >=", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLessThan(Integer value) {
            addCriterion("snation <", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLessThanOrEqualTo(Integer value) {
            addCriterion("snation <=", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationIn(List<Integer> values) {
            addCriterion("snation in", values, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotIn(List<Integer> values) {
            addCriterion("snation not in", values, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationBetween(Integer value1, Integer value2) {
            addCriterion("snation between", value1, value2, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotBetween(Integer value1, Integer value2) {
            addCriterion("snation not between", value1, value2, "snation");
            return (Criteria) this;
        }

        public Criteria andSpolstatusIsNull() {
            addCriterion("spolstatus is null");
            return (Criteria) this;
        }

        public Criteria andSpolstatusIsNotNull() {
            addCriterion("spolstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSpolstatusEqualTo(String value) {
            addCriterion("spolstatus =", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusNotEqualTo(String value) {
            addCriterion("spolstatus <>", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusGreaterThan(String value) {
            addCriterion("spolstatus >", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusGreaterThanOrEqualTo(String value) {
            addCriterion("spolstatus >=", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusLessThan(String value) {
            addCriterion("spolstatus <", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusLessThanOrEqualTo(String value) {
            addCriterion("spolstatus <=", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusLike(String value) {
            addCriterion("spolstatus like", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusNotLike(String value) {
            addCriterion("spolstatus not like", value, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusIn(List<String> values) {
            addCriterion("spolstatus in", values, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusNotIn(List<String> values) {
            addCriterion("spolstatus not in", values, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusBetween(String value1, String value2) {
            addCriterion("spolstatus between", value1, value2, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSpolstatusNotBetween(String value1, String value2) {
            addCriterion("spolstatus not between", value1, value2, "spolstatus");
            return (Criteria) this;
        }

        public Criteria andSnativeIsNull() {
            addCriterion("snative is null");
            return (Criteria) this;
        }

        public Criteria andSnativeIsNotNull() {
            addCriterion("snative is not null");
            return (Criteria) this;
        }

        public Criteria andSnativeEqualTo(String value) {
            addCriterion("snative =", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotEqualTo(String value) {
            addCriterion("snative <>", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeGreaterThan(String value) {
            addCriterion("snative >", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeGreaterThanOrEqualTo(String value) {
            addCriterion("snative >=", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeLessThan(String value) {
            addCriterion("snative <", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeLessThanOrEqualTo(String value) {
            addCriterion("snative <=", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeLike(String value) {
            addCriterion("snative like", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotLike(String value) {
            addCriterion("snative not like", value, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeIn(List<String> values) {
            addCriterion("snative in", values, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotIn(List<String> values) {
            addCriterion("snative not in", values, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeBetween(String value1, String value2) {
            addCriterion("snative between", value1, value2, "snative");
            return (Criteria) this;
        }

        public Criteria andSnativeNotBetween(String value1, String value2) {
            addCriterion("snative not between", value1, value2, "snative");
            return (Criteria) this;
        }

        public Criteria andScardIsNull() {
            addCriterion("scard is null");
            return (Criteria) this;
        }

        public Criteria andScardIsNotNull() {
            addCriterion("scard is not null");
            return (Criteria) this;
        }

        public Criteria andScardEqualTo(String value) {
            addCriterion("scard =", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardNotEqualTo(String value) {
            addCriterion("scard <>", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardGreaterThan(String value) {
            addCriterion("scard >", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardGreaterThanOrEqualTo(String value) {
            addCriterion("scard >=", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardLessThan(String value) {
            addCriterion("scard <", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardLessThanOrEqualTo(String value) {
            addCriterion("scard <=", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardLike(String value) {
            addCriterion("scard like", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardNotLike(String value) {
            addCriterion("scard not like", value, "scard");
            return (Criteria) this;
        }

        public Criteria andScardIn(List<String> values) {
            addCriterion("scard in", values, "scard");
            return (Criteria) this;
        }

        public Criteria andScardNotIn(List<String> values) {
            addCriterion("scard not in", values, "scard");
            return (Criteria) this;
        }

        public Criteria andScardBetween(String value1, String value2) {
            addCriterion("scard between", value1, value2, "scard");
            return (Criteria) this;
        }

        public Criteria andScardNotBetween(String value1, String value2) {
            addCriterion("scard not between", value1, value2, "scard");
            return (Criteria) this;
        }

        public Criteria andStudynumIsNull() {
            addCriterion("studynum is null");
            return (Criteria) this;
        }

        public Criteria andStudynumIsNotNull() {
            addCriterion("studynum is not null");
            return (Criteria) this;
        }

        public Criteria andStudynumEqualTo(String value) {
            addCriterion("studynum =", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotEqualTo(String value) {
            addCriterion("studynum <>", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumGreaterThan(String value) {
            addCriterion("studynum >", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumGreaterThanOrEqualTo(String value) {
            addCriterion("studynum >=", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumLessThan(String value) {
            addCriterion("studynum <", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumLessThanOrEqualTo(String value) {
            addCriterion("studynum <=", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumLike(String value) {
            addCriterion("studynum like", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotLike(String value) {
            addCriterion("studynum not like", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumIn(List<String> values) {
            addCriterion("studynum in", values, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotIn(List<String> values) {
            addCriterion("studynum not in", values, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumBetween(String value1, String value2) {
            addCriterion("studynum between", value1, value2, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotBetween(String value1, String value2) {
            addCriterion("studynum not between", value1, value2, "studynum");
            return (Criteria) this;
        }

        public Criteria andSpnameIsNull() {
            addCriterion("spname is null");
            return (Criteria) this;
        }

        public Criteria andSpnameIsNotNull() {
            addCriterion("spname is not null");
            return (Criteria) this;
        }

        public Criteria andSpnameEqualTo(String value) {
            addCriterion("spname =", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotEqualTo(String value) {
            addCriterion("spname <>", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameGreaterThan(String value) {
            addCriterion("spname >", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameGreaterThanOrEqualTo(String value) {
            addCriterion("spname >=", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLessThan(String value) {
            addCriterion("spname <", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLessThanOrEqualTo(String value) {
            addCriterion("spname <=", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLike(String value) {
            addCriterion("spname like", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotLike(String value) {
            addCriterion("spname not like", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameIn(List<String> values) {
            addCriterion("spname in", values, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotIn(List<String> values) {
            addCriterion("spname not in", values, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameBetween(String value1, String value2) {
            addCriterion("spname between", value1, value2, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotBetween(String value1, String value2) {
            addCriterion("spname not between", value1, value2, "spname");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andStelephoneIsNull() {
            addCriterion("stelephone is null");
            return (Criteria) this;
        }

        public Criteria andStelephoneIsNotNull() {
            addCriterion("stelephone is not null");
            return (Criteria) this;
        }

        public Criteria andStelephoneEqualTo(String value) {
            addCriterion("stelephone =", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneNotEqualTo(String value) {
            addCriterion("stelephone <>", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneGreaterThan(String value) {
            addCriterion("stelephone >", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("stelephone >=", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneLessThan(String value) {
            addCriterion("stelephone <", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneLessThanOrEqualTo(String value) {
            addCriterion("stelephone <=", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneLike(String value) {
            addCriterion("stelephone like", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneNotLike(String value) {
            addCriterion("stelephone not like", value, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneIn(List<String> values) {
            addCriterion("stelephone in", values, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneNotIn(List<String> values) {
            addCriterion("stelephone not in", values, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneBetween(String value1, String value2) {
            addCriterion("stelephone between", value1, value2, "stelephone");
            return (Criteria) this;
        }

        public Criteria andStelephoneNotBetween(String value1, String value2) {
            addCriterion("stelephone not between", value1, value2, "stelephone");
            return (Criteria) this;
        }

        public Criteria andIsschoolIsNull() {
            addCriterion("isschool is null");
            return (Criteria) this;
        }

        public Criteria andIsschoolIsNotNull() {
            addCriterion("isschool is not null");
            return (Criteria) this;
        }

        public Criteria andIsschoolEqualTo(Integer value) {
            addCriterion("isschool =", value, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolNotEqualTo(Integer value) {
            addCriterion("isschool <>", value, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolGreaterThan(Integer value) {
            addCriterion("isschool >", value, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("isschool >=", value, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolLessThan(Integer value) {
            addCriterion("isschool <", value, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolLessThanOrEqualTo(Integer value) {
            addCriterion("isschool <=", value, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolIn(List<Integer> values) {
            addCriterion("isschool in", values, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolNotIn(List<Integer> values) {
            addCriterion("isschool not in", values, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolBetween(Integer value1, Integer value2) {
            addCriterion("isschool between", value1, value2, "isschool");
            return (Criteria) this;
        }

        public Criteria andIsschoolNotBetween(Integer value1, Integer value2) {
            addCriterion("isschool not between", value1, value2, "isschool");
            return (Criteria) this;
        }

        public Criteria andSplanIsNull() {
            addCriterion("splan is null");
            return (Criteria) this;
        }

        public Criteria andSplanIsNotNull() {
            addCriterion("splan is not null");
            return (Criteria) this;
        }

        public Criteria andSplanEqualTo(Integer value) {
            addCriterion("splan =", value, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanNotEqualTo(Integer value) {
            addCriterion("splan <>", value, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanGreaterThan(Integer value) {
            addCriterion("splan >", value, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanGreaterThanOrEqualTo(Integer value) {
            addCriterion("splan >=", value, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanLessThan(Integer value) {
            addCriterion("splan <", value, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanLessThanOrEqualTo(Integer value) {
            addCriterion("splan <=", value, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanIn(List<Integer> values) {
            addCriterion("splan in", values, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanNotIn(List<Integer> values) {
            addCriterion("splan not in", values, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanBetween(Integer value1, Integer value2) {
            addCriterion("splan between", value1, value2, "splan");
            return (Criteria) this;
        }

        public Criteria andSplanNotBetween(Integer value1, Integer value2) {
            addCriterion("splan not between", value1, value2, "splan");
            return (Criteria) this;
        }

        public Criteria andSaidIsNull() {
            addCriterion("said is null");
            return (Criteria) this;
        }

        public Criteria andSaidIsNotNull() {
            addCriterion("said is not null");
            return (Criteria) this;
        }

        public Criteria andSaidEqualTo(String value) {
            addCriterion("said =", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotEqualTo(String value) {
            addCriterion("said <>", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidGreaterThan(String value) {
            addCriterion("said >", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidGreaterThanOrEqualTo(String value) {
            addCriterion("said >=", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidLessThan(String value) {
            addCriterion("said <", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidLessThanOrEqualTo(String value) {
            addCriterion("said <=", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidLike(String value) {
            addCriterion("said like", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotLike(String value) {
            addCriterion("said not like", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidIn(List<String> values) {
            addCriterion("said in", values, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotIn(List<String> values) {
            addCriterion("said not in", values, "said");
            return (Criteria) this;
        }

        public Criteria andSaidBetween(String value1, String value2) {
            addCriterion("said between", value1, value2, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotBetween(String value1, String value2) {
            addCriterion("said not between", value1, value2, "said");
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