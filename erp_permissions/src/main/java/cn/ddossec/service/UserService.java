package cn.ddossec.service;

import cn.ddossec.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {

    /**
     * 根据用户登陆名查询用户信息
     *
     * @param loginname
     * @return
     */
    public User queryUserByLoginName(String loginname);

}
