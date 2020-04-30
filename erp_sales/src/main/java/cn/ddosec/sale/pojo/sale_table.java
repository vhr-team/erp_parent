package cn.ddosec.sale.pojo;

import java.io.Serializable;

public class sale_table implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 销售序号
     */
    private Integer saleId;
    /**
     * 销售编号
     */
    private String saleNumber;
    /**
     * 供应商
     */
    private String saleProvider;
    /**
     * 销售订单号
     */
    private String saleOrder;
    /**
     * 销售日期
     */
    private String saleInitialDate;
    /**
     * 退货日期
     */
    private String saleReturnDate;
    /**
     * 是否可以退货
     */
    private String saleIsreturn;
    /**
     * 收获日期
     */
    private String saleHarvestDate;
    /**
     * 销售总金额
     */
    private Double salePrice;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber == null ? null : saleNumber.trim();
    }

    public String getSaleProvider() {
        return saleProvider;
    }

    public void setSaleProvider(String saleProvider) {
        this.saleProvider = saleProvider == null ? null : saleProvider.trim();
    }

    public String getSaleOrder() {
        return saleOrder;
    }

    public void setSaleOrder(String saleOrder) {
        this.saleOrder = saleOrder == null ? null : saleOrder.trim();
    }

    public String getSaleInitialDate() {
        return saleInitialDate;
    }

    public void setSaleInitialDate(String saleInitialDate) {
        this.saleInitialDate = saleInitialDate == null ? null : saleInitialDate.trim();
    }

    public String getSaleReturnDate() {
        return saleReturnDate;
    }

    public void setSaleReturnDate(String saleReturnDate) {
        this.saleReturnDate = saleReturnDate == null ? null : saleReturnDate.trim();
    }

    public String getSaleIsreturn() {
        return saleIsreturn;
    }

    public void setSaleIsreturn(String saleIsreturn) {
        this.saleIsreturn = saleIsreturn == null ? null : saleIsreturn.trim();
    }

    public String getSaleHarvestDate() {
        return saleHarvestDate;
    }

    public void setSaleHarvestDate(String saleHarvestDate) {
        this.saleHarvestDate = saleHarvestDate == null ? null : saleHarvestDate.trim();
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saleId=").append(saleId);
        sb.append(", saleNumber=").append(saleNumber);
        sb.append(", saleProvider=").append(saleProvider);
        sb.append(", saleOrder=").append(saleOrder);
        sb.append(", saleInitialDate=").append(saleInitialDate);
        sb.append(", saleReturnDate=").append(saleReturnDate);
        sb.append(", saleIsreturn=").append(saleIsreturn);
        sb.append(", saleHarvestDate=").append(saleHarvestDate);
        sb.append(", salePrice=").append(salePrice);
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
        sale_table other = (sale_table) that;
        return (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
                && (this.getSaleNumber() == null ? other.getSaleNumber() == null : this.getSaleNumber().equals(other.getSaleNumber()))
                && (this.getSaleProvider() == null ? other.getSaleProvider() == null : this.getSaleProvider().equals(other.getSaleProvider()))
                && (this.getSaleOrder() == null ? other.getSaleOrder() == null : this.getSaleOrder().equals(other.getSaleOrder()))
                && (this.getSaleInitialDate() == null ? other.getSaleInitialDate() == null : this.getSaleInitialDate().equals(other.getSaleInitialDate()))
                && (this.getSaleReturnDate() == null ? other.getSaleReturnDate() == null : this.getSaleReturnDate().equals(other.getSaleReturnDate()))
                && (this.getSaleIsreturn() == null ? other.getSaleIsreturn() == null : this.getSaleIsreturn().equals(other.getSaleIsreturn()))
                && (this.getSaleHarvestDate() == null ? other.getSaleHarvestDate() == null : this.getSaleHarvestDate().equals(other.getSaleHarvestDate()))
                && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getSaleNumber() == null) ? 0 : getSaleNumber().hashCode());
        result = prime * result + ((getSaleProvider() == null) ? 0 : getSaleProvider().hashCode());
        result = prime * result + ((getSaleOrder() == null) ? 0 : getSaleOrder().hashCode());
        result = prime * result + ((getSaleInitialDate() == null) ? 0 : getSaleInitialDate().hashCode());
        result = prime * result + ((getSaleReturnDate() == null) ? 0 : getSaleReturnDate().hashCode());
        result = prime * result + ((getSaleIsreturn() == null) ? 0 : getSaleIsreturn().hashCode());
        result = prime * result + ((getSaleHarvestDate() == null) ? 0 : getSaleHarvestDate().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        return result;
    }
}
