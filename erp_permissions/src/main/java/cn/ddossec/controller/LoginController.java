package cn.ddossec.controller;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.common.Constant;
import cn.ddossec.common.MenuTreeNode;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Menu;
import cn.ddossec.domain.User;
import cn.ddossec.service.MenuService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.function.Consumer;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private MenuService menuService;

    /**
     * 用户登陆
     *
     * @param loginname
     * @param password
     * @return
     */
    @RequestMapping("doLogin")
    @ResponseBody
    public ResultObj doLogin(String loginname, String password, HttpServletRequest request) {
        try {
            // 得到主体
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken loginToken = new UsernamePasswordToken(loginname, password);
            subject.login(loginToken);

            String token = subject.getSession().getId().toString();

            // 写入登陆日志

            return new ResultObj(200, "登陆成功", token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return new ResultObj(-1, "用户名或密码不正确");
        }
    }

    // 验证码

    /**
     * 加载所有菜单[顶部菜单左侧菜单]
     *
     * @return
     */
    @RequestMapping("loadIndexMenu")
    @ResponseBody
    public Object loadIndexMenu() {
        // 得到当前登陆的用户
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        User user = activeUser.getUser();

        if (null == user) {
            return null;
        }

        List<Menu> menus = null;

        if (user.getType().equals(Constant.USER_TYPE_SUPER)) {// 超级管理员
            menus = menuService.queryAllMenuForList();
        } else {
            menus = menuService.queryMenuForListByUserId(user.getId());
        }

        List<MenuTreeNode> treeNodes = new ArrayList<>();

        for (Menu m : menus) {
            Boolean spread = m.getSpread() == Constant.SPREAD_TRUE ? true : false;

            treeNodes.add(new MenuTreeNode(m.getId(), m.getPid(), m.getTitle(), m.getHref(), m.getIcon(), spread, m.getTarget(), m.getTypecode()));
        }

        List<MenuTreeNode> nodes = MenuTreeNode.MenuTreeNodeBuilder.build(treeNodes, 0);

        Map<String, Object> res = new HashMap<>();
        for (MenuTreeNode n : nodes) {
            res.put(n.getTypecode(), n);
        }
        return res;
    }

    /**
     * 验证用户是否登陆
     *
     * @return
     */
    @RequestMapping("checkLogin")
    @ResponseBody
    public ResultObj checkLogin() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {// 认证成功
            return ResultObj.IS_LOGIN;
        } else {
            return ResultObj.UN_LOGIN;
        }
    }

}
