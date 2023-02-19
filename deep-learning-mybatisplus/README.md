## 集成MyBatis-Plus

SpringBoot使用mybatis-plus框架使用Service CRUD接口(未使用原始的 Mapper CRUD接口).

## 安装h2数据库

使用的是2022年最新版本的h2数据库

配置数据库的账号和密码。

## 修改application.properties

修改配置文件，主要是h2的的账号和密码

## 数据库初始化

创建数据库pos，然后执行SQL文件`src/main/resources/db/schema.sql`，创建user表

## 运行测试用例

执行对用户表查的测试用例：`com.jilingy.deep.learning.mybatisplus.SimpleTest.java`


## 许可证

@Todo
