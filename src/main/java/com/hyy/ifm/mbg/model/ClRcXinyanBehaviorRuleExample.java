package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClRcXinyanBehaviorRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClRcXinyanBehaviorRuleExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andLoansOrgCountIsNull() {
            addCriterion("loans_org_count is null");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountIsNotNull() {
            addCriterion("loans_org_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountEqualTo(Integer value) {
            addCriterion("loans_org_count =", value, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountNotEqualTo(Integer value) {
            addCriterion("loans_org_count <>", value, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountGreaterThan(Integer value) {
            addCriterion("loans_org_count >", value, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_org_count >=", value, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountLessThan(Integer value) {
            addCriterion("loans_org_count <", value, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountLessThanOrEqualTo(Integer value) {
            addCriterion("loans_org_count <=", value, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountIn(List<Integer> values) {
            addCriterion("loans_org_count in", values, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountNotIn(List<Integer> values) {
            addCriterion("loans_org_count not in", values, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountBetween(Integer value1, Integer value2) {
            addCriterion("loans_org_count between", value1, value2, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andLoansOrgCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_org_count not between", value1, value2, "loansOrgCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLoansScoreIsNull() {
            addCriterion("loans_score is null");
            return (Criteria) this;
        }

        public Criteria andLoansScoreIsNotNull() {
            addCriterion("loans_score is not null");
            return (Criteria) this;
        }

        public Criteria andLoansScoreEqualTo(Integer value) {
            addCriterion("loans_score =", value, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreNotEqualTo(Integer value) {
            addCriterion("loans_score <>", value, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreGreaterThan(Integer value) {
            addCriterion("loans_score >", value, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_score >=", value, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreLessThan(Integer value) {
            addCriterion("loans_score <", value, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreLessThanOrEqualTo(Integer value) {
            addCriterion("loans_score <=", value, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreIn(List<Integer> values) {
            addCriterion("loans_score in", values, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreNotIn(List<Integer> values) {
            addCriterion("loans_score not in", values, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreBetween(Integer value1, Integer value2) {
            addCriterion("loans_score between", value1, value2, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_score not between", value1, value2, "loansScore");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityIsNull() {
            addCriterion("loans_credibility is null");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityIsNotNull() {
            addCriterion("loans_credibility is not null");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityEqualTo(Integer value) {
            addCriterion("loans_credibility =", value, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityNotEqualTo(Integer value) {
            addCriterion("loans_credibility <>", value, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityGreaterThan(Integer value) {
            addCriterion("loans_credibility >", value, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_credibility >=", value, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityLessThan(Integer value) {
            addCriterion("loans_credibility <", value, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityLessThanOrEqualTo(Integer value) {
            addCriterion("loans_credibility <=", value, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityIn(List<Integer> values) {
            addCriterion("loans_credibility in", values, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityNotIn(List<Integer> values) {
            addCriterion("loans_credibility not in", values, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityBetween(Integer value1, Integer value2) {
            addCriterion("loans_credibility between", value1, value2, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCredibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_credibility not between", value1, value2, "loansCredibility");
            return (Criteria) this;
        }

        public Criteria andLoansCountIsNull() {
            addCriterion("loans_count is null");
            return (Criteria) this;
        }

        public Criteria andLoansCountIsNotNull() {
            addCriterion("loans_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoansCountEqualTo(Integer value) {
            addCriterion("loans_count =", value, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountNotEqualTo(Integer value) {
            addCriterion("loans_count <>", value, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountGreaterThan(Integer value) {
            addCriterion("loans_count >", value, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_count >=", value, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountLessThan(Integer value) {
            addCriterion("loans_count <", value, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountLessThanOrEqualTo(Integer value) {
            addCriterion("loans_count <=", value, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountIn(List<Integer> values) {
            addCriterion("loans_count in", values, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountNotIn(List<Integer> values) {
            addCriterion("loans_count not in", values, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountBetween(Integer value1, Integer value2) {
            addCriterion("loans_count between", value1, value2, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLoansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_count not between", value1, value2, "loansCount");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthIsNull() {
            addCriterion("latest_one_month is null");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthIsNotNull() {
            addCriterion("latest_one_month is not null");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthEqualTo(Integer value) {
            addCriterion("latest_one_month =", value, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthNotEqualTo(Integer value) {
            addCriterion("latest_one_month <>", value, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthGreaterThan(Integer value) {
            addCriterion("latest_one_month >", value, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_one_month >=", value, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthLessThan(Integer value) {
            addCriterion("latest_one_month <", value, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthLessThanOrEqualTo(Integer value) {
            addCriterion("latest_one_month <=", value, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthIn(List<Integer> values) {
            addCriterion("latest_one_month in", values, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthNotIn(List<Integer> values) {
            addCriterion("latest_one_month not in", values, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthBetween(Integer value1, Integer value2) {
            addCriterion("latest_one_month between", value1, value2, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_one_month not between", value1, value2, "latestOneMonth");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountIsNull() {
            addCriterion("loans_settle_count is null");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountIsNotNull() {
            addCriterion("loans_settle_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountEqualTo(Integer value) {
            addCriterion("loans_settle_count =", value, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountNotEqualTo(Integer value) {
            addCriterion("loans_settle_count <>", value, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountGreaterThan(Integer value) {
            addCriterion("loans_settle_count >", value, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_settle_count >=", value, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountLessThan(Integer value) {
            addCriterion("loans_settle_count <", value, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountLessThanOrEqualTo(Integer value) {
            addCriterion("loans_settle_count <=", value, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountIn(List<Integer> values) {
            addCriterion("loans_settle_count in", values, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountNotIn(List<Integer> values) {
            addCriterion("loans_settle_count not in", values, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountBetween(Integer value1, Integer value2) {
            addCriterion("loans_settle_count between", value1, value2, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansSettleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_settle_count not between", value1, value2, "loansSettleCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountIsNull() {
            addCriterion("loans_overdue_count is null");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountIsNotNull() {
            addCriterion("loans_overdue_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountEqualTo(Integer value) {
            addCriterion("loans_overdue_count =", value, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountNotEqualTo(Integer value) {
            addCriterion("loans_overdue_count <>", value, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountGreaterThan(Integer value) {
            addCriterion("loans_overdue_count >", value, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_overdue_count >=", value, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountLessThan(Integer value) {
            addCriterion("loans_overdue_count <", value, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountLessThanOrEqualTo(Integer value) {
            addCriterion("loans_overdue_count <=", value, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountIn(List<Integer> values) {
            addCriterion("loans_overdue_count in", values, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountNotIn(List<Integer> values) {
            addCriterion("loans_overdue_count not in", values, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountBetween(Integer value1, Integer value2) {
            addCriterion("loans_overdue_count between", value1, value2, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansOverdueCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_overdue_count not between", value1, value2, "loansOverdueCount");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeIsNull() {
            addCriterion("loans_latest_time is null");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeIsNotNull() {
            addCriterion("loans_latest_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeEqualTo(String value) {
            addCriterion("loans_latest_time =", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeNotEqualTo(String value) {
            addCriterion("loans_latest_time <>", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeGreaterThan(String value) {
            addCriterion("loans_latest_time >", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeGreaterThanOrEqualTo(String value) {
            addCriterion("loans_latest_time >=", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeLessThan(String value) {
            addCriterion("loans_latest_time <", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeLessThanOrEqualTo(String value) {
            addCriterion("loans_latest_time <=", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeLike(String value) {
            addCriterion("loans_latest_time like", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeNotLike(String value) {
            addCriterion("loans_latest_time not like", value, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeIn(List<String> values) {
            addCriterion("loans_latest_time in", values, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeNotIn(List<String> values) {
            addCriterion("loans_latest_time not in", values, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeBetween(String value1, String value2) {
            addCriterion("loans_latest_time between", value1, value2, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeNotBetween(String value1, String value2) {
            addCriterion("loans_latest_time not between", value1, value2, "loansLatestTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeIsNull() {
            addCriterion("loans_long_time is null");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeIsNotNull() {
            addCriterion("loans_long_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeEqualTo(Integer value) {
            addCriterion("loans_long_time =", value, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeNotEqualTo(Integer value) {
            addCriterion("loans_long_time <>", value, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeGreaterThan(Integer value) {
            addCriterion("loans_long_time >", value, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_long_time >=", value, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeLessThan(Integer value) {
            addCriterion("loans_long_time <", value, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeLessThanOrEqualTo(Integer value) {
            addCriterion("loans_long_time <=", value, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeIn(List<Integer> values) {
            addCriterion("loans_long_time in", values, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeNotIn(List<Integer> values) {
            addCriterion("loans_long_time not in", values, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeBetween(Integer value1, Integer value2) {
            addCriterion("loans_long_time between", value1, value2, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andLoansLongTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_long_time not between", value1, value2, "loansLongTime");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeIsNull() {
            addCriterion("history_suc_fee is null");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeIsNotNull() {
            addCriterion("history_suc_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeEqualTo(Integer value) {
            addCriterion("history_suc_fee =", value, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeNotEqualTo(Integer value) {
            addCriterion("history_suc_fee <>", value, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeGreaterThan(Integer value) {
            addCriterion("history_suc_fee >", value, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_suc_fee >=", value, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeLessThan(Integer value) {
            addCriterion("history_suc_fee <", value, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeLessThanOrEqualTo(Integer value) {
            addCriterion("history_suc_fee <=", value, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeIn(List<Integer> values) {
            addCriterion("history_suc_fee in", values, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeNotIn(List<Integer> values) {
            addCriterion("history_suc_fee not in", values, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeBetween(Integer value1, Integer value2) {
            addCriterion("history_suc_fee between", value1, value2, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistorySucFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("history_suc_fee not between", value1, value2, "historySucFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeIsNull() {
            addCriterion("history_fail_fee is null");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeIsNotNull() {
            addCriterion("history_fail_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeEqualTo(Integer value) {
            addCriterion("history_fail_fee =", value, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeNotEqualTo(Integer value) {
            addCriterion("history_fail_fee <>", value, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeGreaterThan(Integer value) {
            addCriterion("history_fail_fee >", value, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_fail_fee >=", value, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeLessThan(Integer value) {
            addCriterion("history_fail_fee <", value, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeLessThanOrEqualTo(Integer value) {
            addCriterion("history_fail_fee <=", value, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeIn(List<Integer> values) {
            addCriterion("history_fail_fee in", values, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeNotIn(List<Integer> values) {
            addCriterion("history_fail_fee not in", values, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeBetween(Integer value1, Integer value2) {
            addCriterion("history_fail_fee between", value1, value2, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andHistoryFailFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("history_fail_fee not between", value1, value2, "historyFailFee");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucIsNull() {
            addCriterion("latest_one_month_suc is null");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucIsNotNull() {
            addCriterion("latest_one_month_suc is not null");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucEqualTo(Integer value) {
            addCriterion("latest_one_month_suc =", value, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucNotEqualTo(Integer value) {
            addCriterion("latest_one_month_suc <>", value, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucGreaterThan(Integer value) {
            addCriterion("latest_one_month_suc >", value, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_one_month_suc >=", value, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucLessThan(Integer value) {
            addCriterion("latest_one_month_suc <", value, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucLessThanOrEqualTo(Integer value) {
            addCriterion("latest_one_month_suc <=", value, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucIn(List<Integer> values) {
            addCriterion("latest_one_month_suc in", values, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucNotIn(List<Integer> values) {
            addCriterion("latest_one_month_suc not in", values, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucBetween(Integer value1, Integer value2) {
            addCriterion("latest_one_month_suc between", value1, value2, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthSucNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_one_month_suc not between", value1, value2, "latestOneMonthSuc");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountIsNull() {
            addCriterion("consfin_org_count is null");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountIsNotNull() {
            addCriterion("consfin_org_count is not null");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountEqualTo(Integer value) {
            addCriterion("consfin_org_count =", value, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountNotEqualTo(Integer value) {
            addCriterion("consfin_org_count <>", value, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountGreaterThan(Integer value) {
            addCriterion("consfin_org_count >", value, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("consfin_org_count >=", value, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountLessThan(Integer value) {
            addCriterion("consfin_org_count <", value, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountLessThanOrEqualTo(Integer value) {
            addCriterion("consfin_org_count <=", value, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountIn(List<Integer> values) {
            addCriterion("consfin_org_count in", values, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountNotIn(List<Integer> values) {
            addCriterion("consfin_org_count not in", values, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountBetween(Integer value1, Integer value2) {
            addCriterion("consfin_org_count between", value1, value2, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andConsfinOrgCountNotBetween(Integer value1, Integer value2) {
            addCriterion("consfin_org_count not between", value1, value2, "consfinOrgCount");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthIsNull() {
            addCriterion("latest_six_month is null");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthIsNotNull() {
            addCriterion("latest_six_month is not null");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthEqualTo(Integer value) {
            addCriterion("latest_six_month =", value, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthNotEqualTo(Integer value) {
            addCriterion("latest_six_month <>", value, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthGreaterThan(Integer value) {
            addCriterion("latest_six_month >", value, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_six_month >=", value, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthLessThan(Integer value) {
            addCriterion("latest_six_month <", value, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthLessThanOrEqualTo(Integer value) {
            addCriterion("latest_six_month <=", value, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthIn(List<Integer> values) {
            addCriterion("latest_six_month in", values, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthNotIn(List<Integer> values) {
            addCriterion("latest_six_month not in", values, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthBetween(Integer value1, Integer value2) {
            addCriterion("latest_six_month between", value1, value2, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLatestSixMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_six_month not between", value1, value2, "latestSixMonth");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountIsNull() {
            addCriterion("loans_cash_count is null");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountIsNotNull() {
            addCriterion("loans_cash_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountEqualTo(Integer value) {
            addCriterion("loans_cash_count =", value, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountNotEqualTo(Integer value) {
            addCriterion("loans_cash_count <>", value, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountGreaterThan(Integer value) {
            addCriterion("loans_cash_count >", value, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_cash_count >=", value, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountLessThan(Integer value) {
            addCriterion("loans_cash_count <", value, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountLessThanOrEqualTo(Integer value) {
            addCriterion("loans_cash_count <=", value, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountIn(List<Integer> values) {
            addCriterion("loans_cash_count in", values, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountNotIn(List<Integer> values) {
            addCriterion("loans_cash_count not in", values, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountBetween(Integer value1, Integer value2) {
            addCriterion("loans_cash_count between", value1, value2, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLoansCashCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_cash_count not between", value1, value2, "loansCashCount");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthIsNull() {
            addCriterion("latest_three_month is null");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthIsNotNull() {
            addCriterion("latest_three_month is not null");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthEqualTo(Integer value) {
            addCriterion("latest_three_month =", value, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthNotEqualTo(Integer value) {
            addCriterion("latest_three_month <>", value, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthGreaterThan(Integer value) {
            addCriterion("latest_three_month >", value, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_three_month >=", value, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthLessThan(Integer value) {
            addCriterion("latest_three_month <", value, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthLessThanOrEqualTo(Integer value) {
            addCriterion("latest_three_month <=", value, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthIn(List<Integer> values) {
            addCriterion("latest_three_month in", values, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthNotIn(List<Integer> values) {
            addCriterion("latest_three_month not in", values, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthBetween(Integer value1, Integer value2) {
            addCriterion("latest_three_month between", value1, value2, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLatestThreeMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_three_month not between", value1, value2, "latestThreeMonth");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataIsNull() {
            addCriterion("loans_latest_time_data is null");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataIsNotNull() {
            addCriterion("loans_latest_time_data is not null");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataEqualTo(Integer value) {
            addCriterion("loans_latest_time_data =", value, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataNotEqualTo(Integer value) {
            addCriterion("loans_latest_time_data <>", value, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataGreaterThan(Integer value) {
            addCriterion("loans_latest_time_data >", value, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataGreaterThanOrEqualTo(Integer value) {
            addCriterion("loans_latest_time_data >=", value, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataLessThan(Integer value) {
            addCriterion("loans_latest_time_data <", value, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataLessThanOrEqualTo(Integer value) {
            addCriterion("loans_latest_time_data <=", value, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataIn(List<Integer> values) {
            addCriterion("loans_latest_time_data in", values, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataNotIn(List<Integer> values) {
            addCriterion("loans_latest_time_data not in", values, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataBetween(Integer value1, Integer value2) {
            addCriterion("loans_latest_time_data between", value1, value2, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLoansLatestTimeDataNotBetween(Integer value1, Integer value2) {
            addCriterion("loans_latest_time_data not between", value1, value2, "loansLatestTimeData");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailIsNull() {
            addCriterion("latest_one_month_fail is null");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailIsNotNull() {
            addCriterion("latest_one_month_fail is not null");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailEqualTo(Integer value) {
            addCriterion("latest_one_month_fail =", value, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailNotEqualTo(Integer value) {
            addCriterion("latest_one_month_fail <>", value, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailGreaterThan(Integer value) {
            addCriterion("latest_one_month_fail >", value, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_one_month_fail >=", value, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailLessThan(Integer value) {
            addCriterion("latest_one_month_fail <", value, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailLessThanOrEqualTo(Integer value) {
            addCriterion("latest_one_month_fail <=", value, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailIn(List<Integer> values) {
            addCriterion("latest_one_month_fail in", values, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailNotIn(List<Integer> values) {
            addCriterion("latest_one_month_fail not in", values, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailBetween(Integer value1, Integer value2) {
            addCriterion("latest_one_month_fail between", value1, value2, "latestOneMonthFail");
            return (Criteria) this;
        }

        public Criteria andLatestOneMonthFailNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_one_month_fail not between", value1, value2, "latestOneMonthFail");
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