package com.jilingy.deep.learning.base.factory.builder;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-22
 */
public interface Builder {
    /**
     * 打标签
     */
    void setLabel();

    /**
     * 温度控制
     */
    void setTemperature();

    /**
     * 浓缩咖啡控制
     */
    void setExpresso();

    /**
     * 建造：获得咖啡
     * @return 咖啡
     */
    Coffee getCoffee();

}
