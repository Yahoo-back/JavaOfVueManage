package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EqbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EqbExample() {
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

        public Criteria andCustomerNoIsNull() {
            addCriterion("customer_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("customer_no =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("customer_no <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("customer_no >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_no >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("customer_no <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("customer_no <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("customer_no like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("customer_no not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("customer_no in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("customer_no not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("customer_no between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("customer_no not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoIsNull() {
            addCriterion("rna_no is null");
            return (Criteria) this;
        }

        public Criteria andRnaNoIsNotNull() {
            addCriterion("rna_no is not null");
            return (Criteria) this;
        }

        public Criteria andRnaNoEqualTo(String value) {
            addCriterion("rna_no =", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoNotEqualTo(String value) {
            addCriterion("rna_no <>", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoGreaterThan(String value) {
            addCriterion("rna_no >", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoGreaterThanOrEqualTo(String value) {
            addCriterion("rna_no >=", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoLessThan(String value) {
            addCriterion("rna_no <", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoLessThanOrEqualTo(String value) {
            addCriterion("rna_no <=", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoLike(String value) {
            addCriterion("rna_no like", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoNotLike(String value) {
            addCriterion("rna_no not like", value, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoIn(List<String> values) {
            addCriterion("rna_no in", values, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoNotIn(List<String> values) {
            addCriterion("rna_no not in", values, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoBetween(String value1, String value2) {
            addCriterion("rna_no between", value1, value2, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andRnaNoNotBetween(String value1, String value2) {
            addCriterion("rna_no not between", value1, value2, "rnaNo");
            return (Criteria) this;
        }

        public Criteria andHtNo1IsNull() {
            addCriterion("ht_no1 is null");
            return (Criteria) this;
        }

        public Criteria andHtNo1IsNotNull() {
            addCriterion("ht_no1 is not null");
            return (Criteria) this;
        }

        public Criteria andHtNo1EqualTo(String value) {
            addCriterion("ht_no1 =", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1NotEqualTo(String value) {
            addCriterion("ht_no1 <>", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1GreaterThan(String value) {
            addCriterion("ht_no1 >", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1GreaterThanOrEqualTo(String value) {
            addCriterion("ht_no1 >=", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1LessThan(String value) {
            addCriterion("ht_no1 <", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1LessThanOrEqualTo(String value) {
            addCriterion("ht_no1 <=", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1Like(String value) {
            addCriterion("ht_no1 like", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1NotLike(String value) {
            addCriterion("ht_no1 not like", value, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1In(List<String> values) {
            addCriterion("ht_no1 in", values, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1NotIn(List<String> values) {
            addCriterion("ht_no1 not in", values, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1Between(String value1, String value2) {
            addCriterion("ht_no1 between", value1, value2, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo1NotBetween(String value1, String value2) {
            addCriterion("ht_no1 not between", value1, value2, "htNo1");
            return (Criteria) this;
        }

        public Criteria andHtNo2IsNull() {
            addCriterion("ht_no2 is null");
            return (Criteria) this;
        }

        public Criteria andHtNo2IsNotNull() {
            addCriterion("ht_no2 is not null");
            return (Criteria) this;
        }

        public Criteria andHtNo2EqualTo(String value) {
            addCriterion("ht_no2 =", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2NotEqualTo(String value) {
            addCriterion("ht_no2 <>", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2GreaterThan(String value) {
            addCriterion("ht_no2 >", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2GreaterThanOrEqualTo(String value) {
            addCriterion("ht_no2 >=", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2LessThan(String value) {
            addCriterion("ht_no2 <", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2LessThanOrEqualTo(String value) {
            addCriterion("ht_no2 <=", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2Like(String value) {
            addCriterion("ht_no2 like", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2NotLike(String value) {
            addCriterion("ht_no2 not like", value, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2In(List<String> values) {
            addCriterion("ht_no2 in", values, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2NotIn(List<String> values) {
            addCriterion("ht_no2 not in", values, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2Between(String value1, String value2) {
            addCriterion("ht_no2 between", value1, value2, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo2NotBetween(String value1, String value2) {
            addCriterion("ht_no2 not between", value1, value2, "htNo2");
            return (Criteria) this;
        }

        public Criteria andHtNo3IsNull() {
            addCriterion("ht_no3 is null");
            return (Criteria) this;
        }

        public Criteria andHtNo3IsNotNull() {
            addCriterion("ht_no3 is not null");
            return (Criteria) this;
        }

        public Criteria andHtNo3EqualTo(String value) {
            addCriterion("ht_no3 =", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3NotEqualTo(String value) {
            addCriterion("ht_no3 <>", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3GreaterThan(String value) {
            addCriterion("ht_no3 >", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3GreaterThanOrEqualTo(String value) {
            addCriterion("ht_no3 >=", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3LessThan(String value) {
            addCriterion("ht_no3 <", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3LessThanOrEqualTo(String value) {
            addCriterion("ht_no3 <=", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3Like(String value) {
            addCriterion("ht_no3 like", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3NotLike(String value) {
            addCriterion("ht_no3 not like", value, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3In(List<String> values) {
            addCriterion("ht_no3 in", values, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3NotIn(List<String> values) {
            addCriterion("ht_no3 not in", values, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3Between(String value1, String value2) {
            addCriterion("ht_no3 between", value1, value2, "htNo3");
            return (Criteria) this;
        }

        public Criteria andHtNo3NotBetween(String value1, String value2) {
            addCriterion("ht_no3 not between", value1, value2, "htNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo1IsNull() {
            addCriterion("req_no1 is null");
            return (Criteria) this;
        }

        public Criteria andReqNo1IsNotNull() {
            addCriterion("req_no1 is not null");
            return (Criteria) this;
        }

        public Criteria andReqNo1EqualTo(String value) {
            addCriterion("req_no1 =", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1NotEqualTo(String value) {
            addCriterion("req_no1 <>", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1GreaterThan(String value) {
            addCriterion("req_no1 >", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1GreaterThanOrEqualTo(String value) {
            addCriterion("req_no1 >=", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1LessThan(String value) {
            addCriterion("req_no1 <", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1LessThanOrEqualTo(String value) {
            addCriterion("req_no1 <=", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1Like(String value) {
            addCriterion("req_no1 like", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1NotLike(String value) {
            addCriterion("req_no1 not like", value, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1In(List<String> values) {
            addCriterion("req_no1 in", values, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1NotIn(List<String> values) {
            addCriterion("req_no1 not in", values, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1Between(String value1, String value2) {
            addCriterion("req_no1 between", value1, value2, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo1NotBetween(String value1, String value2) {
            addCriterion("req_no1 not between", value1, value2, "reqNo1");
            return (Criteria) this;
        }

        public Criteria andReqNo2IsNull() {
            addCriterion("req_no2 is null");
            return (Criteria) this;
        }

        public Criteria andReqNo2IsNotNull() {
            addCriterion("req_no2 is not null");
            return (Criteria) this;
        }

        public Criteria andReqNo2EqualTo(String value) {
            addCriterion("req_no2 =", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2NotEqualTo(String value) {
            addCriterion("req_no2 <>", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2GreaterThan(String value) {
            addCriterion("req_no2 >", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2GreaterThanOrEqualTo(String value) {
            addCriterion("req_no2 >=", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2LessThan(String value) {
            addCriterion("req_no2 <", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2LessThanOrEqualTo(String value) {
            addCriterion("req_no2 <=", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2Like(String value) {
            addCriterion("req_no2 like", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2NotLike(String value) {
            addCriterion("req_no2 not like", value, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2In(List<String> values) {
            addCriterion("req_no2 in", values, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2NotIn(List<String> values) {
            addCriterion("req_no2 not in", values, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2Between(String value1, String value2) {
            addCriterion("req_no2 between", value1, value2, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo2NotBetween(String value1, String value2) {
            addCriterion("req_no2 not between", value1, value2, "reqNo2");
            return (Criteria) this;
        }

        public Criteria andReqNo3IsNull() {
            addCriterion("req_no3 is null");
            return (Criteria) this;
        }

        public Criteria andReqNo3IsNotNull() {
            addCriterion("req_no3 is not null");
            return (Criteria) this;
        }

        public Criteria andReqNo3EqualTo(String value) {
            addCriterion("req_no3 =", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3NotEqualTo(String value) {
            addCriterion("req_no3 <>", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3GreaterThan(String value) {
            addCriterion("req_no3 >", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3GreaterThanOrEqualTo(String value) {
            addCriterion("req_no3 >=", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3LessThan(String value) {
            addCriterion("req_no3 <", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3LessThanOrEqualTo(String value) {
            addCriterion("req_no3 <=", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3Like(String value) {
            addCriterion("req_no3 like", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3NotLike(String value) {
            addCriterion("req_no3 not like", value, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3In(List<String> values) {
            addCriterion("req_no3 in", values, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3NotIn(List<String> values) {
            addCriterion("req_no3 not in", values, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3Between(String value1, String value2) {
            addCriterion("req_no3 between", value1, value2, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andReqNo3NotBetween(String value1, String value2) {
            addCriterion("req_no3 not between", value1, value2, "reqNo3");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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