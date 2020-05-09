package cn.ddossec.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "permissions-provider")
public interface UserFeign {

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/user/loadAllUserNoQuery")
    public String loadAllUser();
}
