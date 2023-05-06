package com.jilingy.deep.learning.base.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 必须实现InvocationHandler，完成代理类必须要的方法，以及功能增强
 */
public class AgencyHandler implements InvocationHandler {
    // 传入的目标对象初始化
    private Object target = null;

    // 动态代理：目标是活动的，不是固定的，需要传入进来
    // 传入是谁，代理的就是谁
    public AgencyHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy-代理对象
     * @param method-代理的方法
     * @param args-方法参数
     * @throws Throwable-抛出异常
     * @return: 代理对象
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        result = method.invoke(target, args);

        if (result != null) {
            double price = (double) result;
            price *= 1.5;
            result = price;
        }
        System.out.println("附送小区地图一张！");
        return result;
    }
}
