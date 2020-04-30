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
}
