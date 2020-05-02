package cn.ddossec.controller;

import cn.ddossec.domain.OrderDetail;
import cn.ddossec.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单明细
 */
@RestController
@RequestMapping("orderdetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 根据订单ID，查询订单明细
     *
     * @param orderId
     * @return
     */
    @GetMapping("getDetailByOrderId")
    public List<OrderDetail> getDetailByOrderId(Integer orderId) {
        return this.orderDetailService.getDetailByOrderId(orderId);
    }
}