package cn.ddossec.erp_sms.listener;

import cn.ddossec.utils.SmsUtil;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * @title: SMSController
 * @projectName erp_parent
 * @描述: TODO
 * @作者: 小灰灰
 * @创建时间 2020-05-2416:58
 */
@Component
public class SMSListener {

    //queue模式的消费者
    @JmsListener(destination = "myqueue", containerFactory = "jmsMessageListenerContainerFactory")
    public void readActiveQueue(Message message) {
        System.out.println(message);
        MapMessage map = (MapMessage) message;
        try {
            SmsUtil.sendSms(map.getString("mobile"),
                    map.getString("template_code"),
                    map.getString("sign_name"),
                    map.getString("param"));
        } catch (JMSException e) {
            e.printStackTrace();
        }
        System.out.println(map);
    }
}