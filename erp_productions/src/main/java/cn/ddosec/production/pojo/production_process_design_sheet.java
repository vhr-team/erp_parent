package cn.ddosec.production.pojo;

import java.io.Serializable;
import java.util.Date;

public class production_process_design_sheet implements Serializable {
    /**
     * 序
     */
    private Integer id;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品编号
     */
    private String designIdb;

    /**
     * 设计人
     */
    private String productDesigner;

    /**
     * 登记人
     */
    private String productRegistrant;

    /**
     * 设计要求
     */
    private String esignRequire;

    /**
     * 设计时间
     */
    private Date designDate;

    /**
     * 设计单号
     */
    private String designNumber;

    /**
     * 审核时间
     */
    private String auditDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDesignIdb() {
        return designIdb;
    }

    public void setDesignIdb(String designIdb) {
        this.designIdb = designIdb == null ? null : designIdb.trim();
    }

    public String getProductDesigner() {
        return productDesigner;
    }

    public void setProductDesigner(String productDesigner) {
        this.productDesigner = productDesigner == null ? null : productDesigner.trim();
    }

    public String getProductRegistrant() {
        return productRegistrant;
    }

    public void setProductRegistrant(String productRegistrant) {
        this.productRegistrant = productRegistrant == null ? null : productRegistrant.trim();
    }

    public String getEsignRequire() {
        return esignRequire;
    }

    public void setEsignRequire(String esignRequire) {
        this.esignRequire = esignRequire == null ? null : esignRequire.trim();
    }

    public Date getDesignDate() {
        return designDate;
    }

    public void setDesignDate(Date designDate) {
        this.designDate = designDate;
    }

    public String getDesignNumber() {
        return designNumber;
    }

    public void setDesignNumber(String designNumber) {
        this.designNumber = designNumber == null ? null : designNumber.trim();
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate == null ? null : auditDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productName=").append(productName);
        sb.append(", designIdb=").append(designIdb);
        sb.append(", productDesigner=").append(productDesigner);
        sb.append(", productRegistrant=").append(productRegistrant);
        sb.append(", esignRequire=").append(esignRequire);
        sb.append(", designDate=").append(designDate);
        sb.append(", designNumber=").append(designNumber);
        sb.append(", auditDate=").append(auditDate);
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
        production_process_design_sheet other = (production_process_design_sheet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getDesignIdb() == null ? other.getDesignIdb() == null : this.getDesignIdb().equals(other.getDesignIdb()))
            && (this.getProductDesigner() == null ? other.getProductDesigner() == null : this.getProductDesigner().equals(other.getProductDesigner()))
            && (this.getProductRegistrant() == null ? other.getProductRegistrant() == null : this.getProductRegistrant().equals(other.getProductRegistrant()))
            && (this.getEsignRequire() == null ? other.getEsignRequire() == null : this.getEsignRequire().equals(other.getEsignRequire()))
            && (this.getDesignDate() == null ? other.getDesignDate() == null : this.getDesignDate().equals(other.getDesignDate()))
            && (this.getDesignNumber() == null ? other.getDesignNumber() == null : this.getDesignNumber().equals(other.getDesignNumber()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getDesignIdb() == null) ? 0 : getDesignIdb().hashCode());
        result = prime * result + ((getProductDesigner() == null) ? 0 : getProductDesigner().hashCode());
        result = prime * result + ((getProductRegistrant() == null) ? 0 : getProductRegistrant().hashCode());
        result = prime * result + ((getEsignRequire() == null) ? 0 : getEsignRequire().hashCode());
        result = prime * result + ((getDesignDate() == null) ? 0 : getDesignDate().hashCode());
        result = prime * result + ((getDesignNumber() == null) ? 0 : getDesignNumber().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        return result;
    }
}