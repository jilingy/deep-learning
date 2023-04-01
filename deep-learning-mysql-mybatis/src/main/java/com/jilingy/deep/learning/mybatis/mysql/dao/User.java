package com.jilingy.deep.learning.mybatis.mysql.dao;

import lombok.Data;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-03-23
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
