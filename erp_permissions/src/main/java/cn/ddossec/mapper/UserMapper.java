package cn.ddossec.mapper;

import cn.ddossec.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    Integer queryUserMaxOrderNum();

    void saveUserRole(@Param("uid") Integer uid, @Param("rid") Integer rid);
}
