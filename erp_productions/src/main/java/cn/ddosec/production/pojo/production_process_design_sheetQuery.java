package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class production_process_design_sheetQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public production_process_design_sheetQuery() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDesignIdbIsNull() {
            addCriterion("design_idB is null");
            return (Criteria) this;
        }

        public Criteria andDesignIdbIsNotNull() {
            addCriterion("design_idB is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIdbEqualTo(String value) {
            addCriterion("design_idB =", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbNotEqualTo(String value) {
            addCriterion("design_idB <>", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbGreaterThan(String value) {
            addCriterion("design_idB >", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbGreaterThanOrEqualTo(String value) {
            addCriterion("design_idB >=", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbLessThan(String value) {
            addCriterion("design_idB <", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbLessThanOrEqualTo(String value) {
            addCriterion("design_idB <=", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbLike(String value) {
            addCriterion("design_idB like", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbNotLike(String value) {
            addCriterion("design_idB not like", value, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbIn(List<String> values) {
            addCriterion("design_idB in", values, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbNotIn(List<String> values) {
            addCriterion("design_idB not in", values, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbBetween(String value1, String value2) {
            addCriterion("design_idB between", value1, value2, "designIdb");
            return (Criteria) this;
        }

        public Criteria andDesignIdbNotBetween(String value1, String value2) {
            addCriterion("design_idB not between", value1, value2, "designIdb");
            return (Criteria) this;
        }

        public Criteria andProductDesignerIsNull() {
            addCriterion("product_designer is null");
            return (Criteria) this;
        }

        public Criteria andProductDesignerIsNotNull() {
            addCriterion("product_designer is not null");
            return (Criteria) this;
        }

        public Criteria andProductDesignerEqualTo(String value) {
            addCriterion("product_designer =", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerNotEqualTo(String value) {
            addCriterion("product_designer <>", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerGreaterThan(String value) {
            addCriterion("product_designer >", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("product_designer >=", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerLessThan(String value) {
            addCriterion("product_designer <", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerLessThanOrEqualTo(String value) {
            addCriterion("product_designer <=", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerLike(String value) {
            addCriterion("product_designer like", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerNotLike(String value) {
            addCriterion("product_designer not like", value, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerIn(List<String> values) {
            addCriterion("product_designer in", values, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerNotIn(List<String> values) {
            addCriterion("product_designer not in", values, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerBetween(String value1, String value2) {
            addCriterion("product_designer between", value1, value2, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductDesignerNotBetween(String value1, String value2) {
            addCriterion("product_designer not between", value1, value2, "productDesigner");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantIsNull() {
            addCriterion("product_registrant is null");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantIsNotNull() {
            addCriterion("product_registrant is not null");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantEqualTo(String value) {
            addCriterion("product_registrant =", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantNotEqualTo(String value) {
            addCriterion("product_registrant <>", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantGreaterThan(String value) {
            addCriterion("product_registrant >", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantGreaterThanOrEqualTo(String value) {
            addCriterion("product_registrant >=", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantLessThan(String value) {
            addCriterion("product_registrant <", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantLessThanOrEqualTo(String value) {
            addCriterion("product_registrant <=", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantLike(String value) {
            addCriterion("product_registrant like", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantNotLike(String value) {
            addCriterion("product_registrant not like", value, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantIn(List<String> values) {
            addCriterion("product_registrant in", values, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantNotIn(List<String> values) {
            addCriterion("product_registrant not in", values, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantBetween(String value1, String value2) {
            addCriterion("product_registrant between", value1, value2, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andProductRegistrantNotBetween(String value1, String value2) {
            addCriterion("product_registrant not between", value1, value2, "productRegistrant");
            return (Criteria) this;
        }

        public Criteria andEsignRequireIsNull() {
            addCriterion("esign_require is null");
            return (Criteria) this;
        }

        public Criteria andEsignRequireIsNotNull() {
            addCriterion("esign_require is not null");
            return (Criteria) this;
        }

        public Criteria andEsignRequireEqualTo(String value) {
            addCriterion("esign_require =", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireNotEqualTo(String value) {
            addCriterion("esign_require <>", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireGreaterThan(String value) {
            addCriterion("esign_require >", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireGreaterThanOrEqualTo(String value) {
            addCriterion("esign_require >=", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireLessThan(String value) {
            addCriterion("esign_require <", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireLessThanOrEqualTo(String value) {
            addCriterion("esign_require <=", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireLike(String value) {
            addCriterion("esign_require like", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireNotLike(String value) {
            addCriterion("esign_require not like", value, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireIn(List<String> values) {
            addCriterion("esign_require in", values, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireNotIn(List<String> values) {
            addCriterion("esign_require not in", values, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireBetween(String value1, String value2) {
            addCriterion("esign_require between", value1, value2, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andEsignRequireNotBetween(String value1, String value2) {
            addCriterion("esign_require not between", value1, value2, "esignRequire");
            return (Criteria) this;
        }

        public Criteria andDesignDateIsNull() {
            addCriterion("design_date is null");
            return (Criteria) this;
        }

        public Criteria andDesignDateIsNotNull() {
            addCriterion("design_date is not null");
            return (Criteria) this;
        }

        public Criteria andDesignDateEqualTo(Date value) {
            addCriterionForJDBCDate("design_date =", value, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("design_date <>", value, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("design_date >", value, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("design_date >=", value, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateLessThan(Date value) {
            addCriterionForJDBCDate("design_date <", value, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("design_date <=", value, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateIn(List<Date> values) {
            addCriterionForJDBCDate("design_date in", values, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("design_date not in", values, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("design_date between", value1, value2, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("design_date not between", value1, value2, "designDate");
            return (Criteria) this;
        }

        public Criteria andDesignNumberIsNull() {
            addCriterion("design_number is null");
            return (Criteria) this;
        }

        public Criteria andDesignNumberIsNotNull() {
            addCriterion("design_number is not null");
            return (Criteria) this;
        }

        public Criteria andDesignNumberEqualTo(String value) {
            addCriterion("design_number =", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberNotEqualTo(String value) {
            addCriterion("design_number <>", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberGreaterThan(String value) {
            addCriterion("design_number >", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberGreaterThanOrEqualTo(String value) {
            addCriterion("design_number >=", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberLessThan(String value) {
            addCriterion("design_number <", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberLessThanOrEqualTo(String value) {
            addCriterion("design_number <=", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberLike(String value) {
            addCriterion("design_number like", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberNotLike(String value) {
            addCriterion("design_number not like", value, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberIn(List<String> values) {
            addCriterion("design_number in", values, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberNotIn(List<String> values) {
            addCriterion("design_number not in", values, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberBetween(String value1, String value2) {
            addCriterion("design_number between", value1, value2, "designNumber");
            return (Criteria) this;
        }

        public Criteria andDesignNumberNotBetween(String value1, String value2) {
            addCriterion("design_number not between", value1, value2, "designNumber");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(String value) {
            addCriterion("audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(String value) {
            addCriterion("audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(String value) {
            addCriterion("audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(String value) {
            addCriterion("audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(String value) {
            addCriterion("audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(String value) {
            addCriterion("audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLike(String value) {
            addCriterion("audit_date like", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotLike(String value) {
            addCriterion("audit_date not like", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<String> values) {
            addCriterion("audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<String> values) {
            addCriterion("audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(String value1, String value2) {
            addCriterion("audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(String value1, String value2) {
            addCriterion("audit_date not between", value1, value2, "auditDate");
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