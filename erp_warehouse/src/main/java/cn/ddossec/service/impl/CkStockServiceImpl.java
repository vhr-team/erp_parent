package cn.ddossec.service.impl;

import cn.ddossec.domain.CkStock;
import cn.ddossec.mapper.CkStockMapper;
import cn.ddossec.service.CkStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (CkStock)表服务实现类
 *
 * @author makejava
 * @since 2020-04-17 18:19:59
 */
@SuppressWarnings("all")
@Service("ckStockServiceImpl")
public class CkStockServiceImpl implements CkStockService {
    @Autowired
    private CkStockMapper ckStockMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CkStock queryById(Integer id) {
        return this.ckStockMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CkStock> queryAllByLimit(int offset, int limit) {
        return this.ckStockMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ckStock 实例对象
     * @return 实例对象
     */
    @Override
    public CkStock insert(CkStock ckStock) {
        this.ckStockMapper.insert(ckStock);
        return ckStock;
    }

    /**
     * 修改数据
     *
     * @param ckStock 实例对象
     * @return 实例对象
     */
    @Override
    public CkStock update(CkStock ckStock) {
        this.ckStockMapper.update(ckStock);
        return this.queryById(ckStock.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ckStockMapper.deleteById(id) > 0;
    }
}