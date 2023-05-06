package com.jilingy.deep.learning.base.reflect;

/**
 * 目标类: 二房东
 */
public class SecondLandlord implements Rent {
    // 目标类
    @Override
    public double rent(int amount) {
        System.out.println("目标类（二房东）中的方法：租赁房子");
        return 1500.0;
    }
}
