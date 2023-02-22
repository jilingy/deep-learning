package com.jilingy.deep.learning.base.factory.strategy;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-02-14
 */
public class MemberContext {
    /**
     * 会员折扣策略接口
     */
    private MemberStrategy memberStrategy;

    /**
     * 注入构造方法
     *
     * @param memberStrategy-策略
     */
    public MemberContext(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * 计算价格
     *
     * @param price-咖啡价格
     * @param n-数量
     * @return
     */
    public double executeStrategy(double price, int n) {
        // 通过接口变量调用对应的具体策略
        return memberStrategy.calcPrice(price, n);
    }
}
