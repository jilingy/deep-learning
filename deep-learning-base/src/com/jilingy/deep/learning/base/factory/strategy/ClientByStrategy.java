package com.jilingy.deep.learning.base.factory.strategy;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-02-14
 */
public class ClientByStrategy {
    public static void main(String[] args) {
        // 具体行为策略
        // 接口回调（向上转型）
        MemberStrategy commonMemberStrategy = new CommonMemberStrategy();
        MemberStrategy silverMemberStrategy = new SilverMemberStrategy();
        MemberStrategy goldenMemberStrategy = new GoldenMemberStrategy();

        // 用户选择不同策略
        MemberContext primaryContext = new MemberContext(commonMemberStrategy);
        MemberContext intermediateContext = new MemberContext(silverMemberStrategy);
        MemberContext advanceContext = new MemberContext(goldenMemberStrategy);

        //计算一本300块钱的书
        System.out.println("普通会员的价格：" + primaryContext.executeStrategy(30, 1));// 普通会员：300
        System.out.println("中级会员的价格：" + intermediateContext.executeStrategy(30, 1));// 中级会员 270
        System.out.println("高级会员的价格：" + advanceContext.executeStrategy(30, 1));// 高级会员240
    }
}
