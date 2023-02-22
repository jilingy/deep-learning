package com.jilingy.deep.learning.base.test;

public class WechatPayStrategy implements PayStrategy{
    @Override
    public void pay(UserInfo userInfo) {
        System.out.println("微信支付: " + userInfo.getWetChatNumber() + "paid " + userInfo.getTotal());
    }
}
