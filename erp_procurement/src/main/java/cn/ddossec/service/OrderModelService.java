package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.OrderModel;
import cn.ddossec.vo.OrderModelVo;
import com.baomidou.mybatisplus.extension.service.IService;

public interface OrderModelService extends IService<OrderModel> {

    /**
     * 查询所有订单，可以带条件，分页查询
     * @param orderModelVo
     * @return
     */
    DataGridView queryAllOrderModel(OrderModelVo orderModelVo);

    /**
     * 添加采购单
     * @param orderModel
     */
    void addOrder(OrderModel orderModel);

    /**
     * 审核订单
     * @param orderModel
     */
    void auditOrder(OrderModel orderModel);

    /**
     * 修改采购单
     * @param orderModel
     */
    void updateOrder(OrderModel orderModel);

    /**
     * 查询，所有审核通过的运输单
     * @param vo
     * @return
     */
    DataGridView queryAllTaskList(OrderModelVo vo);

    /**
     * 任务指派
     * @param orderModel
     */
    void tranOrderAssginOrder(OrderModel orderModel);
}
