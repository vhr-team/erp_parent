package cn.ddossec.domain.pojo;

import java.io.Serializable;

public class product_design_record implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 制造商
     */
    private String factoryName;

    /**
     * 档次级别(高档/中档/低档)
     */
    private String productClass;

    /**
     * 保修期
     */
    private String warranty;

    /**
     * 市场单价
     */
    private Double listPrice;

    /**
     * 成本单价
     */
    private Double realCostPrice;

    /**
     * 单位
     */
    private String amountUnit;

    /**
     * 产品描述
     */
    private String productDescribe;

    /**
     * 产品经理
     */
    private String responsiblePerson;

    /**
     * 登记人
     */
    private String register;

    /**
     * 建档时间
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
     * 审核标志(等待审核/审核通过/审核不通过)
     */
    private String checkTag;

    /**
     * 变更人
     */
    private String changer;

    /**
     * 变更时间
     */
    private String changeTime;

    /**
     * 档案变更标志(未变更/已变更)
     */
    private String changeTag;

    /**
     * 档案变更累计
     */
    private Integer fileChangeAmount;

    /**
     * 产品删除标志(未删除/已删除)
     */
    private String deleteTag;

    /**
     * 物料编号
     */
    private String materielArchivesId;

    /**
     * 库存状态
     */
    private Integer inventoryStatus;

    /**
     * 工序设计状态
     */
    private Integer procssStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass == null ? null : productClass.trim();
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty == null ? null : warranty.trim();
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getRealCostPrice() {
        return realCostPrice;
    }

    public void setRealCostPrice(Double realCostPrice) {
        this.realCostPrice = realCostPrice;
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit == null ? null : amountUnit.trim();
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe == null ? null : productDescribe.trim();
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson == null ? null : responsiblePerson.trim();
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

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag == null ? null : checkTag.trim();
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

    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag == null ? null : changeTag.trim();
    }

    public Integer getFileChangeAmount() {
        return fileChangeAmount;
    }

    public void setFileChangeAmount(Integer fileChangeAmount) {
        this.fileChangeAmount = fileChangeAmount;
    }

    public String getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag == null ? null : deleteTag.trim();
    }

    public String getMaterielArchivesId() {
        return materielArchivesId;
    }

    public void setMaterielArchivesId(String materielArchivesId) {
        this.materielArchivesId = materielArchivesId == null ? null : materielArchivesId.trim();
    }

    public Integer getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(Integer inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public Integer getProcssStatus() {
        return procssStatus;
    }

    public void setProcssStatus(Integer procssStatus) {
        this.procssStatus = procssStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", factoryName=").append(factoryName);
        sb.append(", productClass=").append(productClass);
        sb.append(", warranty=").append(warranty);
        sb.append(", listPrice=").append(listPrice);
        sb.append(", realCostPrice=").append(realCostPrice);
        sb.append(", amountUnit=").append(amountUnit);
        sb.append(", productDescribe=").append(productDescribe);
        sb.append(", responsiblePerson=").append(responsiblePerson);
        sb.append(", register=").append(register);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", checker=").append(checker);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checkTag=").append(checkTag);
        sb.append(", changer=").append(changer);
        sb.append(", changeTime=").append(changeTime);
        sb.append(", changeTag=").append(changeTag);
        sb.append(", fileChangeAmount=").append(fileChangeAmount);
        sb.append(", deleteTag=").append(deleteTag);
        sb.append(", materielArchivesId=").append(materielArchivesId);
        sb.append(", inventoryStatus=").append(inventoryStatus);
        sb.append(", procssStatus=").append(procssStatus);
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
        product_design_record other = (product_design_record) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
                && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
                && (this.getFactoryName() == null ? other.getFactoryName() == null : this.getFactoryName().equals(other.getFactoryName()))
                && (this.getProductClass() == null ? other.getProductClass() == null : this.getProductClass().equals(other.getProductClass()))
                && (this.getWarranty() == null ? other.getWarranty() == null : this.getWarranty().equals(other.getWarranty()))
                && (this.getListPrice() == null ? other.getListPrice() == null : this.getListPrice().equals(other.getListPrice()))
                && (this.getRealCostPrice() == null ? other.getRealCostPrice() == null : this.getRealCostPrice().equals(other.getRealCostPrice()))
                && (this.getAmountUnit() == null ? other.getAmountUnit() == null : this.getAmountUnit().equals(other.getAmountUnit()))
                && (this.getProductDescribe() == null ? other.getProductDescribe() == null : this.getProductDescribe().equals(other.getProductDescribe()))
                && (this.getResponsiblePerson() == null ? other.getResponsiblePerson() == null : this.getResponsiblePerson().equals(other.getResponsiblePerson()))
                && (this.getRegister() == null ? other.getRegister() == null : this.getRegister().equals(other.getRegister()))
                && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
                && (this.getChecker() == null ? other.getChecker() == null : this.getChecker().equals(other.getChecker()))
                && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
                && (this.getCheckTag() == null ? other.getCheckTag() == null : this.getCheckTag().equals(other.getCheckTag()))
                && (this.getChanger() == null ? other.getChanger() == null : this.getChanger().equals(other.getChanger()))
                && (this.getChangeTime() == null ? other.getChangeTime() == null : this.getChangeTime().equals(other.getChangeTime()))
                && (this.getChangeTag() == null ? other.getChangeTag() == null : this.getChangeTag().equals(other.getChangeTag()))
                && (this.getFileChangeAmount() == null ? other.getFileChangeAmount() == null : this.getFileChangeAmount().equals(other.getFileChangeAmount()))
                && (this.getDeleteTag() == null ? other.getDeleteTag() == null : this.getDeleteTag().equals(other.getDeleteTag()))
                && (this.getMaterielArchivesId() == null ? other.getMaterielArchivesId() == null : this.getMaterielArchivesId().equals(other.getMaterielArchivesId()))
                && (this.getInventoryStatus() == null ? other.getInventoryStatus() == null : this.getInventoryStatus().equals(other.getInventoryStatus()))
                && (this.getProcssStatus() == null ? other.getProcssStatus() == null : this.getProcssStatus().equals(other.getProcssStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getFactoryName() == null) ? 0 : getFactoryName().hashCode());
        result = prime * result + ((getProductClass() == null) ? 0 : getProductClass().hashCode());
        result = prime * result + ((getWarranty() == null) ? 0 : getWarranty().hashCode());
        result = prime * result + ((getListPrice() == null) ? 0 : getListPrice().hashCode());
        result = prime * result + ((getRealCostPrice() == null) ? 0 : getRealCostPrice().hashCode());
        result = prime * result + ((getAmountUnit() == null) ? 0 : getAmountUnit().hashCode());
        result = prime * result + ((getProductDescribe() == null) ? 0 : getProductDescribe().hashCode());
        result = prime * result + ((getResponsiblePerson() == null) ? 0 : getResponsiblePerson().hashCode());
        result = prime * result + ((getRegister() == null) ? 0 : getRegister().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getChecker() == null) ? 0 : getChecker().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getCheckTag() == null) ? 0 : getCheckTag().hashCode());
        result = prime * result + ((getChanger() == null) ? 0 : getChanger().hashCode());
        result = prime * result + ((getChangeTime() == null) ? 0 : getChangeTime().hashCode());
        result = prime * result + ((getChangeTag() == null) ? 0 : getChangeTag().hashCode());
        result = prime * result + ((getFileChangeAmount() == null) ? 0 : getFileChangeAmount().hashCode());
        result = prime * result + ((getDeleteTag() == null) ? 0 : getDeleteTag().hashCode());
        result = prime * result + ((getMaterielArchivesId() == null) ? 0 : getMaterielArchivesId().hashCode());
        result = prime * result + ((getInventoryStatus() == null) ? 0 : getInventoryStatus().hashCode());
        result = prime * result + ((getProcssStatus() == null) ? 0 : getProcssStatus().hashCode());
        return result;
    }
}
