# 考试报名及考务管理系统

## 1.简介

  本系统主要实现考试报名及考务管理系统的主要功能。系统的开发采用Java与SpringBoot编程环境,以MySQL为数据库，并以IntelliJ IDEA编辑器作为开发平台, 利用SpringBoot微服务框架为基础使用Mybatis作为ORM框架构建系统的数据接口以及实现RESTful风格的路径访问系统资源,同时采用了ThymeLeaf为模板引擎融入自适应UI框架Bootstrap美化用户界面。

  系统采用流行的MVC架构，以角色分类设计开发，主要分为三个部分：考生考试报名系统、考务人员管理系统、考务管理中心系统，通过各个子系统的协作运行，为所有社会考试体系的不同用户提供了定制功能及服务。

## 2.目录结构

doc：文档目录，包含数据库脚本以及流程图

src：源代码目录

=== main：运行代码目录

​        === java：运行代码

​         === resources：资源目录

​                 === static：静态文件目录，js脚本等前端资源

​                 === templates：模板文件目录，前端页面目录

​                 === application.yml：全局配置文件

  === test：测试代码目录

## 3.配置

环境：Windows

IDE：IDEA

语言：Java，HTML，CSS，JavaScript，SQL

框架：SpringBoot+Mybatis

数据库：MySQL

## 4.源代码运行

使用浏览器访问：`localhost:8088/erems/`
