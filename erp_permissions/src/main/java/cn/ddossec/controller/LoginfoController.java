package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.service.LoginfoService;
import cn.ddossec.vo.LoginfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30315
 * @title: LoginfoController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2110:27
 */
@RestController
@RequestMapping("loginfo")
public class LoginfoController {

    @Autowired
    private LoginfoService loginfoService;

    /**
     * 查询所有登录日志
     * @param loginfoVo
     * @return
     */
    @GetMapping("loadAllLoginfo")
    public DataGridView loadAllLoginfo(LoginfoVo loginfoVo) {
        return this.loginfoService.queryAllLoginfo(loginfoVo);
    }

}
