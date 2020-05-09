package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 孙志贤 曾东东
 * @title: Productionapp
 * @projectName erp-production
 * @description: 生产模块
 * @date 2020-04-17
 */
@SpringBootApplication
@EnableTransactionManagement //事务
// 服务发现
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = {"cn.ddossec.mapper"})
public class Productionapp {
    public static void main(String[] args) {
        SpringApplication.run(Productionapp.class, args);
    }
}
