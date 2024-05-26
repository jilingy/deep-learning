package com.jilingy.deep.learning.base.reflect.sms;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/6 18:26
 */
public class SmsServiceImpl implements SmsService{
    @Override
    public void send(String message) {
        System.out.println("SmsServiceImpl:" + message);
    }
}
