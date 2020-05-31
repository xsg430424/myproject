## 《分布式任务调度平台XXL-JOB》
分布式调度平台XXL-JOB
##	简介
###1.1概述
XXL-JOB是一个轻量级分布式任务调度平台，其核心设计目标是开发迅速、学习简单、轻量级、易扩展。
###1.2特性
•	1、简单：支持通过Web页面对任务进行CRUD操作，操作简单，一分钟上手；
•	2、动态：支持动态修改任务状态、启动/停止任务，以及终止运行中任务，即时生效；
•	3、调度中心HA（中心式）：调度采用中心式设计，“调度中心”基于集群Quartz实现并支持集群部署，可保证调度中心HA；
•	4、执行器HA（分布式）：任务分布式执行，任务"执行器"支持集群部署，可保证任务执行HA；
•	5、注册中心: 执行器会周期性自动注册任务, 调度中心将会自动发现注册的任务并触发执行。同时，也支持手动录入执行器地址；
•	6、弹性扩容缩容：一旦有新执行器机器上线或者下线，下次调度时将会重新分配任务；
•	7、路由策略：执行器集群部署时提供丰富的路由策略，包括：第一个、最后一个、轮询、随机、一致性HASH、最不经常使用、最近最久未使用、故障转移、忙碌转移等；
•	8、故障转移：任务路由策略选择"故障转移"情况下，如果执行器集群中某一台机器故障，将会自动Failover切换到一台正常的执行器发送调度请求。
•	9、阻塞处理策略：调度过于密集执行器来不及处理时的处理策略，策略包括：单机串行（默认）、丢弃后续调度、覆盖之前调度；
•	10、任务超时控制：支持自定义任务超时时间，任务运行超时将会主动中断任务；
•	11、任务失败重试：支持自定义任务失败重试次数，当任务失败时将会按照预设的失败重试次数主动进行重试；其中分片任务支持分片粒度的失败重试；
•	12、任务失败告警；默认提供邮件方式失败告警，同时预留扩展接口，可方面的扩展短信、钉钉等告警方式；
•	13、分片广播任务：执行器集群部署时，任务路由策略选择"分片广播"情况下，一次任务调度将会广播触发集群中所有执行器执行一次任务，可根据分片参数开发分片任务；
•	14、动态分片：分片广播任务以执行器为维度进行分片，支持动态扩容执行器集群从而动态增加分片数量，协同进行业务处理；在进行大数据量业务操作时可显著提升任务处理能力和速度。
•	15、事件触发：除了"Cron方式"和"任务依赖方式"触发任务执行之外，支持基于事件的触发任务方式。调度中心提供触发任务单次执行的API服务，可根据业务事件灵活触发。
•	16、任务进度监控：支持实时监控任务进度；
•	17、Rolling实时日志：支持在线查看调度结果，并且支持以Rolling方式实时查看执行器输出的完整的执行日志；
•	18、GLUE：提供Web IDE，支持在线开发任务逻辑代码，动态发布，实时编译生效，省略部署上线的过程。支持30个版本的历史版本回溯。
•	19、脚本任务：支持以GLUE模式开发和运行脚本任务，包括Shell、Python、NodeJS、PHP、PowerShell等类型脚本;
•	20、命令行任务：原生提供通用命令行任务Handler（Bean任务，"CommandJobHandler"）；业务方只需要提供命令行即可；
•	21、任务依赖：支持配置子任务依赖，当父任务执行结束且执行成功后将会主动触发一次子任务的执行, 多个子任务用逗号分隔；
•	22、一致性：“调度中心”通过DB锁保证集群分布式调度的一致性, 一次任务调度只会触发一次执行；
•	23、自定义任务参数：支持在线配置调度任务入参，即时生效；
•	24、调度线程池：调度系统多线程触发调度运行，确保调度精确执行，不被堵塞；
•	25、数据加密：调度中心和执行器之间的通讯进行数据加密，提升调度信息安全性；
•	26、邮件报警：任务失败时支持邮件报警，支持配置多邮件地址群发报警邮件；
•	27、推送maven中央仓库: 将会把最新稳定版推送到maven中央仓库, 方便用户接入和使用;
•	28、运行报表：支持实时查看运行数据，如任务数量、调度次数、执行器数量等；以及调度报表，如调度日期分布图，调度成功分布图等；
•	29、全异步：任务调度流程全异步化设计实现，如异步调度、异步运行、异步回调等，有效对密集调度进行流量削峰，理论上支持任意时长任务的运行；
•	30、跨平台：原生提供通用HTTP任务Handler（Bean任务，"HttpJobHandler"）；业务方只需要提供HTTP链接即可，不限制语言、平台；
•	31、国际化：调度中心支持国际化设置，提供中文、英文两种可选语言，默认为中文；
•	32、容器化：提供官方docker镜像，并实时更新推送dockerhub，进一步实现产品开箱即用；
##	使用
###2.1项目结构
micro-istore
↓
xxl-job
↓
xxl-job-admin：调度中心
xxl-job-core：公共依赖
xxl-job-executor：通过Springboot管理执行器
2.2配置部署“调度中心”
2.2.1调度中心配置文件地址：
microistore\xxl-job\xxl-job-admin\src\main\resources\application.properties
2.2.2调度中心配置内容说明：
```java
 ### web
 server.port=8080
 server.servlet.context-path=/xxl-job-admin
 
 spring.application.name=xxl-job-admin
 
 ### resources
 spring.mvc.static-path-pattern=/static/**
 spring.resources.static-locations=classpath:/static/
 
 ### freemarker
 spring.freemarker.templateLoaderPath=classpath:/templates/
 spring.freemarker.suffix=.ftl
 spring.freemarker.charset=UTF-8
 spring.freemarker.request-context-attribute=request
 spring.freemarker.settings.number_format=0.##########
 
 ### mybatis
 mybatis.mapper-locations=classpath:/mybatis-mapper/*Mapper.xml
 
 ### 调度中心JDBC链接
 ### xxl-job, datasource
 spring.datasource.url=jdbc:mysql://127.0.0.1:3306/spring_cloud?Unicode=true&characterEncoding=UTF-8
 spring.datasource.username=root
 spring.datasource.password=123456
 spring.datasource.driver-class-name=com.mysql.jdbc.Driver
 
 spring.datasource.type=org.apache.tomcat.jdbc.pool.DataSource
 spring.datasource.tomcat.max-wait=10000
 spring.datasource.tomcat.max-active=30
 spring.datasource.tomcat.test-on-borrow=true
 
 ### 报警邮箱
 ### xxl-job email
 spring.mail.host=smtp.qq.com
 spring.mail.port=25
 spring.mail.username=863552144@qq.com
 spring.mail.password=tpvoicpdaupzbbai
 spring.mail.properties.mail.smtp.auth=true
 spring.mail.properties.mail.smtp.starttls.enable=true
 spring.mail.properties.mail.smtp.starttls.required=true
 
 ### 登录账号
 ### xxl-job login
 xxl.job.login.username=admin
 xxl.job.login.password=123456
 
 ### 调度中心通讯TOKEN，非空时启用
 ### xxl-job, access token
 xxl.job.accessToken=
 
 ### 调度中心国际化设置，默认为中文版本，值设置为“en”时切换为英文版本
 ### xxl-job, i18n (default empty as chinese, "en" as english)
 xxl.job.i18n=

2.2.3项目运行
可将项目编译打包部署。 调度中心访问地址：http://localhost:8080/xxl-job-admin
 
2.3配置部署“执行器项目”
2.3.1执行器配置
 
2.3.2开发第一个任务“Hello World”
 
 # 代码地址：xxl-job-executor :com.sfc.xxljobexecutor.executor.jobhandler.HellowWardJobHandler
 package com.sfc.xxljobexecutor.executor.jobhandler;
 
 import com.xxl.job.core.biz.model.ReturnT;
 import com.xxl.job.core.handler.IJobHandler;
 import com.xxl.job.core.handler.annotation.JobHandler;
 import org.springframework.stereotype.Component;
 
 @JobHandler(value="hellowWardJobHandler")
 @Component
 public class HellowWardJobHandler  extends IJobHandler {
     @Override
     public ReturnT<String> execute(String param) throws Exception {
         System.out.println("helloword start job");
         return SUCCESS;
     }
 }
```
 
##2.4执行任务
###2.4.1新增任务
![任务管理界面](https://raw.githubusercontent.com/xuxueli/xxl-job/master/doc/images/img_o8HQ.png "任务管理中心")

![新增任务界面](https://raw.githubusercontent.com/xuxueli/xxl-job/master/doc/images/img_ZAsz.png "新增任务")
 

 
###2.4.2触发执行
注：请确认“调度中心”和“执行器”项目已经成功部署并启动；
请点击任务右侧 “执行” 按钮，可手动触发一次任务执行（通常情况下，通过配置Cron表达式进行任务调度出发）。

###2.4.3查看日志： 
请点击任务右侧 “日志” 按钮，可前往任务日志界面查看任务日志。
在任务日志界面中，可查看该任务的历史调度记录以及每一次调度的任务调度信息、执行参数和执行信息。运行中的任务点击右侧的“执行日志”按钮，可进入日志控制台查看实时执行日志。
 
###2.5发布

 开发环境dev，测试环境test，生产环境prod
 发布版本前一定确认好环境和配置
 xxl-job-admin发布配置
 
    spring.profiles.active=dev
    #spring.profiles.active=test
    #spring.profiles.active=prod

 xxl-job-executor发布配置
    spring:
      profiles:
        active: dev
    #active: test
    #active: prod
 
三、	参考文档
详情及源码可参考：http://www.xuxueli.com/xxl-job/官方文档

文档位置：\\190.168.1.31\临时存储_文件留10天\java文档\xxl-job使用文档
  port {dev:18080   prod:18080    test:8080}
  环境任务调度平台登录地址：http://localhost:port/xxl-job-admin/
  环境任务调度平台登录地址：http://190.168.0.78:port/xxl-job-admin/toLogin