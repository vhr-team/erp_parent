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
            this.orderModelService.addOrder(orderModel);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 审核订单
     *
     * @param orderModel
     * @return
     */
    @PostMapping("auditOrder")
    public ResultObj auditOrder(@RequestBody OrderModel orderModel) {
        try {
            this.orderModelService.auditOrder(orderModel);
            return ResultObj.AUDIT_SUCCESS;
        } catch (Exception e) {
            return ResultObj.AUDIT_ERROR;
        }
    }

    /**
     * 修改采购单
     * @param orderModel
     * @return
     */
    @PostMapping("updateOrder")
    public ResultObj updateOrder(@RequestBody OrderModel orderModel){
        try {
            this.orderModelService.updateOrder(orderModel);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 查询，所有审核通过的运输单
     * @param vo
     * @return
     */
    @GetMapping("queryAllTaskList")
    public List<OrderModel> queryAllTaskList(OrderModelVo vo){
        return this.orderModelService.queryAllTaskList(vo);
    }
}