package com.joey.admin.bean.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author EDZ
 */
@Getter
@Setter
public abstract class BaseEntity{
    /**
     * 创建时间
     */
    @JsonIgnore
    protected Date createTime;
    /**
     * 修改时间
     */
    @JsonIgnore
    protected Date updateTime;
    /**
     * 逻辑删除
     */
    @JsonIgnore
    protected Boolean deleted;
}
