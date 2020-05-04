package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 谷辉  杨洪坤
 */

@SpringBootApplication
@EnableDiscoveryClient //nacos服务
@EnableFeignClients //feign
@MapperScan("cn.ddossec.mapper")
public class warehouseApp {
    public static void main(String[] args) {
        SpringApplication.run(warehouseApp.class,args);
    }
}
