package com.jilingy.deep.learning.base.factory.simple;

/**
 * @author: YangJiling
 * @Description: 客户
 * @date: 2022-09-21
 */
public class Client {

    public static void main(String[] args) throws Exception {

        // 创建拿铁对象
        Coffee latte = new SimpleFactory().createCoffee("latte");
        // 调用拿铁对象的制作方法
        latte.make();

        // 创建美式对象
        Coffee americano = new SimpleFactory().createCoffee("americano");
        // 调用美式对象的制作方法
        americano.make();

    }
}
