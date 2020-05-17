package cn.ddosec.production.pojo;

import java.io.Serializable;

public class products_process_design implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 产品编号
     */
    private String productid;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 设计人
     */
    private String desregister;

    /**
     * 设计时间
     */
    private String desdate;

    /**
     * 物料编号
     */
    private String processId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDesregister() {
        return desregister;
    }

    public void setDesregister(String desregister) {
        this.desregister = desregister == null ? null : desregister.trim();
    }

    public String getDesdate() {
        return desdate;
    }

    public void setDesdate(String desdate) {
        this.desdate = desdate == null ? null : desdate.trim();
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productid=").append(productid);
        sb.append(", productName=").append(productName);
        sb.append(", desregister=").append(desregister);
        sb.append(", desdate=").append(desdate);
        sb.append(", processId=").append(processId);
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
        products_process_design other = (products_process_design) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getDesregister() == null ? other.getDesregister() == null : this.getDesregister().equals(other.getDesregister()))
            && (this.getDesdate() == null ? other.getDesdate() == null : this.getDesdate().equals(other.getDesdate()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getDesregister() == null) ? 0 : getDesregister().hashCode());
        result = prime * result + ((getDesdate() == null) ? 0 : getDesdate().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        return result;
    }
}