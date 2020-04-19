package com.rbac.design.pojo;

import java.util.ArrayList;
import java.util.List;

public class design_recordQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public design_recordQuery() {
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNull() {
            addCriterion("first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNotNull() {
            addCriterion("first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdEqualTo(String value) {
            addCriterion("first_kind_id =", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotEqualTo(String value) {
            addCriterion("first_kind_id <>", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThan(String value) {
            addCriterion("first_kind_id >", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_id >=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThan(String value) {
            addCriterion("first_kind_id <", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("first_kind_id <=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLike(String value) {
            addCriterion("first_kind_id like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotLike(String value) {
            addCriterion("first_kind_id not like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIn(List<String> values) {
            addCriterion("first_kind_id in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotIn(List<String> values) {
            addCriterion("first_kind_id not in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdBetween(String value1, String value2) {
            addCriterion("first_kind_id between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("first_kind_id not between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNull() {
            addCriterion("first_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNotNull() {
            addCriterion("first_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameEqualTo(String value) {
            addCriterion("first_kind_name =", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotEqualTo(String value) {
            addCriterion("first_kind_name <>", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThan(String value) {
            addCriterion("first_kind_name >", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_name >=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThan(String value) {
            addCriterion("first_kind_name <", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("first_kind_name <=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLike(String value) {
            addCriterion("first_kind_name like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotLike(String value) {
            addCriterion("first_kind_name not like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIn(List<String> values) {
            addCriterion("first_kind_name in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotIn(List<String> values) {
            addCriterion("first_kind_name not in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameBetween(String value1, String value2) {
            addCriterion("first_kind_name between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("first_kind_name not between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNull() {
            addCriterion("second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNotNull() {
            addCriterion("second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdEqualTo(String value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(String value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(String value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(String value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLike(String value) {
            addCriterion("second_kind_id like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotLike(String value) {
            addCriterion("second_kind_id not like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<String> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<String> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(String value1, String value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNull() {
            addCriterion("second_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNotNull() {
            addCriterion("second_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameEqualTo(String value) {
            addCriterion("second_kind_name =", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotEqualTo(String value) {
            addCriterion("second_kind_name <>", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThan(String value) {
            addCriterion("second_kind_name >", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_name >=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThan(String value) {
            addCriterion("second_kind_name <", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("second_kind_name <=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLike(String value) {
            addCriterion("second_kind_name like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotLike(String value) {
            addCriterion("second_kind_name not like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIn(List<String> values) {
            addCriterion("second_kind_name in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotIn(List<String> values) {
            addCriterion("second_kind_name not in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameBetween(String value1, String value2) {
            addCriterion("second_kind_name between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("second_kind_name not between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andProductNickIsNull() {
            addCriterion("product_nick is null");
            return (Criteria) this;
        }

        public Criteria andProductNickIsNotNull() {
            addCriterion("product_nick is not null");
            return (Criteria) this;
        }

        public Criteria andProductNickEqualTo(String value) {
            addCriterion("product_nick =", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickNotEqualTo(String value) {
            addCriterion("product_nick <>", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickGreaterThan(String value) {
            addCriterion("product_nick >", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickGreaterThanOrEqualTo(String value) {
            addCriterion("product_nick >=", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickLessThan(String value) {
            addCriterion("product_nick <", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickLessThanOrEqualTo(String value) {
            addCriterion("product_nick <=", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickLike(String value) {
            addCriterion("product_nick like", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickNotLike(String value) {
            addCriterion("product_nick not like", value, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickIn(List<String> values) {
            addCriterion("product_nick in", values, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickNotIn(List<String> values) {
            addCriterion("product_nick not in", values, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickBetween(String value1, String value2) {
            addCriterion("product_nick between", value1, value2, "productNick");
            return (Criteria) this;
        }

        public Criteria andProductNickNotBetween(String value1, String value2) {
            addCriterion("product_nick not between", value1, value2, "productNick");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProductClassIsNull() {
            addCriterion("product_class is null");
            return (Criteria) this;
        }

        public Criteria andProductClassIsNotNull() {
            addCriterion("product_class is not null");
            return (Criteria) this;
        }

        public Criteria andProductClassEqualTo(String value) {
            addCriterion("product_class =", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotEqualTo(String value) {
            addCriterion("product_class <>", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassGreaterThan(String value) {
            addCriterion("product_class >", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassGreaterThanOrEqualTo(String value) {
            addCriterion("product_class >=", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassLessThan(String value) {
            addCriterion("product_class <", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassLessThanOrEqualTo(String value) {
            addCriterion("product_class <=", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassLike(String value) {
            addCriterion("product_class like", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotLike(String value) {
            addCriterion("product_class not like", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassIn(List<String> values) {
            addCriterion("product_class in", values, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotIn(List<String> values) {
            addCriterion("product_class not in", values, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassBetween(String value1, String value2) {
            addCriterion("product_class between", value1, value2, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotBetween(String value1, String value2) {
            addCriterion("product_class not between", value1, value2, "productClass");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitIsNull() {
            addCriterion("personal_unit is null");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitIsNotNull() {
            addCriterion("personal_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitEqualTo(String value) {
            addCriterion("personal_unit =", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitNotEqualTo(String value) {
            addCriterion("personal_unit <>", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitGreaterThan(String value) {
            addCriterion("personal_unit >", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitGreaterThanOrEqualTo(String value) {
            addCriterion("personal_unit >=", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitLessThan(String value) {
            addCriterion("personal_unit <", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitLessThanOrEqualTo(String value) {
            addCriterion("personal_unit <=", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitLike(String value) {
            addCriterion("personal_unit like", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitNotLike(String value) {
            addCriterion("personal_unit not like", value, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitIn(List<String> values) {
            addCriterion("personal_unit in", values, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitNotIn(List<String> values) {
            addCriterion("personal_unit not in", values, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitBetween(String value1, String value2) {
            addCriterion("personal_unit between", value1, value2, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalUnitNotBetween(String value1, String value2) {
            addCriterion("personal_unit not between", value1, value2, "personalUnit");
            return (Criteria) this;
        }

        public Criteria andPersonalValueIsNull() {
            addCriterion("personal_value is null");
            return (Criteria) this;
        }

        public Criteria andPersonalValueIsNotNull() {
            addCriterion("personal_value is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalValueEqualTo(String value) {
            addCriterion("personal_value =", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueNotEqualTo(String value) {
            addCriterion("personal_value <>", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueGreaterThan(String value) {
            addCriterion("personal_value >", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueGreaterThanOrEqualTo(String value) {
            addCriterion("personal_value >=", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueLessThan(String value) {
            addCriterion("personal_value <", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueLessThanOrEqualTo(String value) {
            addCriterion("personal_value <=", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueLike(String value) {
            addCriterion("personal_value like", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueNotLike(String value) {
            addCriterion("personal_value not like", value, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueIn(List<String> values) {
            addCriterion("personal_value in", values, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueNotIn(List<String> values) {
            addCriterion("personal_value not in", values, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueBetween(String value1, String value2) {
            addCriterion("personal_value between", value1, value2, "personalValue");
            return (Criteria) this;
        }

        public Criteria andPersonalValueNotBetween(String value1, String value2) {
            addCriterion("personal_value not between", value1, value2, "personalValue");
            return (Criteria) this;
        }

        public Criteria andProviderGroupIsNull() {
            addCriterion("provider_group is null");
            return (Criteria) this;
        }

        public Criteria andProviderGroupIsNotNull() {
            addCriterion("provider_group is not null");
            return (Criteria) this;
        }

        public Criteria andProviderGroupEqualTo(String value) {
            addCriterion("provider_group =", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupNotEqualTo(String value) {
            addCriterion("provider_group <>", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupGreaterThan(String value) {
            addCriterion("provider_group >", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupGreaterThanOrEqualTo(String value) {
            addCriterion("provider_group >=", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupLessThan(String value) {
            addCriterion("provider_group <", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupLessThanOrEqualTo(String value) {
            addCriterion("provider_group <=", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupLike(String value) {
            addCriterion("provider_group like", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupNotLike(String value) {
            addCriterion("provider_group not like", value, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupIn(List<String> values) {
            addCriterion("provider_group in", values, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupNotIn(List<String> values) {
            addCriterion("provider_group not in", values, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupBetween(String value1, String value2) {
            addCriterion("provider_group between", value1, value2, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andProviderGroupNotBetween(String value1, String value2) {
            addCriterion("provider_group not between", value1, value2, "providerGroup");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNull() {
            addCriterion("warranty is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNotNull() {
            addCriterion("warranty is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(String value) {
            addCriterion("warranty =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(String value) {
            addCriterion("warranty <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(String value) {
            addCriterion("warranty >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(String value) {
            addCriterion("warranty >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(String value) {
            addCriterion("warranty <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(String value) {
            addCriterion("warranty <=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLike(String value) {
            addCriterion("warranty like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotLike(String value) {
            addCriterion("warranty not like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyIn(List<String> values) {
            addCriterion("warranty in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<String> values) {
            addCriterion("warranty not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(String value1, String value2) {
            addCriterion("warranty between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(String value1, String value2) {
            addCriterion("warranty not between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNull() {
            addCriterion("list_price is null");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNotNull() {
            addCriterion("list_price is not null");
            return (Criteria) this;
        }

        public Criteria andListPriceEqualTo(Integer value) {
            addCriterion("list_price =", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotEqualTo(Integer value) {
            addCriterion("list_price <>", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThan(Integer value) {
            addCriterion("list_price >", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_price >=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThan(Integer value) {
            addCriterion("list_price <", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThanOrEqualTo(Integer value) {
            addCriterion("list_price <=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceIn(List<Integer> values) {
            addCriterion("list_price in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotIn(List<Integer> values) {
            addCriterion("list_price not in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceBetween(Integer value1, Integer value2) {
            addCriterion("list_price between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("list_price not between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Integer value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Integer value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Integer value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Integer value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Integer> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Integer> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceIsNull() {
            addCriterion("real_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceIsNotNull() {
            addCriterion("real_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceEqualTo(Integer value) {
            addCriterion("real_cost_price =", value, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceNotEqualTo(Integer value) {
            addCriterion("real_cost_price <>", value, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceGreaterThan(Integer value) {
            addCriterion("real_cost_price >", value, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_cost_price >=", value, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceLessThan(Integer value) {
            addCriterion("real_cost_price <", value, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("real_cost_price <=", value, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceIn(List<Integer> values) {
            addCriterion("real_cost_price in", values, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceNotIn(List<Integer> values) {
            addCriterion("real_cost_price not in", values, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("real_cost_price between", value1, value2, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andRealCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("real_cost_price not between", value1, value2, "realCostPrice");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIsNull() {
            addCriterion("amount_unit is null");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIsNotNull() {
            addCriterion("amount_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUnitEqualTo(String value) {
            addCriterion("amount_unit =", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotEqualTo(String value) {
            addCriterion("amount_unit <>", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitGreaterThan(String value) {
            addCriterion("amount_unit >", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitGreaterThanOrEqualTo(String value) {
            addCriterion("amount_unit >=", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLessThan(String value) {
            addCriterion("amount_unit <", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLessThanOrEqualTo(String value) {
            addCriterion("amount_unit <=", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLike(String value) {
            addCriterion("amount_unit like", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotLike(String value) {
            addCriterion("amount_unit not like", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIn(List<String> values) {
            addCriterion("amount_unit in", values, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotIn(List<String> values) {
            addCriterion("amount_unit not in", values, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitBetween(String value1, String value2) {
            addCriterion("amount_unit between", value1, value2, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotBetween(String value1, String value2) {
            addCriterion("amount_unit not between", value1, value2, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andProductDescribeIsNull() {
            addCriterion("product_describe is null");
            return (Criteria) this;
        }

        public Criteria andProductDescribeIsNotNull() {
            addCriterion("product_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescribeEqualTo(String value) {
            addCriterion("product_describe =", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotEqualTo(String value) {
            addCriterion("product_describe <>", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeGreaterThan(String value) {
            addCriterion("product_describe >", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("product_describe >=", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeLessThan(String value) {
            addCriterion("product_describe <", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeLessThanOrEqualTo(String value) {
            addCriterion("product_describe <=", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeLike(String value) {
            addCriterion("product_describe like", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotLike(String value) {
            addCriterion("product_describe not like", value, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeIn(List<String> values) {
            addCriterion("product_describe in", values, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotIn(List<String> values) {
            addCriterion("product_describe not in", values, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeBetween(String value1, String value2) {
            addCriterion("product_describe between", value1, value2, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andProductDescribeNotBetween(String value1, String value2) {
            addCriterion("product_describe not between", value1, value2, "productDescribe");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIsNull() {
            addCriterion("responsible_person is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIsNotNull() {
            addCriterion("responsible_person is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonEqualTo(String value) {
            addCriterion("responsible_person =", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotEqualTo(String value) {
            addCriterion("responsible_person <>", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonGreaterThan(String value) {
            addCriterion("responsible_person >", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_person >=", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLessThan(String value) {
            addCriterion("responsible_person <", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLessThanOrEqualTo(String value) {
            addCriterion("responsible_person <=", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLike(String value) {
            addCriterion("responsible_person like", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotLike(String value) {
            addCriterion("responsible_person not like", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIn(List<String> values) {
            addCriterion("responsible_person in", values, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotIn(List<String> values) {
            addCriterion("responsible_person not in", values, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonBetween(String value1, String value2) {
            addCriterion("responsible_person between", value1, value2, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotBetween(String value1, String value2) {
            addCriterion("responsible_person not between", value1, value2, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("register_time like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("register_time not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(String value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(String value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(String value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(String value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLike(String value) {
            addCriterion("check_time like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotLike(String value) {
            addCriterion("check_time not like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<String> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<String> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(String value1, String value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(String value1, String value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNull() {
            addCriterion("check_tag is null");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNotNull() {
            addCriterion("check_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTagEqualTo(String value) {
            addCriterion("check_tag =", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotEqualTo(String value) {
            addCriterion("check_tag <>", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThan(String value) {
            addCriterion("check_tag >", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThanOrEqualTo(String value) {
            addCriterion("check_tag >=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThan(String value) {
            addCriterion("check_tag <", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThanOrEqualTo(String value) {
            addCriterion("check_tag <=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLike(String value) {
            addCriterion("check_tag like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotLike(String value) {
            addCriterion("check_tag not like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagIn(List<String> values) {
            addCriterion("check_tag in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotIn(List<String> values) {
            addCriterion("check_tag not in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagBetween(String value1, String value2) {
            addCriterion("check_tag between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotBetween(String value1, String value2) {
            addCriterion("check_tag not between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andChangerIsNull() {
            addCriterion("changer is null");
            return (Criteria) this;
        }

        public Criteria andChangerIsNotNull() {
            addCriterion("changer is not null");
            return (Criteria) this;
        }

        public Criteria andChangerEqualTo(String value) {
            addCriterion("changer =", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotEqualTo(String value) {
            addCriterion("changer <>", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThan(String value) {
            addCriterion("changer >", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThanOrEqualTo(String value) {
            addCriterion("changer >=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThan(String value) {
            addCriterion("changer <", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThanOrEqualTo(String value) {
            addCriterion("changer <=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLike(String value) {
            addCriterion("changer like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotLike(String value) {
            addCriterion("changer not like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerIn(List<String> values) {
            addCriterion("changer in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotIn(List<String> values) {
            addCriterion("changer not in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerBetween(String value1, String value2) {
            addCriterion("changer between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotBetween(String value1, String value2) {
            addCriterion("changer not between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(String value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(String value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(String value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(String value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLike(String value) {
            addCriterion("change_time like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotLike(String value) {
            addCriterion("change_time not like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<String> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<String> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(String value1, String value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(String value1, String value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNull() {
            addCriterion("change_tag is null");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNotNull() {
            addCriterion("change_tag is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTagEqualTo(String value) {
            addCriterion("change_tag =", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotEqualTo(String value) {
            addCriterion("change_tag <>", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThan(String value) {
            addCriterion("change_tag >", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("change_tag >=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThan(String value) {
            addCriterion("change_tag <", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThanOrEqualTo(String value) {
            addCriterion("change_tag <=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLike(String value) {
            addCriterion("change_tag like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotLike(String value) {
            addCriterion("change_tag not like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagIn(List<String> values) {
            addCriterion("change_tag in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotIn(List<String> values) {
            addCriterion("change_tag not in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagBetween(String value1, String value2) {
            addCriterion("change_tag between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotBetween(String value1, String value2) {
            addCriterion("change_tag not between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagIsNull() {
            addCriterion("price_change_tag is null");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagIsNotNull() {
            addCriterion("price_change_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagEqualTo(String value) {
            addCriterion("price_change_tag =", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagNotEqualTo(String value) {
            addCriterion("price_change_tag <>", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagGreaterThan(String value) {
            addCriterion("price_change_tag >", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("price_change_tag >=", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagLessThan(String value) {
            addCriterion("price_change_tag <", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagLessThanOrEqualTo(String value) {
            addCriterion("price_change_tag <=", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagLike(String value) {
            addCriterion("price_change_tag like", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagNotLike(String value) {
            addCriterion("price_change_tag not like", value, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagIn(List<String> values) {
            addCriterion("price_change_tag in", values, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagNotIn(List<String> values) {
            addCriterion("price_change_tag not in", values, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagBetween(String value1, String value2) {
            addCriterion("price_change_tag between", value1, value2, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andPriceChangeTagNotBetween(String value1, String value2) {
            addCriterion("price_change_tag not between", value1, value2, "priceChangeTag");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountIsNull() {
            addCriterion("file_change_amount is null");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountIsNotNull() {
            addCriterion("file_change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountEqualTo(Integer value) {
            addCriterion("file_change_amount =", value, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountNotEqualTo(Integer value) {
            addCriterion("file_change_amount <>", value, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountGreaterThan(Integer value) {
            addCriterion("file_change_amount >", value, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_change_amount >=", value, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountLessThan(Integer value) {
            addCriterion("file_change_amount <", value, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("file_change_amount <=", value, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountIn(List<Integer> values) {
            addCriterion("file_change_amount in", values, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountNotIn(List<Integer> values) {
            addCriterion("file_change_amount not in", values, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountBetween(Integer value1, Integer value2) {
            addCriterion("file_change_amount between", value1, value2, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("file_change_amount not between", value1, value2, "fileChangeAmount");
            return (Criteria) this;
        }

        public Criteria andDeleteTagIsNull() {
            addCriterion("delete_tag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTagIsNotNull() {
            addCriterion("delete_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTagEqualTo(String value) {
            addCriterion("delete_tag =", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotEqualTo(String value) {
            addCriterion("delete_tag <>", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagGreaterThan(String value) {
            addCriterion("delete_tag >", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_tag >=", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagLessThan(String value) {
            addCriterion("delete_tag <", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagLessThanOrEqualTo(String value) {
            addCriterion("delete_tag <=", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagLike(String value) {
            addCriterion("delete_tag like", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotLike(String value) {
            addCriterion("delete_tag not like", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagIn(List<String> values) {
            addCriterion("delete_tag in", values, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotIn(List<String> values) {
            addCriterion("delete_tag not in", values, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagBetween(String value1, String value2) {
            addCriterion("delete_tag between", value1, value2, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotBetween(String value1, String value2) {
            addCriterion("delete_tag not between", value1, value2, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andMaterialListIsNull() {
            addCriterion("material_list is null");
            return (Criteria) this;
        }

        public Criteria andMaterialListIsNotNull() {
            addCriterion("material_list is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialListEqualTo(String value) {
            addCriterion("material_list =", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListNotEqualTo(String value) {
            addCriterion("material_list <>", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListGreaterThan(String value) {
            addCriterion("material_list >", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListGreaterThanOrEqualTo(String value) {
            addCriterion("material_list >=", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListLessThan(String value) {
            addCriterion("material_list <", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListLessThanOrEqualTo(String value) {
            addCriterion("material_list <=", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListLike(String value) {
            addCriterion("material_list like", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListNotLike(String value) {
            addCriterion("material_list not like", value, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListIn(List<String> values) {
            addCriterion("material_list in", values, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListNotIn(List<String> values) {
            addCriterion("material_list not in", values, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListBetween(String value1, String value2) {
            addCriterion("material_list between", value1, value2, "materialList");
            return (Criteria) this;
        }

        public Criteria andMaterialListNotBetween(String value1, String value2) {
            addCriterion("material_list not between", value1, value2, "materialList");
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