package com.jilingy.deep.learning.redisspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisSpringbootApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

//    @Test
//    void contextLoads() {
//        redisTemplate.opsForValue().set("mykey","jilingy");
//        System.out.println(redisTemplate.opsForValue().get("mykey"));
////        RedisConnection redisConnection=redisTemplate.getConnectionFactory().getConnection();
////        redisConnection.flushDb();
//    }
//
//    @Test
//    void Test() throws JsonProcessingException {
//        User user = new User(1, "阳佶伶", 18);
////        String s = new ObjectMapper().writeValueAsString(user);
//        redisTemplate.opsForValue().set("user", user);
//        System.out.println(redisTemplate.opsForValue().get("user"));
//    }

}
