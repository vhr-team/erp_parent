package cn.ddosec.design;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:18
 */
@SpringBootApplication
@MapperScan("cn.ddosec.design.mapper")
public class ErpdesignApp {
    public static void main(String[] args) {
        SpringApplication.run(ErpdesignApp.class, args);
    }
}
