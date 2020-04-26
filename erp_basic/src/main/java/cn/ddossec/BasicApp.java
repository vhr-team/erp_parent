package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 孙志贤，唐疑豪
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.ddossec.mapper"})
@EnableFeignClients
@EnableDiscoveryClient
public class BasicApp {

    public static void main(String[] args) {
        SpringApplication.run(BasicApp.class, args);

    }
}


