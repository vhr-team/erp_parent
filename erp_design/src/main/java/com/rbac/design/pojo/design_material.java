package com.rbac.design.pojo;

import java.io.Serializable;

public class design_material implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 设计编号
     */
    private String designId;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品1级分类编号
     */
    private String firstKindId;

    /**
     * 产品1级分类名称
     */
    private String firstKindName;

    /**
     * 产品2级分类编号
     */
    private String secondKindId;

    /**
     * 产品2级分类名称
     */
    private String secondKindName;

    /**
     * 设计人
     */
    private String designer;

    /**
     * 设计要求
     */
    private String moduleDescribe;

    /**
     * 物料总成本
     */
    private Double costPriceSum;

    /**
     * 登记人
     */
    private String register;

    /**
     * 登记时间
     */
    private String registerTime;

    /**
     * 复核人
     */
    private String checker;

    /**
     * 复核时间
     */
    private String checkTime;

    /**
     * 变更人
     */
    private String changer;

    /**
     * 变更时间
     */
    private String changeTime;

    /**
     * 审核标志(等待审核/审核通过/审核不通过)
     */
    private String checkTag;

    /**
     * 变更标志(未变更/已变更)
     */
    private String changeTag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId == null ? null : designId.trim();
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

    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId == null ? null : firstKindId.trim();
    }

    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName == null ? null : firstKindName.trim();
    }

    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId == null ? null : secondKindId.trim();
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName == null ? null : secondKindName.trim();
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer == null ? null : designer.trim();
    }

    public String getModuleDescribe() {
        return moduleDescribe;
    }

    public void setModuleDescribe(String moduleDescribe) {
        this.moduleDescribe = moduleDescribe == null ? null : moduleDescribe.trim();
    }

    public Double getCostPriceSum() {
        return costPriceSum;
    }

    public void setCostPriceSum(Double costPriceSum) {
        this.costPriceSum = costPriceSum;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag == null ? null : checkTag.trim();
    }

    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag == null ? null : changeTag.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", designId=").append(designId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", firstKindId=").append(firstKindId);
        sb.append(", firstKindName=").append(firstKindName);
        sb.append(", secondKindId=").append(secondKindId);
        sb.append(", secondKindName=").append(secondKindName);
        sb.append(", designer=").append(designer);
        sb.append(", moduleDescribe=").append(moduleDescribe);
        sb.append(", costPriceSum=").append(costPriceSum);
        sb.append(", register=").append(register);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", checker=").append(checker);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", changer=").append(changer);
        sb.append(", changeTime=").append(changeTime);
        sb.append(", checkTag=").append(checkTag);
        sb.append(", changeTag=").append(changeTag);
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
        design_material other = (design_material) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDesignId() == null ? other.getDesignId() == null : this.getDesignId().equals(other.getDesignId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getFirstKindId() == null ? other.getFirstKindId() == null : this.getFirstKindId().equals(other.getFirstKindId()))
            && (this.getFirstKindName() == null ? other.getFirstKindName() == null : this.getFirstKindName().equals(other.getFirstKindName()))
            && (this.getSecondKindId() == null ? other.getSecondKindId() == null : this.getSecondKindId().equals(other.getSecondKindId()))
            && (this.getSecondKindName() == null ? other.getSecondKindName() == null : this.getSecondKindName().equals(other.getSecondKindName()))
            && (this.getDesigner() == null ? other.getDesigner() == null : this.getDesigner().equals(other.getDesigner()))
            && (this.getModuleDescribe() == null ? other.getModuleDescribe() == null : this.getModuleDescribe().equals(other.getModuleDescribe()))
            && (this.getCostPriceSum() == null ? other.getCostPriceSum() == null : this.getCostPriceSum().equals(other.getCostPriceSum()))
            && (this.getRegister() == null ? other.getRegister() == null : this.getRegister().equals(other.getRegister()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getChecker() == null ? other.getChecker() == null : this.getChecker().equals(other.getChecker()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getChanger() == null ? other.getChanger() == null : this.getChanger().equals(other.getChanger()))
            && (this.getChangeTime() == null ? other.getChangeTime() == null : this.getChangeTime().equals(other.getChangeTime()))
            && (this.getCheckTag() == null ? other.getCheckTag() == null : this.getCheckTag().equals(other.getCheckTag()))
            && (this.getChangeTag() == null ? other.getChangeTag() == null : this.getChangeTag().equals(other.getChangeTag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDesignId() == null) ? 0 : getDesignId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getFirstKindId() == null) ? 0 : getFirstKindId().hashCode());
        result = prime * result + ((getFirstKindName() == null) ? 0 : getFirstKindName().hashCode());
        result = prime * result + ((getSecondKindId() == null) ? 0 : getSecondKindId().hashCode());
        result = prime * result + ((getSecondKindName() == null) ? 0 : getSecondKindName().hashCode());
        result = prime * result + ((getDesigner() == null) ? 0 : getDesigner().hashCode());
        result = prime * result + ((getModuleDescribe() == null) ? 0 : getModuleDescribe().hashCode());
        result = prime * result + ((getCostPriceSum() == null) ? 0 : getCostPriceSum().hashCode());
        result = prime * result + ((getRegister() == null) ? 0 : getRegister().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getChecker() == null) ? 0 : getChecker().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getChanger() == null) ? 0 : getChanger().hashCode());
        result = prime * result + ((getChangeTime() == null) ? 0 : getChangeTime().hashCode());
        result = prime * result + ((getCheckTag() == null) ? 0 : getCheckTag().hashCode());
        result = prime * result + ((getChangeTag() == null) ? 0 : getChangeTag().hashCode());
        return result;
    }
}