package com.jilingy.deep.learning.base.reflect.sms;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/6 18:27
 */
public class SmsServiceProxy {
    private SmsService smsService;

    public SmsServiceProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    void sendPlus(String message){
        System.out.println("前置增强");
        smsService.send(message);
        System.out.println("后置增强");
    }
}
