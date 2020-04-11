/*
Navicat MySQL Data Transfer

Source Server         : 腾讯云
Source Server Version : 80016
Source Host           : 106.52.22.118:3306
Source Database       : life

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-07-07 17:58:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `account_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '帐号ID',
  `user_id` int(11) unsigned NOT NULL COMMENT '用户ID',
  `siteName` varchar(50) DEFAULT NULL COMMENT '网站名称',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `url` varchar(100) DEFAULT NULL COMMENT '网址',
  `type` tinyint(1) DEFAULT NULL COMMENT '类型',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(100) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='帐号信息表';

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '1', 'oracle', 'email', 'name3', '', null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('2', '1', '邮政', '-', 'sisterbir6', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('3', '1', '交行1', 'fullname', 'sisterbir6', null, null, '1', 'cash pwd01 for mading/HuaLing 4+Family Bir6  pwd02 for mading/支付短号 622260+name 全拼', null, null, null, null);
INSERT INTO `account` VALUES ('4', '1', '交行2', 'hualing4+familybir6', 'sisterbir6', null, null, '1', 'mading', null, null, null, null);
INSERT INTO `account` VALUES ('5', '1', '百度云', '123user42011', 'name36@', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('6', '1', '码云', 'name3zone6', 'name36@', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('7', '1', '淘宝', 'user42011', 'name37+', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('8', '1', '京东', 'user42011', 'name37+', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('9', '1', '拉钩', 'email', 'name36+@', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('10', '1', 'my12306', 'name3zone6+', 'region4zone6', null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('11', '1', '交行（深圳）', 'en_name1@en_name2@tel', null, null, null, '1', null, null, null, null, null);
INSERT INTO `account` VALUES ('12', '1', 'server', 'region4(FirstCharUpper)zone6', null, null, null, '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for alert
-- ----------------------------
DROP TABLE IF EXISTS `alert`;
CREATE TABLE `alert` (
  `alert_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '提醒ID',
  `alert_name` varchar(50) DEFAULT NULL COMMENT '提醒名称',
  `alert_start_time` datetime DEFAULT NULL COMMENT '提醒开始时间',
  `alert_end_time` datetime DEFAULT NULL COMMENT '提醒结束时间',
  `alert_type` tinyint(4) DEFAULT '1' COMMENT '提醒类型1每日任务2每周任务3每月任务4每年任务5生日6交房租7还花呗信用卡8领取公积金',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(100) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`alert_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='提醒表';

-- ----------------------------
-- Records of alert
-- ----------------------------
INSERT INTO `alert` VALUES ('1', '每日任务', null, null, '1', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('2', '每周任务', null, null, '2', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('3', '每月任务', null, null, '3', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('4', '每年任务', null, null, '4', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('5', '生日', null, null, '5', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('6', '交房租', null, null, '6', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('7', '还花呗', null, null, '7', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('8', '预约公积金\r\n', null, null, '8', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('9', '还信用卡', null, null, '9', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('10', '取公积金', null, null, '10', '1', null, null, null, null, null);
INSERT INTO `alert` VALUES ('11', '更新项目进度', null, null, '11', '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for asset
-- ----------------------------
DROP TABLE IF EXISTS `asset`;
CREATE TABLE `asset` (
  `asset_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '资产ID',
  `user_id` int(11) unsigned NOT NULL COMMENT '用户ID',
  `income` decimal(16,2) NOT NULL DEFAULT '0.00' COMMENT '每月收入',
  `expend` decimal(16,2) NOT NULL DEFAULT '0.00' COMMENT '每月支出',
  `deposit` decimal(16,2) NOT NULL DEFAULT '0.00' COMMENT '每月存款',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(100) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`asset_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='资产表';

-- ----------------------------
-- Records of asset
-- ----------------------------
INSERT INTO `asset` VALUES ('1', '1', '0.00', '0.00', '0.00', '1', null, null, null, null, null);
INSERT INTO `asset` VALUES ('2', '2', '0.00', '0.00', '0.00', '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for birthday
-- ----------------------------
DROP TABLE IF EXISTS `birthday`;
CREATE TABLE `birthday` (
  `bir_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '生日ID',
  `username` varchar(50) NOT NULL COMMENT '名称',
  `nickname` varchar(50) NOT NULL COMMENT '昵称',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(100) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`bir_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='生日信息表';

-- ----------------------------
-- Records of birthday
-- ----------------------------
INSERT INTO `birthday` VALUES ('1', '爸爸', '爸爸', '1954-02-13 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');
INSERT INTO `birthday` VALUES ('2', '妈妈', '妈妈', '1960-03-25 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');
INSERT INTO `birthday` VALUES ('3', '姐姐', '姐姐', '1984-07-02 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');
INSERT INTO `birthday` VALUES ('4', '姨妈', '姨妈', '1964-10-20 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');
INSERT INTO `birthday` VALUES ('5', '姨父', '姨父', '1964-12-07 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');
INSERT INTO `birthday` VALUES ('6', '小舅', '小舅', '1966-03-29 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');
INSERT INTO `birthday` VALUES ('7', '大舅', '大舅', '1955-12-02 08:00:00', '1', '2019-04-25 23:02:02', '', '2019-04-25 23:02:09', '');

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `contact_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '联系人ID',
  `user_id` int(11) unsigned NOT NULL COMMENT '用户ID',
  `fullname` varchar(50) DEFAULT NULL COMMENT '全名',
  `nickname` varchar(50) DEFAULT NULL COMMENT '昵称',
  `appellation` varchar(50) DEFAULT NULL COMMENT '与本人的关系',
  `telephone` varchar(150) DEFAULT NULL COMMENT '联系电话',
  `mobile_phone` varchar(150) DEFAULT NULL COMMENT '联系手机号',
  `certificatenum` varchar(100) DEFAULT NULL COMMENT '身份证号',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `birthday` char(10) DEFAULT NULL COMMENT '出生日期',
  `sex` tinyint(2) DEFAULT NULL COMMENT '性别',
  `type` tinyint(1) DEFAULT NULL COMMENT '关系类型1=亲人，2=朋友，3=同学，4=熟人',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(100) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`contact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='关系表';

-- ----------------------------
-- Records of contact
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` varchar(3000) DEFAULT NULL COMMENT '内容',
  `type` tinyint(1) DEFAULT NULL COMMENT '信息类型1帐号2linux3ES',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='常用信息表';

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '1', null, '在w3school，你可以找到你所需要的所有的网站建设教程。\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddd\n\n\ndd\n\ndd\ndedgf\ndddddd\nddddddddddddddddddd\nd\nd\nd\ndd\nd\neeeeeeeeeeeeeeeeeeeeee\n\ntqrtgdkjfljdfjkdaf\nddddd\n\n\nrtgressssssssssssg\n\n\n\n\n\n\n\n\n\n\n\ndfda;lkeeeeeee', '1', '1', null, null, '2019-07-07 08:20:40');
INSERT INTO `message` VALUES ('2', '1', null, '列出后台进程  ：\nps -ef | grep java\n杀死进程：kill -9 112708\n退出：ctrl+c \n查看内存： df-h\n查看进程的内存：top \n查看剩余内存： free -m \n创建目录：mkdir -p app/microistore/elastic-search\n删除目录：rm -rf  fileName\n测试端口号：telnet ip port\n解压命令：tar -zxvf logstash-6.5.4.tar.gz\n无论是否退出 vi，均可保存所做的工作。按 ESC 键，确定 vi 是否处于命令模式。\n操作   键入\n保存，但不退出vi    :w\n保存并退出vi  :wq\n退出vi，但不保存更改:q!\n用其他文件名保存:w filename\n在现有文件中保存并覆盖该文件    :w! filename\n动态查看日志：tail -f xx.log \n根据文件名查找：find / -name xxx.txt\n当前文件夹下查找：find ./ -name xxx.txt\n查看进程：ps aux|grep xxx.jar\n赋予文件权限：chmod u+x *.sh\n\ndocker命令\n启动\nsudo systemctl start docker\n列出docker中运行的容器\ndocker ps -a\ndocker启动mysql\ndocker restart 容器id\n守护进程重启\nsudo systemctl daemon-reload\n重启docker服务\nsystemctl restart docker\n重启docker服务 ?\nsudo service docker restart\n关闭docker   \nservice docker stop   \n关闭docker  \nsystemctl stop docker\n\n开启防火墙\nsystemctl start firewalld\n查看所有打开的端口： \nfirewall-cmd --zone=public --list-ports\n添加端口：\nfirewall-cmd --zone=public --add-port=3306/tcp --permanent    \n（--permanent永久生效，没有此参数重启后失效）\n重新载入（添加完所有端口必须要重新载入）\nfirewall-cmd --reload\n查看firewalld状态\nsystemctl status firewalld\n关闭防火墙\nsystemctl stop firewalld\n\nLinux添加系统服务及开机自启动\n编写一个脚本，然后把它放在/etc/init.d这个目录下，再用service + 脚本名字 运行即可。如果是要开机自动启动那就得用chkconfig命令了。\nA、service这个命令往往是即时生效，不用开关机，但是重启后服务会回到默认状态。\nB、chkconfig是用于把服务加到开机自动启动列表里，只要启动它，就能自动启动，重启后永久生效即：\nchkconfig --list ：显示所有运行级系统服务的运行状态信息（on或off）\n添加命令：chkconfig --add COMMAND  \n重启后永久生效：chkconfig COMMAND on/off\n删除命令：chkconfig --del COMMAND\n\nMYSQL命令\nmysql -u root -p\nGRANT REPLICATION SLAVE ON *.* TO \'repl\'@\'190.168.104.117\';#分配权限\ngrant replication slave on *.* to \'slave_account\'@\'190.168.104.117\' identified by \'123456\';\n配置从库日志\n#grant replication slave on *.* to slave@\'190.168.5.%\' identified by \'123456\';\nCREATE USER \'slave\'@\'%\' IDENTIFIED WITH mysql_native_password BY \'Java123\';\nGRANT ALL PRIVILEGES ON *.* TO \'slave\'@\'%\';\nSET GLOBAL server_id=2;\nchange master to master_host=\'190.168.4.253\',master_port=3306,master_user=\'slave\',master_password=\'Java123\',master_log_file=\'mysql-bin.000046\',master_log_pos=155;\n\nssh\nssh-keygen -t rsa -C \"742748444@qq.com\"\n\n项目： \nnohup java -jar -Xms500m -Xmx500m /java_app/elastic-search-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod >/java_app/logs/es.log &\nnohup java -jar /webapps/elastic-search-0.0.1-SNAPSHOT.jar --spring.profiles.active=test >/webapps/logs/es.log &\nnohup java -jar /webapps/mysqlToES/mysqlToES-0.0.1-SNAPSHOT.jar >/webapps/mysqlToES/logs/mysqltoes.log &\nnohup java -jar /opt/mysqlToES-0.0.1-SNAPSHOT.jar >/opt/logs/mysqltoes.log &\nnohup java -jar /webapps/message-0.0.1-SNAPSHOT.jar>/webapps/logs/message.log &\nnohup java -jar /app/java/xxl-job-admin-2.1.0-SNAPSHOT.jar &\nnohup java -jar /app/java/xxl-job-executor-http-2.1.0-SNAPSHOT.jar &\n\n\n', '2', '1', null, null, '2019-07-07 08:30:53');
INSERT INTO `message` VALUES ('3', '1', null, '统计总数：    \ncurl -XGET 127.0.0.1:9200/_cat/indices?v\n删除索引\ncurl -XDELETE \'127.0.0.1:9200/sfc_product?pretty\'\n查询索引结构\ncurl -XGET \'http://127.0.0.1:9200/sfc_product?pretty\'\n根据_id查找： \ncurl -XGET \'localhost:9200/bad_ad_specifics/doc/6406862?pretty\'\n查询所有：    \ncurl -XGET \'127.0.0.1:9200/bad_advt_detail/doc/_search?q=*&pretty\'\n分页查询：    \ncurl -H \"Content-Type: application/json\" -XGET 127.0.0.1:9200/badword/doc/_search?pretty -d\'{\"query\": { \"match\": {\"category_id\" : \"4929\"} },\"from\": 1,\"size\": 5}\'\n条件查询-json:\ncurl -H \"Content-Type: application/json\" -XGET 127.0.0.1:9200/bad_advt_title/doc/_search?pretty -d\'{\"query\": { \"match\": {\"id\" : \"4019349\"} }}\'\n条件查询-参数：\ncurl -d \"name=Dual USB Socket Charger Adapter For Ipod Nano&categoryId=4928\" \"http://127.0.0.1:8801/shopeeProduct/similarSearch\"\n创建索引\ncurl -H \"Content-Type: application/json\" -XPUT \'localhost:9200/demo?pretty\' -d \'{\"mappings\": {\"doc\":{\"properties\":{\"ad_id\":{\"type\":\"keyword\",\"store\":false,\"index\":\"true\"},\"ad_detail_description\":{\"type\":\"text\",\"store\":false,\"index\":\"true\"}}}}}\'\ncurl -H \"Content-Type: application/json\" -XPUT \'localhost:9200/aaa?pretty\' -d \'{\"settings\": {\"analysis\": {\"analyzer\": {\"caseSensitive\": {\"filter\": \"lowercase\",\"type\": \"custom\",\"tokenizer\": \"keyword\"}}}}}\'\n查询\ncurl -XPOST http://127.0.0.1:8801/badword/get/all -d \'adSite=US&text=easy reach&pageSize=1000&pageNum=1\'\ncurl http://127.0.0.1:8801/shopeeProduct/get/similar?name=Football Kick Trainer Skills Solo&companyId=1&siteCode=Shopee.Toyfulcabin.my\ncurl -H \"Content-Type: application/json\" -XPOST http://127.0.0.1:8801/badword/get/all -d \'{\"adSite\":\"UK\",\"text\":\"French Fries\"}\'\n\n删除\ncurl -XDELETE \'localhost:9200/bad_advt_title?pretty\'\n定义父子关系\ncurl -H \"Content-Type: application/json\" -XPUT \"http://localhost:9200/bad_word?pretty\" -d \'{\"mappings\": { \"bad_advt_title\" : {\"properties\":{\"ad_id\":{\"type\":\"integer\",\"store\":false,\"index\":\"true\"}}}\'\ncurl -XDELETE \'localhost:9200/bad_word?pretty\'\n设置最大返回条数\ncurl -H \"Content-Type: application/json\" -XPUT http://127.0.0.1:9200/bad_advt_title/_settings -d \'{\"index\": {\"max_result_window\": 1000000}}\'\nindices.query.bool.max_clause_count: 200000\n\n启动elasticsearch\n1.切换到目录\ncd /home/elsearch/elasticsearch-6.5.4\ncd /mnt/disk1/es/elasticsearch-6.5.4\n\n2.切换elsearch用户\nsu elsearch\n\n3.启动\n./bin/elasticsearch -d\n\n启动logstash\n1.切换到目录(root用户)：\ncd /opt/logstash-6.5.4\ncd /usr/elk/logstash\n2.后台启动某个文件\nnohup ./bin/logstash -f ./es_config/conf/logstash.conf &\n(运行某个文件下所有文件:)\nnohup ./bin/logstash -f ./es_config/conf &\n3.查看日志\ntail -f nohup.out\n\n\n', '3', '1', null, null, '2019-07-07 08:33:30');

-- ----------------------------
-- Table structure for note
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `note_id` int(11) DEFAULT NULL COMMENT '笔记id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` varchar(2000) DEFAULT NULL COMMENT '内容',
  `type` tinyint(1) DEFAULT NULL COMMENT '笔记类型1日报2周报3月报4年报',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='笔记表';

-- ----------------------------
-- Records of note
-- ----------------------------

-- ----------------------------
-- Table structure for schedule
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `schedule_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '计划ID',
  `schedule_name` varchar(50) DEFAULT NULL COMMENT '计划名称',
  `schedule_time` datetime DEFAULT NULL COMMENT '计划时间',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态1=有效，0=无效',
  `description` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(100) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`schedule_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='计划表';

-- ----------------------------
-- Records of schedule
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `username` varchar(64) DEFAULT NULL COMMENT '用户名',
  `password` varchar(136) DEFAULT NULL COMMENT '密码',
  `name_cn` varchar(64) DEFAULT NULL COMMENT '姓名',
  `name_en` varchar(64) DEFAULT NULL COMMENT '英文名',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `role_id` tinyint(1) DEFAULT NULL COMMENT '角色id1超级管理员2普通用户',
  `telephone` varchar(150) DEFAULT NULL COMMENT '联系电话',
  `mobile_phone` varchar(150) DEFAULT NULL COMMENT '联系手机号',
  `last_login_datetime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `certificatenum` varchar(1000) DEFAULT NULL COMMENT '身份证号',
  `birthday` char(10) DEFAULT NULL COMMENT '出生日期',
  `sex` char(1) DEFAULT NULL COMMENT '性别F女M男',
  `status` tinyint(1) DEFAULT '1' COMMENT '数据状态1=有效，0=无效',
  `description` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 'xsg', '123456', '肖水庚', 'gavin', '742748444@qq.com', '1', '18218421612', '18218421612', '2019-07-06 22:57:03', null, '1990-05-26', 'M', '1', null, null, null);
