# INSTRUCTIONS
## 拉取代码
> git clone https://github.com/allennotes/archetypes
## 构建数据库
数据库名: barm-archetypes, 字符集: utf8mb4
运行[sql](/archetypes-data/src/main/resources/sql) 的所有sql文件
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
1. 启动nacos
> 参考
- [Nacos安装教程](https://www.cnblogs.com/allennote/articles/12459881.html)
- [使用docker部署nacos](https://www.cnblogs.com/allennote/articles/12459907.html)
2. 启动tree
3. 启动archetypes