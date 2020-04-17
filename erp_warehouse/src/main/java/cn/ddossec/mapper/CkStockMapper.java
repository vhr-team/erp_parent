package cn.ddossec.mapper;

import cn.ddossec.domain.CkStock;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CkStock)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-17 18:20:00
 */
public interface CkStockMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CkStock queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CkStock> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ckStock 实例对象
     * @return 对象列表
     */
    List<CkStock> queryAll(CkStock ckStock);

    /**
     * 新增数据
     *
     * @param ckStock 实例对象
     * @return 影响行数
     */
    int insert(CkStock ckStock);

    /**
     * 修改数据
     *
     * @param ckStock 实例对象
     * @return 影响行数
     */
    int update(CkStock ckStock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}