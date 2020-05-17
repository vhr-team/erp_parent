package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.List;

public class products_process_design_sheetQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public products_process_design_sheetQuery() {
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

        public Criteria andProcessRemarkIsNull() {
            addCriterion("process_remark is null");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkIsNotNull() {
            addCriterion("process_remark is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkEqualTo(String value) {
            addCriterion("process_remark =", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkNotEqualTo(String value) {
            addCriterion("process_remark <>", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkGreaterThan(String value) {
            addCriterion("process_remark >", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("process_remark >=", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkLessThan(String value) {
            addCriterion("process_remark <", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkLessThanOrEqualTo(String value) {
            addCriterion("process_remark <=", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkLike(String value) {
            addCriterion("process_remark like", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkNotLike(String value) {
            addCriterion("process_remark not like", value, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkIn(List<String> values) {
            addCriterion("process_remark in", values, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkNotIn(List<String> values) {
            addCriterion("process_remark not in", values, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkBetween(String value1, String value2) {
            addCriterion("process_remark between", value1, value2, "processRemark");
            return (Criteria) this;
        }

        public Criteria andProcessRemarkNotBetween(String value1, String value2) {
            addCriterion("process_remark not between", value1, value2, "processRemark");
            return (Criteria) this;
        }

        public Criteria andTimenumberIsNull() {
            addCriterion("timenumber is null");
            return (Criteria) this;
        }

        public Criteria andTimenumberIsNotNull() {
            addCriterion("timenumber is not null");
            return (Criteria) this;
        }

        public Criteria andTimenumberEqualTo(Integer value) {
            addCriterion("timenumber =", value, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberNotEqualTo(Integer value) {
            addCriterion("timenumber <>", value, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberGreaterThan(Integer value) {
            addCriterion("timenumber >", value, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("timenumber >=", value, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberLessThan(Integer value) {
            addCriterion("timenumber <", value, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberLessThanOrEqualTo(Integer value) {
            addCriterion("timenumber <=", value, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberIn(List<Integer> values) {
            addCriterion("timenumber in", values, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberNotIn(List<Integer> values) {
            addCriterion("timenumber not in", values, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberBetween(Integer value1, Integer value2) {
            addCriterion("timenumber between", value1, value2, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("timenumber not between", value1, value2, "timenumber");
            return (Criteria) this;
        }

        public Criteria andTimeunitIsNull() {
            addCriterion("timeunit is null");
            return (Criteria) this;
        }

        public Criteria andTimeunitIsNotNull() {
            addCriterion("timeunit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeunitEqualTo(String value) {
            addCriterion("timeunit =", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotEqualTo(String value) {
            addCriterion("timeunit <>", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitGreaterThan(String value) {
            addCriterion("timeunit >", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitGreaterThanOrEqualTo(String value) {
            addCriterion("timeunit >=", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitLessThan(String value) {
            addCriterion("timeunit <", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitLessThanOrEqualTo(String value) {
            addCriterion("timeunit <=", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitLike(String value) {
            addCriterion("timeunit like", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotLike(String value) {
            addCriterion("timeunit not like", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitIn(List<String> values) {
            addCriterion("timeunit in", values, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotIn(List<String> values) {
            addCriterion("timeunit not in", values, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitBetween(String value1, String value2) {
            addCriterion("timeunit between", value1, value2, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotBetween(String value1, String value2) {
            addCriterion("timeunit not between", value1, value2, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimepriceIsNull() {
            addCriterion("timeprice is null");
            return (Criteria) this;
        }

        public Criteria andTimepriceIsNotNull() {
            addCriterion("timeprice is not null");
            return (Criteria) this;
        }

        public Criteria andTimepriceEqualTo(String value) {
            addCriterion("timeprice =", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceNotEqualTo(String value) {
            addCriterion("timeprice <>", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceGreaterThan(String value) {
            addCriterion("timeprice >", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceGreaterThanOrEqualTo(String value) {
            addCriterion("timeprice >=", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceLessThan(String value) {
            addCriterion("timeprice <", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceLessThanOrEqualTo(String value) {
            addCriterion("timeprice <=", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceLike(String value) {
            addCriterion("timeprice like", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceNotLike(String value) {
            addCriterion("timeprice not like", value, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceIn(List<String> values) {
            addCriterion("timeprice in", values, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceNotIn(List<String> values) {
            addCriterion("timeprice not in", values, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceBetween(String value1, String value2) {
            addCriterion("timeprice between", value1, value2, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimepriceNotBetween(String value1, String value2) {
            addCriterion("timeprice not between", value1, value2, "timeprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceIsNull() {
            addCriterion("timesumprice is null");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceIsNotNull() {
            addCriterion("timesumprice is not null");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceEqualTo(String value) {
            addCriterion("timesumprice =", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceNotEqualTo(String value) {
            addCriterion("timesumprice <>", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceGreaterThan(String value) {
            addCriterion("timesumprice >", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceGreaterThanOrEqualTo(String value) {
            addCriterion("timesumprice >=", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceLessThan(String value) {
            addCriterion("timesumprice <", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceLessThanOrEqualTo(String value) {
            addCriterion("timesumprice <=", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceLike(String value) {
            addCriterion("timesumprice like", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceNotLike(String value) {
            addCriterion("timesumprice not like", value, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceIn(List<String> values) {
            addCriterion("timesumprice in", values, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceNotIn(List<String> values) {
            addCriterion("timesumprice not in", values, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceBetween(String value1, String value2) {
            addCriterion("timesumprice between", value1, value2, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andTimesumpriceNotBetween(String value1, String value2) {
            addCriterion("timesumprice not between", value1, value2, "timesumprice");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterIsNull() {
            addCriterion("process_register is null");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterIsNotNull() {
            addCriterion("process_register is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterEqualTo(String value) {
            addCriterion("process_register =", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterNotEqualTo(String value) {
            addCriterion("process_register <>", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterGreaterThan(String value) {
            addCriterion("process_register >", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("process_register >=", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterLessThan(String value) {
            addCriterion("process_register <", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterLessThanOrEqualTo(String value) {
            addCriterion("process_register <=", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterLike(String value) {
            addCriterion("process_register like", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterNotLike(String value) {
            addCriterion("process_register not like", value, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterIn(List<String> values) {
            addCriterion("process_register in", values, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterNotIn(List<String> values) {
            addCriterion("process_register not in", values, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterBetween(String value1, String value2) {
            addCriterion("process_register between", value1, value2, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessRegisterNotBetween(String value1, String value2) {
            addCriterion("process_register not between", value1, value2, "processRegister");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNull() {
            addCriterion("process_date is null");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNotNull() {
            addCriterion("process_date is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDateEqualTo(String value) {
            addCriterion("process_date =", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotEqualTo(String value) {
            addCriterion("process_date <>", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThan(String value) {
            addCriterion("process_date >", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThanOrEqualTo(String value) {
            addCriterion("process_date >=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThan(String value) {
            addCriterion("process_date <", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThanOrEqualTo(String value) {
            addCriterion("process_date <=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLike(String value) {
            addCriterion("process_date like", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotLike(String value) {
            addCriterion("process_date not like", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateIn(List<String> values) {
            addCriterion("process_date in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotIn(List<String> values) {
            addCriterion("process_date not in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateBetween(String value1, String value2) {
            addCriterion("process_date between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotBetween(String value1, String value2) {
            addCriterion("process_date not between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessRequireIsNull() {
            addCriterion("process_require is null");
            return (Criteria) this;
        }

        public Criteria andProcessRequireIsNotNull() {
            addCriterion("process_require is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRequireEqualTo(String value) {
            addCriterion("process_require =", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireNotEqualTo(String value) {
            addCriterion("process_require <>", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireGreaterThan(String value) {
            addCriterion("process_require >", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireGreaterThanOrEqualTo(String value) {
            addCriterion("process_require >=", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireLessThan(String value) {
            addCriterion("process_require <", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireLessThanOrEqualTo(String value) {
            addCriterion("process_require <=", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireLike(String value) {
            addCriterion("process_require like", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireNotLike(String value) {
            addCriterion("process_require not like", value, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireIn(List<String> values) {
            addCriterion("process_require in", values, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireNotIn(List<String> values) {
            addCriterion("process_require not in", values, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireBetween(String value1, String value2) {
            addCriterion("process_require between", value1, value2, "processRequire");
            return (Criteria) this;
        }

        public Criteria andProcessRequireNotBetween(String value1, String value2) {
            addCriterion("process_require not between", value1, value2, "processRequire");
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