package com.joey.admin.bean.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.joey.admin.bean.enums.AgeEnum;
import com.joey.admin.bean.enums.GradeEnum;
import lombok.Data;

/**
 * @author Joey
 */
@Data
@TableName("user")
public class UserDO extends BaseEntity {
    private Long id;
    private String name;
    private String email;
    /**
     * 年龄，IEnum接口的枚举处理
     * 数据库字段：age INT(3)
     */
    private AgeEnum age;

    /**
     * 年级，原生枚举（带{@link com.baomidou.mybatisplus.annotation.EnumValue}):
     * 数据库字段：grade INT(2)
     */
    private GradeEnum grade;
}
