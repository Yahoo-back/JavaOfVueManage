package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class IfmSysMuenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IfmSysMuenExample() {
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

        public Criteria andMuenidIsNull() {
            addCriterion("muenId is null");
            return (Criteria) this;
        }

        public Criteria andMuenidIsNotNull() {
            addCriterion("muenId is not null");
            return (Criteria) this;
        }

        public Criteria andMuenidEqualTo(Integer value) {
            addCriterion("muenId =", value, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidNotEqualTo(Integer value) {
            addCriterion("muenId <>", value, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidGreaterThan(Integer value) {
            addCriterion("muenId >", value, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("muenId >=", value, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidLessThan(Integer value) {
            addCriterion("muenId <", value, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidLessThanOrEqualTo(Integer value) {
            addCriterion("muenId <=", value, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidIn(List<Integer> values) {
            addCriterion("muenId in", values, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidNotIn(List<Integer> values) {
            addCriterion("muenId not in", values, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidBetween(Integer value1, Integer value2) {
            addCriterion("muenId between", value1, value2, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenidNotBetween(Integer value1, Integer value2) {
            addCriterion("muenId not between", value1, value2, "muenid");
            return (Criteria) this;
        }

        public Criteria andMuenNameIsNull() {
            addCriterion("MUEN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMuenNameIsNotNull() {
            addCriterion("MUEN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMuenNameEqualTo(String value) {
            addCriterion("MUEN_NAME =", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameNotEqualTo(String value) {
            addCriterion("MUEN_NAME <>", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameGreaterThan(String value) {
            addCriterion("MUEN_NAME >", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameGreaterThanOrEqualTo(String value) {
            addCriterion("MUEN_NAME >=", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameLessThan(String value) {
            addCriterion("MUEN_NAME <", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameLessThanOrEqualTo(String value) {
            addCriterion("MUEN_NAME <=", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameLike(String value) {
            addCriterion("MUEN_NAME like", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameNotLike(String value) {
            addCriterion("MUEN_NAME not like", value, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameIn(List<String> values) {
            addCriterion("MUEN_NAME in", values, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameNotIn(List<String> values) {
            addCriterion("MUEN_NAME not in", values, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameBetween(String value1, String value2) {
            addCriterion("MUEN_NAME between", value1, value2, "muenName");
            return (Criteria) this;
        }

        public Criteria andMuenNameNotBetween(String value1, String value2) {
            addCriterion("MUEN_NAME not between", value1, value2, "muenName");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("VALUE like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("VALUE not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdIsNull() {
            addCriterion("PARENT_MUEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdIsNotNull() {
            addCriterion("PARENT_MUEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdEqualTo(String value) {
            addCriterion("PARENT_MUEN_ID =", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdNotEqualTo(String value) {
            addCriterion("PARENT_MUEN_ID <>", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdGreaterThan(String value) {
            addCriterion("PARENT_MUEN_ID >", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_MUEN_ID >=", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdLessThan(String value) {
            addCriterion("PARENT_MUEN_ID <", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_MUEN_ID <=", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdLike(String value) {
            addCriterion("PARENT_MUEN_ID like", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdNotLike(String value) {
            addCriterion("PARENT_MUEN_ID not like", value, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdIn(List<String> values) {
            addCriterion("PARENT_MUEN_ID in", values, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdNotIn(List<String> values) {
            addCriterion("PARENT_MUEN_ID not in", values, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdBetween(String value1, String value2) {
            addCriterion("PARENT_MUEN_ID between", value1, value2, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andParentMuenIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_MUEN_ID not between", value1, value2, "parentMuenId");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(Integer value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Integer value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Integer value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Integer value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Integer value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Integer> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Integer> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Integer value1, Integer value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Integer value1, Integer value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("URI is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("URI is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("URI =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("URI <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("URI >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("URI >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("URI <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("URI <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("URI like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("URI not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("URI in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("URI not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("URI between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("URI not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andButtonsIsNull() {
            addCriterion("BUTTONS is null");
            return (Criteria) this;
        }

        public Criteria andButtonsIsNotNull() {
            addCriterion("BUTTONS is not null");
            return (Criteria) this;
        }

        public Criteria andButtonsEqualTo(String value) {
            addCriterion("BUTTONS =", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsNotEqualTo(String value) {
            addCriterion("BUTTONS <>", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsGreaterThan(String value) {
            addCriterion("BUTTONS >", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTONS >=", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsLessThan(String value) {
            addCriterion("BUTTONS <", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsLessThanOrEqualTo(String value) {
            addCriterion("BUTTONS <=", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsLike(String value) {
            addCriterion("BUTTONS like", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsNotLike(String value) {
            addCriterion("BUTTONS not like", value, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsIn(List<String> values) {
            addCriterion("BUTTONS in", values, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsNotIn(List<String> values) {
            addCriterion("BUTTONS not in", values, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsBetween(String value1, String value2) {
            addCriterion("BUTTONS between", value1, value2, "buttons");
            return (Criteria) this;
        }

        public Criteria andButtonsNotBetween(String value1, String value2) {
            addCriterion("BUTTONS not between", value1, value2, "buttons");
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

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
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