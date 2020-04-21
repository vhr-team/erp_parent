package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.LoginfoMapper;
import cn.ddossec.domain.Loginfo;
import cn.ddossec.service.LoginfoService;
/**  
    * @title: LoginfoServiceImpl
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-2110:24
    */
@Service
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements LoginfoService{

}
