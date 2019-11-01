package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcProductReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcProductReportExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterion("visit_time =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterion("visit_time <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterion("visit_time >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("visit_time >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterion("visit_time <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("visit_time <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterion("visit_time in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterion("visit_time not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterion("visit_time between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("visit_time not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(Date value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(Date value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(Date value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(Date value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(Date value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<Date> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<Date> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(Date value1, Date value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(Date value1, Date value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNull() {
            addCriterion("visit_count is null");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNotNull() {
            addCriterion("visit_count is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCountEqualTo(Integer value) {
            addCriterion("visit_count =", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotEqualTo(Integer value) {
            addCriterion("visit_count <>", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThan(Integer value) {
            addCriterion("visit_count >", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_count >=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThan(Integer value) {
            addCriterion("visit_count <", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThanOrEqualTo(Integer value) {
            addCriterion("visit_count <=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountIn(List<Integer> values) {
            addCriterion("visit_count in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotIn(List<Integer> values) {
            addCriterion("visit_count not in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountBetween(Integer value1, Integer value2) {
            addCriterion("visit_count between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_count not between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andRegCountIsNull() {
            addCriterion("reg_count is null");
            return (Criteria) this;
        }

        public Criteria andRegCountIsNotNull() {
            addCriterion("reg_count is not null");
            return (Criteria) this;
        }

        public Criteria andRegCountEqualTo(Integer value) {
            addCriterion("reg_count =", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountNotEqualTo(Integer value) {
            addCriterion("reg_count <>", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountGreaterThan(Integer value) {
            addCriterion("reg_count >", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_count >=", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountLessThan(Integer value) {
            addCriterion("reg_count <", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountLessThanOrEqualTo(Integer value) {
            addCriterion("reg_count <=", value, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountIn(List<Integer> values) {
            addCriterion("reg_count in", values, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountNotIn(List<Integer> values) {
            addCriterion("reg_count not in", values, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountBetween(Integer value1, Integer value2) {
            addCriterion("reg_count between", value1, value2, "regCount");
            return (Criteria) this;
        }

        public Criteria andRegCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_count not between", value1, value2, "regCount");
            return (Criteria) this;
        }

        public Criteria andChangeRateIsNull() {
            addCriterion("change_rate is null");
            return (Criteria) this;
        }

        public Criteria andChangeRateIsNotNull() {
            addCriterion("change_rate is not null");
            return (Criteria) this;
        }

        public Criteria andChangeRateEqualTo(Double value) {
            addCriterion("change_rate =", value, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateNotEqualTo(Double value) {
            addCriterion("change_rate <>", value, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateGreaterThan(Double value) {
            addCriterion("change_rate >", value, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("change_rate >=", value, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateLessThan(Double value) {
            addCriterion("change_rate <", value, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateLessThanOrEqualTo(Double value) {
            addCriterion("change_rate <=", value, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateIn(List<Double> values) {
            addCriterion("change_rate in", values, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateNotIn(List<Double> values) {
            addCriterion("change_rate not in", values, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateBetween(Double value1, Double value2) {
            addCriterion("change_rate between", value1, value2, "changeRate");
            return (Criteria) this;
        }

        public Criteria andChangeRateNotBetween(Double value1, Double value2) {
            addCriterion("change_rate not between", value1, value2, "changeRate");
            return (Criteria) this;
        }

        public Criteria andLoanCountIsNull() {
            addCriterion("loan_count is null");
            return (Criteria) this;
        }

        public Criteria andLoanCountIsNotNull() {
            addCriterion("loan_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCountEqualTo(Integer value) {
            addCriterion("loan_count =", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountNotEqualTo(Integer value) {
            addCriterion("loan_count <>", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountGreaterThan(Integer value) {
            addCriterion("loan_count >", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_count >=", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountLessThan(Integer value) {
            addCriterion("loan_count <", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountLessThanOrEqualTo(Integer value) {
            addCriterion("loan_count <=", value, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountIn(List<Integer> values) {
            addCriterion("loan_count in", values, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountNotIn(List<Integer> values) {
            addCriterion("loan_count not in", values, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountBetween(Integer value1, Integer value2) {
            addCriterion("loan_count between", value1, value2, "loanCount");
            return (Criteria) this;
        }

        public Criteria andLoanCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_count not between", value1, value2, "loanCount");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecIsNull() {
            addCriterion("settle_certificatec is null");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecIsNotNull() {
            addCriterion("settle_certificatec is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecEqualTo(String value) {
            addCriterion("settle_certificatec =", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecNotEqualTo(String value) {
            addCriterion("settle_certificatec <>", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecGreaterThan(String value) {
            addCriterion("settle_certificatec >", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecGreaterThanOrEqualTo(String value) {
            addCriterion("settle_certificatec >=", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecLessThan(String value) {
            addCriterion("settle_certificatec <", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecLessThanOrEqualTo(String value) {
            addCriterion("settle_certificatec <=", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecLike(String value) {
            addCriterion("settle_certificatec like", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecNotLike(String value) {
            addCriterion("settle_certificatec not like", value, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecIn(List<String> values) {
            addCriterion("settle_certificatec in", values, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecNotIn(List<String> values) {
            addCriterion("settle_certificatec not in", values, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecBetween(String value1, String value2) {
            addCriterion("settle_certificatec between", value1, value2, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSettleCertificatecNotBetween(String value1, String value2) {
            addCriterion("settle_certificatec not between", value1, value2, "settleCertificatec");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSettleWayIsNull() {
            addCriterion("settle_way is null");
            return (Criteria) this;
        }

        public Criteria andSettleWayIsNotNull() {
            addCriterion("settle_way is not null");
            return (Criteria) this;
        }

        public Criteria andSettleWayEqualTo(String value) {
            addCriterion("settle_way =", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayNotEqualTo(String value) {
            addCriterion("settle_way <>", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayGreaterThan(String value) {
            addCriterion("settle_way >", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayGreaterThanOrEqualTo(String value) {
            addCriterion("settle_way >=", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayLessThan(String value) {
            addCriterion("settle_way <", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayLessThanOrEqualTo(String value) {
            addCriterion("settle_way <=", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayLike(String value) {
            addCriterion("settle_way like", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayNotLike(String value) {
            addCriterion("settle_way not like", value, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayIn(List<String> values) {
            addCriterion("settle_way in", values, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayNotIn(List<String> values) {
            addCriterion("settle_way not in", values, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayBetween(String value1, String value2) {
            addCriterion("settle_way between", value1, value2, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleWayNotBetween(String value1, String value2) {
            addCriterion("settle_way not between", value1, value2, "settleWay");
            return (Criteria) this;
        }

        public Criteria andSettleStateIsNull() {
            addCriterion("settle_state is null");
            return (Criteria) this;
        }

        public Criteria andSettleStateIsNotNull() {
            addCriterion("settle_state is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStateEqualTo(String value) {
            addCriterion("settle_state =", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotEqualTo(String value) {
            addCriterion("settle_state <>", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateGreaterThan(String value) {
            addCriterion("settle_state >", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_state >=", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLessThan(String value) {
            addCriterion("settle_state <", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLessThanOrEqualTo(String value) {
            addCriterion("settle_state <=", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLike(String value) {
            addCriterion("settle_state like", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotLike(String value) {
            addCriterion("settle_state not like", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateIn(List<String> values) {
            addCriterion("settle_state in", values, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotIn(List<String> values) {
            addCriterion("settle_state not in", values, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateBetween(String value1, String value2) {
            addCriterion("settle_state between", value1, value2, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotBetween(String value1, String value2) {
            addCriterion("settle_state not between", value1, value2, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyIsNull() {
            addCriterion("settle_money is null");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyIsNotNull() {
            addCriterion("settle_money is not null");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyEqualTo(Double value) {
            addCriterion("settle_money =", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyNotEqualTo(Double value) {
            addCriterion("settle_money <>", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyGreaterThan(Double value) {
            addCriterion("settle_money >", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("settle_money >=", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyLessThan(Double value) {
            addCriterion("settle_money <", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyLessThanOrEqualTo(Double value) {
            addCriterion("settle_money <=", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyIn(List<Double> values) {
            addCriterion("settle_money in", values, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyNotIn(List<Double> values) {
            addCriterion("settle_money not in", values, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyBetween(Double value1, Double value2) {
            addCriterion("settle_money between", value1, value2, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyNotBetween(Double value1, Double value2) {
            addCriterion("settle_money not between", value1, value2, "settleMoney");
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