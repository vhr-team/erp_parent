package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Notice;
import cn.ddossec.vo.NoticeVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 30315
 * @title: NoticeService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2111:42
 */
public interface NoticeService extends IService<Notice> {
    DataGridView queryAllNotice(NoticeVo noticeVo);
}
