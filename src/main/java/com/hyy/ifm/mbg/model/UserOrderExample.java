package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOrderExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeIsNull() {
            addCriterion("apply_bank_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeIsNotNull() {
            addCriterion("apply_bank_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeEqualTo(Date value) {
            addCriterion("apply_bank_time =", value, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeNotEqualTo(Date value) {
            addCriterion("apply_bank_time <>", value, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeGreaterThan(Date value) {
            addCriterion("apply_bank_time >", value, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_bank_time >=", value, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeLessThan(Date value) {
            addCriterion("apply_bank_time <", value, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_bank_time <=", value, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeIn(List<Date> values) {
            addCriterion("apply_bank_time in", values, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeNotIn(List<Date> values) {
            addCriterion("apply_bank_time not in", values, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeBetween(Date value1, Date value2) {
            addCriterion("apply_bank_time between", value1, value2, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyBankTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_bank_time not between", value1, value2, "applyBankTime");
            return (Criteria) this;
        }

        public Criteria andApplyAmtIsNull() {
            addCriterion("apply_amt is null");
            return (Criteria) this;
        }

        public Criteria andApplyAmtIsNotNull() {
            addCriterion("apply_amt is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAmtEqualTo(Double value) {
            addCriterion("apply_amt =", value, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtNotEqualTo(Double value) {
            addCriterion("apply_amt <>", value, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtGreaterThan(Double value) {
            addCriterion("apply_amt >", value, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("apply_amt >=", value, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtLessThan(Double value) {
            addCriterion("apply_amt <", value, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtLessThanOrEqualTo(Double value) {
            addCriterion("apply_amt <=", value, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtIn(List<Double> values) {
            addCriterion("apply_amt in", values, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtNotIn(List<Double> values) {
            addCriterion("apply_amt not in", values, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtBetween(Double value1, Double value2) {
            addCriterion("apply_amt between", value1, value2, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andApplyAmtNotBetween(Double value1, Double value2) {
            addCriterion("apply_amt not between", value1, value2, "applyAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtIsNull() {
            addCriterion("repay_amt is null");
            return (Criteria) this;
        }

        public Criteria andRepayAmtIsNotNull() {
            addCriterion("repay_amt is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAmtEqualTo(Double value) {
            addCriterion("repay_amt =", value, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtNotEqualTo(Double value) {
            addCriterion("repay_amt <>", value, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtGreaterThan(Double value) {
            addCriterion("repay_amt >", value, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("repay_amt >=", value, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtLessThan(Double value) {
            addCriterion("repay_amt <", value, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtLessThanOrEqualTo(Double value) {
            addCriterion("repay_amt <=", value, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtIn(List<Double> values) {
            addCriterion("repay_amt in", values, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtNotIn(List<Double> values) {
            addCriterion("repay_amt not in", values, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtBetween(Double value1, Double value2) {
            addCriterion("repay_amt between", value1, value2, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andRepayAmtNotBetween(Double value1, Double value2) {
            addCriterion("repay_amt not between", value1, value2, "repayAmt");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNull() {
            addCriterion("pay_amt is null");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNotNull() {
            addCriterion("pay_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmtEqualTo(Double value) {
            addCriterion("pay_amt =", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotEqualTo(Double value) {
            addCriterion("pay_amt <>", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThan(Double value) {
            addCriterion("pay_amt >", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_amt >=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThan(Double value) {
            addCriterion("pay_amt <", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThanOrEqualTo(Double value) {
            addCriterion("pay_amt <=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtIn(List<Double> values) {
            addCriterion("pay_amt in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotIn(List<Double> values) {
            addCriterion("pay_amt not in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtBetween(Double value1, Double value2) {
            addCriterion("pay_amt between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotBetween(Double value1, Double value2) {
            addCriterion("pay_amt not between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bank_no =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bank_no >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("bank_no <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("bank_no like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("bank_no not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bank_no in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andUserAuthIsNull() {
            addCriterion("user_auth is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthIsNotNull() {
            addCriterion("user_auth is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthEqualTo(String value) {
            addCriterion("user_auth =", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotEqualTo(String value) {
            addCriterion("user_auth <>", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthGreaterThan(String value) {
            addCriterion("user_auth >", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthGreaterThanOrEqualTo(String value) {
            addCriterion("user_auth >=", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLessThan(String value) {
            addCriterion("user_auth <", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLessThanOrEqualTo(String value) {
            addCriterion("user_auth <=", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLike(String value) {
            addCriterion("user_auth like", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotLike(String value) {
            addCriterion("user_auth not like", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthIn(List<String> values) {
            addCriterion("user_auth in", values, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotIn(List<String> values) {
            addCriterion("user_auth not in", values, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthBetween(String value1, String value2) {
            addCriterion("user_auth between", value1, value2, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotBetween(String value1, String value2) {
            addCriterion("user_auth not between", value1, value2, "userAuth");
            return (Criteria) this;
        }

        public Criteria andRebackAmtIsNull() {
            addCriterion("reback_amt is null");
            return (Criteria) this;
        }

        public Criteria andRebackAmtIsNotNull() {
            addCriterion("reback_amt is not null");
            return (Criteria) this;
        }

        public Criteria andRebackAmtEqualTo(Double value) {
            addCriterion("reback_amt =", value, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtNotEqualTo(Double value) {
            addCriterion("reback_amt <>", value, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtGreaterThan(Double value) {
            addCriterion("reback_amt >", value, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("reback_amt >=", value, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtLessThan(Double value) {
            addCriterion("reback_amt <", value, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtLessThanOrEqualTo(Double value) {
            addCriterion("reback_amt <=", value, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtIn(List<Double> values) {
            addCriterion("reback_amt in", values, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtNotIn(List<Double> values) {
            addCriterion("reback_amt not in", values, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtBetween(Double value1, Double value2) {
            addCriterion("reback_amt between", value1, value2, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andRebackAmtNotBetween(Double value1, Double value2) {
            addCriterion("reback_amt not between", value1, value2, "rebackAmt");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(Integer value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(Integer value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(Integer value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(Integer value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<Integer> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<Integer> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_user_id not between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andRefundAmtIsNull() {
            addCriterion("refund_amt is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmtIsNotNull() {
            addCriterion("refund_amt is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmtEqualTo(Double value) {
            addCriterion("refund_amt =", value, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtNotEqualTo(Double value) {
            addCriterion("refund_amt <>", value, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtGreaterThan(Double value) {
            addCriterion("refund_amt >", value, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_amt >=", value, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtLessThan(Double value) {
            addCriterion("refund_amt <", value, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtLessThanOrEqualTo(Double value) {
            addCriterion("refund_amt <=", value, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtIn(List<Double> values) {
            addCriterion("refund_amt in", values, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtNotIn(List<Double> values) {
            addCriterion("refund_amt not in", values, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtBetween(Double value1, Double value2) {
            addCriterion("refund_amt between", value1, value2, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundAmtNotBetween(Double value1, Double value2) {
            addCriterion("refund_amt not between", value1, value2, "refundAmt");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
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