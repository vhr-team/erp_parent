package cn.ddossec.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 唐颖豪
 * @title: AppUtils
 * @projectName erp_parent
 * @description: 当实现了ApplicationContextAware，IOC容器初始化时会回调setApplicationContext把IOC容器对象转到里面
 * @date 2020-04-1420:33
 */
@Component
public class AppUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
