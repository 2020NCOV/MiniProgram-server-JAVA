# MiniProgram-server-JAVA

这里是NCOV 2020疫情防控-人员健康管理平台开源项目的小程序后端--Java版本。

主项目入口 >> https://github.com/2020NCOV/ncov-report

**数据库表结构与主项目保持一致** 

数据库文件位置 >> https://github.com/2020NCOV/ncov-report/tree/master/database

## 项目结构

#### （1）代码层的结构

##### 　　根目录：src/miniprogram/server

　　　　1.工程启动类(ApplicationServer.java)置于miniprogram.server.build包下

　　　　2.实体类(domain)置于miniprogram.server.domain

　　　　3.数据访问层(Dao)置于miniprogram.server.repository

　　　　4.数据服务层(Service)置于miniprogram.server.service,数据服务的实现接口(serviceImpl)至于miniprogram.server.service.impl

　　　　5.前端控制器(Controller)置于miniprogram.server.controller

　　　　6.工具类(utils)置于miniprogram.server.utils

　　　　7.常量接口类(constant)置于miniprogram.server.constant

　　　　8.配置信息类(config)置于miniprogram.server.config

　　　　9.数据传输类(vo)置于miniprogram.server.vo

#### （2）资源文件的结构

##### 　　根目录:src/main/resources

　　　　1.配置文件(.yaml/.json等)置于config文件夹下

　　　　2.国际化(i18n))置于i18n文件夹下

　　　　3.spring.xml置于META-INF/spring文件夹下