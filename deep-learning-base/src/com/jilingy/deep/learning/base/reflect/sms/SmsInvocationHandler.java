package com.jilingy.deep.learning.base.reflect.sms;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/6 22:20
 */
public class SmsInvocationHandler implements InvocationHandler {
    private Object target;

    public SmsInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(target, args);
        if (res != null) {
            Integer num = (Integer) res;
            res = num;
        }
        System.out.println("增强");
        return res;
    }
}
