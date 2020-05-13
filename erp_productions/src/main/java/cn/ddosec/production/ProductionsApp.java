package cn.ddosec.production;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author joker_dj
 * @create 2020-05-12日 8:49
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("cn.ddosec.production.mapper")
public class ProductionsApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductionsApp.class,args);
    }
}
