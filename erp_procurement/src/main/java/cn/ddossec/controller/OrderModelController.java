package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.service.OrderModelService;
import cn.ddossec.vo.OrderModelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单控制器
 */
@RestController
@RequestMapping("ordermodel")
public class OrderModelController {

    @Autowired
    private OrderModelService orderModelService;

    /**
     * 查询所有订单，可以带条件，分页查询
     * @param orderModelVo
     * @return
     */
    @GetMapping("queryAllOrderModel")
    public DataGridView queryAllOrderModel(OrderModelVo orderModelVo){
        return this.orderModelService.queryAllOrderModel(orderModelVo);
    }

}