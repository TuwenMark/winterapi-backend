package com.winter.api.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户接口调用状态枚举
 *
 * @author yupi
 */
public enum UserInterfaceInvokeStatusEnum {

    NORMAL("正常", 0),
    FORBIDDEN("禁用", 1);

    private final String text;

    private final int value;

    UserInterfaceInvokeStatusEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
