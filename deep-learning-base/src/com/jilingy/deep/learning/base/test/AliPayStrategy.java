package com.jilingy.deep.learning.base.test;

public class AliPayStrategy implements PayStrategy{
    @Override
    public void pay(UserInfo userInfo) {
        System.out.println("ali支付: " + userInfo.getEmail() + "paid " + userInfo.getTotal());
    }
}
