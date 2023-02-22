package com.jilingy.deep.learning.base.factory.simple;

import java.util.Objects;

/**
 * @author: YangJiling
 * @Description: 简单工厂
 * @date: 2022-09-20
 */
public class SimpleFactory {
    public static final String LATTE = "latte";
    public static final String AMERICANO = "americano";

    public Coffee createCoffee(String type) throws Exception {

        if (Objects.equals(type, LATTE)) {
            // 当type等于拿铁的时候，创建拿铁咖啡对象
            return new Latte();
        } else if (Objects.equals(type, AMERICANO)) {
            // 当type等于美式的时候，创建美式咖啡对象
            return new Americano();
        } else {
            throw new Exception();
        }
    }
}
