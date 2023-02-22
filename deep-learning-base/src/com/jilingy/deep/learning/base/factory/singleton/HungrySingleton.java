package com.jilingy.deep.learning.base.factory.singleton;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-21
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 私有化构造器，私有化的原因是【单例模式 在内存里仅仅只创建一次对象的设计模式，只能在这个类里创建实例】
     */
    private HungrySingleton() {
    }

    public static  HungrySingleton getInstance() {
        return instance;
    }

}
