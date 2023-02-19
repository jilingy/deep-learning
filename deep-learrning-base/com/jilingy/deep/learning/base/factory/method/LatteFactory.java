package com.jilingy.deep.learning.base.factory.method;

/**
 * @author: YangJiling
 * @Description: 具体工厂-拿铁工厂
 * @date: 2022-09-20
 */
public class LatteFactory implements CoffeeAbstractFactory {

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
