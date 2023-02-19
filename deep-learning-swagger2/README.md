## 集成Swagger2

SpringBoot集成MyBatis做DAO层，并使用mybatis-plus框架来简化对MyBatis的操作。

## 简介

1. Swagger 是一种规范。
2. springfox-swagger2 是基于 Spring 生态系统的该规范的实现。
3. springfox-swagger-ui 是对 swagger-ui 的封装，使其可以使用 Spring 的服务。
4. Knife4j是一个集Swagger2 和 OpenAPI3 为一体的增强解决方案(简而言之就是比swagger2更好看)

## 使用方法
现在项目保留的是最好看的使用Knife4j, 想要尝试swagger2增强版ui以及swagger2普通版ui可以按照以下方式进行适配.

## 使用Knife4j()
配置使用com.jilingy.deep.learning.swagger2.config.Knife4jConfiguration.class文件

依赖仅使用:
```xml
<dependency>
    <groupId>com.github.xiaoymin</groupId>
    <artifactId>knife4j-spring-boot-starter</artifactId>
    <version>2.0.9</version>
</dependency>
```
启动类上加上
```java
@EnableKnife4j
```

测试是否成功的网址: http://localhost:8080/doc.html

## 使用基础版swagger2
配置使用com.jilingy.deep.learning.swagger2.config.SwaggerConfig.class文件

依赖仅使用:
```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
    <scope>compile</scope>
</dependency>
```

启动类上加上
```java
@EnableSwagger2
```

测试是否成功的网址: http://localhost:8080/swagger-ui.html

## 使用增强版swagger2
配置使用com.jilingy.deep.learning.swagger2.config.SwaggerConfig.class文件

依赖仅使用:
```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
    <scope>compile</scope>
</dependency>
<!-- swagger增强ui的关键依赖 -->
<dependency>
    <groupId>com.github.xiaoymin</groupId>
    <artifactId>swagger-bootstrap-ui</artifactId>
    <version>1.9.6</version>
</dependency>
```

启动类上加上
```java
@EnableSwagger2
```

测试是否成功的网址: http://localhost:8080/doc.html

## 许可证

@Todo
