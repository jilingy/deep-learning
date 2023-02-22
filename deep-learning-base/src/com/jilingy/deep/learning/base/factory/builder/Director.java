package com.jilingy.deep.learning.base.factory.builder;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-22
 */
public class Director {

    public Coffee constructCoffee(Builder builder){
        builder.setExpresso();
        builder.setLabel();
        builder.setTemperature();
        return builder.getCoffee();
    }
}
