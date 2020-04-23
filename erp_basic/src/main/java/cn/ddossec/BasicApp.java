package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 孙志贤，唐疑豪
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.ddossec.mapper"})
public class BasicApp {

    public static void main(String[] args) {
        SpringApplication.run(BasicApp.class, args);

    }
}



