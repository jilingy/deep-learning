package com.jilingy.deep.learning.base.factory.strategy;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-02-14
 */
public class SilverMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double price, int n) {
        return (price * n) - price * n * 0.1;
    }
}
