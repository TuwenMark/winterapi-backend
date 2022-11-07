package com.winter.api.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口URL地址
     */
    private String url;

    /**
     * 接口请求类型
     */
    private String method;

    /**
     * 请求头
     */
    private String requestHeader ;

    /**
     * 响应头
     */
    private String responseHeader;

    private static final long serialVersionUID = 1L;
}