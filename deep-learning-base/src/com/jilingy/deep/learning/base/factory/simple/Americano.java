package com.jilingy.deep.learning.base.factory.simple;

/**
 * @author: YangJiling
 * @Description: 具体产品-美式
 * @date: 2022-09-20
 */
public class Americano implements Coffee {
    public Americano() {
    }

    @Override
    public void make() {
        System.out.println("制作一杯美式咖啡");
    }
}
