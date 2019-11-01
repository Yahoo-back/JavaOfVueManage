package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ClYoudunGraphDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClYoudunGraphDetailExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andMobileCountIsNull() {
            addCriterion("mobile_count is null");
            return (Criteria) this;
        }

        public Criteria andMobileCountIsNotNull() {
            addCriterion("mobile_count is not null");
            return (Criteria) this;
        }

        public Criteria andMobileCountEqualTo(String value) {
            addCriterion("mobile_count =", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotEqualTo(String value) {
            addCriterion("mobile_count <>", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountGreaterThan(String value) {
            addCriterion("mobile_count >", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_count >=", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountLessThan(String value) {
            addCriterion("mobile_count <", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountLessThanOrEqualTo(String value) {
            addCriterion("mobile_count <=", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountLike(String value) {
            addCriterion("mobile_count like", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotLike(String value) {
            addCriterion("mobile_count not like", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountIn(List<String> values) {
            addCriterion("mobile_count in", values, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotIn(List<String> values) {
            addCriterion("mobile_count not in", values, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountBetween(String value1, String value2) {
            addCriterion("mobile_count between", value1, value2, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotBetween(String value1, String value2) {
            addCriterion("mobile_count not between", value1, value2, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountIsNull() {
            addCriterion("link_user_count is null");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountIsNotNull() {
            addCriterion("link_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountEqualTo(String value) {
            addCriterion("link_user_count =", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountNotEqualTo(String value) {
            addCriterion("link_user_count <>", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountGreaterThan(String value) {
            addCriterion("link_user_count >", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountGreaterThanOrEqualTo(String value) {
            addCriterion("link_user_count >=", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountLessThan(String value) {
            addCriterion("link_user_count <", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountLessThanOrEqualTo(String value) {
            addCriterion("link_user_count <=", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountLike(String value) {
            addCriterion("link_user_count like", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountNotLike(String value) {
            addCriterion("link_user_count not like", value, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountIn(List<String> values) {
            addCriterion("link_user_count in", values, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountNotIn(List<String> values) {
            addCriterion("link_user_count not in", values, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountBetween(String value1, String value2) {
            addCriterion("link_user_count between", value1, value2, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andLinkUserCountNotBetween(String value1, String value2) {
            addCriterion("link_user_count not between", value1, value2, "linkUserCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountIsNull() {
            addCriterion("other_link_device_count is null");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountIsNotNull() {
            addCriterion("other_link_device_count is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountEqualTo(String value) {
            addCriterion("other_link_device_count =", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountNotEqualTo(String value) {
            addCriterion("other_link_device_count <>", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountGreaterThan(String value) {
            addCriterion("other_link_device_count >", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountGreaterThanOrEqualTo(String value) {
            addCriterion("other_link_device_count >=", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountLessThan(String value) {
            addCriterion("other_link_device_count <", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountLessThanOrEqualTo(String value) {
            addCriterion("other_link_device_count <=", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountLike(String value) {
            addCriterion("other_link_device_count like", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountNotLike(String value) {
            addCriterion("other_link_device_count not like", value, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountIn(List<String> values) {
            addCriterion("other_link_device_count in", values, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountNotIn(List<String> values) {
            addCriterion("other_link_device_count not in", values, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountBetween(String value1, String value2) {
            addCriterion("other_link_device_count between", value1, value2, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andOtherLinkDeviceCountNotBetween(String value1, String value2) {
            addCriterion("other_link_device_count not between", value1, value2, "otherLinkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountIsNull() {
            addCriterion("user_have_bankcard_count is null");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountIsNotNull() {
            addCriterion("user_have_bankcard_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountEqualTo(String value) {
            addCriterion("user_have_bankcard_count =", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountNotEqualTo(String value) {
            addCriterion("user_have_bankcard_count <>", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountGreaterThan(String value) {
            addCriterion("user_have_bankcard_count >", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountGreaterThanOrEqualTo(String value) {
            addCriterion("user_have_bankcard_count >=", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountLessThan(String value) {
            addCriterion("user_have_bankcard_count <", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountLessThanOrEqualTo(String value) {
            addCriterion("user_have_bankcard_count <=", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountLike(String value) {
            addCriterion("user_have_bankcard_count like", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountNotLike(String value) {
            addCriterion("user_have_bankcard_count not like", value, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountIn(List<String> values) {
            addCriterion("user_have_bankcard_count in", values, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountNotIn(List<String> values) {
            addCriterion("user_have_bankcard_count not in", values, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountBetween(String value1, String value2) {
            addCriterion("user_have_bankcard_count between", value1, value2, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andUserHaveBankcardCountNotBetween(String value1, String value2) {
            addCriterion("user_have_bankcard_count not between", value1, value2, "userHaveBankcardCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountIsNull() {
            addCriterion("partner_user_count is null");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountIsNotNull() {
            addCriterion("partner_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountEqualTo(String value) {
            addCriterion("partner_user_count =", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountNotEqualTo(String value) {
            addCriterion("partner_user_count <>", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountGreaterThan(String value) {
            addCriterion("partner_user_count >", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountGreaterThanOrEqualTo(String value) {
            addCriterion("partner_user_count >=", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountLessThan(String value) {
            addCriterion("partner_user_count <", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountLessThanOrEqualTo(String value) {
            addCriterion("partner_user_count <=", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountLike(String value) {
            addCriterion("partner_user_count like", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountNotLike(String value) {
            addCriterion("partner_user_count not like", value, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountIn(List<String> values) {
            addCriterion("partner_user_count in", values, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountNotIn(List<String> values) {
            addCriterion("partner_user_count not in", values, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountBetween(String value1, String value2) {
            addCriterion("partner_user_count between", value1, value2, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andPartnerUserCountNotBetween(String value1, String value2) {
            addCriterion("partner_user_count not between", value1, value2, "partnerUserCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountIsNull() {
            addCriterion("bankcard_count is null");
            return (Criteria) this;
        }

        public Criteria andBankcardCountIsNotNull() {
            addCriterion("bankcard_count is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardCountEqualTo(String value) {
            addCriterion("bankcard_count =", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountNotEqualTo(String value) {
            addCriterion("bankcard_count <>", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountGreaterThan(String value) {
            addCriterion("bankcard_count >", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_count >=", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountLessThan(String value) {
            addCriterion("bankcard_count <", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountLessThanOrEqualTo(String value) {
            addCriterion("bankcard_count <=", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountLike(String value) {
            addCriterion("bankcard_count like", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountNotLike(String value) {
            addCriterion("bankcard_count not like", value, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountIn(List<String> values) {
            addCriterion("bankcard_count in", values, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountNotIn(List<String> values) {
            addCriterion("bankcard_count not in", values, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountBetween(String value1, String value2) {
            addCriterion("bankcard_count between", value1, value2, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andBankcardCountNotBetween(String value1, String value2) {
            addCriterion("bankcard_count not between", value1, value2, "bankcardCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountIsNull() {
            addCriterion("link_device_count is null");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountIsNotNull() {
            addCriterion("link_device_count is not null");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountEqualTo(String value) {
            addCriterion("link_device_count =", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountNotEqualTo(String value) {
            addCriterion("link_device_count <>", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountGreaterThan(String value) {
            addCriterion("link_device_count >", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountGreaterThanOrEqualTo(String value) {
            addCriterion("link_device_count >=", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountLessThan(String value) {
            addCriterion("link_device_count <", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountLessThanOrEqualTo(String value) {
            addCriterion("link_device_count <=", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountLike(String value) {
            addCriterion("link_device_count like", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountNotLike(String value) {
            addCriterion("link_device_count not like", value, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountIn(List<String> values) {
            addCriterion("link_device_count in", values, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountNotIn(List<String> values) {
            addCriterion("link_device_count not in", values, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountBetween(String value1, String value2) {
            addCriterion("link_device_count between", value1, value2, "linkDeviceCount");
            return (Criteria) this;
        }

        public Criteria andLinkDeviceCountNotBetween(String value1, String value2) {
            addCriterion("link_device_count not between", value1, value2, "linkDeviceCount");
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