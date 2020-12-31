package com.joey.admin.bean.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author EDZ
 */
public enum GradeEnum {
    //小学
    PRIMARY(1, "小学"),
    // 中学
    SECONDARY(2, "中学"),
    // 高中
    HIGH(3, "高中");

    /**
     * 标记数据库存的值是code
     */
    @EnumValue
    private final Integer code;
    @JsonValue
    private final String desc;

    GradeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}