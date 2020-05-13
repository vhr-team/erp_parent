package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseInbound)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:40
 */
public interface WarehouseInboundService {

    /**
     * 入库管理
     * @param storeTag 入库标志
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryInbound(String storeTag, int page, int limit);


    /**
     * 查询可调度入库数据
     *
     * @param checkTag 入库审核状态
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    DataGridView queryInboundLimit(String checkTag, int page, int limit);

    /**
     * 入库申请登记
     *
     * @param warehouseInbound 实例对象
     * @return 主键id
     */
    void insertWarehousing(WarehouseInbound warehouseInbound);

    /**
     * 入库申请审核
     *
     * @param check_tag 入库标志 0待审核 1复核不通过 2复核通过
     * @param check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    int updateWarehousing(String check_tag,Date check_time,String checker,String inbound_id);


}