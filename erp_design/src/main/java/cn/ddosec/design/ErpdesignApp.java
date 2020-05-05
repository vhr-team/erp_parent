package cn.ddosec.design;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:18
 */
@SpringBootApplication
// 服务发现
@EnableDiscoveryClient
@EnableFeignClients //启用Feign
@MapperScan("cn.ddosec.design.mapper")
public class ErpdesignApp {
    public static void main(String[] args) {
        SpringApplication.run(ErpdesignApp.class, args);
    }
}
