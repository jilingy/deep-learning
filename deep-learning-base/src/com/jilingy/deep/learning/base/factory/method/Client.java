package com.jilingy.deep.learning.base.factory.method;

/**
 * @author: YangJiling
 * @Description: 客户
 * @date: 2022-09-21
 */
public class Client {
    public static void main(String[] args) {
        // 使用拿铁工厂来创建拿铁对象
        CoffeeAbstractFactory latteFactory = new com.jilingy.deep.learning.base.factory.method.LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        // 调用拿铁的制作方法
        latte.make();

        // 使用美式工厂来创建美式对象
        CoffeeAbstractFactory americanoFactory = new com.jilingy.deep.learning.base.factory.method.AmericanoFactory();
        Coffee americano = americanoFactory.createCoffee();
        // 调用美式的制作方法
        americano.make();
    }
}
