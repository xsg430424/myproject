package com.jinjue.demo.controller;

import com.jinjue.demo.vo.response.OrderLogQueryVo;
import com.jinjue.demo.vo.response.OrderLogVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(value = "/orderLog")
public class OrderLogController {
	/**
	 * 查询订单操作日志
	 *
	 * @param orderLogQueryVo
	 * @return
	 */
	@PostMapping(value = "/query")
	public List<OrderLogVo> query(
			@RequestBody @Valid OrderLogQueryVo orderLogQueryVo) {
		List<OrderLogVo> orderLogVos=new ArrayList<>();
		OrderLogVo orderLogVo=new OrderLogVo();
		orderLogVo.setLogMsg("msg");
		orderLogVo.setLogState(1);
		orderLogVo.setLogUser("user");
		orderLogVo.setLogRole("admin");
		orderLogVos.add(orderLogVo);
		return orderLogVos;
	}
}
