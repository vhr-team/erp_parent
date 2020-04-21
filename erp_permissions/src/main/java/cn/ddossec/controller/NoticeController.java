package cn.ddossec.controller;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Notice;
import cn.ddossec.service.NoticeService;
import cn.ddossec.vo.NoticeVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 30315
 * @title: NoticeController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2111:38
 */
@RequestMapping("notice")
@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 查询
     *
     * @param noticeVo
     * @return
     */
    @GetMapping("loadAllNotice")
    public Object loadAllNotice(NoticeVo noticeVo) {
        return this.noticeService.queryAllNotice(noticeVo);
    }

    /**
     * 添加公告
     *
     * @param notice
     * @return
     */
    @PostMapping("addNotice")
    public ResultObj addNotice(Notice notice) {
        try {
            Subject subject = SecurityUtils.getSubject();
            ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
            notice.setOpername(activeUser.getUser().getName());
            notice.setCreatetime(new Date());
            this.noticeService.save(notice);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改公告
     *
     * @param notice
     * @return
     */
    @RequestMapping("updateNotice")
    public ResultObj updateNotice(Notice notice) {
        try {
            this.noticeService.updateById(notice);  //update()  updateSelective()
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping("deleteNotice")
    public ResultObj deleteNotice(Integer id) {
        try {
            this.noticeService.removeById(id);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("batchDeleteNotice")
    public ResultObj batchdeleteNotice(Integer[] ids) {
        try {
            List<Integer> idsList = new ArrayList<>();
            for (Integer id : ids) {
                idsList.add(id);
            }
            this.noticeService.removeByIds(idsList);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

}
