package com.jilingy.deep.learning.base.factory.abtract;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-21
 */
public class ReserveFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Cake createCake() {
        return new Mousse();
    }
}
