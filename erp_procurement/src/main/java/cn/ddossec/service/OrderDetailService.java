package cn.ddossec.service;

import cn.ddossec.domain.OrderDetail;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface OrderDetailService extends IService<OrderDetail>{

    /**
     * 根据订单ID，查询订单明细
     * @param orderId
     * @return
     */
    List<OrderDetail> getDetailByOrderId(Integer orderId);
}
