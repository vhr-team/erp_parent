package cn.ddossec.realm;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.domain.User;
import cn.ddossec.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class UserRealm extends AuthorizingRealm {


    @Autowired
    @Lazy
    private UserService userService;

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName=token.getPrincipal().toString();
        User user = this.userService.queryUserByLoginName(userName);
        if(null!=user){
            ActiveUser activeUser = new ActiveUser();
            activeUser.setUser(user);
            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(activeUser,user.getPwd(), ByteSource.Util.bytes(user.getSalt()),getName());
            return info;
        }
        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
