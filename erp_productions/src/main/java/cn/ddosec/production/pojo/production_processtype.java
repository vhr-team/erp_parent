package cn.ddosec.production.pojo;

import java.io.Serializable;

public class production_processtype implements Serializable {
    /**
     * 工序编号
     */
    private Integer id;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序描述
     */
    private String processDescribe;

    /**
     * 设计要求
     */
    private String designRequire;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getProcessDescribe() {
        return processDescribe;
    }

    public void setProcessDescribe(String processDescribe) {
        this.processDescribe = processDescribe == null ? null : processDescribe.trim();
    }

    public String getDesignRequire() {
        return designRequire;
    }

    public void setDesignRequire(String designRequire) {
        this.designRequire = designRequire == null ? null : designRequire.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processName=").append(processName);
        sb.append(", processDescribe=").append(processDescribe);
        sb.append(", designRequire=").append(designRequire);
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
        production_processtype other = (production_processtype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getProcessDescribe() == null ? other.getProcessDescribe() == null : this.getProcessDescribe().equals(other.getProcessDescribe()))
            && (this.getDesignRequire() == null ? other.getDesignRequire() == null : this.getDesignRequire().equals(other.getDesignRequire()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getProcessDescribe() == null) ? 0 : getProcessDescribe().hashCode());
        result = prime * result + ((getDesignRequire() == null) ? 0 : getDesignRequire().hashCode());
        return result;
    }
}