package com.jilingy.deep.learning.base.reflect.sms;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/6 18:29
 */
public class SmsClient {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();

        // 静态代理
//        SmsServiceProxy smsServiceProxy = new SmsServiceProxy(smsService);
//        smsServiceProxy.sendPlus("java");

        // 动态代理
        SmsInvocationHandler smsInvocationHandler = new SmsInvocationHandler(smsService);
        SmsService proxy = (SmsService) Proxy.newProxyInstance(smsService.getClass().getClassLoader(), smsService.getClass().getInterfaces(), smsInvocationHandler);
        proxy.send("2");
    }
}
