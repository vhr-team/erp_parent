package cn.ddosec.sale.pojo;

import java.util.ArrayList;
import java.util.List;

public class sale_tableQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public sale_tableQuery() {
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

        public Criteria andSaleIdIsNull() {
            addCriterion("sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("sale_id =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("sale_id <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("sale_id >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_id >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("sale_id <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_id <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("sale_id in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("sale_id not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_id between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_id not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleNumberIsNull() {
            addCriterion("sale_number is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumberIsNotNull() {
            addCriterion("sale_number is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumberEqualTo(String value) {
            addCriterion("sale_number =", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberNotEqualTo(String value) {
            addCriterion("sale_number <>", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberGreaterThan(String value) {
            addCriterion("sale_number >", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sale_number >=", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberLessThan(String value) {
            addCriterion("sale_number <", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberLessThanOrEqualTo(String value) {
            addCriterion("sale_number <=", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberLike(String value) {
            addCriterion("sale_number like", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberNotLike(String value) {
            addCriterion("sale_number not like", value, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberIn(List<String> values) {
            addCriterion("sale_number in", values, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberNotIn(List<String> values) {
            addCriterion("sale_number not in", values, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberBetween(String value1, String value2) {
            addCriterion("sale_number between", value1, value2, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleNumberNotBetween(String value1, String value2) {
            addCriterion("sale_number not between", value1, value2, "saleNumber");
            return (Criteria) this;
        }

        public Criteria andSaleProviderIsNull() {
            addCriterion("sale_provider is null");
            return (Criteria) this;
        }

        public Criteria andSaleProviderIsNotNull() {
            addCriterion("sale_provider is not null");
            return (Criteria) this;
        }

        public Criteria andSaleProviderEqualTo(String value) {
            addCriterion("sale_provider =", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderNotEqualTo(String value) {
            addCriterion("sale_provider <>", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderGreaterThan(String value) {
            addCriterion("sale_provider >", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderGreaterThanOrEqualTo(String value) {
            addCriterion("sale_provider >=", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderLessThan(String value) {
            addCriterion("sale_provider <", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderLessThanOrEqualTo(String value) {
            addCriterion("sale_provider <=", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderLike(String value) {
            addCriterion("sale_provider like", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderNotLike(String value) {
            addCriterion("sale_provider not like", value, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderIn(List<String> values) {
            addCriterion("sale_provider in", values, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderNotIn(List<String> values) {
            addCriterion("sale_provider not in", values, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderBetween(String value1, String value2) {
            addCriterion("sale_provider between", value1, value2, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleProviderNotBetween(String value1, String value2) {
            addCriterion("sale_provider not between", value1, value2, "saleProvider");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIsNull() {
            addCriterion("sale_order is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIsNotNull() {
            addCriterion("sale_order is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderEqualTo(String value) {
            addCriterion("sale_order =", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNotEqualTo(String value) {
            addCriterion("sale_order <>", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderGreaterThan(String value) {
            addCriterion("sale_order >", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderGreaterThanOrEqualTo(String value) {
            addCriterion("sale_order >=", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderLessThan(String value) {
            addCriterion("sale_order <", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderLessThanOrEqualTo(String value) {
            addCriterion("sale_order <=", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderLike(String value) {
            addCriterion("sale_order like", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNotLike(String value) {
            addCriterion("sale_order not like", value, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIn(List<String> values) {
            addCriterion("sale_order in", values, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNotIn(List<String> values) {
            addCriterion("sale_order not in", values, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderBetween(String value1, String value2) {
            addCriterion("sale_order between", value1, value2, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNotBetween(String value1, String value2) {
            addCriterion("sale_order not between", value1, value2, "saleOrder");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateIsNull() {
            addCriterion("sale_initial_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateIsNotNull() {
            addCriterion("sale_initial_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateEqualTo(String value) {
            addCriterion("sale_initial_date =", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateNotEqualTo(String value) {
            addCriterion("sale_initial_date <>", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateGreaterThan(String value) {
            addCriterion("sale_initial_date >", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateGreaterThanOrEqualTo(String value) {
            addCriterion("sale_initial_date >=", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateLessThan(String value) {
            addCriterion("sale_initial_date <", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateLessThanOrEqualTo(String value) {
            addCriterion("sale_initial_date <=", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateLike(String value) {
            addCriterion("sale_initial_date like", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateNotLike(String value) {
            addCriterion("sale_initial_date not like", value, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateIn(List<String> values) {
            addCriterion("sale_initial_date in", values, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateNotIn(List<String> values) {
            addCriterion("sale_initial_date not in", values, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateBetween(String value1, String value2) {
            addCriterion("sale_initial_date between", value1, value2, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleInitialDateNotBetween(String value1, String value2) {
            addCriterion("sale_initial_date not between", value1, value2, "saleInitialDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateIsNull() {
            addCriterion("sale_return_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateIsNotNull() {
            addCriterion("sale_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateEqualTo(String value) {
            addCriterion("sale_return_date =", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateNotEqualTo(String value) {
            addCriterion("sale_return_date <>", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateGreaterThan(String value) {
            addCriterion("sale_return_date >", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("sale_return_date >=", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateLessThan(String value) {
            addCriterion("sale_return_date <", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateLessThanOrEqualTo(String value) {
            addCriterion("sale_return_date <=", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateLike(String value) {
            addCriterion("sale_return_date like", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateNotLike(String value) {
            addCriterion("sale_return_date not like", value, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateIn(List<String> values) {
            addCriterion("sale_return_date in", values, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateNotIn(List<String> values) {
            addCriterion("sale_return_date not in", values, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateBetween(String value1, String value2) {
            addCriterion("sale_return_date between", value1, value2, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnDateNotBetween(String value1, String value2) {
            addCriterion("sale_return_date not between", value1, value2, "saleReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnIsNull() {
            addCriterion("sale_isreturn is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnIsNotNull() {
            addCriterion("sale_isreturn is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnEqualTo(String value) {
            addCriterion("sale_isreturn =", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnNotEqualTo(String value) {
            addCriterion("sale_isreturn <>", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnGreaterThan(String value) {
            addCriterion("sale_isreturn >", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnGreaterThanOrEqualTo(String value) {
            addCriterion("sale_isreturn >=", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnLessThan(String value) {
            addCriterion("sale_isreturn <", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnLessThanOrEqualTo(String value) {
            addCriterion("sale_isreturn <=", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnLike(String value) {
            addCriterion("sale_isreturn like", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnNotLike(String value) {
            addCriterion("sale_isreturn not like", value, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnIn(List<String> values) {
            addCriterion("sale_isreturn in", values, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnNotIn(List<String> values) {
            addCriterion("sale_isreturn not in", values, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnBetween(String value1, String value2) {
            addCriterion("sale_isreturn between", value1, value2, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleIsreturnNotBetween(String value1, String value2) {
            addCriterion("sale_isreturn not between", value1, value2, "saleIsreturn");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateIsNull() {
            addCriterion("sale_harvest_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateIsNotNull() {
            addCriterion("sale_harvest_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateEqualTo(String value) {
            addCriterion("sale_harvest_date =", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateNotEqualTo(String value) {
            addCriterion("sale_harvest_date <>", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateGreaterThan(String value) {
            addCriterion("sale_harvest_date >", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateGreaterThanOrEqualTo(String value) {
            addCriterion("sale_harvest_date >=", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateLessThan(String value) {
            addCriterion("sale_harvest_date <", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateLessThanOrEqualTo(String value) {
            addCriterion("sale_harvest_date <=", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateLike(String value) {
            addCriterion("sale_harvest_date like", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateNotLike(String value) {
            addCriterion("sale_harvest_date not like", value, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateIn(List<String> values) {
            addCriterion("sale_harvest_date in", values, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateNotIn(List<String> values) {
            addCriterion("sale_harvest_date not in", values, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateBetween(String value1, String value2) {
            addCriterion("sale_harvest_date between", value1, value2, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSaleHarvestDateNotBetween(String value1, String value2) {
            addCriterion("sale_harvest_date not between", value1, value2, "saleHarvestDate");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Double value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Double value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Double value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Double value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Double> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Double> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Double value1, Double value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
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
