package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class BankDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDictExample() {
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

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("DATA_TYPE like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("DATA_TYPE not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andItemKeyIsNull() {
            addCriterion("ITEM_KEY is null");
            return (Criteria) this;
        }

        public Criteria andItemKeyIsNotNull() {
            addCriterion("ITEM_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andItemKeyEqualTo(String value) {
            addCriterion("ITEM_KEY =", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotEqualTo(String value) {
            addCriterion("ITEM_KEY <>", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyGreaterThan(String value) {
            addCriterion("ITEM_KEY >", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_KEY >=", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLessThan(String value) {
            addCriterion("ITEM_KEY <", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLessThanOrEqualTo(String value) {
            addCriterion("ITEM_KEY <=", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLike(String value) {
            addCriterion("ITEM_KEY like", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotLike(String value) {
            addCriterion("ITEM_KEY not like", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyIn(List<String> values) {
            addCriterion("ITEM_KEY in", values, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotIn(List<String> values) {
            addCriterion("ITEM_KEY not in", values, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyBetween(String value1, String value2) {
            addCriterion("ITEM_KEY between", value1, value2, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotBetween(String value1, String value2) {
            addCriterion("ITEM_KEY not between", value1, value2, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNull() {
            addCriterion("ITEM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNotNull() {
            addCriterion("ITEM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andItemValueEqualTo(String value) {
            addCriterion("ITEM_VALUE =", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotEqualTo(String value) {
            addCriterion("ITEM_VALUE <>", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThan(String value) {
            addCriterion("ITEM_VALUE >", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_VALUE >=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThan(String value) {
            addCriterion("ITEM_VALUE <", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThanOrEqualTo(String value) {
            addCriterion("ITEM_VALUE <=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLike(String value) {
            addCriterion("ITEM_VALUE like", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotLike(String value) {
            addCriterion("ITEM_VALUE not like", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueIn(List<String> values) {
            addCriterion("ITEM_VALUE in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotIn(List<String> values) {
            addCriterion("ITEM_VALUE not in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueBetween(String value1, String value2) {
            addCriterion("ITEM_VALUE between", value1, value2, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotBetween(String value1, String value2) {
            addCriterion("ITEM_VALUE not between", value1, value2, "itemValue");
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

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andOutDataFromIsNull() {
            addCriterion("OUT_DATA_FROM is null");
            return (Criteria) this;
        }

        public Criteria andOutDataFromIsNotNull() {
            addCriterion("OUT_DATA_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andOutDataFromEqualTo(String value) {
            addCriterion("OUT_DATA_FROM =", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromNotEqualTo(String value) {
            addCriterion("OUT_DATA_FROM <>", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromGreaterThan(String value) {
            addCriterion("OUT_DATA_FROM >", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_DATA_FROM >=", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromLessThan(String value) {
            addCriterion("OUT_DATA_FROM <", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromLessThanOrEqualTo(String value) {
            addCriterion("OUT_DATA_FROM <=", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromLike(String value) {
            addCriterion("OUT_DATA_FROM like", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromNotLike(String value) {
            addCriterion("OUT_DATA_FROM not like", value, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromIn(List<String> values) {
            addCriterion("OUT_DATA_FROM in", values, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromNotIn(List<String> values) {
            addCriterion("OUT_DATA_FROM not in", values, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromBetween(String value1, String value2) {
            addCriterion("OUT_DATA_FROM between", value1, value2, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andOutDataFromNotBetween(String value1, String value2) {
            addCriterion("OUT_DATA_FROM not between", value1, value2, "outDataFrom");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDictDescIsNull() {
            addCriterion("DICT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDictDescIsNotNull() {
            addCriterion("DICT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDictDescEqualTo(String value) {
            addCriterion("DICT_DESC =", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescNotEqualTo(String value) {
            addCriterion("DICT_DESC <>", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescGreaterThan(String value) {
            addCriterion("DICT_DESC >", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_DESC >=", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescLessThan(String value) {
            addCriterion("DICT_DESC <", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescLessThanOrEqualTo(String value) {
            addCriterion("DICT_DESC <=", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescLike(String value) {
            addCriterion("DICT_DESC like", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescNotLike(String value) {
            addCriterion("DICT_DESC not like", value, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescIn(List<String> values) {
            addCriterion("DICT_DESC in", values, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescNotIn(List<String> values) {
            addCriterion("DICT_DESC not in", values, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescBetween(String value1, String value2) {
            addCriterion("DICT_DESC between", value1, value2, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andDictDescNotBetween(String value1, String value2) {
            addCriterion("DICT_DESC not between", value1, value2, "dictDesc");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNull() {
            addCriterion("is_view is null");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNotNull() {
            addCriterion("is_view is not null");
            return (Criteria) this;
        }

        public Criteria andIsViewEqualTo(String value) {
            addCriterion("is_view =", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotEqualTo(String value) {
            addCriterion("is_view <>", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThan(String value) {
            addCriterion("is_view >", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThanOrEqualTo(String value) {
            addCriterion("is_view >=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThan(String value) {
            addCriterion("is_view <", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThanOrEqualTo(String value) {
            addCriterion("is_view <=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLike(String value) {
            addCriterion("is_view like", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotLike(String value) {
            addCriterion("is_view not like", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewIn(List<String> values) {
            addCriterion("is_view in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotIn(List<String> values) {
            addCriterion("is_view not in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewBetween(String value1, String value2) {
            addCriterion("is_view between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotBetween(String value1, String value2) {
            addCriterion("is_view not between", value1, value2, "isView");
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