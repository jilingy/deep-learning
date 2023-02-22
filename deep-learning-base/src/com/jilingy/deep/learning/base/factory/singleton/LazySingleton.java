package com.jilingy.deep.learning.base.factory.singleton;

import java.util.Objects;

/**
 * @author: YangJiling
 * @Description: 懒汉式
 * @date: 2022-09-21
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    /**
     * 私有化构造器，私有化的原因是【单例模式 在内存里仅仅只创建一次对象的设计模式，只能在这个类里创建实例】
     */
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        // 实例不存在，未初始化的情况下才考虑线程安全问题
        // 实例存在的情况下，线程直接返回实例不抢锁
        if (Objects.isNull(instance)) {

            // 多个线程 A,B同时进入上面的if来抢锁
            // 抢到锁的线程A进行创建实例，抢不到锁的B线程进入阻塞状态
            synchronized (LazySingleton.class) {
                // 例如线程A抢到了锁，开始创建，并创建成功
                // 线程B在线程A抢锁成功-》释放后，再次拿到锁，使用if语句判断实例是否存在，存在则返回实例，不存在则创建
                if (Objects.isNull(instance)) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;

    }
}
