package cn.ddossec.erp_sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ErpSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpSmsApplication.class, args);
    }

}