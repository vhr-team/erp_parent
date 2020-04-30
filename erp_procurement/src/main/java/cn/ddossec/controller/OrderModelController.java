package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.OrderModel;
import cn.ddossec.domain.User;
import cn.ddossec.service.OrderModelService;
import cn.ddossec.service.feign.UserFeign;
import cn.ddossec.vo.OrderModelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单控制器
 */
@RestController
@RequestMapping("ordermodel")
public class OrderModelController {

    @Autowired
    private OrderModelService orderModelService;

    @Autowired
    private UserFeign userFeign;

    /**
     * 查询所有订单，可以带条件，分页查询
     *
     * @param orderModelVo
     * @return
     */
    @RequestMapping("queryAllOrderModel")
    public DataGridView queryAllOrderModel(OrderModelVo orderModelVo) {
        return this.orderModelService.queryAllOrderModel(orderModelVo);
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("queryAllUser")
    public List<User> queryAllUser() {
        return userFeign.loadAllUser();
    }

    /**
     * 添加采购单
     *
     * @return
     */
    @PostMapping("addOrder")
    public ResultObj addOrder(@RequestBody OrderModel orderModel) {
        try {
            System.out.println(orderModel);
            this.orderModelService.addOrder(orderModel);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultObj.ADD_ERROR;
        }
    }
}