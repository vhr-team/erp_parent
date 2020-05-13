package cn.ddosec.production.pojo;

import java.io.Serializable;

public class Product_auditTable implements Serializable {
    private Integer id;

    /**
     * 设计单外键
     */
    private Integer designId;

    /**
     * 设计单状态
     */
    private String sjdstate;

    /**
     * 审核状态
     */
    private String shstate;

    /**
     * 工时总成本
     */
    private String manhourcost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDesignId() {
        return designId;
    }

    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    public String getSjdstate() {
        return sjdstate;
    }

    public void setSjdstate(String sjdstate) {
        this.sjdstate = sjdstate == null ? null : sjdstate.trim();
    }

    public String getShstate() {
        return shstate;
    }

    public void setShstate(String shstate) {
        this.shstate = shstate == null ? null : shstate.trim();
    }

    public String getManhourcost() {
        return manhourcost;
    }

    public void setManhourcost(String manhourcost) {
        this.manhourcost = manhourcost == null ? null : manhourcost.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", designId=").append(designId);
        sb.append(", sjdstate=").append(sjdstate);
        sb.append(", shstate=").append(shstate);
        sb.append(", manhourcost=").append(manhourcost);
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
        Product_auditTable other = (Product_auditTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDesignId() == null ? other.getDesignId() == null : this.getDesignId().equals(other.getDesignId()))
            && (this.getSjdstate() == null ? other.getSjdstate() == null : this.getSjdstate().equals(other.getSjdstate()))
            && (this.getShstate() == null ? other.getShstate() == null : this.getShstate().equals(other.getShstate()))
            && (this.getManhourcost() == null ? other.getManhourcost() == null : this.getManhourcost().equals(other.getManhourcost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDesignId() == null) ? 0 : getDesignId().hashCode());
        result = prime * result + ((getSjdstate() == null) ? 0 : getSjdstate().hashCode());
        result = prime * result + ((getShstate() == null) ? 0 : getShstate().hashCode());
        result = prime * result + ((getManhourcost() == null) ? 0 : getManhourcost().hashCode());
        return result;
    }
}