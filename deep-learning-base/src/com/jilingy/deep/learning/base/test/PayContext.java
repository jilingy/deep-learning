package com.jilingy.deep.learning.base.test;

public class PayContext {
    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void executeStrategy(UserInfo userInfo){
        payStrategy.pay(userInfo);
    }
}
