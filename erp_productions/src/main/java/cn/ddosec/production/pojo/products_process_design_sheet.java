package cn.ddosec.production.pojo;

import java.io.Serializable;

public class products_process_design_sheet implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 工序编号
     */
    private String processId;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序描述
     */
    private String processRemark;

    /**
     * 工时数
     */
    private Integer timenumber;

    /**
     * 工时单位
     */
    private String timeunit;

    /**
     * 工时成本
     */
    private String timeprice;

    /**
     * 工时总成本
     */
    private String timesumprice;

    /**
     * 工序设计人
     */
    private String processRegister;

    /**
     * 工序设计时间
     */
    private String processDate;

    /**
     * 工序设计要求
     */
    private String processRequire;

    private String processCheck;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
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

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getProcessRemark() {
        return processRemark;
    }

    public void setProcessRemark(String processRemark) {
        this.processRemark = processRemark == null ? null : processRemark.trim();
    }

    public Integer getTimenumber() {
        return timenumber;
    }

    public void setTimenumber(Integer timenumber) {
        this.timenumber = timenumber;
    }

    public String getTimeunit() {
        return timeunit;
    }

    public void setTimeunit(String timeunit) {
        this.timeunit = timeunit == null ? null : timeunit.trim();
    }

    public String getTimeprice() {
        return timeprice;
    }

    public void setTimeprice(String timeprice) {
        this.timeprice = timeprice == null ? null : timeprice.trim();
    }

    public String getTimesumprice() {
        return timesumprice;
    }

    public void setTimesumprice(String timesumprice) {
        this.timesumprice = timesumprice == null ? null : timesumprice.trim();
    }

    public String getProcessRegister() {
        return processRegister;
    }

    public void setProcessRegister(String processRegister) {
        this.processRegister = processRegister == null ? null : processRegister.trim();
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate == null ? null : processDate.trim();
    }

    public String getProcessRequire() {
        return processRequire;
    }

    public void setProcessRequire(String processRequire) {
        this.processRequire = processRequire == null ? null : processRequire.trim();
    }

    public String getProcessCheck() {
        return processCheck;
    }

    public void setProcessCheck(String processCheck) {
        this.processCheck = processCheck == null ? null : processCheck.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processId=").append(processId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", processName=").append(processName);
        sb.append(", processRemark=").append(processRemark);
        sb.append(", timenumber=").append(timenumber);
        sb.append(", timeunit=").append(timeunit);
        sb.append(", timeprice=").append(timeprice);
        sb.append(", timesumprice=").append(timesumprice);
        sb.append(", processRegister=").append(processRegister);
        sb.append(", processDate=").append(processDate);
        sb.append(", processRequire=").append(processRequire);
        sb.append(", processCheck=").append(processCheck);
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
        products_process_design_sheet other = (products_process_design_sheet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getProcessRemark() == null ? other.getProcessRemark() == null : this.getProcessRemark().equals(other.getProcessRemark()))
            && (this.getTimenumber() == null ? other.getTimenumber() == null : this.getTimenumber().equals(other.getTimenumber()))
            && (this.getTimeunit() == null ? other.getTimeunit() == null : this.getTimeunit().equals(other.getTimeunit()))
            && (this.getTimeprice() == null ? other.getTimeprice() == null : this.getTimeprice().equals(other.getTimeprice()))
            && (this.getTimesumprice() == null ? other.getTimesumprice() == null : this.getTimesumprice().equals(other.getTimesumprice()))
            && (this.getProcessRegister() == null ? other.getProcessRegister() == null : this.getProcessRegister().equals(other.getProcessRegister()))
            && (this.getProcessDate() == null ? other.getProcessDate() == null : this.getProcessDate().equals(other.getProcessDate()))
            && (this.getProcessRequire() == null ? other.getProcessRequire() == null : this.getProcessRequire().equals(other.getProcessRequire()))
            && (this.getProcessCheck() == null ? other.getProcessCheck() == null : this.getProcessCheck().equals(other.getProcessCheck()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getProcessRemark() == null) ? 0 : getProcessRemark().hashCode());
        result = prime * result + ((getTimenumber() == null) ? 0 : getTimenumber().hashCode());
        result = prime * result + ((getTimeunit() == null) ? 0 : getTimeunit().hashCode());
        result = prime * result + ((getTimeprice() == null) ? 0 : getTimeprice().hashCode());
        result = prime * result + ((getTimesumprice() == null) ? 0 : getTimesumprice().hashCode());
        result = prime * result + ((getProcessRegister() == null) ? 0 : getProcessRegister().hashCode());
        result = prime * result + ((getProcessDate() == null) ? 0 : getProcessDate().hashCode());
        result = prime * result + ((getProcessRequire() == null) ? 0 : getProcessRequire().hashCode());
        result = prime * result + ((getProcessCheck() == null) ? 0 : getProcessCheck().hashCode());
        return result;
    }
}