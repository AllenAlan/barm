# INSTRUCTIONS
## 拉取代码
> git clone https://github.com/allennotes/archetypes
## 构建数据库
数据库名：demo， 字符集：utf8mb4
## 修改配置application.yaml文件
```yaml
spring:
  datasource:
    url: jdbc:mysql://192.168.31.219:3306/数据库名?useSSL=false&useUnicode=true&characterEncoding=UTF-8
    driver-class-name: com.mysql.jdbc.Driver
    username: 用户名
    password: 密码
```
## 启动项目
> 直接运行archetypes-server下的ServerApplication.java文件即可