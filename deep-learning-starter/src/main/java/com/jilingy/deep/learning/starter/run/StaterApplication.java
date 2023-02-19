package com.jilingy.deep.learning.starter.run;

import cn.hutool.extra.spring.EnableSpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.jilingy.deep.learning"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement
@EnableSpringUtil
public class StaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaterApplication.class, args);
    }

}
