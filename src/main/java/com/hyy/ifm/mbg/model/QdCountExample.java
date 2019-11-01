package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QdCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QdCountExample() {
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountuvIsNull() {
            addCriterion("countUv is null");
            return (Criteria) this;
        }

        public Criteria andCountuvIsNotNull() {
            addCriterion("countUv is not null");
            return (Criteria) this;
        }

        public Criteria andCountuvEqualTo(Integer value) {
            addCriterion("countUv =", value, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvNotEqualTo(Integer value) {
            addCriterion("countUv <>", value, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvGreaterThan(Integer value) {
            addCriterion("countUv >", value, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvGreaterThanOrEqualTo(Integer value) {
            addCriterion("countUv >=", value, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvLessThan(Integer value) {
            addCriterion("countUv <", value, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvLessThanOrEqualTo(Integer value) {
            addCriterion("countUv <=", value, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvIn(List<Integer> values) {
            addCriterion("countUv in", values, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvNotIn(List<Integer> values) {
            addCriterion("countUv not in", values, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvBetween(Integer value1, Integer value2) {
            addCriterion("countUv between", value1, value2, "countuv");
            return (Criteria) this;
        }

        public Criteria andCountuvNotBetween(Integer value1, Integer value2) {
            addCriterion("countUv not between", value1, value2, "countuv");
            return (Criteria) this;
        }

        public Criteria andNonecountIsNull() {
            addCriterion("noneCount is null");
            return (Criteria) this;
        }

        public Criteria andNonecountIsNotNull() {
            addCriterion("noneCount is not null");
            return (Criteria) this;
        }

        public Criteria andNonecountEqualTo(Integer value) {
            addCriterion("noneCount =", value, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountNotEqualTo(Integer value) {
            addCriterion("noneCount <>", value, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountGreaterThan(Integer value) {
            addCriterion("noneCount >", value, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("noneCount >=", value, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountLessThan(Integer value) {
            addCriterion("noneCount <", value, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountLessThanOrEqualTo(Integer value) {
            addCriterion("noneCount <=", value, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountIn(List<Integer> values) {
            addCriterion("noneCount in", values, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountNotIn(List<Integer> values) {
            addCriterion("noneCount not in", values, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountBetween(Integer value1, Integer value2) {
            addCriterion("noneCount between", value1, value2, "nonecount");
            return (Criteria) this;
        }

        public Criteria andNonecountNotBetween(Integer value1, Integer value2) {
            addCriterion("noneCount not between", value1, value2, "nonecount");
            return (Criteria) this;
        }

        public Criteria andFacecountIsNull() {
            addCriterion("faceCount is null");
            return (Criteria) this;
        }

        public Criteria andFacecountIsNotNull() {
            addCriterion("faceCount is not null");
            return (Criteria) this;
        }

        public Criteria andFacecountEqualTo(Integer value) {
            addCriterion("faceCount =", value, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountNotEqualTo(Integer value) {
            addCriterion("faceCount <>", value, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountGreaterThan(Integer value) {
            addCriterion("faceCount >", value, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("faceCount >=", value, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountLessThan(Integer value) {
            addCriterion("faceCount <", value, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountLessThanOrEqualTo(Integer value) {
            addCriterion("faceCount <=", value, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountIn(List<Integer> values) {
            addCriterion("faceCount in", values, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountNotIn(List<Integer> values) {
            addCriterion("faceCount not in", values, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountBetween(Integer value1, Integer value2) {
            addCriterion("faceCount between", value1, value2, "facecount");
            return (Criteria) this;
        }

        public Criteria andFacecountNotBetween(Integer value1, Integer value2) {
            addCriterion("faceCount not between", value1, value2, "facecount");
            return (Criteria) this;
        }

        public Criteria andPercountIsNull() {
            addCriterion("perCount is null");
            return (Criteria) this;
        }

        public Criteria andPercountIsNotNull() {
            addCriterion("perCount is not null");
            return (Criteria) this;
        }

        public Criteria andPercountEqualTo(Integer value) {
            addCriterion("perCount =", value, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountNotEqualTo(Integer value) {
            addCriterion("perCount <>", value, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountGreaterThan(Integer value) {
            addCriterion("perCount >", value, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("perCount >=", value, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountLessThan(Integer value) {
            addCriterion("perCount <", value, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountLessThanOrEqualTo(Integer value) {
            addCriterion("perCount <=", value, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountIn(List<Integer> values) {
            addCriterion("perCount in", values, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountNotIn(List<Integer> values) {
            addCriterion("perCount not in", values, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountBetween(Integer value1, Integer value2) {
            addCriterion("perCount between", value1, value2, "percount");
            return (Criteria) this;
        }

        public Criteria andPercountNotBetween(Integer value1, Integer value2) {
            addCriterion("perCount not between", value1, value2, "percount");
            return (Criteria) this;
        }

        public Criteria andBankcountIsNull() {
            addCriterion("bankCount is null");
            return (Criteria) this;
        }

        public Criteria andBankcountIsNotNull() {
            addCriterion("bankCount is not null");
            return (Criteria) this;
        }

        public Criteria andBankcountEqualTo(Integer value) {
            addCriterion("bankCount =", value, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountNotEqualTo(Integer value) {
            addCriterion("bankCount <>", value, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountGreaterThan(Integer value) {
            addCriterion("bankCount >", value, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankCount >=", value, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountLessThan(Integer value) {
            addCriterion("bankCount <", value, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountLessThanOrEqualTo(Integer value) {
            addCriterion("bankCount <=", value, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountIn(List<Integer> values) {
            addCriterion("bankCount in", values, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountNotIn(List<Integer> values) {
            addCriterion("bankCount not in", values, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountBetween(Integer value1, Integer value2) {
            addCriterion("bankCount between", value1, value2, "bankcount");
            return (Criteria) this;
        }

        public Criteria andBankcountNotBetween(Integer value1, Integer value2) {
            addCriterion("bankCount not between", value1, value2, "bankcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountIsNull() {
            addCriterion("concatCount is null");
            return (Criteria) this;
        }

        public Criteria andConcatcountIsNotNull() {
            addCriterion("concatCount is not null");
            return (Criteria) this;
        }

        public Criteria andConcatcountEqualTo(Integer value) {
            addCriterion("concatCount =", value, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountNotEqualTo(Integer value) {
            addCriterion("concatCount <>", value, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountGreaterThan(Integer value) {
            addCriterion("concatCount >", value, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("concatCount >=", value, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountLessThan(Integer value) {
            addCriterion("concatCount <", value, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountLessThanOrEqualTo(Integer value) {
            addCriterion("concatCount <=", value, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountIn(List<Integer> values) {
            addCriterion("concatCount in", values, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountNotIn(List<Integer> values) {
            addCriterion("concatCount not in", values, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountBetween(Integer value1, Integer value2) {
            addCriterion("concatCount between", value1, value2, "concatcount");
            return (Criteria) this;
        }

        public Criteria andConcatcountNotBetween(Integer value1, Integer value2) {
            addCriterion("concatCount not between", value1, value2, "concatcount");
            return (Criteria) this;
        }

        public Criteria andYuncountIsNull() {
            addCriterion("yunCount is null");
            return (Criteria) this;
        }

        public Criteria andYuncountIsNotNull() {
            addCriterion("yunCount is not null");
            return (Criteria) this;
        }

        public Criteria andYuncountEqualTo(Integer value) {
            addCriterion("yunCount =", value, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountNotEqualTo(Integer value) {
            addCriterion("yunCount <>", value, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountGreaterThan(Integer value) {
            addCriterion("yunCount >", value, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("yunCount >=", value, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountLessThan(Integer value) {
            addCriterion("yunCount <", value, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountLessThanOrEqualTo(Integer value) {
            addCriterion("yunCount <=", value, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountIn(List<Integer> values) {
            addCriterion("yunCount in", values, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountNotIn(List<Integer> values) {
            addCriterion("yunCount not in", values, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountBetween(Integer value1, Integer value2) {
            addCriterion("yunCount between", value1, value2, "yuncount");
            return (Criteria) this;
        }

        public Criteria andYuncountNotBetween(Integer value1, Integer value2) {
            addCriterion("yunCount not between", value1, value2, "yuncount");
            return (Criteria) this;
        }

        public Criteria andPaycountIsNull() {
            addCriterion("payCount is null");
            return (Criteria) this;
        }

        public Criteria andPaycountIsNotNull() {
            addCriterion("payCount is not null");
            return (Criteria) this;
        }

        public Criteria andPaycountEqualTo(Integer value) {
            addCriterion("payCount =", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotEqualTo(Integer value) {
            addCriterion("payCount <>", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountGreaterThan(Integer value) {
            addCriterion("payCount >", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("payCount >=", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountLessThan(Integer value) {
            addCriterion("payCount <", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountLessThanOrEqualTo(Integer value) {
            addCriterion("payCount <=", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountIn(List<Integer> values) {
            addCriterion("payCount in", values, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotIn(List<Integer> values) {
            addCriterion("payCount not in", values, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountBetween(Integer value1, Integer value2) {
            addCriterion("payCount between", value1, value2, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("payCount not between", value1, value2, "paycount");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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