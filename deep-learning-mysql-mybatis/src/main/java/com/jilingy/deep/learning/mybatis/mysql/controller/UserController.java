package com.jilingy.deep.learning.mybatis.mysql.controller;

import com.jilingy.deep.learning.mybatis.mysql.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-03-23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/name")
    public User getAllUser(String name) {
        return null;
    }
}
