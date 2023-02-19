package com.jilingy.deep.learning.base.factory.abtract;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-21
 */
public class Mousse implements Cake{

    public Mousse() {
    }

    @Override
    public void make() {
        System.out.println("制作一个慕斯蛋糕");
    }
}
