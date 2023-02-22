package com.jilingy.deep.learning.base.common;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-06
 */
public class StorageClient {

    public StorageClient(IStorage storage){
        // 存储的客户
        String stringStream = "这是需要存储的数据";
        storage.write(stringStream);
    }

    public static void main(String[] args) {
        // 使用数据库的方式写入
        IStorage dataBaeStorage = new DataBaeStorageImpl();
        StorageClient storageClientByDataBaeStorage = new StorageClient(dataBaeStorage);

        // 使用文本文件的方式写入
        IStorage textFileStorage = new TextFileStorageImpl();
        StorageClient storageClientByTextFile = new StorageClient(textFileStorage);
    }
}
