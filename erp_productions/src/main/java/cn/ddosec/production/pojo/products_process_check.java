package cn.ddosec.production.pojo;

import java.io.Serializable;

public class products_process_check implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 工序ID
     */
    private String processId;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序审核状态
     */
    private String processCheck;

    /**
     * 审核描述
     */
    private String processCheckRemark;

    /**
     * 审核人员
     */
    private String processCheckPerson;

    /**
     * 审核日期
     */
    private String processCheckDate;

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

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getProcessCheck() {
        return processCheck;
    }

    public void setProcessCheck(String processCheck) {
        this.processCheck = processCheck == null ? null : processCheck.trim();
    }

    public String getProcessCheckRemark() {
        return processCheckRemark;
    }

    public void setProcessCheckRemark(String processCheckRemark) {
        this.processCheckRemark = processCheckRemark == null ? null : processCheckRemark.trim();
    }

    public String getProcessCheckPerson() {
        return processCheckPerson;
    }

    public void setProcessCheckPerson(String processCheckPerson) {
        this.processCheckPerson = processCheckPerson == null ? null : processCheckPerson.trim();
    }

    public String getProcessCheckDate() {
        return processCheckDate;
    }

    public void setProcessCheckDate(String processCheckDate) {
        this.processCheckDate = processCheckDate == null ? null : processCheckDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processId=").append(processId);
        sb.append(", processName=").append(processName);
        sb.append(", processCheck=").append(processCheck);
        sb.append(", processCheckRemark=").append(processCheckRemark);
        sb.append(", processCheckPerson=").append(processCheckPerson);
        sb.append(", processCheckDate=").append(processCheckDate);
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
        products_process_check other = (products_process_check) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getProcessCheck() == null ? other.getProcessCheck() == null : this.getProcessCheck().equals(other.getProcessCheck()))
            && (this.getProcessCheckRemark() == null ? other.getProcessCheckRemark() == null : this.getProcessCheckRemark().equals(other.getProcessCheckRemark()))
            && (this.getProcessCheckPerson() == null ? other.getProcessCheckPerson() == null : this.getProcessCheckPerson().equals(other.getProcessCheckPerson()))
            && (this.getProcessCheckDate() == null ? other.getProcessCheckDate() == null : this.getProcessCheckDate().equals(other.getProcessCheckDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getProcessCheck() == null) ? 0 : getProcessCheck().hashCode());
        result = prime * result + ((getProcessCheckRemark() == null) ? 0 : getProcessCheckRemark().hashCode());
        result = prime * result + ((getProcessCheckPerson() == null) ? 0 : getProcessCheckPerson().hashCode());
        result = prime * result + ((getProcessCheckDate() == null) ? 0 : getProcessCheckDate().hashCode());
        return result;
    }
}
