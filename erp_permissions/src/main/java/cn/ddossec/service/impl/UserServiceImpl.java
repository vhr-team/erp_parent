package cn.ddossec.service.impl;

import cn.ddossec.domain.User;
import cn.ddossec.mapper.UserMapper;
import cn.ddossec.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.val;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private Log log = LogFactory.getLog(UserServiceImpl.class);

    @Override
    public User queryUserByLoginName(String loginname) {
        UserMapper userMapper = this.getBaseMapper();
        QueryWrapper<User> qw = new QueryWrapper<>();
        if(StringUtils.isBlank(loginname)){
            // 打日志
            log.error("登陆名不能为空");
            return null;
        }
        qw.eq("loginname", loginname);
        User user = userMapper.selectOne(qw);
        return user;
    }
}
