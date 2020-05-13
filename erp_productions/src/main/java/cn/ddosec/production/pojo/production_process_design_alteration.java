package cn.ddosec.production.pojo;

import java.io.Serializable;

public class production_process_design_alteration implements Serializable {
    /**
     * 序
     */
    private Integer id;

    /**
     * 设计单ID
     */
    private Integer sjdid;

    /**
     * 审核单ID
     */
    private Integer shdid;

    /**
     * 修改时间
     */
    private String editDate;

    /**
     * 修改次数
     */
    private Integer editCount;

    /**
     * 变更人
     */
    private String username;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSjdid() {
        return sjdid;
    }

    public void setSjdid(Integer sjdid) {
        this.sjdid = sjdid;
    }

    public Integer getShdid() {
        return shdid;
    }

    public void setShdid(Integer shdid) {
        this.shdid = shdid;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate == null ? null : editDate.trim();
    }

    public Integer getEditCount() {
        return editCount;
    }

    public void setEditCount(Integer editCount) {
        this.editCount = editCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sjdid=").append(sjdid);
        sb.append(", shdid=").append(shdid);
        sb.append(", editDate=").append(editDate);
        sb.append(", editCount=").append(editCount);
        sb.append(", username=").append(username);
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
        production_process_design_alteration other = (production_process_design_alteration) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSjdid() == null ? other.getSjdid() == null : this.getSjdid().equals(other.getSjdid()))
            && (this.getShdid() == null ? other.getShdid() == null : this.getShdid().equals(other.getShdid()))
            && (this.getEditDate() == null ? other.getEditDate() == null : this.getEditDate().equals(other.getEditDate()))
            && (this.getEditCount() == null ? other.getEditCount() == null : this.getEditCount().equals(other.getEditCount()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSjdid() == null) ? 0 : getSjdid().hashCode());
        result = prime * result + ((getShdid() == null) ? 0 : getShdid().hashCode());
        result = prime * result + ((getEditDate() == null) ? 0 : getEditDate().hashCode());
        result = prime * result + ((getEditCount() == null) ? 0 : getEditCount().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return result;
    }
}