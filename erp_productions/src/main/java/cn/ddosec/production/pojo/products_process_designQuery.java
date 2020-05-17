package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.List;

public class products_process_designQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public products_process_designQuery() {
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

        public Criteria andDesregisterIsNull() {
            addCriterion("desregister is null");
            return (Criteria) this;
        }

        public Criteria andDesregisterIsNotNull() {
            addCriterion("desregister is not null");
            return (Criteria) this;
        }

        public Criteria andDesregisterEqualTo(String value) {
            addCriterion("desregister =", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterNotEqualTo(String value) {
            addCriterion("desregister <>", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterGreaterThan(String value) {
            addCriterion("desregister >", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterGreaterThanOrEqualTo(String value) {
            addCriterion("desregister >=", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterLessThan(String value) {
            addCriterion("desregister <", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterLessThanOrEqualTo(String value) {
            addCriterion("desregister <=", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterLike(String value) {
            addCriterion("desregister like", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterNotLike(String value) {
            addCriterion("desregister not like", value, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterIn(List<String> values) {
            addCriterion("desregister in", values, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterNotIn(List<String> values) {
            addCriterion("desregister not in", values, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterBetween(String value1, String value2) {
            addCriterion("desregister between", value1, value2, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesregisterNotBetween(String value1, String value2) {
            addCriterion("desregister not between", value1, value2, "desregister");
            return (Criteria) this;
        }

        public Criteria andDesdateIsNull() {
            addCriterion("desdate is null");
            return (Criteria) this;
        }

        public Criteria andDesdateIsNotNull() {
            addCriterion("desdate is not null");
            return (Criteria) this;
        }

        public Criteria andDesdateEqualTo(String value) {
            addCriterion("desdate =", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateNotEqualTo(String value) {
            addCriterion("desdate <>", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateGreaterThan(String value) {
            addCriterion("desdate >", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateGreaterThanOrEqualTo(String value) {
            addCriterion("desdate >=", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateLessThan(String value) {
            addCriterion("desdate <", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateLessThanOrEqualTo(String value) {
            addCriterion("desdate <=", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateLike(String value) {
            addCriterion("desdate like", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateNotLike(String value) {
            addCriterion("desdate not like", value, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateIn(List<String> values) {
            addCriterion("desdate in", values, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateNotIn(List<String> values) {
            addCriterion("desdate not in", values, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateBetween(String value1, String value2) {
            addCriterion("desdate between", value1, value2, "desdate");
            return (Criteria) this;
        }

        public Criteria andDesdateNotBetween(String value1, String value2) {
            addCriterion("desdate not between", value1, value2, "desdate");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessCheckIsNull() {
            addCriterion("process_check is null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckIsNotNull() {
            addCriterion("process_check is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckEqualTo(String value) {
            addCriterion("process_check =", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckNotEqualTo(String value) {
            addCriterion("process_check <>", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckGreaterThan(String value) {
            addCriterion("process_check >", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckGreaterThanOrEqualTo(String value) {
            addCriterion("process_check >=", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckLessThan(String value) {
            addCriterion("process_check <", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckLessThanOrEqualTo(String value) {
            addCriterion("process_check <=", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckLike(String value) {
            addCriterion("process_check like", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckNotLike(String value) {
            addCriterion("process_check not like", value, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckIn(List<String> values) {
            addCriterion("process_check in", values, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckNotIn(List<String> values) {
            addCriterion("process_check not in", values, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckBetween(String value1, String value2) {
            addCriterion("process_check between", value1, value2, "processCheck");
            return (Criteria) this;
        }

        public Criteria andProcessCheckNotBetween(String value1, String value2) {
            addCriterion("process_check not between", value1, value2, "processCheck");
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