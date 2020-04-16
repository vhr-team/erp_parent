package cn.ddossec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // 启用swagger2
public class Swagger2AutoConfiguration {

    /**
     * 在IOC容器里面创建可以对象可以扫描Controller里面的是否有Swagger相关的注解 如果，swagger会生成相关的文档
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.ddossec"))// 指定扫描包下面的注解
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().description("permissions Api")
                .contact(new Contact("唐颖豪", "http://www.xhh.ddos-sec.cn/", "303158131@qq.com"))
                .version("1.0")
                .license("Leader_TBlog")
                .build();
    }
}
