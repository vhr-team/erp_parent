package cn.ddossec.controller;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.common.Constant;
import cn.ddossec.common.MenuTreeNode;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Loginfo;
import cn.ddossec.domain.Menu;
import cn.ddossec.domain.User;
import cn.ddossec.service.LoginfoService;
import cn.ddossec.service.MenuService;
import cn.ddossec.service.UserService;
import cn.ddossec.vo.RegistObj;
import com.wf.captcha.SpecCaptcha;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private LoginfoService loginfoService;

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @param loginname
     * @param password
     * @return
     */
    @RequestMapping("doLogin")
    @ResponseBody
    public ResultObj doLogin(String loginname, String password, String keyCode, String captcha, HttpServletRequest request) {
        try {
            ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
            String code = opsForValue.get(keyCode);
            if (null == code) {
                return new ResultObj(-1, "验证码过期");
            } else {
                if (code.equalsIgnoreCase(captcha)) {
                    Subject subject = SecurityUtils.getSubject();
                    UsernamePasswordToken loginToken = new UsernamePasswordToken(loginname, password);

                    subject.login(loginToken);

                    String token = subject.getSession().getId().toString();
                    //写入登陆日志
                    ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
                    User user = activeUser.getUser();
                    user.setPwd(null);

                    Loginfo loginfo = new Loginfo();
                    // 设置登录日志信息
                    loginfo.setLoginname(user.getName() + ":" + user.getLoginname());
                    loginfo.setLoginip(request.getRemoteAddr());
                    loginfo.setLogintime(new Date());
                    this.loginfoService.save(loginfo);

                    List<String> permissions = activeUser.getPermissions();
                    Map<String, Object> map = new HashMap<>();
                    map.put("token", token);
                    map.put("permissions", permissions);
                    map.put("usertype", user.getType());
                    map.put("user", user);
                    return new ResultObj(200, "登陆成功", map);
                } else {
                    return new ResultObj(-1, "验证码出错");
                }
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return new ResultObj(-1, "用户或密码不正确");
        }
    }

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

    /**
     * 验证码
     * <p>
     * redis   key value
     */
    @ResponseBody
    @RequestMapping("captcha")
    public ResultObj captcha(HttpServletRequest request, HttpServletResponse response, String codeKey) throws Exception {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);
        specCaptcha.setCharType(2);
        String code = specCaptcha.text().toLowerCase();

        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        opsForValue.set(codeKey, code);
        // 过期时间
        opsForValue.getOperations().expire(codeKey, 60, TimeUnit.SECONDS);

        return new ResultObj(200, specCaptcha.toBase64());
    }

    /**
     * 　　* @描述: 校验验证码
     * 　　* @参数 ${tags}
     * 　　* @返回值 ${return_type}
     * 　　* @throws
     * 　　* @作者: 小灰灰
     * 　　* @时间 2020-05-24 20:59
     */
    @PostMapping("registeredUser")
    @ResponseBody
    public ResultObj registeredUser(@RequestBody RegistObj registObj) {
        try {
            User user = userService.queryUserByLoginName(registObj.getName());
            if (user != null) {
                return new ResultObj(-1, "该用户名已存在！");
            } else {
                // 从Redis 取出 验证码 和用户输入的比较
                String phoneCode = redisTemplate.boundValueOps(registObj.getPhone()).get();
                if (!phoneCode.equals(registObj.getCode())) {
                    return new ResultObj(-1, "验证码错误！");
                }
                this.userService.regist(registObj);
                return new ResultObj(200, "注册成功! ");
            }
        } catch (Exception e) {
            return new ResultObj(-1, "注册失败！");
        }
    }
}
