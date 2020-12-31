package com.joey.admin.bean.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author EDZ
 */
public enum AgeEnum implements IEnum<Integer> {
    // 一岁
    ONE(1, "一岁"),
    // 二岁
    TWO(2, "二岁"),
    // 三岁
    THREE(3, "三岁");

    @JsonValue
    private final int value;
    private final String desc;

    AgeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }
}