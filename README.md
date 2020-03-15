# MiniProgram-server-JAVA

这里是NCOV 2020疫情防控-人员健康管理平台开源项目的小程序后端--Java版本。

主项目入口 >> https://github.com/2020NCOV/ncov-report

**数据库表结构与主项目保持一致** 

数据库文件位置 >> https://github.com/2020NCOV/ncov-report/tree/master/database

commit前如何与上游仓库同步？>> [本地及远程仓库如何与上游仓库保持一致](https://github.com/msq0313/MiniProgram-server-JAVA/blob/master/Git_tour.md)

## 项目导航

[MiniProgram-server-JAVA](#MiniProgram-server-JAVA)

- [项目导航](#项目导航)
- [项目结构](#项目结构)
- [本地配置](#本地配置)

## 项目结构

#### （1）代码层的结构

##### 　　根目录：src/main/java/miniprogram/server

　　　　1.工程启动类(ServerApplication.java)置于miniprogram.server

　　　　2.实体类(Beans)置于miniprogram.server.beans

　　　　3.数据访问层(Mapper)置于miniprogram.server.mapper

　　　　4.数据服务层(Service)置于miniprogram.server.service

　　　　5.前端控制器(Controller)置于miniprogram.server.controller

　　　　6.工具类(utils)置于miniprogram.server.utils

　　　　7.常量接口类(constant)置于miniprogram.server.constant

　　　　8.配置信息类(config)置于miniprogram.server.config

　　　　9.数据传输类(vo)置于miniprogram.server.vo

#### （2）资源文件的结构

##### 　　根目录：src/main/resources

　　　　1.配置文件(.yaml/.json等)置于config文件夹下

　　　　2.国际化(i18n))置于i18n文件夹下

　　　　3.spring.xml置于META-INF/spring文件夹下

　　　　4.页面以及js/css/image等置于static文件夹下的各自文件下

## 本地配置

### 1.导入IDEA

IDE根据pom.xml自动导入依赖

### 2.修改配置文件

src/main/resources/application.properties

~~~
# 根据项目情况修改

# 配置api端口号

server.port=8080

# 连接数据库

spring.datasource.url=jdbc:mysql://localhost:3306/数据库名?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true
spring.datasource.username=数据库用户名名
spring.datasource.password=数据库密码
~~~

### 3.配置小程序参数

目前变量位置在：controller/LoginController，以后会加入到配置文件中。

~~~
String appid  = "自己的小程序appid";
String secret = "自己的小程序secret";
~~~

### 4.运行ServerApplication

浏览器中输入http://localhost:8080/index

可返回 MiniProgram-server-JAVA 即成功运行

### 5.小程序联调

打开小程序开发工具，导入项目

小程序项目地址：https://github.com/2020NCOV/ncov-report-mini-program-server

修改小程序端的baseURL,在/ncov-report-mini-program/util/config.js文件中

~~~
const baseURL = 'http://127.0.0.1:8080/index'; //这表示小程序访问的是本机的8080端口，正是后端程序监听的端口
~~~

- 编译运行小程序
- 打开调试器，点击network
- 查看小程序发出的请求getcode，如果返回status code是200ok则表示前后端通信成功，并可查看response内容
- 可正常进行注册登录，解绑信息等操作。



**目前已实现大部分接口，getall接口（获取数据库城市列表并返回）未实现。项目开发仍在进行，各接口仍需完善，欢迎朋友们共同参与开发！**