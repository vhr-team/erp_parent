package cn.ddoesc.production.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class production_orderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public production_orderQuery() {
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

        public Criteria andScheduleIdIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(String value) {
            addCriterion("schedule_id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(String value) {
            addCriterion("schedule_id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(String value) {
            addCriterion("schedule_id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(String value) {
            addCriterion("schedule_id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(String value) {
            addCriterion("schedule_id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLike(String value) {
            addCriterion("schedule_id like", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotLike(String value) {
            addCriterion("schedule_id not like", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<String> values) {
            addCriterion("schedule_id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<String> values) {
            addCriterion("schedule_id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(String value1, String value2) {
            addCriterion("schedule_id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(String value1, String value2) {
            addCriterion("schedule_id not between", value1, value2, "scheduleId");
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdIsNull() {
            addCriterion("qutbound_order_id is null");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdIsNotNull() {
            addCriterion("qutbound_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdEqualTo(String value) {
            addCriterion("qutbound_order_id =", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdNotEqualTo(String value) {
            addCriterion("qutbound_order_id <>", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdGreaterThan(String value) {
            addCriterion("qutbound_order_id >", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("qutbound_order_id >=", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdLessThan(String value) {
            addCriterion("qutbound_order_id <", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdLessThanOrEqualTo(String value) {
            addCriterion("qutbound_order_id <=", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdLike(String value) {
            addCriterion("qutbound_order_id like", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdNotLike(String value) {
            addCriterion("qutbound_order_id not like", value, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdIn(List<String> values) {
            addCriterion("qutbound_order_id in", values, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdNotIn(List<String> values) {
            addCriterion("qutbound_order_id not in", values, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdBetween(String value1, String value2) {
            addCriterion("qutbound_order_id between", value1, value2, "qutboundOrderId");
            return (Criteria) this;
        }

        public Criteria andQutboundOrderIdNotBetween(String value1, String value2) {
            addCriterion("qutbound_order_id not between", value1, value2, "qutboundOrderId");
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

        public Criteria andAggregateIsNull() {
            addCriterion("aggregate is null");
            return (Criteria) this;
        }

        public Criteria andAggregateIsNotNull() {
            addCriterion("aggregate is not null");
            return (Criteria) this;
        }

        public Criteria andAggregateEqualTo(Integer value) {
            addCriterion("aggregate =", value, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateNotEqualTo(Integer value) {
            addCriterion("aggregate <>", value, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateGreaterThan(Integer value) {
            addCriterion("aggregate >", value, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateGreaterThanOrEqualTo(Integer value) {
            addCriterion("aggregate >=", value, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateLessThan(Integer value) {
            addCriterion("aggregate <", value, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateLessThanOrEqualTo(Integer value) {
            addCriterion("aggregate <=", value, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateIn(List<Integer> values) {
            addCriterion("aggregate in", values, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateNotIn(List<Integer> values) {
            addCriterion("aggregate not in", values, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateBetween(Integer value1, Integer value2) {
            addCriterion("aggregate between", value1, value2, "aggregate");
            return (Criteria) this;
        }

        public Criteria andAggregateNotBetween(Integer value1, Integer value2) {
            addCriterion("aggregate not between", value1, value2, "aggregate");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("review_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("review_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(Date value) {
            addCriterion("review_time =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(Date value) {
            addCriterion("review_time <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(Date value) {
            addCriterion("review_time >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("review_time >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(Date value) {
            addCriterion("review_time <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("review_time <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<Date> values) {
            addCriterion("review_time in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<Date> values) {
            addCriterion("review_time not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(Date value1, Date value2) {
            addCriterion("review_time between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("review_time not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditIsNull() {
            addCriterion("checked_audit is null");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditIsNotNull() {
            addCriterion("checked_audit is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditEqualTo(String value) {
            addCriterion("checked_audit =", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditNotEqualTo(String value) {
            addCriterion("checked_audit <>", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditGreaterThan(String value) {
            addCriterion("checked_audit >", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditGreaterThanOrEqualTo(String value) {
            addCriterion("checked_audit >=", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditLessThan(String value) {
            addCriterion("checked_audit <", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditLessThanOrEqualTo(String value) {
            addCriterion("checked_audit <=", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditLike(String value) {
            addCriterion("checked_audit like", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditNotLike(String value) {
            addCriterion("checked_audit not like", value, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditIn(List<String> values) {
            addCriterion("checked_audit in", values, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditNotIn(List<String> values) {
            addCriterion("checked_audit not in", values, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditBetween(String value1, String value2) {
            addCriterion("checked_audit between", value1, value2, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andCheckedAuditNotBetween(String value1, String value2) {
            addCriterion("checked_audit not between", value1, value2, "checkedAudit");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateIsNull() {
            addCriterion("production_generate is null");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateIsNotNull() {
            addCriterion("production_generate is not null");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateEqualTo(String value) {
            addCriterion("production_generate =", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateNotEqualTo(String value) {
            addCriterion("production_generate <>", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateGreaterThan(String value) {
            addCriterion("production_generate >", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateGreaterThanOrEqualTo(String value) {
            addCriterion("production_generate >=", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateLessThan(String value) {
            addCriterion("production_generate <", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateLessThanOrEqualTo(String value) {
            addCriterion("production_generate <=", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateLike(String value) {
            addCriterion("production_generate like", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateNotLike(String value) {
            addCriterion("production_generate not like", value, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateIn(List<String> values) {
            addCriterion("production_generate in", values, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateNotIn(List<String> values) {
            addCriterion("production_generate not in", values, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateBetween(String value1, String value2) {
            addCriterion("production_generate between", value1, value2, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andProductionGenerateNotBetween(String value1, String value2) {
            addCriterion("production_generate not between", value1, value2, "productionGenerate");
            return (Criteria) this;
        }

        public Criteria andAddStatusIsNull() {
            addCriterion("add_status is null");
            return (Criteria) this;
        }

        public Criteria andAddStatusIsNotNull() {
            addCriterion("add_status is not null");
            return (Criteria) this;
        }

        public Criteria andAddStatusEqualTo(String value) {
            addCriterion("add_status =", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotEqualTo(String value) {
            addCriterion("add_status <>", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusGreaterThan(String value) {
            addCriterion("add_status >", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusGreaterThanOrEqualTo(String value) {
            addCriterion("add_status >=", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusLessThan(String value) {
            addCriterion("add_status <", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusLessThanOrEqualTo(String value) {
            addCriterion("add_status <=", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusLike(String value) {
            addCriterion("add_status like", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotLike(String value) {
            addCriterion("add_status not like", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusIn(List<String> values) {
            addCriterion("add_status in", values, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotIn(List<String> values) {
            addCriterion("add_status not in", values, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusBetween(String value1, String value2) {
            addCriterion("add_status between", value1, value2, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotBetween(String value1, String value2) {
            addCriterion("add_status not between", value1, value2, "addStatus");
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