package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = {"cn.ddossec.mapper"})
public class BasicApp {

    public static void main(String[] args) {
        SpringApplication.run(BasicApp.class, args);

    }
}



