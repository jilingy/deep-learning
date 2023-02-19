package com.jilingy.deep.learning.base.common;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-06
 */
public class DataBaeStorageImpl implements IStorage{
    @Override
    public void write(Object object) {
        //storage to database
        System.out.println("DataBaeStorage方式写入：" + object.toString());
    }
}
