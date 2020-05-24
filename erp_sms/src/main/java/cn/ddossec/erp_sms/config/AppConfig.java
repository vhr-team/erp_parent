package cn.ddossec.erp_sms.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

/**
 * ClassName: AppConfig <br/>
 * Description: <br/>
 * date: 2020/5/24 19:40<br/>
 *
 * @author ccsert<br />
 * @since JDK 1.8
 */
@Configuration
@EnableJms
public class AppConfig {

    public ConnectionFactory connectionFactory() {

        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://xhh.ddos-sec.cn:61617");
        connectionFactory.setUserName("admin");
        connectionFactory.setPassword("admin");
        return connectionFactory;
    }

    @Bean
    public javax.jms.Connection activeConnection() throws JMSException {
        ConnectionFactory connectionFactory = this.connectionFactory();

        return connectionFactory.createConnection();
    }

    @Bean
    public DefaultJmsListenerContainerFactory jmsTopicListenerContainerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory());
        factory.setPubSubDomain(true);
        factory.setRecoveryInterval(1000L);
        return factory;
    }

    @Bean
    public JmsListenerContainerFactory jmsMessageListenerContainerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory());
        return factory;
    }
}
