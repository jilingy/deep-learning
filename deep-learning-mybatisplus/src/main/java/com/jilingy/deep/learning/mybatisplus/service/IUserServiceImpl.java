package com.jilingy.deep.learning.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jilingy.deep.learning.mybatisplus.entity.User;
import com.jilingy.deep.learning.mybatisplus.repository.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-11-14
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
