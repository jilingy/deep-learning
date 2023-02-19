package com.jilingy.deep.learning.swagger2;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.jilingy.deep.learning"} )
@EnableKnife4j
//@EnableSwagger2
public class SwaggerApplication  {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

}
