package com.winter.api.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: winterapi-backend
 * @description: 接口调用次数分析展示对象
 * @author: Mr.Ye
 * @create: 2023-02-08 21:20
 **/
@Data
public class InterfaceInvokeVO implements Serializable {

	private static final long serialVersionUID = -734928584007516805L;

	/**
	 * 接口ID
	 */
	private String interfaceName;

	/**
	 * 接口调用次数
	 */
	private Integer totalNum;
}
