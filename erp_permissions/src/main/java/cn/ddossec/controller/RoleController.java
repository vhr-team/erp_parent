package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Role;
import cn.ddossec.service.RoleService;
import cn.ddossec.vo.RoleVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/role")
@Slf4j
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
    @RequiresPermissions(value = {"role:add"})
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
    @RequiresPermissions(value = {"role:assignpermissions"})
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
    @RequiresPermissions(value = {"role:update"})
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
    @RequiresPermissions(value = {"role:delete"})
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

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/batchDeleteRole")
    @RequiresPermissions(value = {"role:batchdelete"})
    public ResultObj batchDeleteRole(Integer[] ids){
        try{
            if(null == ids || 0 == ids.length){
                log.error("参数不能为空");
                return ResultObj.DELETE_ERROR;
            }
            Collection<Serializable> idList = new ArrayList<>();
            for (Integer id : ids) {
                idList.add(id);
            }
            this.roleService.removeByIds(idList);
            return ResultObj.DELETE_SUCCESS;
        }catch (Exception e){
            log.error("删除失败");
            return ResultObj.DELETE_ERROR;
        }
    }
}
