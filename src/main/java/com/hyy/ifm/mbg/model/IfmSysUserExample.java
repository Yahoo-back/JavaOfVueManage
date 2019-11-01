package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IfmSysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IfmSysUserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNull() {
            addCriterion("JOB_NUM is null");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNotNull() {
            addCriterion("JOB_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumEqualTo(String value) {
            addCriterion("JOB_NUM =", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotEqualTo(String value) {
            addCriterion("JOB_NUM <>", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThan(String value) {
            addCriterion("JOB_NUM >", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NUM >=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThan(String value) {
            addCriterion("JOB_NUM <", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThanOrEqualTo(String value) {
            addCriterion("JOB_NUM <=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLike(String value) {
            addCriterion("JOB_NUM like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotLike(String value) {
            addCriterion("JOB_NUM not like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumIn(List<String> values) {
            addCriterion("JOB_NUM in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotIn(List<String> values) {
            addCriterion("JOB_NUM not in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumBetween(String value1, String value2) {
            addCriterion("JOB_NUM between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotBetween(String value1, String value2) {
            addCriterion("JOB_NUM not between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNull() {
            addCriterion("IDENTITY_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNotNull() {
            addCriterion("IDENTITY_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEqualTo(String value) {
            addCriterion("IDENTITY_CARD =", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotEqualTo(String value) {
            addCriterion("IDENTITY_CARD <>", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThan(String value) {
            addCriterion("IDENTITY_CARD >", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_CARD >=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThan(String value) {
            addCriterion("IDENTITY_CARD <", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_CARD <=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLike(String value) {
            addCriterion("IDENTITY_CARD like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotLike(String value) {
            addCriterion("IDENTITY_CARD not like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIn(List<String> values) {
            addCriterion("IDENTITY_CARD in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotIn(List<String> values) {
            addCriterion("IDENTITY_CARD not in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBetween(String value1, String value2) {
            addCriterion("IDENTITY_CARD between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_CARD not between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("COMPANY_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("COMPANY_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("COMPANY_EMAIL =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("COMPANY_EMAIL <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("COMPANY_EMAIL >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_EMAIL >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("COMPANY_EMAIL <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_EMAIL <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("COMPANY_EMAIL like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("COMPANY_EMAIL not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("COMPANY_EMAIL in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("COMPANY_EMAIL not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("COMPANY_EMAIL between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("COMPANY_EMAIL not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailIsNull() {
            addCriterion("PERSONAL_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailIsNotNull() {
            addCriterion("PERSONAL_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailEqualTo(String value) {
            addCriterion("PERSONAL_EMAIL =", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailNotEqualTo(String value) {
            addCriterion("PERSONAL_EMAIL <>", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailGreaterThan(String value) {
            addCriterion("PERSONAL_EMAIL >", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONAL_EMAIL >=", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailLessThan(String value) {
            addCriterion("PERSONAL_EMAIL <", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailLessThanOrEqualTo(String value) {
            addCriterion("PERSONAL_EMAIL <=", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailLike(String value) {
            addCriterion("PERSONAL_EMAIL like", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailNotLike(String value) {
            addCriterion("PERSONAL_EMAIL not like", value, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailIn(List<String> values) {
            addCriterion("PERSONAL_EMAIL in", values, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailNotIn(List<String> values) {
            addCriterion("PERSONAL_EMAIL not in", values, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailBetween(String value1, String value2) {
            addCriterion("PERSONAL_EMAIL between", value1, value2, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andPersonalEmailNotBetween(String value1, String value2) {
            addCriterion("PERSONAL_EMAIL not between", value1, value2, "personalEmail");
            return (Criteria) this;
        }

        public Criteria andLiveAddrIsNull() {
            addCriterion("LIVE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddrIsNotNull() {
            addCriterion("LIVE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddrEqualTo(String value) {
            addCriterion("LIVE_ADDR =", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotEqualTo(String value) {
            addCriterion("LIVE_ADDR <>", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrGreaterThan(String value) {
            addCriterion("LIVE_ADDR >", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_ADDR >=", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrLessThan(String value) {
            addCriterion("LIVE_ADDR <", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrLessThanOrEqualTo(String value) {
            addCriterion("LIVE_ADDR <=", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrLike(String value) {
            addCriterion("LIVE_ADDR like", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotLike(String value) {
            addCriterion("LIVE_ADDR not like", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrIn(List<String> values) {
            addCriterion("LIVE_ADDR in", values, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotIn(List<String> values) {
            addCriterion("LIVE_ADDR not in", values, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrBetween(String value1, String value2) {
            addCriterion("LIVE_ADDR between", value1, value2, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotBetween(String value1, String value2) {
            addCriterion("LIVE_ADDR not between", value1, value2, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNull() {
            addCriterion("CREAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNotNull() {
            addCriterion("CREAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDateEqualTo(Date value) {
            addCriterion("CREAT_DATE =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(Date value) {
            addCriterion("CREAT_DATE <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(Date value) {
            addCriterion("CREAT_DATE >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREAT_DATE >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(Date value) {
            addCriterion("CREAT_DATE <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(Date value) {
            addCriterion("CREAT_DATE <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<Date> values) {
            addCriterion("CREAT_DATE in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<Date> values) {
            addCriterion("CREAT_DATE not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(Date value1, Date value2) {
            addCriterion("CREAT_DATE between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(Date value1, Date value2) {
            addCriterion("CREAT_DATE not between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andLgnIdIsNull() {
            addCriterion("LGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLgnIdIsNotNull() {
            addCriterion("LGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLgnIdEqualTo(String value) {
            addCriterion("LGN_ID =", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdNotEqualTo(String value) {
            addCriterion("LGN_ID <>", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdGreaterThan(String value) {
            addCriterion("LGN_ID >", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdGreaterThanOrEqualTo(String value) {
            addCriterion("LGN_ID >=", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdLessThan(String value) {
            addCriterion("LGN_ID <", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdLessThanOrEqualTo(String value) {
            addCriterion("LGN_ID <=", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdLike(String value) {
            addCriterion("LGN_ID like", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdNotLike(String value) {
            addCriterion("LGN_ID not like", value, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdIn(List<String> values) {
            addCriterion("LGN_ID in", values, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdNotIn(List<String> values) {
            addCriterion("LGN_ID not in", values, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdBetween(String value1, String value2) {
            addCriterion("LGN_ID between", value1, value2, "lgnId");
            return (Criteria) this;
        }

        public Criteria andLgnIdNotBetween(String value1, String value2) {
            addCriterion("LGN_ID not between", value1, value2, "lgnId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOnjobdateIsNull() {
            addCriterion("ONJOBDATE is null");
            return (Criteria) this;
        }

        public Criteria andOnjobdateIsNotNull() {
            addCriterion("ONJOBDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnjobdateEqualTo(Date value) {
            addCriterion("ONJOBDATE =", value, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateNotEqualTo(Date value) {
            addCriterion("ONJOBDATE <>", value, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateGreaterThan(Date value) {
            addCriterion("ONJOBDATE >", value, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ONJOBDATE >=", value, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateLessThan(Date value) {
            addCriterion("ONJOBDATE <", value, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateLessThanOrEqualTo(Date value) {
            addCriterion("ONJOBDATE <=", value, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateIn(List<Date> values) {
            addCriterion("ONJOBDATE in", values, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateNotIn(List<Date> values) {
            addCriterion("ONJOBDATE not in", values, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateBetween(Date value1, Date value2) {
            addCriterion("ONJOBDATE between", value1, value2, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andOnjobdateNotBetween(Date value1, Date value2) {
            addCriterion("ONJOBDATE not between", value1, value2, "onjobdate");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("WEIXIN is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("WEIXIN is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("WEIXIN =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("WEIXIN <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("WEIXIN >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("WEIXIN >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("WEIXIN <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("WEIXIN <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("WEIXIN like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("WEIXIN not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("WEIXIN in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("WEIXIN not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("WEIXIN between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("WEIXIN not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andCpaIsNull() {
            addCriterion("cpa is null");
            return (Criteria) this;
        }

        public Criteria andCpaIsNotNull() {
            addCriterion("cpa is not null");
            return (Criteria) this;
        }

        public Criteria andCpaEqualTo(String value) {
            addCriterion("cpa =", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaNotEqualTo(String value) {
            addCriterion("cpa <>", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaGreaterThan(String value) {
            addCriterion("cpa >", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaGreaterThanOrEqualTo(String value) {
            addCriterion("cpa >=", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaLessThan(String value) {
            addCriterion("cpa <", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaLessThanOrEqualTo(String value) {
            addCriterion("cpa <=", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaLike(String value) {
            addCriterion("cpa like", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaNotLike(String value) {
            addCriterion("cpa not like", value, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaIn(List<String> values) {
            addCriterion("cpa in", values, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaNotIn(List<String> values) {
            addCriterion("cpa not in", values, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaBetween(String value1, String value2) {
            addCriterion("cpa between", value1, value2, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpaNotBetween(String value1, String value2) {
            addCriterion("cpa not between", value1, value2, "cpa");
            return (Criteria) this;
        }

        public Criteria andCpatypeIsNull() {
            addCriterion("cpaType is null");
            return (Criteria) this;
        }

        public Criteria andCpatypeIsNotNull() {
            addCriterion("cpaType is not null");
            return (Criteria) this;
        }

        public Criteria andCpatypeEqualTo(Integer value) {
            addCriterion("cpaType =", value, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeNotEqualTo(Integer value) {
            addCriterion("cpaType <>", value, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeGreaterThan(Integer value) {
            addCriterion("cpaType >", value, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpaType >=", value, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeLessThan(Integer value) {
            addCriterion("cpaType <", value, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeLessThanOrEqualTo(Integer value) {
            addCriterion("cpaType <=", value, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeIn(List<Integer> values) {
            addCriterion("cpaType in", values, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeNotIn(List<Integer> values) {
            addCriterion("cpaType not in", values, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeBetween(Integer value1, Integer value2) {
            addCriterion("cpaType between", value1, value2, "cpatype");
            return (Criteria) this;
        }

        public Criteria andCpatypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cpaType not between", value1, value2, "cpatype");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNull() {
            addCriterion("loanRate is null");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNotNull() {
            addCriterion("loanRate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrateEqualTo(String value) {
            addCriterion("loanRate =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(String value) {
            addCriterion("loanRate <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(String value) {
            addCriterion("loanRate >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(String value) {
            addCriterion("loanRate >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(String value) {
            addCriterion("loanRate <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(String value) {
            addCriterion("loanRate <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLike(String value) {
            addCriterion("loanRate like", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotLike(String value) {
            addCriterion("loanRate not like", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<String> values) {
            addCriterion("loanRate in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<String> values) {
            addCriterion("loanRate not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(String value1, String value2) {
            addCriterion("loanRate between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(String value1, String value2) {
            addCriterion("loanRate not between", value1, value2, "loanrate");
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