package cn.ddosec.sale.pojo;

import java.io.Serializable;
import java.util.Date;

public class sale_order implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单序号
     */
    private Integer id;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 订单详细ID
     */
    private String orderDetailId;
    /**
     * 买家名称
     */
    private String buyerName;
    /**
     * 买家电话
     */
    private String buyerPhone;
    /**
     * 买家地址
     */
    private String buyerAddress;
    /**
     * 创建日期
     */
    private Date orderCreateDate;
    /**
     * 更改日期
     */
    private String orderUpdateDate;
    /**
     * 订单总金额
     */
    private Double orderPrice;
    /**
     * 支付状态(待支付,取消支付,已支付)
     */
    private String orderPriceStatus;
    /**
     * 订单状态(进行中,已完成)
     */
    private String orderStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId == null ? null : orderDetailId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone == null ? null : buyerPhone.trim();
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public String getOrderUpdateDate() {
        return orderUpdateDate;
    }

    public void setOrderUpdateDate(String orderUpdateDate) {
        this.orderUpdateDate = orderUpdateDate == null ? null : orderUpdateDate.trim();
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderPriceStatus() {
        return orderPriceStatus;
    }

    public void setOrderPriceStatus(String orderPriceStatus) {
        this.orderPriceStatus = orderPriceStatus == null ? null : orderPriceStatus.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderDetailId=").append(orderDetailId);
        sb.append(", buyerName=").append(buyerName);
        sb.append(", buyerPhone=").append(buyerPhone);
        sb.append(", buyerAddress=").append(buyerAddress);
        sb.append(", orderCreateDate=").append(orderCreateDate);
        sb.append(", orderUpdateDate=").append(orderUpdateDate);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderPriceStatus=").append(orderPriceStatus);
        sb.append(", orderStatus=").append(orderStatus);
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
        sale_order other = (sale_order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
                && (this.getOrderDetailId() == null ? other.getOrderDetailId() == null : this.getOrderDetailId().equals(other.getOrderDetailId()))
                && (this.getBuyerName() == null ? other.getBuyerName() == null : this.getBuyerName().equals(other.getBuyerName()))
                && (this.getBuyerPhone() == null ? other.getBuyerPhone() == null : this.getBuyerPhone().equals(other.getBuyerPhone()))
                && (this.getBuyerAddress() == null ? other.getBuyerAddress() == null : this.getBuyerAddress().equals(other.getBuyerAddress()))
                && (this.getOrderCreateDate() == null ? other.getOrderCreateDate() == null : this.getOrderCreateDate().equals(other.getOrderCreateDate()))
                && (this.getOrderUpdateDate() == null ? other.getOrderUpdateDate() == null : this.getOrderUpdateDate().equals(other.getOrderUpdateDate()))
                && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
                && (this.getOrderPriceStatus() == null ? other.getOrderPriceStatus() == null : this.getOrderPriceStatus().equals(other.getOrderPriceStatus()))
                && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderDetailId() == null) ? 0 : getOrderDetailId().hashCode());
        result = prime * result + ((getBuyerName() == null) ? 0 : getBuyerName().hashCode());
        result = prime * result + ((getBuyerPhone() == null) ? 0 : getBuyerPhone().hashCode());
        result = prime * result + ((getBuyerAddress() == null) ? 0 : getBuyerAddress().hashCode());
        result = prime * result + ((getOrderCreateDate() == null) ? 0 : getOrderCreateDate().hashCode());
        result = prime * result + ((getOrderUpdateDate() == null) ? 0 : getOrderUpdateDate().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderPriceStatus() == null) ? 0 : getOrderPriceStatus().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        return result;
    }
}
