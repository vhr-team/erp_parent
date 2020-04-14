package cn.ddossec.controller;

import cn.ddossec.service.UserService;
import cn.ddossec.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
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

}
