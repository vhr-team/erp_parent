package cn.ddoesc.production;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author joker_dj
 * @create 2020-05-25日 2:26
 */
@SpringBootApplication
@EnableDiscoveryClient//服务发现
@EnableFeignClients//feign调用
@MapperScan("cn.ddoesc.production.mapper")
public class production_two {
    public static void main(String[] args) {
        SpringApplication.run(production_two.class,args);
    }
}
