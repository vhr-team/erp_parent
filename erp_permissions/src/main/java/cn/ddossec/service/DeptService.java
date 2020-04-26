package cn.ddossec.service;

import cn.ddossec.domain.Dept;
import cn.ddossec.vo.DeptVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 30315
 * @title: DeptService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-147:25
 */
public interface DeptService extends IService<Dept> {
    DataGridView queryAllDept(DeptVo deptVo);

    Integer queryDeptMaxOrderNum();

    Dept saveDept(Dept dept);

    Dept updateDept(Dept dept);

    Integer queryDeptChildrenCountById(Integer id);
}
