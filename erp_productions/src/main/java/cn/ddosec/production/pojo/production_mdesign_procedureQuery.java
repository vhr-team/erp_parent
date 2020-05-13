package cn.ddosec.production.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class production_mdesign_procedureQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public production_mdesign_procedureQuery() {
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

        public Criteria andDesignIdIsNull() {
            addCriterion("design_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNotNull() {
            addCriterion("design_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIdEqualTo(String value) {
            addCriterion("design_id =", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotEqualTo(String value) {
            addCriterion("design_id <>", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThan(String value) {
            addCriterion("design_id >", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThanOrEqualTo(String value) {
            addCriterion("design_id >=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThan(String value) {
            addCriterion("design_id <", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThanOrEqualTo(String value) {
            addCriterion("design_id <=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLike(String value) {
            addCriterion("design_id like", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotLike(String value) {
            addCriterion("design_id not like", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdIn(List<String> values) {
            addCriterion("design_id in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotIn(List<String> values) {
            addCriterion("design_id not in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdBetween(String value1, String value2) {
            addCriterion("design_id between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotBetween(String value1, String value2) {
            addCriterion("design_id not between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNull() {
            addCriterion("procedure_id is null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNotNull() {
            addCriterion("procedure_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdEqualTo(String value) {
            addCriterion("procedure_id =", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotEqualTo(String value) {
            addCriterion("procedure_id <>", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThan(String value) {
            addCriterion("procedure_id >", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_id >=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThan(String value) {
            addCriterion("procedure_id <", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThanOrEqualTo(String value) {
            addCriterion("procedure_id <=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLike(String value) {
            addCriterion("procedure_id like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotLike(String value) {
            addCriterion("procedure_id not like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIn(List<String> values) {
            addCriterion("procedure_id in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotIn(List<String> values) {
            addCriterion("procedure_id not in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdBetween(String value1, String value2) {
            addCriterion("procedure_id between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotBetween(String value1, String value2) {
            addCriterion("procedure_id not between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIsNull() {
            addCriterion("procedure_name is null");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIsNotNull() {
            addCriterion("procedure_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureNameEqualTo(String value) {
            addCriterion("procedure_name =", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotEqualTo(String value) {
            addCriterion("procedure_name <>", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameGreaterThan(String value) {
            addCriterion("procedure_name >", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_name >=", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLessThan(String value) {
            addCriterion("procedure_name <", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLessThanOrEqualTo(String value) {
            addCriterion("procedure_name <=", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLike(String value) {
            addCriterion("procedure_name like", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotLike(String value) {
            addCriterion("procedure_name not like", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIn(List<String> values) {
            addCriterion("procedure_name in", values, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotIn(List<String> values) {
            addCriterion("procedure_name not in", values, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameBetween(String value1, String value2) {
            addCriterion("procedure_name between", value1, value2, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotBetween(String value1, String value2) {
            addCriterion("procedure_name not between", value1, value2, "procedureName");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIsNull() {
            addCriterion("labour_hour_amount is null");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIsNotNull() {
            addCriterion("labour_hour_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountEqualTo(Integer value) {
            addCriterion("labour_hour_amount =", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotEqualTo(Integer value) {
            addCriterion("labour_hour_amount <>", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountGreaterThan(Integer value) {
            addCriterion("labour_hour_amount >", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("labour_hour_amount >=", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountLessThan(Integer value) {
            addCriterion("labour_hour_amount <", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountLessThanOrEqualTo(Integer value) {
            addCriterion("labour_hour_amount <=", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIn(List<Integer> values) {
            addCriterion("labour_hour_amount in", values, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotIn(List<Integer> values) {
            addCriterion("labour_hour_amount not in", values, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountBetween(Integer value1, Integer value2) {
            addCriterion("labour_hour_amount between", value1, value2, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("labour_hour_amount not between", value1, value2, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeIsNull() {
            addCriterion("procedurce_describe is null");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeIsNotNull() {
            addCriterion("procedurce_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeEqualTo(String value) {
            addCriterion("procedurce_describe =", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeNotEqualTo(String value) {
            addCriterion("procedurce_describe <>", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeGreaterThan(String value) {
            addCriterion("procedurce_describe >", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("procedurce_describe >=", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeLessThan(String value) {
            addCriterion("procedurce_describe <", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeLessThanOrEqualTo(String value) {
            addCriterion("procedurce_describe <=", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeLike(String value) {
            addCriterion("procedurce_describe like", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeNotLike(String value) {
            addCriterion("procedurce_describe not like", value, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeIn(List<String> values) {
            addCriterion("procedurce_describe in", values, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeNotIn(List<String> values) {
            addCriterion("procedurce_describe not in", values, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeBetween(String value1, String value2) {
            addCriterion("procedurce_describe between", value1, value2, "procedurceDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedurceDescribeNotBetween(String value1, String value2) {
            addCriterion("procedurce_describe not between", value1, value2, "procedurceDescribe");
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

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(Double value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(Double value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(Double value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(Double value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(Double value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<Double> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<Double> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(Double value1, Double value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(Double value1, Double value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIsNull() {
            addCriterion("module_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIsNotNull() {
            addCriterion("module_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalEqualTo(Double value) {
            addCriterion("module_subtotal =", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotEqualTo(Double value) {
            addCriterion("module_subtotal <>", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalGreaterThan(Double value) {
            addCriterion("module_subtotal >", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("module_subtotal >=", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalLessThan(Double value) {
            addCriterion("module_subtotal <", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalLessThanOrEqualTo(Double value) {
            addCriterion("module_subtotal <=", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIn(List<Double> values) {
            addCriterion("module_subtotal in", values, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotIn(List<Double> values) {
            addCriterion("module_subtotal not in", values, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalBetween(Double value1, Double value2) {
            addCriterion("module_subtotal between", value1, value2, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotBetween(Double value1, Double value2) {
            addCriterion("module_subtotal not between", value1, value2, "moduleSubtotal");
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

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterionForJDBCDate("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterionForJDBCDate("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterionForJDBCDate("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIsNull() {
            addCriterion("design_module_tag is null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIsNotNull() {
            addCriterion("design_module_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagEqualTo(String value) {
            addCriterion("design_module_tag =", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotEqualTo(String value) {
            addCriterion("design_module_tag <>", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagGreaterThan(String value) {
            addCriterion("design_module_tag >", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagGreaterThanOrEqualTo(String value) {
            addCriterion("design_module_tag >=", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLessThan(String value) {
            addCriterion("design_module_tag <", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLessThanOrEqualTo(String value) {
            addCriterion("design_module_tag <=", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLike(String value) {
            addCriterion("design_module_tag like", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotLike(String value) {
            addCriterion("design_module_tag not like", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIn(List<String> values) {
            addCriterion("design_module_tag in", values, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotIn(List<String> values) {
            addCriterion("design_module_tag not in", values, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagBetween(String value1, String value2) {
            addCriterion("design_module_tag between", value1, value2, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotBetween(String value1, String value2) {
            addCriterion("design_module_tag not between", value1, value2, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIsNull() {
            addCriterion("design_module_change_tag is null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIsNotNull() {
            addCriterion("design_module_change_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagEqualTo(String value) {
            addCriterion("design_module_change_tag =", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotEqualTo(String value) {
            addCriterion("design_module_change_tag <>", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagGreaterThan(String value) {
            addCriterion("design_module_change_tag >", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("design_module_change_tag >=", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLessThan(String value) {
            addCriterion("design_module_change_tag <", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLessThanOrEqualTo(String value) {
            addCriterion("design_module_change_tag <=", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLike(String value) {
            addCriterion("design_module_change_tag like", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotLike(String value) {
            addCriterion("design_module_change_tag not like", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIn(List<String> values) {
            addCriterion("design_module_change_tag in", values, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotIn(List<String> values) {
            addCriterion("design_module_change_tag not in", values, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagBetween(String value1, String value2) {
            addCriterion("design_module_change_tag between", value1, value2, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotBetween(String value1, String value2) {
            addCriterion("design_module_change_tag not between", value1, value2, "designModuleChangeTag");
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