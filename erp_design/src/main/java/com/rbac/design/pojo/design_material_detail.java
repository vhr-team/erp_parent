package com.rbac.design.pojo;

import java.io.Serializable;

public class design_material_detail implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 父级序号
     */
    private Integer parentId;

    /**
     * 物料序号
     */
    private Integer detailsNumber;

    /**
     * 物料编号
     */
    private String productId;

    /**
     * 物料名称
     */
    private String productName;

    /**
     * 用途类型
     */
    private String type;

    /**
     * 描述
     */
    private String productDescribe;

    /**
     * 单位
     */
    private String amountUnit;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 可用数量
     */
    private Integer residualAmount;

    /**
     * 单价
     */
    private Integer costPrice;

    /**
     * 小计
     */
    private Integer subtotal;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDetailsNumber() {
        return detailsNumber;
    }

    public void setDetailsNumber(Integer detailsNumber) {
        this.detailsNumber = detailsNumber;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe == null ? null : productDescribe.trim();
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit == null ? null : amountUnit.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getResidualAmount() {
        return residualAmount;
    }

    public void setResidualAmount(Integer residualAmount) {
        this.residualAmount = residualAmount;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", detailsNumber=").append(detailsNumber);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", type=").append(type);
        sb.append(", productDescribe=").append(productDescribe);
        sb.append(", amountUnit=").append(amountUnit);
        sb.append(", amount=").append(amount);
        sb.append(", residualAmount=").append(residualAmount);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", subtotal=").append(subtotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        design_material_detail other = (design_material_detail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getDetailsNumber() == null ? other.getDetailsNumber() == null : this.getDetailsNumber().equals(other.getDetailsNumber()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getProductDescribe() == null ? other.getProductDescribe() == null : this.getProductDescribe().equals(other.getProductDescribe()))
            && (this.getAmountUnit() == null ? other.getAmountUnit() == null : this.getAmountUnit().equals(other.getAmountUnit()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getResidualAmount() == null ? other.getResidualAmount() == null : this.getResidualAmount().equals(other.getResidualAmount()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getSubtotal() == null ? other.getSubtotal() == null : this.getSubtotal().equals(other.getSubtotal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getDetailsNumber() == null) ? 0 : getDetailsNumber().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getProductDescribe() == null) ? 0 : getProductDescribe().hashCode());
        result = prime * result + ((getAmountUnit() == null) ? 0 : getAmountUnit().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getResidualAmount() == null) ? 0 : getResidualAmount().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getSubtotal() == null) ? 0 : getSubtotal().hashCode());
        return result;
    }
}