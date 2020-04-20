package cn.ddossec.listener;

import cn.ddossec.common.AppUtils;
import cn.ddossec.common.toolUtils;
import cn.ddossec.domain.User;
import cn.ddossec.service.UserService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * @author 30315
 * @title: TaskListenerImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1817:44
 */
public class TaskListenerImpl implements TaskListener {

    private static final long serialVersionUID = 1L;

    @Override
    public void notify(DelegateTask delegateTask) {
        //得到当前用户
        User currentUser = toolUtils.getCurrentUser();
        //取出领导ID
        Integer mgr = currentUser.getMgr();
        //从IOC容器里面取出UserService
        UserService userService = AppUtils.getContext().getBean(UserService.class);
        //3查询领导信息
        User leaderUser = userService.queryUserById(mgr);
        //4,设置办理人
        delegateTask.setAssignee(leaderUser.getName());
    }
}
