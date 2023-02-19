package com.jilingy.deep.learning.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jilingy.deep.learning.mybatisplus.entity.User;
import com.jilingy.deep.learning.mybatisplus.repository.UserMapper;
import com.jilingy.deep.learning.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.List;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-11-14
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/name")
    public User getAllUser(String name) {
        QueryWrapper<User> wrapper = Wrappers.query();
        return userService.getOne(wrapper.eq("name", name));
    }
}
