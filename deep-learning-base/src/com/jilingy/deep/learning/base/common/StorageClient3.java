package com.jilingy.deep.learning.base.common;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-06
 */
public class StorageClient3 {
    public StorageClient3(DataBaeStorageImpl dataBaeStorage){
        // 存储的客户
        String stringStream = "这是需要存储的数据";
        dataBaeStorage.write(stringStream);
    }

    public static void main(String[] args) {
        // 使用Redis的方式写入
        RedisStorageImpl redisStorage = new RedisStorageImpl();
        StorageClient3 storageClientByRedis = new StorageClient3(redisStorage);
    }
}
