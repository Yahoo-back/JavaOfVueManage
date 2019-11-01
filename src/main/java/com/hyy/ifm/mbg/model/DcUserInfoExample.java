package com.hyy.ifm.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class DcUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcUserInfoExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNull() {
            addCriterion("zhima_score is null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNotNull() {
            addCriterion("zhima_score is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreEqualTo(String value) {
            addCriterion("zhima_score =", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotEqualTo(String value) {
            addCriterion("zhima_score <>", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThan(String value) {
            addCriterion("zhima_score >", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThanOrEqualTo(String value) {
            addCriterion("zhima_score >=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThan(String value) {
            addCriterion("zhima_score <", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThanOrEqualTo(String value) {
            addCriterion("zhima_score <=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLike(String value) {
            addCriterion("zhima_score like", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotLike(String value) {
            addCriterion("zhima_score not like", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIn(List<String> values) {
            addCriterion("zhima_score in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotIn(List<String> values) {
            addCriterion("zhima_score not in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreBetween(String value1, String value2) {
            addCriterion("zhima_score between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotBetween(String value1, String value2) {
            addCriterion("zhima_score not between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankOpenIsNull() {
            addCriterion("bank_open is null");
            return (Criteria) this;
        }

        public Criteria andBankOpenIsNotNull() {
            addCriterion("bank_open is not null");
            return (Criteria) this;
        }

        public Criteria andBankOpenEqualTo(String value) {
            addCriterion("bank_open =", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenNotEqualTo(String value) {
            addCriterion("bank_open <>", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenGreaterThan(String value) {
            addCriterion("bank_open >", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenGreaterThanOrEqualTo(String value) {
            addCriterion("bank_open >=", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenLessThan(String value) {
            addCriterion("bank_open <", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenLessThanOrEqualTo(String value) {
            addCriterion("bank_open <=", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenLike(String value) {
            addCriterion("bank_open like", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenNotLike(String value) {
            addCriterion("bank_open not like", value, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenIn(List<String> values) {
            addCriterion("bank_open in", values, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenNotIn(List<String> values) {
            addCriterion("bank_open not in", values, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenBetween(String value1, String value2) {
            addCriterion("bank_open between", value1, value2, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andBankOpenNotBetween(String value1, String value2) {
            addCriterion("bank_open not between", value1, value2, "bankOpen");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIsNull() {
            addCriterion("mobile_auth is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIsNotNull() {
            addCriterion("mobile_auth is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthEqualTo(String value) {
            addCriterion("mobile_auth =", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotEqualTo(String value) {
            addCriterion("mobile_auth <>", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthGreaterThan(String value) {
            addCriterion("mobile_auth >", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_auth >=", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLessThan(String value) {
            addCriterion("mobile_auth <", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLessThanOrEqualTo(String value) {
            addCriterion("mobile_auth <=", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLike(String value) {
            addCriterion("mobile_auth like", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotLike(String value) {
            addCriterion("mobile_auth not like", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIn(List<String> values) {
            addCriterion("mobile_auth in", values, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotIn(List<String> values) {
            addCriterion("mobile_auth not in", values, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthBetween(String value1, String value2) {
            addCriterion("mobile_auth between", value1, value2, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotBetween(String value1, String value2) {
            addCriterion("mobile_auth not between", value1, value2, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andCardAddIsNull() {
            addCriterion("card_add is null");
            return (Criteria) this;
        }

        public Criteria andCardAddIsNotNull() {
            addCriterion("card_add is not null");
            return (Criteria) this;
        }

        public Criteria andCardAddEqualTo(String value) {
            addCriterion("card_add =", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddNotEqualTo(String value) {
            addCriterion("card_add <>", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddGreaterThan(String value) {
            addCriterion("card_add >", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddGreaterThanOrEqualTo(String value) {
            addCriterion("card_add >=", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddLessThan(String value) {
            addCriterion("card_add <", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddLessThanOrEqualTo(String value) {
            addCriterion("card_add <=", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddLike(String value) {
            addCriterion("card_add like", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddNotLike(String value) {
            addCriterion("card_add not like", value, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddIn(List<String> values) {
            addCriterion("card_add in", values, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddNotIn(List<String> values) {
            addCriterion("card_add not in", values, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddBetween(String value1, String value2) {
            addCriterion("card_add between", value1, value2, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andCardAddNotBetween(String value1, String value2) {
            addCriterion("card_add not between", value1, value2, "cardAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddIsNull() {
            addCriterion("live_add is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddIsNotNull() {
            addCriterion("live_add is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddEqualTo(String value) {
            addCriterion("live_add =", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddNotEqualTo(String value) {
            addCriterion("live_add <>", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddGreaterThan(String value) {
            addCriterion("live_add >", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddGreaterThanOrEqualTo(String value) {
            addCriterion("live_add >=", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddLessThan(String value) {
            addCriterion("live_add <", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddLessThanOrEqualTo(String value) {
            addCriterion("live_add <=", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddLike(String value) {
            addCriterion("live_add like", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddNotLike(String value) {
            addCriterion("live_add not like", value, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddIn(List<String> values) {
            addCriterion("live_add in", values, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddNotIn(List<String> values) {
            addCriterion("live_add not in", values, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddBetween(String value1, String value2) {
            addCriterion("live_add between", value1, value2, "liveAdd");
            return (Criteria) this;
        }

        public Criteria andLiveAddNotBetween(String value1, String value2) {
            addCriterion("live_add not between", value1, value2, "liveAdd");
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