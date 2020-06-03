package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.OrderDetail;
import cn.ddossec.domain.OrderModel;
import cn.ddossec.domain.User;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.service.OrderModelService;
import cn.ddossec.service.feign.GRNFegin;
import cn.ddossec.service.feign.UserFeign;
import cn.ddossec.vo.OrderModelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @Autowired
    private GRNFegin grnFegin;

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
     *
     * @param orderModel
     * @return
     */
    @PostMapping("updateOrder")
    public ResultObj updateOrder(@RequestBody OrderModel orderModel) {
        try {
            this.orderModelService.updateOrder(orderModel);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 查询，所有审核通过的运输单
     *
     * @param vo
     * @return
     */
    @GetMapping("queryAllTaskList")
    public DataGridView queryAllTaskList(OrderModelVo vo) {
        System.out.println(vo);
        return this.orderModelService.queryAllTaskList(vo);
    }

    /**
     * 加载运输部人员
     *
     * @return
     */
    @GetMapping("loadTransportUsers")
    public DataGridView loadTransportUsers() {
        return this.userFeign.queryUserByDeptId(7);
    }

    /**
     * 任务指派
     *
     * @param orderModel
     * @return
     */
    @PostMapping("tranOrderAssginOrder")
    public ResultObj tranOrderAssginOrder(@RequestBody OrderModel orderModel) {
        try {
            this.orderModelService.tranOrderAssginOrder(orderModel);
            return ResultObj.ASSIGNED_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ASSIGNED_ERROR;
        }
    }

    /**
     * 确认取货
     *
     * @param orderModel
     * @return
     */
    @PostMapping("taskOrderPickGoods")
    public ResultObj taskOrderPickGoods(@RequestBody OrderModel orderModel) {
        try {
            this.orderModelService.taskOrderPickGoods(orderModel);
            return ResultObj.PICKCARGO_SUCCESS;
        } catch (Exception e) {
            return ResultObj.PICKCARGO_ERROR;
        }
    }

    /**
     * 结单
     *
     * @param orderModel
     * @return
     */
    @PostMapping("finishTranOrder")
    public ResultObj finishTranOrder(@RequestBody OrderModel orderModel) {
        try {
            this.orderModelService.finishTranOrder(orderModel);

            List<User> users = this.userFeign.loadAllUser();

            for (User user : users) {
                if(user.getId().equals(orderModel.getCompleter())){
                    orderModel.getUser().setName(user.getName());
                }
            }

            WarehouseInbound warehouseInbound = new WarehouseInbound();
            warehouseInbound.setAmountSum(orderModel.getTotalNum());// 商品总件数
            warehouseInbound.setStorer(orderModel.getUser().getName());// 入库人
            warehouseInbound.setCostPriceSum(orderModel.getTotalPrice());
            warehouseInbound.setReason("采购单入库");//入库理由

            List<OrderDetail> details = orderModel.getDetails();

            List<Integer> list = new ArrayList<>();
            List<String> nameList = new ArrayList<>();
            List<String> produIdList = new ArrayList<>();
            List<Integer> numList = new ArrayList<>();
            List<String> amountUnit = new ArrayList<>();
            List<Double> costPrice = new ArrayList<>();
            List<Double> subtotal = new ArrayList<>();

            for (OrderDetail detail : details) {
                list.add(detail.getOrderDetailId());
                nameList.add(detail.getGoods().getProductname());
                produIdList.add(detail.getGoods().getId()+"");

                /*数量*/
                numList.add(detail.getDetailNum());
                /*单位*/
                amountUnit.add(detail.getGoods().getUnit());
                /*单价*/
                costPrice.add(detail.getGoods().getPrice());

                /*小计*/
                subtotal.add(detail.getDetailNum() * detail.getGoods().getPrice());
            }
            warehouseInbound.setIds(list.toArray(new Integer[list.size()]));
            warehouseInbound.setProductName(nameList.toArray(new String[nameList.size()]));
            warehouseInbound.setProductId(produIdList.toArray(new String[produIdList.size()]));
            warehouseInbound.setAmount(numList.toArray(new Integer[numList.size()]));
            /*单位*/
            warehouseInbound.setAmountUnit(amountUnit.toArray(new String[amountUnit.size()]));
            /*成本单价*/
            warehouseInbound.setCostPrice(costPrice.toArray(new Double[costPrice.size()]));
            /*小计*/
            warehouseInbound.setSubtotal(subtotal.toArray(new Integer[subtotal.size()]));

            System.out.println(warehouseInbound);
            grnFegin.insertWarehousing(warehouseInbound);

            return ResultObj.TRANORDER_SUCCESS;
        } catch (Exception e) {
            return ResultObj.TRANORDER_ERROR;
        }
    }
}
