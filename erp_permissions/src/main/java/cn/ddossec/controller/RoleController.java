package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Role;
import cn.ddossec.service.RoleService;
import cn.ddossec.vo.RoleVo;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询角色
     *
     * @param roleVo
     * @return
     */
    @RequestMapping("/loadAllRole")
    public Object loadAllRole(RoleVo roleVo) {
        return this.roleService.queryAllRole(roleVo);
    }

    /**
     * 添加角色
     */
    @PostMapping("/addRole")
    public ResultObj addRole(Role role) {
        try {
            role.setCreatetime(new Date());
            role.setAvailable(Constant.AVAILABLE_TRUE);
            this.roleService.saveRole(role);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 根据角色ID查询角色拥有的菜单和权限ID
     *
     * @param id 角色ID
     */
    @RequestMapping("queryMenuIdsByRid")
    public Object queryMenuIdsByRid(Integer id) {
        List<Integer> mids = this.roleService.queryMenuIdsByRid(id);
        return new DataGridView(mids);
    }

    /**
     * 保存角色和菜单权限之间的关系
     */
    @RequestMapping("saveRoleMenu")
    public ResultObj saveRoleMenu(Integer rid, Integer[] mids) {
        try {
            this.roleService.saveRoleMenu(rid, mids);
            return ResultObj.DISPATCH_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DISPATCH_ERROR;
        }
    }

    /**
     * 修改角色
     */
    @PostMapping("/updateRole")
    public ResultObj updateRole(Role role) {
        try {
            this.roleService.updateRole(role);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }


    /**
     * 删除
     */
    @RequestMapping("/deleteRole")
    public ResultObj deleteRole(Integer id) {
        try {
            this.roleService.removeById(id);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 查询所有可用的角色
     *
     * @param roleVo
     * @return
     */
    @RequestMapping("/loadAllAvailableRoleNoPage")
    public Object loadAllAvailableRoleNoPage(RoleVo roleVo) {
        roleVo.setAvailable(Constant.AVAILABLE_TRUE);
        return this.roleService.loadAllAvailableRoleNoPage(roleVo);
    }
}
