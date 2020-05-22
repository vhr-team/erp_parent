package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.List;

public class products_process_checkQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public products_process_checkQuery() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andProcessCheckRemarkIsNull() {
            addCriterion("process_check_remark is null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkIsNotNull() {
            addCriterion("process_check_remark is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkEqualTo(String value) {
            addCriterion("process_check_remark =", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkNotEqualTo(String value) {
            addCriterion("process_check_remark <>", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkGreaterThan(String value) {
            addCriterion("process_check_remark >", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("process_check_remark >=", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkLessThan(String value) {
            addCriterion("process_check_remark <", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkLessThanOrEqualTo(String value) {
            addCriterion("process_check_remark <=", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkLike(String value) {
            addCriterion("process_check_remark like", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkNotLike(String value) {
            addCriterion("process_check_remark not like", value, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkIn(List<String> values) {
            addCriterion("process_check_remark in", values, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkNotIn(List<String> values) {
            addCriterion("process_check_remark not in", values, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkBetween(String value1, String value2) {
            addCriterion("process_check_remark between", value1, value2, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckRemarkNotBetween(String value1, String value2) {
            addCriterion("process_check_remark not between", value1, value2, "processCheckRemark");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonIsNull() {
            addCriterion("process_check_person is null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonIsNotNull() {
            addCriterion("process_check_person is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonEqualTo(String value) {
            addCriterion("process_check_person =", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonNotEqualTo(String value) {
            addCriterion("process_check_person <>", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonGreaterThan(String value) {
            addCriterion("process_check_person >", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonGreaterThanOrEqualTo(String value) {
            addCriterion("process_check_person >=", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonLessThan(String value) {
            addCriterion("process_check_person <", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonLessThanOrEqualTo(String value) {
            addCriterion("process_check_person <=", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonLike(String value) {
            addCriterion("process_check_person like", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonNotLike(String value) {
            addCriterion("process_check_person not like", value, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonIn(List<String> values) {
            addCriterion("process_check_person in", values, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonNotIn(List<String> values) {
            addCriterion("process_check_person not in", values, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonBetween(String value1, String value2) {
            addCriterion("process_check_person between", value1, value2, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckPersonNotBetween(String value1, String value2) {
            addCriterion("process_check_person not between", value1, value2, "processCheckPerson");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateIsNull() {
            addCriterion("process_check_date is null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateIsNotNull() {
            addCriterion("process_check_date is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateEqualTo(String value) {
            addCriterion("process_check_date =", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateNotEqualTo(String value) {
            addCriterion("process_check_date <>", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateGreaterThan(String value) {
            addCriterion("process_check_date >", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateGreaterThanOrEqualTo(String value) {
            addCriterion("process_check_date >=", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateLessThan(String value) {
            addCriterion("process_check_date <", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateLessThanOrEqualTo(String value) {
            addCriterion("process_check_date <=", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateLike(String value) {
            addCriterion("process_check_date like", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateNotLike(String value) {
            addCriterion("process_check_date not like", value, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateIn(List<String> values) {
            addCriterion("process_check_date in", values, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateNotIn(List<String> values) {
            addCriterion("process_check_date not in", values, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateBetween(String value1, String value2) {
            addCriterion("process_check_date between", value1, value2, "processCheckDate");
            return (Criteria) this;
        }

        public Criteria andProcessCheckDateNotBetween(String value1, String value2) {
            addCriterion("process_check_date not between", value1, value2, "processCheckDate");
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
