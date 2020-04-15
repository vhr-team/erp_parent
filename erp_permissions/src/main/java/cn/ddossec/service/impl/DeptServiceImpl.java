package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.vo.DeptVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.DeptMapper;
import cn.ddossec.domain.Dept;
import cn.ddossec.service.DeptService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 30315
 * @title: DeptServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-147:25
 */
@Service
@Transactional
@Slf4j
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
    @Override
    @Cacheable(cacheNames = "cn.ddossec.service.impl.DeptServiceImpl", key = "#id")
    public Dept getById(Serializable id) {
        return super.getById(id);
    }

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public DataGridView queryAllDept(DeptVo deptVo) {
        // 设置查询条件
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.like(StringUtils.isNotBlank(deptVo.getTitle()), "title", deptVo.getTitle());
        qw.orderByAsc("ordernum");

        List<Dept> depts = this.deptMapper.selectList(qw);
        return new DataGridView(Long.valueOf(depts.size()), depts);
    }

    @Override
    public Integer queryDeptMaxOrderNum() {
        return this.deptMapper.queryDeptMaxOrderNum();
    }

    @Override
    @CachePut(cacheNames = "cn.ddossec.service.impl.DeptServiceImpl", key = "#result.id")
    public Dept saveDept(Dept dept) {
        this.deptMapper.insert(dept);
        return dept;
    }

    @Override
    @CachePut(cacheNames = "cn.ddossec.service.impl.DeptServiceImpl", key = "#result.id")
    public Dept updateDept(Dept dept) {
        this.deptMapper.updateById(dept);
        return dept;
    }

    @Override
    public Integer queryDeptChildrenCountById(Integer id) {
        return this.deptMapper.queryDeptChildrenCountById(id);
    }

    @Override
    @CacheEvict(cacheNames = "cn.ddossec.service.impl.DeptServiceImpl", key = "#id")
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }
}
