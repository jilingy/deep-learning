package com.jilingy.deep.learning.base.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        // 1. 创建目标对象
        Rent rent = new Landlord();

        // 2. 创建InvocationHandler对象
        InvocationHandler agencyHandler = new AgencyHandler(rent);

        // 3. 创建代理对象-中介
        Rent agency = (Rent) Proxy.newProxyInstance(rent.getClass().getClassLoader(), rent.getClass().getInterfaces(), agencyHandler);

        //
        System.out.println(agency.rent(1));
    }
}
