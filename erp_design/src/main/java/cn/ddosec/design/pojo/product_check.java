package cn.ddosec.design.pojo;

import java.io.Serializable;

public class product_check implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 审核状态
     */
    private String productCheck;

    /**
     * 审核人员
     */
    private String checkPerson;

    /**
     * 审核描述
     */
    private String checkRemark;

    /**
     * 审核时间
     */
    private String checkDate;

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

    public String getProductCheck() {
        return productCheck;
    }

    public void setProductCheck(String productCheck) {
        this.productCheck = productCheck == null ? null : productCheck.trim();
    }

    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson == null ? null : checkPerson.trim();
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark == null ? null : checkRemark.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
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
        sb.append(", productCheck=").append(productCheck);
        sb.append(", checkPerson=").append(checkPerson);
        sb.append(", checkRemark=").append(checkRemark);
        sb.append(", checkDate=").append(checkDate);
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
        product_check other = (product_check) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductCheck() == null ? other.getProductCheck() == null : this.getProductCheck().equals(other.getProductCheck()))
            && (this.getCheckPerson() == null ? other.getCheckPerson() == null : this.getCheckPerson().equals(other.getCheckPerson()))
            && (this.getCheckRemark() == null ? other.getCheckRemark() == null : this.getCheckRemark().equals(other.getCheckRemark()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductCheck() == null) ? 0 : getProductCheck().hashCode());
        result = prime * result + ((getCheckPerson() == null) ? 0 : getCheckPerson().hashCode());
        result = prime * result + ((getCheckRemark() == null) ? 0 : getCheckRemark().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        return result;
    }
}