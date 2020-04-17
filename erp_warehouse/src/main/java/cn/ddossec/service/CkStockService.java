package cn.ddossec.service;

import cn.ddossec.domain.CkStock;

import java.util.List;

/**
 * (CkStock)表服务接口
 *
 * @author makejava
 * @since 2020-04-17 18:19:59
 */
public interface CkStockService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CkStock queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CkStock> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ckStock 实例对象
     * @return 实例对象
     */
    CkStock insert(CkStock ckStock);

    /**
     * 修改数据
     *
     * @param ckStock 实例对象
     * @return 实例对象
     */
    CkStock update(CkStock ckStock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}