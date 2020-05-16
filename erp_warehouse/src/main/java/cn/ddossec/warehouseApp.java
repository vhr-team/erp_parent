package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 谷辉  杨洪坤
 */

@SpringBootApplication
@EnableDiscoveryClient //nacos服务
@EnableFeignClients //feign
@EnableTransactionManagement //开启事务
@EnableCaching //开启redis缓存
@MapperScan("cn.ddossec.mapper")
public class warehouseApp {
    public static void main(String[] args) {
        SpringApplication.run(warehouseApp.class,args);
    }
}
