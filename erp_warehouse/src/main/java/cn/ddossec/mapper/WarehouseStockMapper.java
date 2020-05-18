package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseStock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseStock)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
public interface WarehouseStockMapper extends BaseMapper<WarehouseStock> {

    /**
     * 通过库存编号修改安全库存配置
     * @param minAmount 库存报警下限
     * @param maxAmount 库存报警上限
     * @param maxCapacityAmount 最大存储量
     * @param Id 序号
     */
    void updateAmount(@Param("minAmount") Integer minAmount,@Param("maxAmount") Integer maxAmount,@Param("maxCapacityAmount") Integer maxCapacityAmount,@Param("Id") Integer Id);

    /**
     * 通过序号删除数据
     *
     * @param id 序号
     */
    int deleteByProductId(Integer id);

}