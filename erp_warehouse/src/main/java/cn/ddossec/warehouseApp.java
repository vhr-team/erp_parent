package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 谷辉  杨洪坤
 */

@SpringBootApplication
@MapperScan("cn.ddossec.mapper")
public class warehouseApp {
    public static void main(String[] args) {
        SpringApplication.run(warehouseApp.class,args);
    }
}
