package com.jinjue.demo.entity;

import lombok.*;

import java.util.Date;

/**
 * @author wuxiaohua
 * @date 2018/9/30
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderLogVo {

	/**
	 * 日志文本
	 */
	private String logMsg;

	/**
	 * 操作角色
	 */
	private String logRole;

	/**
	 * 操作人
	 */
	private String logUser;

	/**
	 * 操作状态
	 */
	private Integer logState;

	/**
	 * 处理时间
	 */
	private Date logTime;

}
