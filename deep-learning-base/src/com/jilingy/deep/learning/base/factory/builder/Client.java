package com.jilingy.deep.learning.base.factory.builder;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-22
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("================热美式===================");
        HotAmericanoBuilder hotAmericanoBuilder = new HotAmericanoBuilder();
        Director hotDirector = new Director();
        Coffee hotAmericano = hotDirector.constructCoffee(hotAmericanoBuilder);
        System.out.println(hotAmericano);

        System.out.println("================冰美式===================");
        IcedAmericanoBuilder icedAmericanoBuilder = new IcedAmericanoBuilder();
        Director icedDirector = new Director();
        Coffee icedAmericano = icedDirector.constructCoffee(icedAmericanoBuilder);
        System.out.println(icedAmericano);

        System.out.println("================简写冰美式===================");
        Coffee simpleIcedAmericano = icedDirector.constructCoffee(new IcedAmericanoBuilder());
        System.out.println(simpleIcedAmericano);
    }
}
