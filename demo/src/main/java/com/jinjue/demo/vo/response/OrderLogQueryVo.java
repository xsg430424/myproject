package com.jinjue.demo.vo.response;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author wuxiaohua
 * @version 1.0
 * @date 2019/03/13 10:14
 */
@Setter
@Getter
public class OrderLogQueryVo {

	@NotBlank(message = "订单ID不能为空")
	private String orderId;
}
