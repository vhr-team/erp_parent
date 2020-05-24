package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.User;
import cn.ddossec.vo.UserVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<User> {

    /**
     * 根据用户登陆名查询用户信息
     *
     * @param loginname
     * @return
     */
    public User queryUserByLoginName(String loginname);

    DataGridView loadAllUser(UserVo userVo);

    Integer queryUserMaxOrderNum();

    User saveUser(User user);

    User updateUser(User user);

    User LogicToDelete(Integer id);

    void saveUserRole(Integer uid, Integer[] rids);

    public List<User> queryUserByDeptId(Integer deptid);

    List<User> loadAllUser();

    /**
     * 查询领导信息
     * @param mgr
     * @return
     */
    User queryUserById(Integer mgr);

    /*发送短信验证码*/
    public void sendCode(String phone);

    /**
     * 注册用户
     *
     * @param username 用户名
     * @param password 密码
     */
    void regist(String username, String password);
}
