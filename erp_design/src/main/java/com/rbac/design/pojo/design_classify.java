package com.rbac.design.pojo;

import java.io.Serializable;

public class design_classify implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 父级序号
     */
    private Integer pId;


    /**
     * 分类编号
     */
    private String kindId;

    /**
     * 分类名称
     */
    private String kindName;

    private String name;

    public design_classify() {
    }

    public design_classify(Integer id, Integer pId, String kindId, String kindName, String name, Integer kindLevel) {
        this.id = id;
        this.pId = pId;
        this.kindId = kindId;
        this.kindName = kindName;
        this.name = name;
        this.kindLevel = kindLevel;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "design_classify{" +
                "id=" + id +
                ", pId=" + pId +
                ", kindId='" + kindId + '\'' +
                ", kindName='" + kindName + '\'' +
                ", name='" + name + '\'' +
                ", kindLevel=" + kindLevel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 级别
     */
    private Integer kindLevel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public Integer getKindLevel() {
        return kindLevel;
    }

    public void setKindLevel(Integer kindLevel) {
        this.kindLevel = kindLevel;
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
        design_classify other = (design_classify) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getKindId() == null ? other.getKindId() == null : this.getKindId().equals(other.getKindId()))
            && (this.getKindName() == null ? other.getKindName() == null : this.getKindName().equals(other.getKindName()))
            && (this.getKindLevel() == null ? other.getKindLevel() == null : this.getKindLevel().equals(other.getKindLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getKindId() == null) ? 0 : getKindId().hashCode());
        result = prime * result + ((getKindName() == null) ? 0 : getKindName().hashCode());
        result = prime * result + ((getKindLevel() == null) ? 0 : getKindLevel().hashCode());
        return result;
    }
}
