package cn.ddossec.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;

@Component
public class ActiveMqConfig {

    @Autowired
    private Environment env;

    private String mqqueuename;

    private String mqtopicname;

    @Bean
    public ConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL(env.getProperty("spring.activemq.broker-url"));
        connectionFactory.setUserName(env.getProperty("spring.activemq.user"));
        connectionFactory.setPassword(env.getProperty("spring.activemq.password"));
        return connectionFactory;
    }

    @Bean
    public JmsTemplate genJmsTemplate() {
        return new JmsTemplate(connectionFactory());

    }

    @Bean
    public JmsMessagingTemplate jmsMessageTemplate() {
        return new JmsMessagingTemplate(connectionFactory());
    }

    @Bean
    public Queue queue() {
        if (mqqueuename == null) {
            mqqueuename = "myqueue";
        }
        return new ActiveMQQueue(mqqueuename);
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }


    public String getMqqueuename() {
        return mqqueuename;
    }

    public void setMqqueuename(String mqqueuename) {
        this.mqqueuename = mqqueuename;
    }

    public String getMqtopicname() {
        return mqtopicname;
    }

    public void setMqtopicname(String mqtopicname) {
        this.mqtopicname = mqtopicname;
    }
}