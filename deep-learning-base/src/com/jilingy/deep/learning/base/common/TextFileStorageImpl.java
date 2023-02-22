package com.jilingy.deep.learning.base.common;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-06
 */
public class TextFileStorageImpl extends DataBaeStorageImpl{
    @Override
    public void write(Object object) {
        //storage to text file
        System.out.println("TextFileStorage方式写入：" + object.toString());
    }
}
