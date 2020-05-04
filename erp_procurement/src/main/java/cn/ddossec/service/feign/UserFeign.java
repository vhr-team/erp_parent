package cn.ddossec.service.feign;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "permissions-provider")
public interface UserFeign {

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/user/loadAllUserNoQuery")
    public List<User> loadAllUser();

    /**
     * 根据部门ID查询员工
     *
     * @param deptid
     * @return
     */
    @RequestMapping("/user/queryUserByDeptId")
    public DataGridView queryUserByDeptId(@RequestParam Integer deptid);

}