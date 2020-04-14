package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.ResultObj;
import cn.ddossec.service.RoleService;
import com.sxt.system.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: 0812erp
 * @author: 雷哥
 * @create: 2020-01-06 16:24
 **/
@RestController
@RequestMapping("role")
public class RoleController {


    @Autowired
    private RoleService roleService;


    /**
     * 查询角色
     * @param roleVo
     * @return
     */
    @RequestMapping("loadAllRole")
    public Object loadAllRole(RoleVo roleVo){
        return this.roleService.queryAllRole(roleVo);
    }





    /**
     * 添加角色
     */
    @PostMapping("addRole")
    public ResultObj addRole(Role role){
        try {
            role.setCreatetime(new Date());
            role.setAvailable(Constant.AVAILABLE_TRUE);
            this.roleService.saveRole(role);
            return ResultObj.ADD_SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改角色
     */
    @PostMapping("updateRole")
    public ResultObj updateRole(Role role){
        try {
            this.roleService.updateRole(role);
            return ResultObj.UPDATE_SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }


    /**
     * 删除
     */
    @RequestMapping("deleteRole")
    public ResultObj deleteRole(Integer id){
        try {
            this.roleService.removeById(id);
            return ResultObj.DELETE_SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

}
