package com.jilingy.deep.learning.base.factory.abtract;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-21
 */
public class Client {
    public static void main(String[] args) {

        // 普通店铺
        System.out.println("================普通店铺=================");
        AbstractFactory common = new CommonFactory();
        Coffee americano = common.createCoffee();
        americano.make();
        Cake cheese = common.createCake();
        cheese.make();

        System.out.println("=================甄选店铺================");
        // 甄选店铺
        AbstractFactory reserve = new ReserveFactory();
        Coffee latte = reserve.createCoffee();
        latte.make();
        Cake mousse = reserve.createCake();
        mousse.make();
    }
}
