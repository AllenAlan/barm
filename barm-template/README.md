# demo项目 
## 简介
<img src="https://s2.ax1x.com/2020/03/01/3c249U.png" alt="3c249U.png" title="3c249U.png" />
<p align="left">
    <a href="http://ilovey.live"><img alt="Author" src="https://img.shields.io/badge/author-AllenAlan-blue.svg"/></a>
    <a><img alt="JDK" src="https://img.shields.io/badge/JDK-1.8-orange.svg"/></a>
</p>

> 提供一站式分布式项目模板.欢迎交流学习~
## Directory Structure
```
archetypes
|-- archetypes-api      jar文件 API二方包
|-- archetypes-core     jar文件 核心业务层
|-- archetypes-data     jar文件 持久层
|-- archetypes-server   jar文件 provider,发布的web服务
|-- archetypes-util     jar文件 工具包
`-- pom.xml            maven 发布文件
```

## Options
- framework 
   > Springboot 2.2.4
- ORM
   > MybatisPlus  
- DB 
   > MySQL
- 属性转换
   > mapstruct
## Quick Start
说明文档 [instructions](/INSTRUCTIONS.md)

## Features
- [x] MybatisPlus集成 
    - [x] 通用增改
    - [x] 统一逻辑删
    - [x] 分页查询
- [x] 异常统一处理
- [x] 消息体格式统一
- [x] 对象转化
- [x] 基于线程池的异步注解
- [x] 配置注册中心
- [x] 远程调用
 ## TODO
- [ ] 配置缓存
- [ ] 配置消息队列
- [ ] 分布式事务
- [ ] 配置分布式锁
- [ ] 分布式定时任务
- [ ] 配置配置中心
- [ ] 集成token
- [ ] 配置分库分
    ... 未完待续
## CHANGELOG
迭代版本记录 [changelog](/CHANGELOG.md)

## END
> 有任何疑问, 欢迎issues提问