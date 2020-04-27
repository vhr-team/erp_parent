package cn.ddossec.service.feign;

import cn.ddossec.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "permissions-provider")
public interface UserFeign {

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/user/loadAllUserNoQuery")
    public List<User> loadAllUser();

}