package com.jilingy.deep.learning.mybatisplus;

import com.MybatisPlusApplication;
import com.jilingy.deep.learning.mybatisplus.entity.User;
import com.jilingy.deep.learning.mybatisplus.repository.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-11-14
 */
@SpringBootTest(classes = MybatisPlusApplication.class)
@RunWith(SpringRunner.class)
public class SampleTest {
    private static final Logger log = LoggerFactory.getLogger(SampleTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
