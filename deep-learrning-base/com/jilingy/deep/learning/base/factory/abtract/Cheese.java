package com.jilingy.deep.learning.base.factory.abtract;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-21
 */
public class Cheese implements Cake{
    public Cheese() {
    }

    @Override
    public void make() {
        System.out.println("制作一个芝士蛋糕");
    }
}
