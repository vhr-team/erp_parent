package cn.ddossec.mapper;

import cn.ddossec.domain.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
    * @title: DeptMapper
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-147:25
    */
public interface DeptMapper extends BaseMapper<Dept> {
    Integer queryDeptMaxOrderNum();

    Integer queryDeptChildrenCountById(Integer id);
}
