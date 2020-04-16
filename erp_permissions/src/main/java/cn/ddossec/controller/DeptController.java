package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Dept;
import cn.ddossec.service.DeptService;
import cn.ddossec.vo.DeptVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 唐颖豪
 * @title: DeptController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-147:29
 */
@RestController
@RequestMapping("/dept")
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询部门
     *
     * @param deptVo
     * @return
     */
    @GetMapping("/loadAllDept")
    public Object loadAllDept(DeptVo deptVo) {
        return this.deptService.queryAllDept(deptVo);
    }

    /**
     * 查询部门最大的排序码
     */
    @GetMapping("/queryDeptMaxOrderNum")
    public Object queryDeptMaxOrderNum() {
        Integer maxValue = this.deptService.queryDeptMaxOrderNum();
        return new DataGridView(maxValue + 1);
    }


    /**
     * 添加部门
     *
     * @param dept
     * @return
     */
    @PostMapping("/addDept")
    @RequiresPermissions(value = {"dept:add"})
    public ResultObj addDept(Dept dept) {
        try {
            dept.setSpread(Constant.SPREAD_FALSE);
            dept.setAvailable(Constant.AVAILABLE_TRUE);

            this.deptService.saveDept(dept);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改部门
     * 修改—是否展开是否可用
     *
     * @param dept
     * @return
     */
    @PostMapping("/updateDept")
    @RequiresPermissions(value = {"dept:update"})
    public ResultObj updateDept(Dept dept) {
        try {
            this.deptService.updateDept(dept);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 部门修改
     *
     * @param id
     * @return
     */
    @GetMapping("/getDeptById")
    public Object getDeptById(Integer id) {
        return new DataGridView(this.deptService.getById(id));
    }

    /**
     * 根据ID查询，当前部门的子部门的个数
     *
     * @param id
     * @return
     */
    @GetMapping("/getDeptChildrenCountById")
    public Object getDeptChildrenCountById(Integer id) {
        Integer count = this.deptService.queryDeptChildrenCountById(id);
        return new DataGridView(count);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/deleteDept")
    @RequiresPermissions(value = {"dept:delete"})
    public ResultObj deleteDpet(Integer id){
        try{
            this.deptService.removeById(id);
            return ResultObj.DELETE_SUCCESS;
        }catch (Exception e){
            return ResultObj.DELETE_ERROR;
        }
    }

}
