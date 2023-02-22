package com.jilingy.deep.learning.base.common;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-06
 */
public class StorageClient2 {

    public StorageClient2(DataBaeStorageImpl dataBaeStorage){
        // 存储的客户
        String stringStream = "这是需要存储的数据";
        dataBaeStorage.write(stringStream);
    }

    public StorageClient2(TextFileStorageImpl textFileStorage){
        // 存储的客户
        String stringStream = "这是需要存储的数据";
        textFileStorage.write(stringStream);
    }

    public static void main(String[] args) {
        // 使用数据库的方式写入
        DataBaeStorageImpl dataBaeStorage = new DataBaeStorageImpl();
        StorageClient2 storageClientByDataBaeStorage = new StorageClient2(dataBaeStorage);

        // 使用文本文件的方式写入
        TextFileStorageImpl textFileStorage = new TextFileStorageImpl();
        StorageClient2 storageClientByTextFile = new StorageClient2(textFileStorage);
    }
}
