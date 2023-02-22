package com.jilingy.deep.learning.base.factory.builder;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-22
 */
public class IcedAmericanoBuilder implements Builder {
    private Coffee coffee = new Coffee();

    @Override
    public void setLabel() {
        this.coffee.setLabel("冰美式");
    }

    @Override
    public void setTemperature() {
        this.coffee.setTemperature("冰水");
    }

    @Override
    public void setExpresso() {
        this.coffee.setExpresso("浓缩咖啡2泵");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
