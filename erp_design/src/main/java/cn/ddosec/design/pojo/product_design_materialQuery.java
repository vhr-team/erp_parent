package cn.ddosec.design.pojo;

import java.util.ArrayList;
import java.util.List;

public class product_design_materialQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public product_design_materialQuery() {
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

        public Criteria andDesignerIsNull() {
            addCriterion("designer is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNotNull() {
            addCriterion("designer is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerEqualTo(String value) {
            addCriterion("designer =", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotEqualTo(String value) {
            addCriterion("designer <>", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThan(String value) {
            addCriterion("designer >", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("designer >=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThan(String value) {
            addCriterion("designer <", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThanOrEqualTo(String value) {
            addCriterion("designer <=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLike(String value) {
            addCriterion("designer like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotLike(String value) {
            addCriterion("designer not like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIn(List<String> values) {
            addCriterion("designer in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotIn(List<String> values) {
            addCriterion("designer not in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerBetween(String value1, String value2) {
            addCriterion("designer between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotBetween(String value1, String value2) {
            addCriterion("designer not between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeIsNull() {
            addCriterion("module_describe is null");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeIsNotNull() {
            addCriterion("module_describe is not null");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeEqualTo(String value) {
            addCriterion("module_describe =", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeNotEqualTo(String value) {
            addCriterion("module_describe <>", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeGreaterThan(String value) {
            addCriterion("module_describe >", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("module_describe >=", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeLessThan(String value) {
            addCriterion("module_describe <", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeLessThanOrEqualTo(String value) {
            addCriterion("module_describe <=", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeLike(String value) {
            addCriterion("module_describe like", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeNotLike(String value) {
            addCriterion("module_describe not like", value, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeIn(List<String> values) {
            addCriterion("module_describe in", values, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeNotIn(List<String> values) {
            addCriterion("module_describe not in", values, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeBetween(String value1, String value2) {
            addCriterion("module_describe between", value1, value2, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andModuleDescribeNotBetween(String value1, String value2) {
            addCriterion("module_describe not between", value1, value2, "moduleDescribe");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIsNull() {
            addCriterion("cost_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIsNotNull() {
            addCriterion("cost_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumEqualTo(Double value) {
            addCriterion("cost_price_sum =", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotEqualTo(Double value) {
            addCriterion("cost_price_sum <>", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumGreaterThan(Double value) {
            addCriterion("cost_price_sum >", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_price_sum >=", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumLessThan(Double value) {
            addCriterion("cost_price_sum <", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumLessThanOrEqualTo(Double value) {
            addCriterion("cost_price_sum <=", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIn(List<Double> values) {
            addCriterion("cost_price_sum in", values, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotIn(List<Double> values) {
            addCriterion("cost_price_sum not in", values, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumBetween(Double value1, Double value2) {
            addCriterion("cost_price_sum between", value1, value2, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotBetween(Double value1, Double value2) {
            addCriterion("cost_price_sum not between", value1, value2, "costPriceSum");
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

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("register_time like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("register_time not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(String value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(String value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(String value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(String value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLike(String value) {
            addCriterion("check_time like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotLike(String value) {
            addCriterion("check_time not like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<String> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<String> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(String value1, String value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(String value1, String value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andChangerIsNull() {
            addCriterion("changer is null");
            return (Criteria) this;
        }

        public Criteria andChangerIsNotNull() {
            addCriterion("changer is not null");
            return (Criteria) this;
        }

        public Criteria andChangerEqualTo(String value) {
            addCriterion("changer =", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotEqualTo(String value) {
            addCriterion("changer <>", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThan(String value) {
            addCriterion("changer >", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThanOrEqualTo(String value) {
            addCriterion("changer >=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThan(String value) {
            addCriterion("changer <", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThanOrEqualTo(String value) {
            addCriterion("changer <=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLike(String value) {
            addCriterion("changer like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotLike(String value) {
            addCriterion("changer not like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerIn(List<String> values) {
            addCriterion("changer in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotIn(List<String> values) {
            addCriterion("changer not in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerBetween(String value1, String value2) {
            addCriterion("changer between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotBetween(String value1, String value2) {
            addCriterion("changer not between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(String value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(String value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(String value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(String value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLike(String value) {
            addCriterion("change_time like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotLike(String value) {
            addCriterion("change_time not like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<String> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<String> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(String value1, String value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(String value1, String value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNull() {
            addCriterion("check_tag is null");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNotNull() {
            addCriterion("check_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTagEqualTo(String value) {
            addCriterion("check_tag =", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotEqualTo(String value) {
            addCriterion("check_tag <>", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThan(String value) {
            addCriterion("check_tag >", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThanOrEqualTo(String value) {
            addCriterion("check_tag >=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThan(String value) {
            addCriterion("check_tag <", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThanOrEqualTo(String value) {
            addCriterion("check_tag <=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLike(String value) {
            addCriterion("check_tag like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotLike(String value) {
            addCriterion("check_tag not like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagIn(List<String> values) {
            addCriterion("check_tag in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotIn(List<String> values) {
            addCriterion("check_tag not in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagBetween(String value1, String value2) {
            addCriterion("check_tag between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotBetween(String value1, String value2) {
            addCriterion("check_tag not between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNull() {
            addCriterion("change_tag is null");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNotNull() {
            addCriterion("change_tag is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTagEqualTo(String value) {
            addCriterion("change_tag =", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotEqualTo(String value) {
            addCriterion("change_tag <>", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThan(String value) {
            addCriterion("change_tag >", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("change_tag >=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThan(String value) {
            addCriterion("change_tag <", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThanOrEqualTo(String value) {
            addCriterion("change_tag <=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLike(String value) {
            addCriterion("change_tag like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotLike(String value) {
            addCriterion("change_tag not like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagIn(List<String> values) {
            addCriterion("change_tag in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotIn(List<String> values) {
            addCriterion("change_tag not in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagBetween(String value1, String value2) {
            addCriterion("change_tag between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotBetween(String value1, String value2) {
            addCriterion("change_tag not between", value1, value2, "changeTag");
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
