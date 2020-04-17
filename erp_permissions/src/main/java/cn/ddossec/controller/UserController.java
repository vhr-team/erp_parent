package cn.ddossec.controller;

import cn.ddossec.common.*;
import cn.ddossec.domain.User;
import cn.ddossec.service.UserService;
import cn.ddossec.vo.UserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30315
 * @title: UserController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1417:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loadAllUser")
    public Object loadAllUser(UserVo userVo) {
        return this.userService.loadAllUser(userVo);
    }

    /**
     * 查询用户最大的排序码
     *
     * @return
     */
    @GetMapping("/queryUserMaxOrderNum")
    public Object queryUserMaxOrderNum() {
        Integer maxValue = this.userService.queryUserMaxOrderNum();
        return new DataGridView(maxValue + 1);
    }

    /**
     * 根据部门ID查询员工
     * @param deptid
     * @return
     */
    @RequestMapping("queryUserByDeptId")
    public DataGridView queryUserByDeptId(Integer deptid){
        return new DataGridView(this.userService.queryUserByDeptId(deptid));
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    @RequiresPermissions(value = {"user:add"})
    public ResultObj addUser(User user) {
        try {
            // 设置盐
            user.setSalt(MD5Utils.createUUID());
            user.setType(Constant.USER_TYPE_NORMAL);
            user.setPwd(MD5Utils.md5(Constant.DEFAULT_PWD, user.getSalt(), 2));
            // 可用
            user.setAvailable(Constant.AVAILABLE_TRUE);
            user.setImgpath(Constant.DEFAULT_TITLE_IMAGE);

            this.userService.saveUser(user);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    @RequiresPermissions(value = {"user:update"})
    public ResultObj updateUser(User user) {
        try {
            this.userService.updateUser(user);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 重置用户密码
     *
     * @param id
     * @return
     */
    @PostMapping("/resetUserPwd")
    @RequiresPermissions(value = {"user:reset"})
    public ResultObj resetUserPwd(Integer id) {
        try {
            User user = new User();
            user.setId(id);
            user.setSalt(MD5Utils.createUUID());
            user.setPwd(MD5Utils.md5(Constant.DEFAULT_PWD, user.getSalt(), 2));

            this.userService.updateUser(user);
            return ResultObj.RESET_ERROR;
        } catch (Exception e) {
            return ResultObj.RESET_ERROR;
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteUser")
    @RequiresPermissions(value = {"user:delete"})
    public ResultObj deleteUser(Integer id) {
        try {
            this.userService.LogicToDelete(id);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 保存用户和角色之间的关系
     */
    @RequestMapping("/saveUserRole")
    @RequiresPermissions(value = {"user:assignroles"})
    public ResultObj saveUserRole(Integer uid, Integer[] rids) {
        try {
            this.userService.saveUserRole(uid, rids);
            return ResultObj.DISPATCH_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DISPATCH_ERROR;
        }
    }

    /**
     * 查询当前登录的用户
     *
     * @return
     */
    @GetMapping("/getCurrentUser")
    public Object getCurrentUser() {
        ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject().getPrincipal();
        return new DataGridView(activeUser.getUser());
    }

    /**
     * 根据用户ID查询用户对象
     * @param userId
     * @return
     */
    @RequestMapping("loadUserByUserId")
    public DataGridView loadUserByUserId(Integer userId){
        User user = this.userService.getById(userId);
        return new DataGridView(user);
    }
}
