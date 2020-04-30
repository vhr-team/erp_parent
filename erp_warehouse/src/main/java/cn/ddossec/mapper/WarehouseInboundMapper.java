package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseInbound;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseInbound)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:41
 */
public interface WarehouseInboundMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseInbound queryById(Integer id);

    /**
     * 查询入库单
     *
     * @param checkTag 入库审核状态
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseInbound> queryInboundLimit(@Param("checkTag") String checkTag, @Param("offset") int offset, @Param("limit") int limit);


    /**
     * 入库申请登记
     *
     * @param warehouseInbound 实例对象
     * @return 主键id
     */
    int insertWarehousing(WarehouseInbound warehouseInbound);

    /**
     * 入库申请审核
     *
     * @param check_tag 入库标志 0待审核 1复核不通过 2复核通过
     * @param check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    int updateWarehousing(@Param("check_tag") String check_tag,@Param("check_time") Date check_time,@Param("checker") String checker,@Param("inbound_id") String inbound_id);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}