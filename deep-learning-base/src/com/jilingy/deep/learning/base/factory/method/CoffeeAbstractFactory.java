package com.jilingy.deep.learning.base.factory.method;

/**
 * @author: YangJiling
 * @Description: 抽象工厂-咖啡工厂
 * @date: 2022-09-21
 */
public interface CoffeeAbstractFactory {
    /**
     * 创建咖啡对象所以是create不是make
     *
     * @return 咖啡对象
     */
    Coffee createCoffee();
}
