package cn.ddossec.common;

import cn.ddossec.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * @author 30315
 * @title: tool
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-209:16
 */
public class toolUtils {

    /**
     * 获取当前登录的用户
     * @return
     */
    public static User getCurrentUser(){
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        User user = activeUser.getUser();
        return user;
    }

}
