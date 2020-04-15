package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.MD5Utils;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.User;
import cn.ddossec.service.UserService;
import cn.ddossec.vo.UserVo;
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
     * 添加用户
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser")
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

}
