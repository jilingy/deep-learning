package com.jilingy.deep.learning.base.factory.method;

/**
 * @author: YangJiling
 * @Description: 具体工厂-美式工厂
 * @date: 2022-09-20
 */
public class AmericanoFactory implements CoffeeAbstractFactory {

    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
