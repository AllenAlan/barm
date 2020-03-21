# Barm项目脚手架使用说明

## 将archetype安装到本地

- 在archetype目录下执行, 注意与pom.xml同级

  ```bash
  mvn clean install	
  ```

  



- 执行成功后,执行crawl命令,在本地仓库的根目录生成`archetype-catalog.xml`骨架配置文件:

  ```bash
  mvn archetype:crawl 
  ```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
    xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <archetypes>
    <archetype>
      <groupId>com.barm.archetypes</groupId>
      <artifactId>archetypes-archetype</artifactId>
      <version>1.0.1-RELEASE</version>
      <description>Demo project for Spring Boot</description>
    </archetype>
  </archetypes>
</archetype-catalog>

```

![](https://s1.ax1x.com/2020/03/21/8fpNUx.png)

![](https://s1.ax1x.com/2020/03/21/8fpWPf.png)

## 通过mvn archetype:generate构建项目

从本地archeType模板中创建项目,执行

```bash
mvn archetype:generate -DarchetypeCatalog=local
```

然后依次选择模板序号和groupId,artifactId,version和package信息：

![](https://s2.ax1x.com/2020/03/03/3hFtAS.gif)