package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.List;

public class Product_auditTableQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public Product_auditTableQuery() {
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

        public Criteria andDesignIdIsNull() {
            addCriterion("design_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNotNull() {
            addCriterion("design_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIdEqualTo(Integer value) {
            addCriterion("design_id =", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotEqualTo(Integer value) {
            addCriterion("design_id <>", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThan(Integer value) {
            addCriterion("design_id >", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_id >=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThan(Integer value) {
            addCriterion("design_id <", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThanOrEqualTo(Integer value) {
            addCriterion("design_id <=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdIn(List<Integer> values) {
            addCriterion("design_id in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotIn(List<Integer> values) {
            addCriterion("design_id not in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdBetween(Integer value1, Integer value2) {
            addCriterion("design_id between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("design_id not between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andSjdstateIsNull() {
            addCriterion("sjdState is null");
            return (Criteria) this;
        }

        public Criteria andSjdstateIsNotNull() {
            addCriterion("sjdState is not null");
            return (Criteria) this;
        }

        public Criteria andSjdstateEqualTo(String value) {
            addCriterion("sjdState =", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateNotEqualTo(String value) {
            addCriterion("sjdState <>", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateGreaterThan(String value) {
            addCriterion("sjdState >", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateGreaterThanOrEqualTo(String value) {
            addCriterion("sjdState >=", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateLessThan(String value) {
            addCriterion("sjdState <", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateLessThanOrEqualTo(String value) {
            addCriterion("sjdState <=", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateLike(String value) {
            addCriterion("sjdState like", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateNotLike(String value) {
            addCriterion("sjdState not like", value, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateIn(List<String> values) {
            addCriterion("sjdState in", values, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateNotIn(List<String> values) {
            addCriterion("sjdState not in", values, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateBetween(String value1, String value2) {
            addCriterion("sjdState between", value1, value2, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andSjdstateNotBetween(String value1, String value2) {
            addCriterion("sjdState not between", value1, value2, "sjdstate");
            return (Criteria) this;
        }

        public Criteria andShstateIsNull() {
            addCriterion("shState is null");
            return (Criteria) this;
        }

        public Criteria andShstateIsNotNull() {
            addCriterion("shState is not null");
            return (Criteria) this;
        }

        public Criteria andShstateEqualTo(String value) {
            addCriterion("shState =", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotEqualTo(String value) {
            addCriterion("shState <>", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateGreaterThan(String value) {
            addCriterion("shState >", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateGreaterThanOrEqualTo(String value) {
            addCriterion("shState >=", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLessThan(String value) {
            addCriterion("shState <", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLessThanOrEqualTo(String value) {
            addCriterion("shState <=", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateLike(String value) {
            addCriterion("shState like", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotLike(String value) {
            addCriterion("shState not like", value, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateIn(List<String> values) {
            addCriterion("shState in", values, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotIn(List<String> values) {
            addCriterion("shState not in", values, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateBetween(String value1, String value2) {
            addCriterion("shState between", value1, value2, "shstate");
            return (Criteria) this;
        }

        public Criteria andShstateNotBetween(String value1, String value2) {
            addCriterion("shState not between", value1, value2, "shstate");
            return (Criteria) this;
        }

        public Criteria andManhourcostIsNull() {
            addCriterion("manhourcost is null");
            return (Criteria) this;
        }

        public Criteria andManhourcostIsNotNull() {
            addCriterion("manhourcost is not null");
            return (Criteria) this;
        }

        public Criteria andManhourcostEqualTo(String value) {
            addCriterion("manhourcost =", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotEqualTo(String value) {
            addCriterion("manhourcost <>", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostGreaterThan(String value) {
            addCriterion("manhourcost >", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostGreaterThanOrEqualTo(String value) {
            addCriterion("manhourcost >=", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostLessThan(String value) {
            addCriterion("manhourcost <", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostLessThanOrEqualTo(String value) {
            addCriterion("manhourcost <=", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostLike(String value) {
            addCriterion("manhourcost like", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotLike(String value) {
            addCriterion("manhourcost not like", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostIn(List<String> values) {
            addCriterion("manhourcost in", values, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotIn(List<String> values) {
            addCriterion("manhourcost not in", values, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostBetween(String value1, String value2) {
            addCriterion("manhourcost between", value1, value2, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotBetween(String value1, String value2) {
            addCriterion("manhourcost not between", value1, value2, "manhourcost");
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