package com.winter.api.model.dto.userinterfaceinvoke;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 * @author Mr.Ye
 */
@Data
public class UserInterfaceInvokeUpdateRequest implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer restNum;

    /**
     * 接口调用状态，0——正常，1——禁用
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}