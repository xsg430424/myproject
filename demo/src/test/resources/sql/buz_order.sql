/*
 Navicat MySQL Data Transfer

 Source Server         : dev
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : k8s2.utcook.com:13306
 Source Schema         : buz_order

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 07/04/2020 09:56:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ds_order
-- ----------------------------
DROP TABLE IF EXISTS `ds_order`;
CREATE TABLE `ds_order`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '实体 ID',
  `create_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `order_sn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '订单编号',
  `pay_sn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '支付单号',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `store_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '卖家店铺ID',
  `store_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '卖家店铺名称',
  `update_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `buyer_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '买家ID',
  `buyer_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '买家姓名',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `is_del` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT 'N' COMMENT '删除标识',
  `add_time` datetime(0) NOT NULL COMMENT '订单生成时间',
  `payment_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '支付方式名称代码（offline货到付款，alipay支付宝，wxpay微信支付，predeposit站内余额支付，unionpay银联）',
  `payment_time` datetime(0) NULL DEFAULT NULL COMMENT '支付(付款)时间',
  `finnshed_time` datetime(0) NULL DEFAULT NULL COMMENT '订单完成时间',
  `goods_amount` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '商品总价格',
  `order_amount` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '订单总价格',
  `shipping_fee` decimal(10, 2) UNSIGNED NULL DEFAULT 0.00 COMMENT '运费',
  `evaluation_state` tinyint(4) NULL DEFAULT 2 COMMENT '评价状态 0：未评价 1：已评价 2:评价关闭',
  `order_state` tinyint(4) NOT NULL DEFAULT 10 COMMENT '订单状态：0:已取消 10:未付款 20:已付款 30:已发货 40:已收货',
  `refund_state` tinyint(3) UNSIGNED NULL DEFAULT 0 COMMENT '退款状态 0:无退款 1:部分退款 2:全部退款',
  `lock_state` tinyint(3) UNSIGNED NULL DEFAULT 0 COMMENT '锁定状态:0:正常,1:锁定',
  `delete_state` tinyint(4) NOT NULL DEFAULT 0 COMMENT '删除状态 0:未删除 1:放入回收站 2:彻底删除',
  `refund_amount` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '退款金额',
  `delay_time` datetime(0) NULL DEFAULT NULL COMMENT '延迟时间,默认为0',
  `order_from` tinyint(4) NOT NULL DEFAULT 1 COMMENT '订单来源，1:PC 2:手机',
  `order_type` tinyint(4) NULL DEFAULT 1 COMMENT '订单类型:1普通 2先买后付 3虚拟',
  `order_goods` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '订单商品冗余信息，JSON数组形式',
  `extend_info` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '扩展信息',
  `app_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '应用ID',
  `cancel_reason` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '订单取消原因',
  `refundreturn_state` tinyint(4) NULL DEFAULT NULL COMMENT '退货退款状态，冗余售后服务退款退货表状态',
  `refundreturn_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '退货退款ID',
  `store_logo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '卖家店铺logo',
  `refund_way` tinyint(4) NULL DEFAULT 1 COMMENT '退款方式：1应用方退款2平台直接退款',
  `refund_time` datetime(0) NULL DEFAULT NULL COMMENT '退款时间',
  `refund_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '退款流水号',
  `order_keywords` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '订单关键词',
  `store_followed` tinyint(4) NULL DEFAULT 0 COMMENT '是否关注店铺：0未关注 1已关注',
  `order_goods_type` tinyint(4) NULL DEFAULT 0 COMMENT '订单的商品类型（对应商品表的goods_type 由应用方定义）',
  `order_sub_state` tinyint(4) NULL DEFAULT 0 COMMENT '订单子状态',
  `extra_charges` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '额外费用',
  `pre_shipping` datetime(0) NULL DEFAULT NULL COMMENT '预配送时间',
  `shipping_way` tinyint(4) NULL DEFAULT 1 COMMENT '配送方式',
  `need_matching` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_ds_order_order_sn`(`order_sn`) USING BTREE,
  INDEX `order_buyer_id_idx`(`buyer_id`, `order_state`, `app_id`, `order_type`) USING BTREE,
  INDEX `order_store_id_idx`(`store_id`, `order_state`, `order_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ds_ordercommon
-- ----------------------------
DROP TABLE IF EXISTS `ds_ordercommon`;
CREATE TABLE `ds_ordercommon`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '实体 ID',
  `order_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '订单ID',
  `create_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `shipping_time` datetime(0) NULL DEFAULT NULL COMMENT '配送时间',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `shipping_express_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '配送公司ID',
  `evaluation_time` datetime(0) NULL DEFAULT NULL COMMENT '评价时间',
  `update_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `evalseller_state` tinyint(4) NULL DEFAULT 0 COMMENT '卖家是否已评价买家(0未评价1已评价)',
  `evalseller_time` datetime(0) NULL DEFAULT NULL COMMENT '卖家评价买家的时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `is_del` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT 'N' COMMENT '删除标识',
  `order_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '订单留言',
  `deliver_explain` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '订单发货备注',
  `reciver_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '收货人姓名',
  `reciver_info` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '收货人其它信息',
  `reciver_province_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '收货人省级ID',
  `reciver_city_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '收货人市级ID',
  `shipping_code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '订单物流单号',
  `reciver_phone` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '收货人电话',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `ordercommon_order_id_idx`(`order_id`, `reciver_phone`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '订单信息扩展表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ds_ordergoods
-- ----------------------------
DROP TABLE IF EXISTS `ds_ordergoods`;
CREATE TABLE `ds_ordergoods`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '实体 ID',
  `order_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '订单ID',
  `create_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `goods_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '商品ID',
  `goods_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '商品名称',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `goods_price` decimal(14, 5) NOT NULL COMMENT '商品价格',
  `goods_num` smallint(5) UNSIGNED NOT NULL DEFAULT 1 COMMENT '商品数量',
  `update_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `goods_image` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品图片',
  `goods_pay_price` decimal(10, 2) UNSIGNED NOT NULL COMMENT '商品实际成交价',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `is_del` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT 'N' COMMENT '删除标识',
  `store_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '0' COMMENT '店铺ID',
  `buyer_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '0' COMMENT '买家ID',
  `specparam_id` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '规格参数ID',
  `specparam_name` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '规格参数名称',
  `extend_info` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '扩展信息',
  `chain_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '传播链ID',
  `settlement_status` tinyint(4) NULL DEFAULT 0 COMMENT '结算状态：0无结算1待结算2已结算',
  `refundreturn_state` tinyint(4) NULL DEFAULT NULL COMMENT '退货退款状态，冗余售后服务退款退货表状态',
  `refundreturn_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '退货退款ID',
  `goods_discount` decimal(10, 2) NULL DEFAULT 1.00 COMMENT '商品折扣',
  `goods_storage_check` tinyint(4) NULL DEFAULT 0 COMMENT '是否验证库存：0验证 1不验证',
  `goods_followed` tinyint(4) NULL DEFAULT 0 COMMENT '是否关注商品：0未关注 1已关注',
  `pkg_spec` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '套餐规格',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `ordergoods_order_id`(`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '订单商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ds_orderlog
-- ----------------------------
DROP TABLE IF EXISTS `ds_orderlog`;
CREATE TABLE `ds_orderlog`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '实体 ID',
  `create_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `is_del` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT 'N' COMMENT '删除标识',
  `biz_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '业务id',
  `log_msg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '日志文本',
  `log_time` datetime(3) NOT NULL COMMENT '录入时间',
  `log_role` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '操作角色',
  `log_user` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '操作人',
  `log_state` tinyint(4) NULL DEFAULT NULL COMMENT '操作状态',
  `biz_type` tinyint(4) NOT NULL COMMENT '业务类型：1订单，2退款',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `orderlog_biz_id`(`biz_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '订单日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ds_orderpay
-- ----------------------------
DROP TABLE IF EXISTS `ds_orderpay`;
CREATE TABLE `ds_orderpay`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '实体 ID',
  `create_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `is_del` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT 'N' COMMENT '删除标识',
  `pay_sn` bigint(20) NOT NULL COMMENT '支付单号',
  `buyer_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '买家ID',
  `api_paystate` tinyint(4) NULL DEFAULT 0 COMMENT '0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '订单支付表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ds_timertask
-- ----------------------------
DROP TABLE IF EXISTS `ds_timertask`;
CREATE TABLE `ds_timertask`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '实体 ID',
  `create_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `is_del` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT 'N' COMMENT '删除标识',
  `biz_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '业务ID',
  `biz_ot` datetime(0) NOT NULL COMMENT '业务超时时间',
  `biz_code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '业务码：pay_ot支付超时,applyrefund_ot申请退款超时,evaluate_ot评价超时,confirm_ot确认订单超时',
  `biz_status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '业务处理状态：0处理中1已处理',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `timertask_biz_id`(`biz_id`) USING BTREE,
  INDEX `timertask_biz_code_idx`(`biz_code`, `biz_ot`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '定时任务' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
