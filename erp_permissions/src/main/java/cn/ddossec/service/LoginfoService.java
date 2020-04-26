package cn.ddossec.service;

import cn.ddossec.domain.Loginfo;
import cn.ddossec.vo.LoginfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 30315
 * @title: LoginfoService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2110:24
 */
public interface LoginfoService extends IService<Loginfo> {

    /**
     * 查询所有登录日志
     * @param loginfoVo
     * @return
     */
    DataGridView queryAllLoginfo(LoginfoVo loginfoVo);
}
