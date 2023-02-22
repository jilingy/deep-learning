package com.jilingy.deep.learning.base.common;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-06
 */
public class RedisStorageImpl extends DataBaeStorageImpl{
    @Override
    public void write(Object object) {
        //storage to redis
        System.out.println("Redis方式写入：" + object.toString());
    }
}
