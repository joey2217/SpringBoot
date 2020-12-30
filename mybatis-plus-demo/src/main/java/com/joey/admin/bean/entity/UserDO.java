package com.joey.admin.bean.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Joey
 */
@Data
@TableName("user")
public class UserDO {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
