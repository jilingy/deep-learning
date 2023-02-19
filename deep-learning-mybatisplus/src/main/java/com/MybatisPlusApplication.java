package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: YangJiling
 * @Description: 启动类
 * @date: 2022-11-14
 */
@SpringBootApplication(scanBasePackages = { "com.*" })
@MapperScan("com.jilingy.deep.learning.mybatisplus.repository")
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
