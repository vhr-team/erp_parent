package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.NoticeMapper;
import cn.ddossec.domain.Notice;
import cn.ddossec.service.NoticeService;
/**  
    * @title: NoticeServiceImpl
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-2111:42
    */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService{

}
