package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.List;

public class production_processtypeQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public production_processtypeQuery() {
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

        public Criteria andProcessNameIsNull() {
            addCriterion("process_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("process_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("process_name =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("process_name <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("process_name >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_name >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("process_name <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("process_name <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("process_name like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("process_name not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("process_name in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("process_name not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("process_name between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("process_name not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeIsNull() {
            addCriterion("process_describe is null");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeIsNotNull() {
            addCriterion("process_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeEqualTo(String value) {
            addCriterion("process_describe =", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotEqualTo(String value) {
            addCriterion("process_describe <>", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeGreaterThan(String value) {
            addCriterion("process_describe >", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("process_describe >=", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeLessThan(String value) {
            addCriterion("process_describe <", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeLessThanOrEqualTo(String value) {
            addCriterion("process_describe <=", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeLike(String value) {
            addCriterion("process_describe like", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotLike(String value) {
            addCriterion("process_describe not like", value, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeIn(List<String> values) {
            addCriterion("process_describe in", values, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotIn(List<String> values) {
            addCriterion("process_describe not in", values, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeBetween(String value1, String value2) {
            addCriterion("process_describe between", value1, value2, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andProcessDescribeNotBetween(String value1, String value2) {
            addCriterion("process_describe not between", value1, value2, "processDescribe");
            return (Criteria) this;
        }

        public Criteria andDesignRequireIsNull() {
            addCriterion("design_require is null");
            return (Criteria) this;
        }

        public Criteria andDesignRequireIsNotNull() {
            addCriterion("design_require is not null");
            return (Criteria) this;
        }

        public Criteria andDesignRequireEqualTo(String value) {
            addCriterion("design_require =", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireNotEqualTo(String value) {
            addCriterion("design_require <>", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireGreaterThan(String value) {
            addCriterion("design_require >", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireGreaterThanOrEqualTo(String value) {
            addCriterion("design_require >=", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireLessThan(String value) {
            addCriterion("design_require <", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireLessThanOrEqualTo(String value) {
            addCriterion("design_require <=", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireLike(String value) {
            addCriterion("design_require like", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireNotLike(String value) {
            addCriterion("design_require not like", value, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireIn(List<String> values) {
            addCriterion("design_require in", values, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireNotIn(List<String> values) {
            addCriterion("design_require not in", values, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireBetween(String value1, String value2) {
            addCriterion("design_require between", value1, value2, "designRequire");
            return (Criteria) this;
        }

        public Criteria andDesignRequireNotBetween(String value1, String value2) {
            addCriterion("design_require not between", value1, value2, "designRequire");
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