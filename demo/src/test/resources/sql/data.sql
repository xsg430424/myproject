delete from ds_order;
delete from ds_ordercommon;
delete from ds_ordergoods;

INSERT INTO `buz_order`.`ds_order` (`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`,`shipping_way`,`need_matching`) VALUES ('212822791333023744', 'n-buyer1', '1212822791186223104', NULL, '2018-10-31 16:28:34', '4028b88166855aa5016685c081960000', '好滋味在线', 'n-buyer1', 'n-buyer1', 'n-buyer1', '2018-11-08 17:08:46', 'N', '2018-10-31 16:28:34', 'wxpay', NULL, '2018-10-31 17:00:00', '35.00', '35.00', '0.00', NULL, '0', NULL, NULL, '0', NULL, NULL, '2', '1', '[{\"buyerId\":\"n-buyer1\",\"chainId\":\"\",\"goodsId\":\"4028cb2266bd74fe0166bd8045900000\",\"goodsImage\":\"group1/M00/00/04/wKhpSFvY-bCAVwwOAAJ_l7vNbxs821.jpg\",\"goodsName\":\"豉汁蒸凤爪\",\"goodsNum\":2,\"goodsPayPrice\":30.00,\"goodsPrice\":15.00,\"id\":\"212822791588876288\",\"orderId\":\"212822791333023744\",\"storeId\":\"4028b88166855aa5016685c081960000\"},{\"buyerId\":\"n-buyer1\",\"chainId\":\"\",\"goodsId\":\"4028cb2266af09c10166af37b2510004\",\"goodsImage\":\"group1/M00/00/04/wKhpSFvY-ZiAK4ygAABKE0FIBT8151.jpg\",\"goodsName\":\"光酥饼\",\"goodsNum\":1,\"goodsPayPrice\":5.00,\"goodsPrice\":5.00,\"id\":\"212822791588876289\",\"orderId\":\"212822791333023744\",\"storeId\":\"4028b88166855aa5016685c081960000\"}]', NULL, '4028b8816680062f016680239e480000', '其他原因', NULL, NULL, 'group1/M00/00/03/wKhpSFvWeWqAf9n8AAGRmsGEpYE711.jpg', '1', NULL, NULL, NULL, '0', '0', '0', '0.00', NULL,'1',NULL);
INSERT INTO `buz_order`.`ds_order` (`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`,`shipping_way`,`need_matching`) VALUES ('213544612181450752', 'platform_admin', '1213544612068204544', NULL, '2018-11-02 16:16:49', '213068947032096768', '厨师长张先生', NULL, 'platform_admin', 'platform_admin', NULL, 'N', '2018-11-02 16:16:49', 'wxpay', NULL, '2018-11-02 16:50:00', '3000.00', '3000.00', '0.00', NULL, '0', NULL, NULL, '0', NULL, NULL, '1', '1', '[{\"buyerId\":\"platform_admin\",\"goodsId\":\"213076228444508160\",\"goodsImage\":\"group1/M00/00/04/wKhpSFvaVAOADitXAAELrx7GF6Q159.jpg\",\"goodsName\":\"广式靓虾饺\",\"goodsNum\":100,\"goodsPayPrice\":3000.00,\"goodsPrice\":30.00,\"id\":\"213544612378583040\",\"orderId\":\"213544612181450752\",\"storeId\":\"213068947032096768\"}]', '', '436140e219c747859196a6988d8d5005', '超时未付款', NULL, NULL, 'group1/M00/00/04/wKhpSFvaTE6Abv62AACn4kSWYh8420.jpg', '1', NULL, NULL, NULL, '0', '0', '0', '0.00', NULL,'1',NULL);
INSERT INTO `buz_order`.`ds_order` (`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`,`shipping_way`,`need_matching`) VALUES ('213545650875670528', 'platform_admin', '1213545650871476224', NULL, '2018-11-02 16:20:57', '213068947032096768', '厨师长张先生', NULL, 'platform_admin', 'platform_admin', NULL, 'N', '2018-11-02 16:20:57', 'wxpay', NULL, '2018-11-02 17:00:00', '3000.00', '3000.00', '0.00', NULL, '20', NULL, NULL, '0', NULL, NULL, '1', '1', '[{\"buyerId\":\"platform_admin\",\"goodsId\":\"213076228444508160\",\"goodsImage\":\"group1/M00/00/04/wKhpSFvaVAOADitXAAELrx7GF6Q159.jpg\",\"goodsName\":\"广式靓虾饺\",\"goodsNum\":100,\"goodsPayPrice\":3000.00,\"goodsPrice\":30.00,\"id\":\"213545650888253440\",\"orderId\":\"213545650875670528\",\"storeId\":\"213068947032096768\"}]', '', '436140e219c747859196a6988d8d5005', '超时未付款', NULL, NULL, 'group1/M00/00/04/wKhpSFvaTE6Abv62AACn4kSWYh8420.jpg', '2', NULL, NULL, NULL, '0', '0', '0', '0.00', NULL, '1',NULL);
INSERT INTO `buz_order`.`ds_order` (`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`,`shipping_way`,`need_matching`) VALUES ('217176111795642369', 'n-buyer1', '1217176111795642368', NULL, '2018-11-12 16:47:06', '4028b88166855aa5016685f41b1d0004', '广州白云山制药', NULL, 'n-buyer1', 'n-buyer1', NULL, 'N', '2018-11-12 16:47:06', 'wxpay', NULL, NULL, '0.01', '0.01', '0.00', NULL, '30', NULL, '0', '0', NULL, NULL, '2', '1', '[{\"buyerId\":\"n-buyer1\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"215968768147681281\",\"goodsImage\":\"group1/M00/00/08/wKhpSFvk2ciAYcYYAAjlS0KKm-E151.jpg\",\"goodsName\":\"广东凉茶颗粒\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"217176111799836672\",\"orderId\":\"217176111795642369\",\"storeId\":\"4028b88166855aa5016685f41b1d0004\"}]', NULL, '4028b8816680062f01668117b50b0002', NULL, NULL, NULL, 'group1/M00/00/07/wKhpSFvigOuAY2G2AAGiL1mysSc974.png', '1', NULL, NULL, NULL, '0', '0', '0', '0.00', NULL,'1',NULL);
INSERT INTO `buz_order`.`ds_order` (`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`,`shipping_way`,`need_matching`) VALUES ('357080220249194497', 'f756482d670a436fbb1ec30aef8e19d9', '1357080220249194496', NULL, '2019-12-03 18:16:05', '283491778840092672', '优特智能称菜厨房', NULL, 'f756482d670a436fbb1ec30aef8e19d9', 'f756482d670a436fbb1ec30aef8e19d9', '2019-12-03 18:16:05', 'N', '2019-12-03 18:16:05', 'unpay', NULL, NULL, '10.02', '10.02', '0.00', '2', '10', NULL, '0', '0', NULL, NULL, '2', '2', '[{\"buyerId\":\"f756482d670a436fbb1ec30aef8e19d9\",\"extendInfo\":\"[{\\\"dishId\\\":\\\"e04b022000674eeb\\\",\\\"goodsWeight\\\":1}]\",\"goodsDiscount\":1.00,\"goodsId\":\"355543473296060417\",\"goodsImage\":\"Fr2N52b7fVC6LIi5y4mmz-xdJiFq\",\"goodsName\":\"干烧带鱼\",\"goodsNum\":1,\"goodsPayPrice\":10.02,\"goodsPrice\":10.02,\"id\":\"357080220257583104\",\"orderId\":\"357080220249194497\",\"storeId\":\"283491778840092672\"}]', '{\"orderType\":\"MINI_PROGRAM_WEIGH\",\"weighDishes\":[{\"id\":\"8a7485b46ecaecff016ecafaa71e0000\",\"dishId\":\"e04b022000674eeb\",\"bindTime\":1575363454627,\"unBindTime\":1575368165490}]}', '436140e219c747859196a6988d8d5005', NULL, NULL, NULL, '银桦路', '1', NULL, NULL, '临时顾客', '0', '0', '0', '0.00', NULL,'1',NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350655', 'user', '1313889399668707298', 'ac7c01dda6a74abd9d3bc61d41562f5b', '2019-08-06 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', 'wxpay', '2020-04-09 12:05:00', '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 0, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350656', 'user', '1313889399668707299', NULL, '2019-08-06 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', NULL, NULL, '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 10, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350657', 'user', '1313889399668707300', NULL, '2019-08-06 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', NULL, NULL, '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 10, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350658', 'user', '1313889399668707301', 'ac7c01dda6a74abd9d3bc61d41562f5c', '2019-08-06 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', 'wxpay', '2020-04-09 12:05:00', '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 20, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350659', 'user', '1313889399668707302', 'ac7c01dda6a74abd9d3bc61d41562f5d', '2019-08-08 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', 'wxpay', '2020-04-09 12:05:00', '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 30, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350660', 'user', '1313889399668707303', 'ac7c01dda6a74abd9d3bc61d41562f5d', '2019-08-08 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', 'wxpay', '2020-04-09 12:05:00', '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 0, 40, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('313889399677095936', 'n-buyer1', '1313889399668707328', 'ac7c01dda6a74abd9d3bc61d41562f5a', '2019-08-06 13:51:11', '219704034071166976', '食在不一样', NULL, 'n-buyer1', 'n-buyer1', '2019-08-06 14:04:01', 'N', '2019-08-06 13:51:11', 'wxpay', '2019-08-06 14:04:00', '2019-09-02 14:50:01', 0.01, 0.01, 0.00, 1, 40, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"n-buyer1\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"313889399677095936\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', NULL, NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 0.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350654', 'user', '1313889399668707297', NULL, '2019-08-06 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', NULL, NULL, '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 10, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350653', 'user', '1313889399668707296', NULL, '2019-08-06 13:51:11', '219704034071166976', '食在不一样', 'user', 'user', 'user', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', NULL, NULL, '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 2, 10, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);
INSERT INTO `buz_order`.`ds_order`(`id`, `create_id`, `order_sn`, `pay_sn`, `create_time`, `store_id`, `store_name`, `update_id`, `buyer_id`, `buyer_name`, `update_time`, `is_del`, `add_time`, `payment_code`, `payment_time`, `finnshed_time`, `goods_amount`, `order_amount`, `shipping_fee`, `evaluation_state`, `order_state`, `refund_state`, `lock_state`, `delete_state`, `refund_amount`, `delay_time`, `order_from`, `order_type`, `order_goods`, `extend_info`, `app_id`, `cancel_reason`, `refundreturn_state`, `refundreturn_id`, `store_logo`, `refund_way`, `refund_time`, `refund_no`, `order_keywords`, `store_followed`, `order_goods_type`, `order_sub_state`, `extra_charges`, `pre_shipping`, `shipping_way`, `need_matching`) VALUES ('357396454161350661', 'buyer1', '1313889399668707304', 'ac7c01dda6a74abd9d3bc61d41562f5d', '2019-08-08 13:51:11', '219704034071166977', '食在不一样', 'buyer1', 'buyer1', 'buyer1', '2020-04-09 12:30:00', 'N', '2020-04-09 12:00:00', 'wxpay', '2020-04-09 12:05:00', '2020-04-09 12:30:00', 0.01, 0.01, 0.00, 0, 40, NULL, 0, 0, NULL, NULL, 2, 1, '[{\"buyerId\":\"user\",\"chainId\":\"\",\"goodsDiscount\":1.00,\"goodsId\":\"220440222009073665\",\"goodsImage\":\"0/0/0/0/0/0/0/0/5/23.jpg\",\"goodsName\":\"麻辣水煮鱼\",\"goodsNum\":1,\"goodsPayPrice\":0.01,\"goodsPrice\":0.01,\"id\":\"313889399790342144\",\"orderId\":\"357396454161350657\",\"storeId\":\"219704034071166976\"}]', NULL, '219696853603061760', 'cancelReason', NULL, NULL, 'group1/M00/00/09/wKhpSFvyb-SADeZOAADdskVslFU702.png', 1, NULL, NULL, NULL, 1, 0, 0, 1.00, NULL, 1, NULL);

INSERT INTO `buz_order`.`ds_ordercommon` (`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('313889399752593408', '313889399677095936', 'n-buyer1', NULL, '2019-08-06 13:51:11', NULL, NULL, NULL, NULL, NULL, NULL, 'N', NULL, NULL, '李四', '珠海市香洲区唐家人才公寓', NULL, NULL, NULL, '13789456892');
INSERT INTO `buz_order`.`ds_ordercommon` (`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('213545650879864833', '213545650875670528', 'platform_admin', NULL, '2018-11-02 16:20:57', NULL, NULL, NULL, '0', NULL, NULL, 'N', '', NULL, 'platform_admin', '社区厨房地址暂不提供', NULL, NULL, NULL, '社区厨房电话暂不提供');
INSERT INTO `buz_order`.`ds_ordercommon` (`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('212822791563710464', '212822791333023744', 'n-buyer1', NULL, '2018-10-31 16:28:34', NULL, NULL, NULL, '0', NULL, NULL, 'N', '', NULL, 'n-buyer1', '广东省珠海市香洲区吉大巴士站旁', NULL, NULL, NULL, '13754878569');
INSERT INTO `buz_order`.`ds_ordercommon` (`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('217176111795642371', '217176111795642369', 'n-buyer1', NULL, '2018-11-12 16:47:06', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '', NULL, 'buyer1', '广东省珠海市香洲区优特大厦', NULL, NULL, NULL, '18666552563');
INSERT INTO `buz_order`.`ds_ordercommon` (`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('357080220253388801', '357080220249194497', 'f756482d670a436fbb1ec30aef8e19d9', NULL, '2019-12-03 18:16:05', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '智能称菜订单', NULL, '游客', '银桦路', NULL, NULL, NULL, '---');
INSERT INTO `buz_order`.`ds_ordercommon`(`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('357080220253388901', '357396454161350657', 'f756482d670a436fbb1ec30aef8e19d9', NULL, '2020-04-08 12:00:00', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '订单信息', NULL, '小华', '塘岭路', NULL, NULL, NULL, '---');
INSERT INTO `buz_order`.`ds_ordercommon`(`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('357080220253388902', '357396454161350658', 'f756482d670a436fbb1ec30aef8e19d9', NULL, '2020-04-08 12:00:00', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '订单信息', NULL, '小华', '塘岭路', NULL, NULL, NULL, '---');
INSERT INTO `buz_order`.`ds_ordercommon`(`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('357080220253388903', '357396454161350659', 'f756482d670a436fbb1ec30aef8e19d9', NULL, '2020-04-08 12:00:00', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '订单信息', NULL, '小华', '塘岭路', NULL, NULL, NULL, '---');
INSERT INTO `buz_order`.`ds_ordercommon`(`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('357080220253388904', '357396454161350660', 'f756482d670a436fbb1ec30aef8e19d9', NULL, '2020-04-08 12:00:00', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '订单信息', NULL, '小华', '塘岭路', NULL, NULL, NULL, '---');
INSERT INTO `buz_order`.`ds_ordercommon`(`id`, `order_id`, `create_id`, `shipping_time`, `create_time`, `shipping_express_id`, `evaluation_time`, `update_id`, `evalseller_state`, `evalseller_time`, `update_time`, `is_del`, `order_message`, `deliver_explain`, `reciver_name`, `reciver_info`, `reciver_province_id`, `reciver_city_id`, `shipping_code`, `reciver_phone`) VALUES ('357080220253388909', '357396454161350661', 'f756482d670a436fbb1ec30aef8e19d9', NULL, '2020-04-08 12:00:00', NULL, NULL, NULL, NULL, NULL, NULL, 'N', '订单信息', NULL, '小华', '塘岭路', NULL, NULL, NULL, '---');


INSERT INTO `buz_order`.`ds_ordergoods` (`id`, `order_id`, `create_id`, `goods_id`, `goods_name`, `create_time`, `goods_price`, `goods_num`, `update_id`, `goods_image`, `goods_pay_price`, `update_time`, `is_del`, `store_id`, `buyer_id`, `specparam_id`, `specparam_name`, `extend_info`, `chain_id`, `settlement_status`, `refundreturn_state`, `refundreturn_id`, `goods_discount`, `goods_followed`, `goods_storage_check`) VALUES ('313889399790342144', '313889399677095936', 'n-buyer1', '220040657325604865', '豉汁蒸凤爪', '2020-01-07 13:51:11', '0.01', '1', NULL, '0/0/0/0/0/0/0/0/5/23.jpg', '0.01', '2019-08-06 13:51:11', 'N', '219704034071166976', 'n-buyer1', NULL, NULL, NULL, '', NULL, NULL, NULL, '1.00', '1', '0');
INSERT INTO `buz_order`.`ds_ordergoods` (`id`, `order_id`, `create_id`, `goods_id`, `goods_name`, `create_time`, `goods_price`, `goods_num`, `update_id`, `goods_image`, `goods_pay_price`, `update_time`, `is_del`, `store_id`, `buyer_id`, `specparam_id`, `specparam_name`, `extend_info`, `chain_id`, `settlement_status`, `refundreturn_state`, `refundreturn_id`, `goods_discount`, `goods_storage_check`, `goods_followed`, `pkg_spec`) VALUES ('313889399790342150', '357396454161350660', 'user', '220040657325604865', '豉汁蒸凤爪', '2020-04-09 12:00:00', 0.01000, 1, NULL, '0/0/0/0/0/0/0/0/5/23.jpg', 0.01, '2020-04-09 12:00:00', 'N', '219704034071166976', 'user', NULL, NULL, NULL, '', NULL, NULL, NULL, 1.00, 0, 1, NULL);

INSERT INTO `buz_order`.`ds_orderlog`(`id`, `create_id`, `create_time`, `update_id`, `update_time`, `is_del`, `biz_id`, `log_msg`, `log_time`, `log_role`, `log_user`, `log_state`, `biz_type`) VALUES ('212822791343025001', 'user', '2020-04-09 10:13:42', 'user', '2020-04-09 10:14:29', 'N', '313889399677095936', 'msg', '2020-04-09 10:14:21.000', 'admin', 'user', 1, 1);