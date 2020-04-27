package cn.ddosec.sale.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sale_orderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public sale_orderQuery() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(String value) {
            addCriterion("order_detail_id =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(String value) {
            addCriterion("order_detail_id <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(String value) {
            addCriterion("order_detail_id >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_detail_id >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(String value) {
            addCriterion("order_detail_id <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(String value) {
            addCriterion("order_detail_id <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLike(String value) {
            addCriterion("order_detail_id like", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotLike(String value) {
            addCriterion("order_detail_id not like", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<String> values) {
            addCriterion("order_detail_id in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<String> values) {
            addCriterion("order_detail_id not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(String value1, String value2) {
            addCriterion("order_detail_id between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(String value1, String value2) {
            addCriterion("order_detail_id not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNull() {
            addCriterion("buyer_phone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNotNull() {
            addCriterion("buyer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneEqualTo(String value) {
            addCriterion("buyer_phone =", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotEqualTo(String value) {
            addCriterion("buyer_phone <>", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThan(String value) {
            addCriterion("buyer_phone >", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_phone >=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThan(String value) {
            addCriterion("buyer_phone <", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("buyer_phone <=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLike(String value) {
            addCriterion("buyer_phone like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotLike(String value) {
            addCriterion("buyer_phone not like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIn(List<String> values) {
            addCriterion("buyer_phone in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotIn(List<String> values) {
            addCriterion("buyer_phone not in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneBetween(String value1, String value2) {
            addCriterion("buyer_phone between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("buyer_phone not between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("buyer_address is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("buyer_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("buyer_address =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("buyer_address <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("buyer_address >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_address >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("buyer_address <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("buyer_address <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("buyer_address like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("buyer_address not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("buyer_address in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("buyer_address not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("buyer_address between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("buyer_address not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNull() {
            addCriterion("order_create_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNotNull() {
            addCriterion("order_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateEqualTo(Date value) {
            addCriterion("order_create_date =", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotEqualTo(Date value) {
            addCriterion("order_create_date <>", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThan(Date value) {
            addCriterion("order_create_date >", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_date >=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThan(Date value) {
            addCriterion("order_create_date <", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("order_create_date <=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIn(List<Date> values) {
            addCriterion("order_create_date in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotIn(List<Date> values) {
            addCriterion("order_create_date not in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateBetween(Date value1, Date value2) {
            addCriterion("order_create_date between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("order_create_date not between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateIsNull() {
            addCriterion("order_update_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateIsNotNull() {
            addCriterion("order_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateEqualTo(String value) {
            addCriterion("order_update_date =", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateNotEqualTo(String value) {
            addCriterion("order_update_date <>", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateGreaterThan(String value) {
            addCriterion("order_update_date >", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("order_update_date >=", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateLessThan(String value) {
            addCriterion("order_update_date <", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("order_update_date <=", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateLike(String value) {
            addCriterion("order_update_date like", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateNotLike(String value) {
            addCriterion("order_update_date not like", value, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateIn(List<String> values) {
            addCriterion("order_update_date in", values, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateNotIn(List<String> values) {
            addCriterion("order_update_date not in", values, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateBetween(String value1, String value2) {
            addCriterion("order_update_date between", value1, value2, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateDateNotBetween(String value1, String value2) {
            addCriterion("order_update_date not between", value1, value2, "orderUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Double value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Double value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Double value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Double value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Double> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Double> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Double value1, Double value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusIsNull() {
            addCriterion("order_price_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusIsNotNull() {
            addCriterion("order_price_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusEqualTo(String value) {
            addCriterion("order_price_status =", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusNotEqualTo(String value) {
            addCriterion("order_price_status <>", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusGreaterThan(String value) {
            addCriterion("order_price_status >", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_price_status >=", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusLessThan(String value) {
            addCriterion("order_price_status <", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusLessThanOrEqualTo(String value) {
            addCriterion("order_price_status <=", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusLike(String value) {
            addCriterion("order_price_status like", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusNotLike(String value) {
            addCriterion("order_price_status not like", value, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusIn(List<String> values) {
            addCriterion("order_price_status in", values, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusNotIn(List<String> values) {
            addCriterion("order_price_status not in", values, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusBetween(String value1, String value2) {
            addCriterion("order_price_status between", value1, value2, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPriceStatusNotBetween(String value1, String value2) {
            addCriterion("order_price_status not between", value1, value2, "orderPriceStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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
