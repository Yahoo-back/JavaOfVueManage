package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcProductExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(Integer value) {
            addCriterion("classify_id =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(Integer value) {
            addCriterion("classify_id <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(Integer value) {
            addCriterion("classify_id >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_id >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(Integer value) {
            addCriterion("classify_id <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("classify_id <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<Integer> values) {
            addCriterion("classify_id in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<Integer> values) {
            addCriterion("classify_id not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("classify_id between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_id not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(String value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(String value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(String value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(String value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(String value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(String value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLike(String value) {
            addCriterion("interest like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotLike(String value) {
            addCriterion("interest not like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<String> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<String> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(String value1, String value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(String value1, String value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andKtxDescIsNull() {
            addCriterion("ktx_desc is null");
            return (Criteria) this;
        }

        public Criteria andKtxDescIsNotNull() {
            addCriterion("ktx_desc is not null");
            return (Criteria) this;
        }

        public Criteria andKtxDescEqualTo(String value) {
            addCriterion("ktx_desc =", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescNotEqualTo(String value) {
            addCriterion("ktx_desc <>", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescGreaterThan(String value) {
            addCriterion("ktx_desc >", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescGreaterThanOrEqualTo(String value) {
            addCriterion("ktx_desc >=", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescLessThan(String value) {
            addCriterion("ktx_desc <", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescLessThanOrEqualTo(String value) {
            addCriterion("ktx_desc <=", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescLike(String value) {
            addCriterion("ktx_desc like", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescNotLike(String value) {
            addCriterion("ktx_desc not like", value, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescIn(List<String> values) {
            addCriterion("ktx_desc in", values, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescNotIn(List<String> values) {
            addCriterion("ktx_desc not in", values, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescBetween(String value1, String value2) {
            addCriterion("ktx_desc between", value1, value2, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andKtxDescNotBetween(String value1, String value2) {
            addCriterion("ktx_desc not between", value1, value2, "ktxDesc");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
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

        public Criteria andPerioWayIsNull() {
            addCriterion("perio_way is null");
            return (Criteria) this;
        }

        public Criteria andPerioWayIsNotNull() {
            addCriterion("perio_way is not null");
            return (Criteria) this;
        }

        public Criteria andPerioWayEqualTo(String value) {
            addCriterion("perio_way =", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayNotEqualTo(String value) {
            addCriterion("perio_way <>", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayGreaterThan(String value) {
            addCriterion("perio_way >", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayGreaterThanOrEqualTo(String value) {
            addCriterion("perio_way >=", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayLessThan(String value) {
            addCriterion("perio_way <", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayLessThanOrEqualTo(String value) {
            addCriterion("perio_way <=", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayLike(String value) {
            addCriterion("perio_way like", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayNotLike(String value) {
            addCriterion("perio_way not like", value, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayIn(List<String> values) {
            addCriterion("perio_way in", values, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayNotIn(List<String> values) {
            addCriterion("perio_way not in", values, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayBetween(String value1, String value2) {
            addCriterion("perio_way between", value1, value2, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPerioWayNotBetween(String value1, String value2) {
            addCriterion("perio_way not between", value1, value2, "perioWay");
            return (Criteria) this;
        }

        public Criteria andPeriodizationIsNull() {
            addCriterion("periodization is null");
            return (Criteria) this;
        }

        public Criteria andPeriodizationIsNotNull() {
            addCriterion("periodization is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodizationEqualTo(String value) {
            addCriterion("periodization =", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationNotEqualTo(String value) {
            addCriterion("periodization <>", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationGreaterThan(String value) {
            addCriterion("periodization >", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationGreaterThanOrEqualTo(String value) {
            addCriterion("periodization >=", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationLessThan(String value) {
            addCriterion("periodization <", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationLessThanOrEqualTo(String value) {
            addCriterion("periodization <=", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationLike(String value) {
            addCriterion("periodization like", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationNotLike(String value) {
            addCriterion("periodization not like", value, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationIn(List<String> values) {
            addCriterion("periodization in", values, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationNotIn(List<String> values) {
            addCriterion("periodization not in", values, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationBetween(String value1, String value2) {
            addCriterion("periodization between", value1, value2, "periodization");
            return (Criteria) this;
        }

        public Criteria andPeriodizationNotBetween(String value1, String value2) {
            addCriterion("periodization not between", value1, value2, "periodization");
            return (Criteria) this;
        }

        public Criteria andConditionListIsNull() {
            addCriterion("condition_list is null");
            return (Criteria) this;
        }

        public Criteria andConditionListIsNotNull() {
            addCriterion("condition_list is not null");
            return (Criteria) this;
        }

        public Criteria andConditionListEqualTo(String value) {
            addCriterion("condition_list =", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListNotEqualTo(String value) {
            addCriterion("condition_list <>", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListGreaterThan(String value) {
            addCriterion("condition_list >", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListGreaterThanOrEqualTo(String value) {
            addCriterion("condition_list >=", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListLessThan(String value) {
            addCriterion("condition_list <", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListLessThanOrEqualTo(String value) {
            addCriterion("condition_list <=", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListLike(String value) {
            addCriterion("condition_list like", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListNotLike(String value) {
            addCriterion("condition_list not like", value, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListIn(List<String> values) {
            addCriterion("condition_list in", values, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListNotIn(List<String> values) {
            addCriterion("condition_list not in", values, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListBetween(String value1, String value2) {
            addCriterion("condition_list between", value1, value2, "conditionList");
            return (Criteria) this;
        }

        public Criteria andConditionListNotBetween(String value1, String value2) {
            addCriterion("condition_list not between", value1, value2, "conditionList");
            return (Criteria) this;
        }

        public Criteria andDataListIsNull() {
            addCriterion("data_list is null");
            return (Criteria) this;
        }

        public Criteria andDataListIsNotNull() {
            addCriterion("data_list is not null");
            return (Criteria) this;
        }

        public Criteria andDataListEqualTo(String value) {
            addCriterion("data_list =", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListNotEqualTo(String value) {
            addCriterion("data_list <>", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListGreaterThan(String value) {
            addCriterion("data_list >", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListGreaterThanOrEqualTo(String value) {
            addCriterion("data_list >=", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListLessThan(String value) {
            addCriterion("data_list <", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListLessThanOrEqualTo(String value) {
            addCriterion("data_list <=", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListLike(String value) {
            addCriterion("data_list like", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListNotLike(String value) {
            addCriterion("data_list not like", value, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListIn(List<String> values) {
            addCriterion("data_list in", values, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListNotIn(List<String> values) {
            addCriterion("data_list not in", values, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListBetween(String value1, String value2) {
            addCriterion("data_list between", value1, value2, "dataList");
            return (Criteria) this;
        }

        public Criteria andDataListNotBetween(String value1, String value2) {
            addCriterion("data_list not between", value1, value2, "dataList");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNull() {
            addCriterion("contact_info is null");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNotNull() {
            addCriterion("contact_info is not null");
            return (Criteria) this;
        }

        public Criteria andContactInfoEqualTo(String value) {
            addCriterion("contact_info =", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotEqualTo(String value) {
            addCriterion("contact_info <>", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThan(String value) {
            addCriterion("contact_info >", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThanOrEqualTo(String value) {
            addCriterion("contact_info >=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThan(String value) {
            addCriterion("contact_info <", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThanOrEqualTo(String value) {
            addCriterion("contact_info <=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLike(String value) {
            addCriterion("contact_info like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotLike(String value) {
            addCriterion("contact_info not like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoIn(List<String> values) {
            addCriterion("contact_info in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotIn(List<String> values) {
            addCriterion("contact_info not in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoBetween(String value1, String value2) {
            addCriterion("contact_info between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotBetween(String value1, String value2) {
            addCriterion("contact_info not between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andManagerUrlIsNull() {
            addCriterion("manager_url is null");
            return (Criteria) this;
        }

        public Criteria andManagerUrlIsNotNull() {
            addCriterion("manager_url is not null");
            return (Criteria) this;
        }

        public Criteria andManagerUrlEqualTo(String value) {
            addCriterion("manager_url =", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlNotEqualTo(String value) {
            addCriterion("manager_url <>", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlGreaterThan(String value) {
            addCriterion("manager_url >", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("manager_url >=", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlLessThan(String value) {
            addCriterion("manager_url <", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlLessThanOrEqualTo(String value) {
            addCriterion("manager_url <=", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlLike(String value) {
            addCriterion("manager_url like", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlNotLike(String value) {
            addCriterion("manager_url not like", value, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlIn(List<String> values) {
            addCriterion("manager_url in", values, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlNotIn(List<String> values) {
            addCriterion("manager_url not in", values, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlBetween(String value1, String value2) {
            addCriterion("manager_url between", value1, value2, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUrlNotBetween(String value1, String value2) {
            addCriterion("manager_url not between", value1, value2, "managerUrl");
            return (Criteria) this;
        }

        public Criteria andManagerUserIsNull() {
            addCriterion("manager_user is null");
            return (Criteria) this;
        }

        public Criteria andManagerUserIsNotNull() {
            addCriterion("manager_user is not null");
            return (Criteria) this;
        }

        public Criteria andManagerUserEqualTo(String value) {
            addCriterion("manager_user =", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserNotEqualTo(String value) {
            addCriterion("manager_user <>", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserGreaterThan(String value) {
            addCriterion("manager_user >", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserGreaterThanOrEqualTo(String value) {
            addCriterion("manager_user >=", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserLessThan(String value) {
            addCriterion("manager_user <", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserLessThanOrEqualTo(String value) {
            addCriterion("manager_user <=", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserLike(String value) {
            addCriterion("manager_user like", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserNotLike(String value) {
            addCriterion("manager_user not like", value, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserIn(List<String> values) {
            addCriterion("manager_user in", values, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserNotIn(List<String> values) {
            addCriterion("manager_user not in", values, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserBetween(String value1, String value2) {
            addCriterion("manager_user between", value1, value2, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerUserNotBetween(String value1, String value2) {
            addCriterion("manager_user not between", value1, value2, "managerUser");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNull() {
            addCriterion("manager_password is null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNotNull() {
            addCriterion("manager_password is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordEqualTo(String value) {
            addCriterion("manager_password =", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotEqualTo(String value) {
            addCriterion("manager_password <>", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThan(String value) {
            addCriterion("manager_password >", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("manager_password >=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThan(String value) {
            addCriterion("manager_password <", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThanOrEqualTo(String value) {
            addCriterion("manager_password <=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLike(String value) {
            addCriterion("manager_password like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotLike(String value) {
            addCriterion("manager_password not like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIn(List<String> values) {
            addCriterion("manager_password in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotIn(List<String> values) {
            addCriterion("manager_password not in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordBetween(String value1, String value2) {
            addCriterion("manager_password between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotBetween(String value1, String value2) {
            addCriterion("manager_password not between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
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

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLike(String value) {
            addCriterion("is_hot like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotLike(String value) {
            addCriterion("is_hot not like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<String> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<String> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String value1, String value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String value1, String value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andHotSortIsNull() {
            addCriterion("hot_sort is null");
            return (Criteria) this;
        }

        public Criteria andHotSortIsNotNull() {
            addCriterion("hot_sort is not null");
            return (Criteria) this;
        }

        public Criteria andHotSortEqualTo(String value) {
            addCriterion("hot_sort =", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortNotEqualTo(String value) {
            addCriterion("hot_sort <>", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortGreaterThan(String value) {
            addCriterion("hot_sort >", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortGreaterThanOrEqualTo(String value) {
            addCriterion("hot_sort >=", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortLessThan(String value) {
            addCriterion("hot_sort <", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortLessThanOrEqualTo(String value) {
            addCriterion("hot_sort <=", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortLike(String value) {
            addCriterion("hot_sort like", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortNotLike(String value) {
            addCriterion("hot_sort not like", value, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortIn(List<String> values) {
            addCriterion("hot_sort in", values, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortNotIn(List<String> values) {
            addCriterion("hot_sort not in", values, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortBetween(String value1, String value2) {
            addCriterion("hot_sort between", value1, value2, "hotSort");
            return (Criteria) this;
        }

        public Criteria andHotSortNotBetween(String value1, String value2) {
            addCriterion("hot_sort not between", value1, value2, "hotSort");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("apply_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("apply_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(String value) {
            addCriterion("apply_num =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(String value) {
            addCriterion("apply_num <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(String value) {
            addCriterion("apply_num >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(String value) {
            addCriterion("apply_num >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(String value) {
            addCriterion("apply_num <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(String value) {
            addCriterion("apply_num <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLike(String value) {
            addCriterion("apply_num like", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotLike(String value) {
            addCriterion("apply_num not like", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<String> values) {
            addCriterion("apply_num in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<String> values) {
            addCriterion("apply_num not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(String value1, String value2) {
            addCriterion("apply_num between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(String value1, String value2) {
            addCriterion("apply_num not between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSettleCycleIsNull() {
            addCriterion("settle_cycle is null");
            return (Criteria) this;
        }

        public Criteria andSettleCycleIsNotNull() {
            addCriterion("settle_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCycleEqualTo(String value) {
            addCriterion("settle_cycle =", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleNotEqualTo(String value) {
            addCriterion("settle_cycle <>", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleGreaterThan(String value) {
            addCriterion("settle_cycle >", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleGreaterThanOrEqualTo(String value) {
            addCriterion("settle_cycle >=", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleLessThan(String value) {
            addCriterion("settle_cycle <", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleLessThanOrEqualTo(String value) {
            addCriterion("settle_cycle <=", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleLike(String value) {
            addCriterion("settle_cycle like", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleNotLike(String value) {
            addCriterion("settle_cycle not like", value, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleIn(List<String> values) {
            addCriterion("settle_cycle in", values, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleNotIn(List<String> values) {
            addCriterion("settle_cycle not in", values, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleBetween(String value1, String value2) {
            addCriterion("settle_cycle between", value1, value2, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleCycleNotBetween(String value1, String value2) {
            addCriterion("settle_cycle not between", value1, value2, "settleCycle");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaIsNull() {
            addCriterion("settle_way_cpa is null");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaIsNotNull() {
            addCriterion("settle_way_cpa is not null");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaEqualTo(String value) {
            addCriterion("settle_way_cpa =", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaNotEqualTo(String value) {
            addCriterion("settle_way_cpa <>", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaGreaterThan(String value) {
            addCriterion("settle_way_cpa >", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaGreaterThanOrEqualTo(String value) {
            addCriterion("settle_way_cpa >=", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaLessThan(String value) {
            addCriterion("settle_way_cpa <", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaLessThanOrEqualTo(String value) {
            addCriterion("settle_way_cpa <=", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaLike(String value) {
            addCriterion("settle_way_cpa like", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaNotLike(String value) {
            addCriterion("settle_way_cpa not like", value, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaIn(List<String> values) {
            addCriterion("settle_way_cpa in", values, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaNotIn(List<String> values) {
            addCriterion("settle_way_cpa not in", values, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaBetween(String value1, String value2) {
            addCriterion("settle_way_cpa between", value1, value2, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpaNotBetween(String value1, String value2) {
            addCriterion("settle_way_cpa not between", value1, value2, "settleWayCpa");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsIsNull() {
            addCriterion("settle_way_cps is null");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsIsNotNull() {
            addCriterion("settle_way_cps is not null");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsEqualTo(String value) {
            addCriterion("settle_way_cps =", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsNotEqualTo(String value) {
            addCriterion("settle_way_cps <>", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsGreaterThan(String value) {
            addCriterion("settle_way_cps >", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsGreaterThanOrEqualTo(String value) {
            addCriterion("settle_way_cps >=", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsLessThan(String value) {
            addCriterion("settle_way_cps <", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsLessThanOrEqualTo(String value) {
            addCriterion("settle_way_cps <=", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsLike(String value) {
            addCriterion("settle_way_cps like", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsNotLike(String value) {
            addCriterion("settle_way_cps not like", value, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsIn(List<String> values) {
            addCriterion("settle_way_cps in", values, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsNotIn(List<String> values) {
            addCriterion("settle_way_cps not in", values, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsBetween(String value1, String value2) {
            addCriterion("settle_way_cps between", value1, value2, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andSettleWayCpsNotBetween(String value1, String value2) {
            addCriterion("settle_way_cps not between", value1, value2, "settleWayCps");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(String value) {
            addCriterion("dpc.id =", value, "settleWayCps");
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
