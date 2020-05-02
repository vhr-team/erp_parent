package cn.ddosec.design.pojo;

import java.io.Serializable;

public class product_material_archives implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 物料id
     */
    private String materialid;

    /**
     * 产品档案ID
     */
    private String productid;

    /**
     * 物料名称
     */
    private String materialname;

    /**
     * 所需数量
     */
    private Integer materialnum;

    /**
     * 单位
     */
    private String materialunit;

    /**
     * 描述
     */
    private String materialremark;

    /**
     * 组装设计ID
     */
    private String assembleid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid == null ? null : materialid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public Integer getMaterialnum() {
        return materialnum;
    }

    public void setMaterialnum(Integer materialnum) {
        this.materialnum = materialnum;
    }

    public String getMaterialunit() {
        return materialunit;
    }

    public void setMaterialunit(String materialunit) {
        this.materialunit = materialunit == null ? null : materialunit.trim();
    }

    public String getMaterialremark() {
        return materialremark;
    }

    public void setMaterialremark(String materialremark) {
        this.materialremark = materialremark == null ? null : materialremark.trim();
    }

    public String getAssembleid() {
        return assembleid;
    }

    public void setAssembleid(String assembleid) {
        this.assembleid = assembleid == null ? null : assembleid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", materialid=").append(materialid);
        sb.append(", productid=").append(productid);
        sb.append(", materialname=").append(materialname);
        sb.append(", materialnum=").append(materialnum);
        sb.append(", materialunit=").append(materialunit);
        sb.append(", materialremark=").append(materialremark);
        sb.append(", assembleid=").append(assembleid);
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
        product_material_archives other = (product_material_archives) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMaterialid() == null ? other.getMaterialid() == null : this.getMaterialid().equals(other.getMaterialid()))
                && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
                && (this.getMaterialname() == null ? other.getMaterialname() == null : this.getMaterialname().equals(other.getMaterialname()))
                && (this.getMaterialnum() == null ? other.getMaterialnum() == null : this.getMaterialnum().equals(other.getMaterialnum()))
                && (this.getMaterialunit() == null ? other.getMaterialunit() == null : this.getMaterialunit().equals(other.getMaterialunit()))
                && (this.getMaterialremark() == null ? other.getMaterialremark() == null : this.getMaterialremark().equals(other.getMaterialremark()))
                && (this.getAssembleid() == null ? other.getAssembleid() == null : this.getAssembleid().equals(other.getAssembleid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMaterialid() == null) ? 0 : getMaterialid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getMaterialname() == null) ? 0 : getMaterialname().hashCode());
        result = prime * result + ((getMaterialnum() == null) ? 0 : getMaterialnum().hashCode());
        result = prime * result + ((getMaterialunit() == null) ? 0 : getMaterialunit().hashCode());
        result = prime * result + ((getMaterialremark() == null) ? 0 : getMaterialremark().hashCode());
        result = prime * result + ((getAssembleid() == null) ? 0 : getAssembleid().hashCode());
        return result;
    }
}
