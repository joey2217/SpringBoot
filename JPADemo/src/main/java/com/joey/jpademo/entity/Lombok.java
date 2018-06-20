package com.joey.jpademo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Joey
 * @date 2018-06-20 14:36
 * @desc TestLombok
 **/
@NoArgsConstructor
@AllArgsConstructor
public @Data class Lombok {
   // @Getter@Setter
    private int id;
    private int name;
}
