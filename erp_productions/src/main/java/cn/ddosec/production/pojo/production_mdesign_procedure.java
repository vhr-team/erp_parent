package cn.ddosec.production.pojo;

import java.io.Serializable;
import java.util.Date;

public class production_mdesign_procedure implements Serializable {
    /**
     * 序
     */
    private Integer id;

    /**
     * 设计编号
     */
    private String designId;

    /**
     * 工序编号
     */
    private String procedureId;

    /**
     * 工序名称
     */
    private String procedureName;

    /**
     * 工时数
     */
    private Integer labourHourAmount;

    /**
     * 工序描述
     */
    private String procedurceDescribe;

    /**
     * 单位
     */
    private String amountUnit;

    /**
     * 单位工时成本
     */
    private Integer costPrice;

    /**
     * 工时成本小计
     */
    private Double subtotal;

    /**
     * 物料成本小计
     */
    private Double moduleSubtotal;

    /**
     * 登记人
     */
    private String register;

    /**
     * 登记时间
     */
    private Date registerTime;

    /**
     * 当前工序物料标志D002-0: 未设计 D002-1: 已设计
     */
    private String designModuleTag;

    /**
     * 当前工序物料变更标志 D003-0: 未变更D003-0: 已变更
     */
    private String designModuleChangeTag;

    /**
     * 产品名称外键
     */
    private String productName;

    /**
     * 设计人
     */
    private String productDesigner;

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

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId == null ? null : procedureId.trim();
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName == null ? null : procedureName.trim();
    }

    public Integer getLabourHourAmount() {
        return labourHourAmount;
    }

    public void setLabourHourAmount(Integer labourHourAmount) {
        this.labourHourAmount = labourHourAmount;
    }

    public String getProcedurceDescribe() {
        return procedurceDescribe;
    }

    public void setProcedurceDescribe(String procedurceDescribe) {
        this.procedurceDescribe = procedurceDescribe == null ? null : procedurceDescribe.trim();
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit == null ? null : amountUnit.trim();
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getModuleSubtotal() {
        return moduleSubtotal;
    }

    public void setModuleSubtotal(Double moduleSubtotal) {
        this.moduleSubtotal = moduleSubtotal;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getDesignModuleTag() {
        return designModuleTag;
    }

    public void setDesignModuleTag(String designModuleTag) {
        this.designModuleTag = designModuleTag == null ? null : designModuleTag.trim();
    }

    public String getDesignModuleChangeTag() {
        return designModuleChangeTag;
    }

    public void setDesignModuleChangeTag(String designModuleChangeTag) {
        this.designModuleChangeTag = designModuleChangeTag == null ? null : designModuleChangeTag.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDesigner() {
        return productDesigner;
    }

    public void setProductDesigner(String productDesigner) {
        this.productDesigner = productDesigner == null ? null : productDesigner.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", designId=").append(designId);
        sb.append(", procedureId=").append(procedureId);
        sb.append(", procedureName=").append(procedureName);
        sb.append(", labourHourAmount=").append(labourHourAmount);
        sb.append(", procedurceDescribe=").append(procedurceDescribe);
        sb.append(", amountUnit=").append(amountUnit);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", subtotal=").append(subtotal);
        sb.append(", moduleSubtotal=").append(moduleSubtotal);
        sb.append(", register=").append(register);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", designModuleTag=").append(designModuleTag);
        sb.append(", designModuleChangeTag=").append(designModuleChangeTag);
        sb.append(", productName=").append(productName);
        sb.append(", productDesigner=").append(productDesigner);
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
        production_mdesign_procedure other = (production_mdesign_procedure) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDesignId() == null ? other.getDesignId() == null : this.getDesignId().equals(other.getDesignId()))
            && (this.getProcedureId() == null ? other.getProcedureId() == null : this.getProcedureId().equals(other.getProcedureId()))
            && (this.getProcedureName() == null ? other.getProcedureName() == null : this.getProcedureName().equals(other.getProcedureName()))
            && (this.getLabourHourAmount() == null ? other.getLabourHourAmount() == null : this.getLabourHourAmount().equals(other.getLabourHourAmount()))
            && (this.getProcedurceDescribe() == null ? other.getProcedurceDescribe() == null : this.getProcedurceDescribe().equals(other.getProcedurceDescribe()))
            && (this.getAmountUnit() == null ? other.getAmountUnit() == null : this.getAmountUnit().equals(other.getAmountUnit()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getSubtotal() == null ? other.getSubtotal() == null : this.getSubtotal().equals(other.getSubtotal()))
            && (this.getModuleSubtotal() == null ? other.getModuleSubtotal() == null : this.getModuleSubtotal().equals(other.getModuleSubtotal()))
            && (this.getRegister() == null ? other.getRegister() == null : this.getRegister().equals(other.getRegister()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getDesignModuleTag() == null ? other.getDesignModuleTag() == null : this.getDesignModuleTag().equals(other.getDesignModuleTag()))
            && (this.getDesignModuleChangeTag() == null ? other.getDesignModuleChangeTag() == null : this.getDesignModuleChangeTag().equals(other.getDesignModuleChangeTag()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductDesigner() == null ? other.getProductDesigner() == null : this.getProductDesigner().equals(other.getProductDesigner()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDesignId() == null) ? 0 : getDesignId().hashCode());
        result = prime * result + ((getProcedureId() == null) ? 0 : getProcedureId().hashCode());
        result = prime * result + ((getProcedureName() == null) ? 0 : getProcedureName().hashCode());
        result = prime * result + ((getLabourHourAmount() == null) ? 0 : getLabourHourAmount().hashCode());
        result = prime * result + ((getProcedurceDescribe() == null) ? 0 : getProcedurceDescribe().hashCode());
        result = prime * result + ((getAmountUnit() == null) ? 0 : getAmountUnit().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getSubtotal() == null) ? 0 : getSubtotal().hashCode());
        result = prime * result + ((getModuleSubtotal() == null) ? 0 : getModuleSubtotal().hashCode());
        result = prime * result + ((getRegister() == null) ? 0 : getRegister().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getDesignModuleTag() == null) ? 0 : getDesignModuleTag().hashCode());
        result = prime * result + ((getDesignModuleChangeTag() == null) ? 0 : getDesignModuleChangeTag().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductDesigner() == null) ? 0 : getProductDesigner().hashCode());
        return result;
    }
}