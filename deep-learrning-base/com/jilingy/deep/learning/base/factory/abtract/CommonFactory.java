package com.jilingy.deep.learning.base.factory.abtract;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-21
 */
public class CommonFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Cake createCake() {
        return new Cheese();
    }
}
