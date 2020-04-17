package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author 唐疑豪
 * @title: PermissionsApp
 * @projectName erp_parent
 * @description: 权限模块
 * @date 2020-04-1321:16
 */
@SpringBootApplication
// mapper接口的扫描
@MapperScan(basePackages = {"cn.ddossec.mapper"})
// 开启Redis缓存
@EnableCaching
// 服务发现
//@EnableDiscoveryClient
public class PermissionsApp {
    public static void main(String[] args) {
        SpringApplication.run(PermissionsApp.class, args);
    }
}
