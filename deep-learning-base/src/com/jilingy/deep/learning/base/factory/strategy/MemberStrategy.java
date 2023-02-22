package com.jilingy.deep.learning.base.factory.strategy;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-02-14
 */
public interface MemberStrategy {
    /**
     * 一个计算价格的抽象方法
     * @param price-咖啡价格
     * @param n-数量
     * @return
     */
    double calcPrice(double price, int n);
}
