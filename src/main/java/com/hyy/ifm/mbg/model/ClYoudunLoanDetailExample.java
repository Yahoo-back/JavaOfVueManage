package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ClYoudunLoanDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClYoudunLoanDetailExample() {
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

        public Criteria andActualLoanPlatformCountIsNull() {
            addCriterion("actual_loan_platform_count is null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountIsNotNull() {
            addCriterion("actual_loan_platform_count is not null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountEqualTo(String value) {
            addCriterion("actual_loan_platform_count =", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountNotEqualTo(String value) {
            addCriterion("actual_loan_platform_count <>", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountGreaterThan(String value) {
            addCriterion("actual_loan_platform_count >", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountGreaterThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count >=", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountLessThan(String value) {
            addCriterion("actual_loan_platform_count <", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountLessThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count <=", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountLike(String value) {
            addCriterion("actual_loan_platform_count like", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountNotLike(String value) {
            addCriterion("actual_loan_platform_count not like", value, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountIn(List<String> values) {
            addCriterion("actual_loan_platform_count in", values, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountNotIn(List<String> values) {
            addCriterion("actual_loan_platform_count not in", values, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count between", value1, value2, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCountNotBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count not between", value1, value2, "actualLoanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mIsNull() {
            addCriterion("actual_loan_platform_count_3m is null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mIsNotNull() {
            addCriterion("actual_loan_platform_count_3m is not null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mEqualTo(String value) {
            addCriterion("actual_loan_platform_count_3m =", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mNotEqualTo(String value) {
            addCriterion("actual_loan_platform_count_3m <>", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mGreaterThan(String value) {
            addCriterion("actual_loan_platform_count_3m >", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mGreaterThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count_3m >=", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mLessThan(String value) {
            addCriterion("actual_loan_platform_count_3m <", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mLessThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count_3m <=", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mLike(String value) {
            addCriterion("actual_loan_platform_count_3m like", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mNotLike(String value) {
            addCriterion("actual_loan_platform_count_3m not like", value, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mIn(List<String> values) {
            addCriterion("actual_loan_platform_count_3m in", values, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mNotIn(List<String> values) {
            addCriterion("actual_loan_platform_count_3m not in", values, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count_3m between", value1, value2, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount3mNotBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count_3m not between", value1, value2, "actualLoanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mIsNull() {
            addCriterion("actual_loan_platform_count_1m is null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mIsNotNull() {
            addCriterion("actual_loan_platform_count_1m is not null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mEqualTo(String value) {
            addCriterion("actual_loan_platform_count_1m =", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mNotEqualTo(String value) {
            addCriterion("actual_loan_platform_count_1m <>", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mGreaterThan(String value) {
            addCriterion("actual_loan_platform_count_1m >", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mGreaterThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count_1m >=", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mLessThan(String value) {
            addCriterion("actual_loan_platform_count_1m <", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mLessThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count_1m <=", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mLike(String value) {
            addCriterion("actual_loan_platform_count_1m like", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mNotLike(String value) {
            addCriterion("actual_loan_platform_count_1m not like", value, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mIn(List<String> values) {
            addCriterion("actual_loan_platform_count_1m in", values, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mNotIn(List<String> values) {
            addCriterion("actual_loan_platform_count_1m not in", values, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count_1m between", value1, value2, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount1mNotBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count_1m not between", value1, value2, "actualLoanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mIsNull() {
            addCriterion("actual_loan_platform_count_6m is null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mIsNotNull() {
            addCriterion("actual_loan_platform_count_6m is not null");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mEqualTo(String value) {
            addCriterion("actual_loan_platform_count_6m =", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mNotEqualTo(String value) {
            addCriterion("actual_loan_platform_count_6m <>", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mGreaterThan(String value) {
            addCriterion("actual_loan_platform_count_6m >", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mGreaterThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count_6m >=", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mLessThan(String value) {
            addCriterion("actual_loan_platform_count_6m <", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mLessThanOrEqualTo(String value) {
            addCriterion("actual_loan_platform_count_6m <=", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mLike(String value) {
            addCriterion("actual_loan_platform_count_6m like", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mNotLike(String value) {
            addCriterion("actual_loan_platform_count_6m not like", value, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mIn(List<String> values) {
            addCriterion("actual_loan_platform_count_6m in", values, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mNotIn(List<String> values) {
            addCriterion("actual_loan_platform_count_6m not in", values, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count_6m between", value1, value2, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andActualLoanPlatformCount6mNotBetween(String value1, String value2) {
            addCriterion("actual_loan_platform_count_6m not between", value1, value2, "actualLoanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountIsNull() {
            addCriterion("loan_platform_count is null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountIsNotNull() {
            addCriterion("loan_platform_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountEqualTo(String value) {
            addCriterion("loan_platform_count =", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountNotEqualTo(String value) {
            addCriterion("loan_platform_count <>", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountGreaterThan(String value) {
            addCriterion("loan_platform_count >", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountGreaterThanOrEqualTo(String value) {
            addCriterion("loan_platform_count >=", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountLessThan(String value) {
            addCriterion("loan_platform_count <", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountLessThanOrEqualTo(String value) {
            addCriterion("loan_platform_count <=", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountLike(String value) {
            addCriterion("loan_platform_count like", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountNotLike(String value) {
            addCriterion("loan_platform_count not like", value, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountIn(List<String> values) {
            addCriterion("loan_platform_count in", values, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountNotIn(List<String> values) {
            addCriterion("loan_platform_count not in", values, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountBetween(String value1, String value2) {
            addCriterion("loan_platform_count between", value1, value2, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCountNotBetween(String value1, String value2) {
            addCriterion("loan_platform_count not between", value1, value2, "loanPlatformCount");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mIsNull() {
            addCriterion("loan_platform_count_3m is null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mIsNotNull() {
            addCriterion("loan_platform_count_3m is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mEqualTo(String value) {
            addCriterion("loan_platform_count_3m =", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mNotEqualTo(String value) {
            addCriterion("loan_platform_count_3m <>", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mGreaterThan(String value) {
            addCriterion("loan_platform_count_3m >", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mGreaterThanOrEqualTo(String value) {
            addCriterion("loan_platform_count_3m >=", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mLessThan(String value) {
            addCriterion("loan_platform_count_3m <", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mLessThanOrEqualTo(String value) {
            addCriterion("loan_platform_count_3m <=", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mLike(String value) {
            addCriterion("loan_platform_count_3m like", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mNotLike(String value) {
            addCriterion("loan_platform_count_3m not like", value, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mIn(List<String> values) {
            addCriterion("loan_platform_count_3m in", values, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mNotIn(List<String> values) {
            addCriterion("loan_platform_count_3m not in", values, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mBetween(String value1, String value2) {
            addCriterion("loan_platform_count_3m between", value1, value2, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount3mNotBetween(String value1, String value2) {
            addCriterion("loan_platform_count_3m not between", value1, value2, "loanPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mIsNull() {
            addCriterion("loan_platform_count_1m is null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mIsNotNull() {
            addCriterion("loan_platform_count_1m is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mEqualTo(String value) {
            addCriterion("loan_platform_count_1m =", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mNotEqualTo(String value) {
            addCriterion("loan_platform_count_1m <>", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mGreaterThan(String value) {
            addCriterion("loan_platform_count_1m >", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mGreaterThanOrEqualTo(String value) {
            addCriterion("loan_platform_count_1m >=", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mLessThan(String value) {
            addCriterion("loan_platform_count_1m <", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mLessThanOrEqualTo(String value) {
            addCriterion("loan_platform_count_1m <=", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mLike(String value) {
            addCriterion("loan_platform_count_1m like", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mNotLike(String value) {
            addCriterion("loan_platform_count_1m not like", value, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mIn(List<String> values) {
            addCriterion("loan_platform_count_1m in", values, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mNotIn(List<String> values) {
            addCriterion("loan_platform_count_1m not in", values, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mBetween(String value1, String value2) {
            addCriterion("loan_platform_count_1m between", value1, value2, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount1mNotBetween(String value1, String value2) {
            addCriterion("loan_platform_count_1m not between", value1, value2, "loanPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mIsNull() {
            addCriterion("loan_platform_count_6m is null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mIsNotNull() {
            addCriterion("loan_platform_count_6m is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mEqualTo(String value) {
            addCriterion("loan_platform_count_6m =", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mNotEqualTo(String value) {
            addCriterion("loan_platform_count_6m <>", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mGreaterThan(String value) {
            addCriterion("loan_platform_count_6m >", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mGreaterThanOrEqualTo(String value) {
            addCriterion("loan_platform_count_6m >=", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mLessThan(String value) {
            addCriterion("loan_platform_count_6m <", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mLessThanOrEqualTo(String value) {
            addCriterion("loan_platform_count_6m <=", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mLike(String value) {
            addCriterion("loan_platform_count_6m like", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mNotLike(String value) {
            addCriterion("loan_platform_count_6m not like", value, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mIn(List<String> values) {
            addCriterion("loan_platform_count_6m in", values, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mNotIn(List<String> values) {
            addCriterion("loan_platform_count_6m not in", values, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mBetween(String value1, String value2) {
            addCriterion("loan_platform_count_6m between", value1, value2, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformCount6mNotBetween(String value1, String value2) {
            addCriterion("loan_platform_count_6m not between", value1, value2, "loanPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountIsNull() {
            addCriterion("repayment_times_count is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountIsNotNull() {
            addCriterion("repayment_times_count is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountEqualTo(String value) {
            addCriterion("repayment_times_count =", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountNotEqualTo(String value) {
            addCriterion("repayment_times_count <>", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountGreaterThan(String value) {
            addCriterion("repayment_times_count >", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_times_count >=", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountLessThan(String value) {
            addCriterion("repayment_times_count <", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountLessThanOrEqualTo(String value) {
            addCriterion("repayment_times_count <=", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountLike(String value) {
            addCriterion("repayment_times_count like", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountNotLike(String value) {
            addCriterion("repayment_times_count not like", value, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountIn(List<String> values) {
            addCriterion("repayment_times_count in", values, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountNotIn(List<String> values) {
            addCriterion("repayment_times_count not in", values, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountBetween(String value1, String value2) {
            addCriterion("repayment_times_count between", value1, value2, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimesCountNotBetween(String value1, String value2) {
            addCriterion("repayment_times_count not between", value1, value2, "repaymentTimesCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountIsNull() {
            addCriterion("repayment_platform_count is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountIsNotNull() {
            addCriterion("repayment_platform_count is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountEqualTo(String value) {
            addCriterion("repayment_platform_count =", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountNotEqualTo(String value) {
            addCriterion("repayment_platform_count <>", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountGreaterThan(String value) {
            addCriterion("repayment_platform_count >", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count >=", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountLessThan(String value) {
            addCriterion("repayment_platform_count <", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountLessThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count <=", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountLike(String value) {
            addCriterion("repayment_platform_count like", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountNotLike(String value) {
            addCriterion("repayment_platform_count not like", value, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountIn(List<String> values) {
            addCriterion("repayment_platform_count in", values, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountNotIn(List<String> values) {
            addCriterion("repayment_platform_count not in", values, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountBetween(String value1, String value2) {
            addCriterion("repayment_platform_count between", value1, value2, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCountNotBetween(String value1, String value2) {
            addCriterion("repayment_platform_count not between", value1, value2, "repaymentPlatformCount");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mIsNull() {
            addCriterion("repayment_platform_count_3m is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mIsNotNull() {
            addCriterion("repayment_platform_count_3m is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mEqualTo(String value) {
            addCriterion("repayment_platform_count_3m =", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mNotEqualTo(String value) {
            addCriterion("repayment_platform_count_3m <>", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mGreaterThan(String value) {
            addCriterion("repayment_platform_count_3m >", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count_3m >=", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mLessThan(String value) {
            addCriterion("repayment_platform_count_3m <", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mLessThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count_3m <=", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mLike(String value) {
            addCriterion("repayment_platform_count_3m like", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mNotLike(String value) {
            addCriterion("repayment_platform_count_3m not like", value, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mIn(List<String> values) {
            addCriterion("repayment_platform_count_3m in", values, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mNotIn(List<String> values) {
            addCriterion("repayment_platform_count_3m not in", values, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mBetween(String value1, String value2) {
            addCriterion("repayment_platform_count_3m between", value1, value2, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount3mNotBetween(String value1, String value2) {
            addCriterion("repayment_platform_count_3m not between", value1, value2, "repaymentPlatformCount3m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mIsNull() {
            addCriterion("repayment_platform_count_1m is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mIsNotNull() {
            addCriterion("repayment_platform_count_1m is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mEqualTo(String value) {
            addCriterion("repayment_platform_count_1m =", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mNotEqualTo(String value) {
            addCriterion("repayment_platform_count_1m <>", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mGreaterThan(String value) {
            addCriterion("repayment_platform_count_1m >", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count_1m >=", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mLessThan(String value) {
            addCriterion("repayment_platform_count_1m <", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mLessThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count_1m <=", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mLike(String value) {
            addCriterion("repayment_platform_count_1m like", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mNotLike(String value) {
            addCriterion("repayment_platform_count_1m not like", value, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mIn(List<String> values) {
            addCriterion("repayment_platform_count_1m in", values, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mNotIn(List<String> values) {
            addCriterion("repayment_platform_count_1m not in", values, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mBetween(String value1, String value2) {
            addCriterion("repayment_platform_count_1m between", value1, value2, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount1mNotBetween(String value1, String value2) {
            addCriterion("repayment_platform_count_1m not between", value1, value2, "repaymentPlatformCount1m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mIsNull() {
            addCriterion("repayment_platform_count_6m is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mIsNotNull() {
            addCriterion("repayment_platform_count_6m is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mEqualTo(String value) {
            addCriterion("repayment_platform_count_6m =", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mNotEqualTo(String value) {
            addCriterion("repayment_platform_count_6m <>", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mGreaterThan(String value) {
            addCriterion("repayment_platform_count_6m >", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count_6m >=", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mLessThan(String value) {
            addCriterion("repayment_platform_count_6m <", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mLessThanOrEqualTo(String value) {
            addCriterion("repayment_platform_count_6m <=", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mLike(String value) {
            addCriterion("repayment_platform_count_6m like", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mNotLike(String value) {
            addCriterion("repayment_platform_count_6m not like", value, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mIn(List<String> values) {
            addCriterion("repayment_platform_count_6m in", values, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mNotIn(List<String> values) {
            addCriterion("repayment_platform_count_6m not in", values, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mBetween(String value1, String value2) {
            addCriterion("repayment_platform_count_6m between", value1, value2, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlatformCount6mNotBetween(String value1, String value2) {
            addCriterion("repayment_platform_count_6m not between", value1, value2, "repaymentPlatformCount6m");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPIsNull() {
            addCriterion("today_request_loan_p is null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPIsNotNull() {
            addCriterion("today_request_loan_p is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPEqualTo(String value) {
            addCriterion("today_request_loan_p =", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPNotEqualTo(String value) {
            addCriterion("today_request_loan_p <>", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPGreaterThan(String value) {
            addCriterion("today_request_loan_p >", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPGreaterThanOrEqualTo(String value) {
            addCriterion("today_request_loan_p >=", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPLessThan(String value) {
            addCriterion("today_request_loan_p <", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPLessThanOrEqualTo(String value) {
            addCriterion("today_request_loan_p <=", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPLike(String value) {
            addCriterion("today_request_loan_p like", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPNotLike(String value) {
            addCriterion("today_request_loan_p not like", value, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPIn(List<String> values) {
            addCriterion("today_request_loan_p in", values, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPNotIn(List<String> values) {
            addCriterion("today_request_loan_p not in", values, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPBetween(String value1, String value2) {
            addCriterion("today_request_loan_p between", value1, value2, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPNotBetween(String value1, String value2) {
            addCriterion("today_request_loan_p not between", value1, value2, "todayRequestLoanP");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreIsNull() {
            addCriterion("today_request_loan_fre is null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreIsNotNull() {
            addCriterion("today_request_loan_fre is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreEqualTo(String value) {
            addCriterion("today_request_loan_fre =", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreNotEqualTo(String value) {
            addCriterion("today_request_loan_fre <>", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreGreaterThan(String value) {
            addCriterion("today_request_loan_fre >", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreGreaterThanOrEqualTo(String value) {
            addCriterion("today_request_loan_fre >=", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreLessThan(String value) {
            addCriterion("today_request_loan_fre <", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreLessThanOrEqualTo(String value) {
            addCriterion("today_request_loan_fre <=", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreLike(String value) {
            addCriterion("today_request_loan_fre like", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreNotLike(String value) {
            addCriterion("today_request_loan_fre not like", value, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreIn(List<String> values) {
            addCriterion("today_request_loan_fre in", values, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreNotIn(List<String> values) {
            addCriterion("today_request_loan_fre not in", values, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreBetween(String value1, String value2) {
            addCriterion("today_request_loan_fre between", value1, value2, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreNotBetween(String value1, String value2) {
            addCriterion("today_request_loan_fre not between", value1, value2, "todayRequestLoanFre");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceIsNull() {
            addCriterion("today_request_loan_divice is null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceIsNotNull() {
            addCriterion("today_request_loan_divice is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceEqualTo(String value) {
            addCriterion("today_request_loan_divice =", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceNotEqualTo(String value) {
            addCriterion("today_request_loan_divice <>", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceGreaterThan(String value) {
            addCriterion("today_request_loan_divice >", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceGreaterThanOrEqualTo(String value) {
            addCriterion("today_request_loan_divice >=", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceLessThan(String value) {
            addCriterion("today_request_loan_divice <", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceLessThanOrEqualTo(String value) {
            addCriterion("today_request_loan_divice <=", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceLike(String value) {
            addCriterion("today_request_loan_divice like", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceNotLike(String value) {
            addCriterion("today_request_loan_divice not like", value, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceIn(List<String> values) {
            addCriterion("today_request_loan_divice in", values, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceNotIn(List<String> values) {
            addCriterion("today_request_loan_divice not in", values, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceBetween(String value1, String value2) {
            addCriterion("today_request_loan_divice between", value1, value2, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanDiviceNotBetween(String value1, String value2) {
            addCriterion("today_request_loan_divice not between", value1, value2, "todayRequestLoanDivice");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxIsNull() {
            addCriterion("today_request_loan_fre_max is null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxIsNotNull() {
            addCriterion("today_request_loan_fre_max is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxEqualTo(String value) {
            addCriterion("today_request_loan_fre_max =", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxNotEqualTo(String value) {
            addCriterion("today_request_loan_fre_max <>", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxGreaterThan(String value) {
            addCriterion("today_request_loan_fre_max >", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxGreaterThanOrEqualTo(String value) {
            addCriterion("today_request_loan_fre_max >=", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxLessThan(String value) {
            addCriterion("today_request_loan_fre_max <", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxLessThanOrEqualTo(String value) {
            addCriterion("today_request_loan_fre_max <=", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxLike(String value) {
            addCriterion("today_request_loan_fre_max like", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxNotLike(String value) {
            addCriterion("today_request_loan_fre_max not like", value, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxIn(List<String> values) {
            addCriterion("today_request_loan_fre_max in", values, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxNotIn(List<String> values) {
            addCriterion("today_request_loan_fre_max not in", values, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxBetween(String value1, String value2) {
            addCriterion("today_request_loan_fre_max between", value1, value2, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanFreMaxNotBetween(String value1, String value2) {
            addCriterion("today_request_loan_fre_max not between", value1, value2, "todayRequestLoanFreMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxIsNull() {
            addCriterion("today_request_loan_p_max is null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxIsNotNull() {
            addCriterion("today_request_loan_p_max is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxEqualTo(String value) {
            addCriterion("today_request_loan_p_max =", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxNotEqualTo(String value) {
            addCriterion("today_request_loan_p_max <>", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxGreaterThan(String value) {
            addCriterion("today_request_loan_p_max >", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxGreaterThanOrEqualTo(String value) {
            addCriterion("today_request_loan_p_max >=", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxLessThan(String value) {
            addCriterion("today_request_loan_p_max <", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxLessThanOrEqualTo(String value) {
            addCriterion("today_request_loan_p_max <=", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxLike(String value) {
            addCriterion("today_request_loan_p_max like", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxNotLike(String value) {
            addCriterion("today_request_loan_p_max not like", value, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxIn(List<String> values) {
            addCriterion("today_request_loan_p_max in", values, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxNotIn(List<String> values) {
            addCriterion("today_request_loan_p_max not in", values, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxBetween(String value1, String value2) {
            addCriterion("today_request_loan_p_max between", value1, value2, "todayRequestLoanPMax");
            return (Criteria) this;
        }

        public Criteria andTodayRequestLoanPMaxNotBetween(String value1, String value2) {
            addCriterion("today_request_loan_p_max not between", value1, value2, "todayRequestLoanPMax");
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