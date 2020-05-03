package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseInbound;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseInbound)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:41
 */
public interface WarehouseInboundMapper extends BaseMapper<WarehouseInbound> {

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


}