//package com.jilingy.deep.learning.swagger2.config;
//
//import io.swagger.annotations.ApiOperation;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
//@Configuration //说明这是一个配置类
//@EnableSwagger2// 该注解开启Swagger2的自动配置
///**
// * @author: YangJiling
// * @Description:
// * @date: 2022-11-09
// */
//public class SwaggerConfig implements WebMvcConfigurer {
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                //加了ApiOperation注解的类，才生成接口文档
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                //包下的类，才生成接口文档
//                .apis(RequestHandlerSelectors.basePackage("com.jilingy.deep.learning.swagger2.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("swagger演示")
//                .description("接口文档描述")
//                .termsOfServiceUrl("https://www.baidu.com")
//                .version("1.0.0")
//                .build();
//    }
//
//}
