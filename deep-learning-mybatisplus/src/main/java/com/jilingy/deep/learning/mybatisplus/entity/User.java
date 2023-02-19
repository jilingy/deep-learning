package com.jilingy.deep.learning.mybatisplus.entity;

import lombok.Data;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-11-14
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
