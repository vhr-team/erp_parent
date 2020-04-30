package cn.ddosec.sale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author joker_dj
 * @create 2020-04-27日 13:37
 */
@SpringBootApplication
@MapperScan("cn.ddosec.sale.mapper")
public class saleApp {
    public static void main(String[] args) {
        SpringApplication.run(saleApp.class, args);
    }
}
