package cn.ddosec.design.pojo;

import java.util.ArrayList;
import java.util.List;

public class product_material_archivesQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public product_material_archivesQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
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

        public Criteria andMaterialidIsNull() {
            addCriterion("materialid is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("materialid is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(String value) {
            addCriterion("materialid =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(String value) {
            addCriterion("materialid <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(String value) {
            addCriterion("materialid >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(String value) {
            addCriterion("materialid >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(String value) {
            addCriterion("materialid <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(String value) {
            addCriterion("materialid <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLike(String value) {
            addCriterion("materialid like", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotLike(String value) {
            addCriterion("materialid not like", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<String> values) {
            addCriterion("materialid in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<String> values) {
            addCriterion("materialid not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(String value1, String value2) {
            addCriterion("materialid between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(String value1, String value2) {
            addCriterion("materialid not between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productid like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productid not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("materialname is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("materialname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("materialname =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("materialname <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("materialname >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("materialname >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("materialname <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("materialname <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("materialname like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("materialname not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("materialname in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("materialname not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("materialname between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("materialname not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNull() {
            addCriterion("materialnum is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNotNull() {
            addCriterion("materialnum is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumEqualTo(Integer value) {
            addCriterion("materialnum =", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotEqualTo(Integer value) {
            addCriterion("materialnum <>", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThan(Integer value) {
            addCriterion("materialnum >", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialnum >=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThan(Integer value) {
            addCriterion("materialnum <", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThanOrEqualTo(Integer value) {
            addCriterion("materialnum <=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIn(List<Integer> values) {
            addCriterion("materialnum in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotIn(List<Integer> values) {
            addCriterion("materialnum not in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumBetween(Integer value1, Integer value2) {
            addCriterion("materialnum between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotBetween(Integer value1, Integer value2) {
            addCriterion("materialnum not between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialunitIsNull() {
            addCriterion("materialunit is null");
            return (Criteria) this;
        }

        public Criteria andMaterialunitIsNotNull() {
            addCriterion("materialunit is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialunitEqualTo(String value) {
            addCriterion("materialunit =", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitNotEqualTo(String value) {
            addCriterion("materialunit <>", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitGreaterThan(String value) {
            addCriterion("materialunit >", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitGreaterThanOrEqualTo(String value) {
            addCriterion("materialunit >=", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitLessThan(String value) {
            addCriterion("materialunit <", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitLessThanOrEqualTo(String value) {
            addCriterion("materialunit <=", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitLike(String value) {
            addCriterion("materialunit like", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitNotLike(String value) {
            addCriterion("materialunit not like", value, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitIn(List<String> values) {
            addCriterion("materialunit in", values, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitNotIn(List<String> values) {
            addCriterion("materialunit not in", values, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitBetween(String value1, String value2) {
            addCriterion("materialunit between", value1, value2, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialunitNotBetween(String value1, String value2) {
            addCriterion("materialunit not between", value1, value2, "materialunit");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkIsNull() {
            addCriterion("materialremark is null");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkIsNotNull() {
            addCriterion("materialremark is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkEqualTo(String value) {
            addCriterion("materialremark =", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkNotEqualTo(String value) {
            addCriterion("materialremark <>", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkGreaterThan(String value) {
            addCriterion("materialremark >", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkGreaterThanOrEqualTo(String value) {
            addCriterion("materialremark >=", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkLessThan(String value) {
            addCriterion("materialremark <", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkLessThanOrEqualTo(String value) {
            addCriterion("materialremark <=", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkLike(String value) {
            addCriterion("materialremark like", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkNotLike(String value) {
            addCriterion("materialremark not like", value, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkIn(List<String> values) {
            addCriterion("materialremark in", values, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkNotIn(List<String> values) {
            addCriterion("materialremark not in", values, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkBetween(String value1, String value2) {
            addCriterion("materialremark between", value1, value2, "materialremark");
            return (Criteria) this;
        }

        public Criteria andMaterialremarkNotBetween(String value1, String value2) {
            addCriterion("materialremark not between", value1, value2, "materialremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkIsNull() {
            addCriterion("checkremark is null");
            return (Criteria) this;
        }

        public Criteria andCheckremarkIsNotNull() {
            addCriterion("checkremark is not null");
            return (Criteria) this;
        }

        public Criteria andCheckremarkEqualTo(String value) {
            addCriterion("checkremark =", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkNotEqualTo(String value) {
            addCriterion("checkremark <>", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkGreaterThan(String value) {
            addCriterion("checkremark >", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkGreaterThanOrEqualTo(String value) {
            addCriterion("checkremark >=", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkLessThan(String value) {
            addCriterion("checkremark <", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkLessThanOrEqualTo(String value) {
            addCriterion("checkremark <=", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkLike(String value) {
            addCriterion("checkremark like", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkNotLike(String value) {
            addCriterion("checkremark not like", value, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkIn(List<String> values) {
            addCriterion("checkremark in", values, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkNotIn(List<String> values) {
            addCriterion("checkremark not in", values, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkBetween(String value1, String value2) {
            addCriterion("checkremark between", value1, value2, "checkremark");
            return (Criteria) this;
        }

        public Criteria andCheckremarkNotBetween(String value1, String value2) {
            addCriterion("checkremark not between", value1, value2, "checkremark");
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
    }
}
