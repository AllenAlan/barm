# tree dubbo分布式ID
## 简介
<img src="https://s2.ax1x.com/2020/03/01/3c249U.png" alt="3c249U.png" title="3c249U.png" />
<p align="left">
    <a href="http://ilovey.live"><img alt="Author" src="https://img.shields.io/badge/author-AllenAlan-blue.svg"/></a>
    <a><img alt="JDK" src="https://img.shields.io/badge/JDK-1.8-orange.svg"/></a>
</p>

> 基于美团Leaf, 为分布式服务提供分布式ID 的高可用服务tree 
## Directory Structure
```
tree
|-- tree-api      jar文件 API二方包
|-- tree-core     jar文件 核心业务层
|-- tree-server   jar文件 provider,发布的web服务
`-- pom.xml       maven 发布文件
```
## Quick Start
说明文档 [instructions](/INSTRUCTIONS.md)

## Features
- [x] 异常统一处理
- [x] 消息体格式统一
- [x] 对象转化
- [x] 基于线程池的异步注解
- [x] 配置注册中心
- [x] 远程调用
  ... 未完待续
## CHANGELOG
迭代版本记录 [changelog](/CHANGELOG.md)

## END
> 有任何疑问, 欢迎issues提问