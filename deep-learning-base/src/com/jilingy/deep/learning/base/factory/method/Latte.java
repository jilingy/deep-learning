package com.jilingy.deep.learning.base.factory.method;

/**
 * @author: YangJiling
 * @Description: 具体产品-拿铁
 * @date: 2022-09-20
 */
public class Latte implements Coffee {

    public Latte() {
    }

    @Override
    public void make() {
        System.out.println("制作一杯拿铁咖啡");
    }
}
