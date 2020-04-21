package cn.ddossec.service;

import cn.ddossec.domain.Notice;
import cn.ddossec.vo.NoticeVo;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
    * @title: NoticeService
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-2111:42
    */
public interface NoticeService extends IService<Notice>{

        Object queryAllNotice(NoticeVo noticeVo);
    }
