# INSTRUCTIONS
## 拉取代码
```bash
git clone https://github.com/allennotes/archetypes
``` 
### 准备美团leaf-core包
1. 拉取 leaf源码
```bash
git clone git@github.com:Meituan-Dianping/Leaf.git
```
2. 修改 pom.xml
```xml
<curator.version>4.0.1</curator.version>
```
3. 打maven包
```bash
cd leaf
mvn clean install -DskipTests
```
## 构建数据库
数据库名: barm-tree, 字符集: utf8mb4
运行DDL
```sql
CREATE DATABASE leaf
CREATE TABLE `leaf_alloc` (
  `biz_tag` varchar(128)  NOT NULL DEFAULT '',
  `max_id` bigint(20) NOT NULL DEFAULT '1',
  `step` int(11) NOT NULL,
  `description` varchar(256)  DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`biz_tag`)
) ENGINE=InnoDB;

insert into leaf_alloc(biz_tag, max_id, step, description) values('leaf-segment-test', 1, 2000, 'Test leaf Segment Mode Get Id')
```
## 修改配置application.yaml文件
修改 所有的ip&port
## 修改leaf.properties文件
## 运行项目
1. 启动nacos
> 参考
- [Nacos安装教程](https://www.cnblogs.com/allennote/articles/12459881.html)
- [使用docker部署nacos](https://www.cnblogs.com/allennote/articles/12459907.html)
2. 启动tree
## 调用
- rpc接口
引入
```xml
<dependency>
    <groupId>com.barm.tree</groupId>
    <artifactId>tree-api</artifactId>
    <version>1.0.0-RELEASE</version>
</dependency>
```
```java
public class IDGenerator {

    @Reference
    private TreeProvider treeProvider;

    @Value("${spring.application.name}")
    private String key;

    public Long leafId(){
        return treeProvider.leafId(key);
    }

    public String leafIdStr(){
        return leafId().toString();
    }

    public List<Long> batchLeafId(Integer size){
        return treeProvider.batchLeafId(key, size);
    }

}
```