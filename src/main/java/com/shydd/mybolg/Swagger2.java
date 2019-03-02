package com.shydd.mybolg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * 功能描述: Swagger2 配置类
 *
 * @param:
 * @return:
 * @auther: Superman
 * @date: 2019/3/2 22:25
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
//                api信息 调用私有类方法
                .apiInfo(apiInfo())
//                选择api
                .select()
//                请求处理的程序
                .apis(RequestHandlerSelectors.basePackage("com.shydd.bolg"))
//                路径
                .paths(PathSelectors.any())
//                执行
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
//                标题
                .title("shydd个人博客地址RESTful APIs")
//                描述
                .description("原文地址链接：http://blog.didispace.com/springbootswagger2/")
//                服务器网址
                .termsOfServiceUrl("http://blog.didispace.com/")
//                联系人
                .contact("@深海鱼dandan")
//                版本
                .version("1.0.0")
//                建立
                .build();

    }
}
