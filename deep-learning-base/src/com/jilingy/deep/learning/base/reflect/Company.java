package com.jilingy.deep.learning.base.reflect;

/**
 * 目标类: 公司房产租赁
 */
public class Company implements Rent {
    // 目标类
    @Override
    public double rent(int amount) {
        System.out.println("目标类（公司）中的方法：租赁房子");
        return 20000.0;
    }
}
