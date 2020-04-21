package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.SysNoticeMapper;
import cn.ddossec.domain.SysNotice;
import cn.ddossec.service.SysNoticeService;
/**  
    * @title: SysNoticeServiceImpl
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-2111:34
    */
@Service
public class SysNoticeServiceImpl extends ServiceImpl<SysNoticeMapper, SysNotice> implements SysNoticeService{

}
