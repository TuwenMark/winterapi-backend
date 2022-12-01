package com.winter.api.model.dto.userinterfaceinvoke;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @TableName product
 * @author Mr.Ye
 */
@Data
public class UserInterfaceInvokeAddRequest implements Serializable {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 接口ID
     */
    private Long interfaceId;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer restNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}