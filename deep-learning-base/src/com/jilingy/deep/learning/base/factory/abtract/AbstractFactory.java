package com.jilingy.deep.learning.base.factory.abtract;

/**
 * @author: YangJiling
 * @Description: 抽象工厂
 * @date: 2022-09-21
 */
public interface AbstractFactory {


    /**
     * 创建咖啡对象所以是create不是make
     *
     * @return 咖啡对象
     */
    Coffee createCoffee();

    /**
     * 创建蛋糕对象所以是create不是make
     *
     * @return 蛋糕对象
     */
    Cake createCake();
}
