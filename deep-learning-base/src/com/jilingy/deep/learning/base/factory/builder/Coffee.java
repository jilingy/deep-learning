package com.jilingy.deep.learning.base.factory.builder;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-09-22
 */
public class Coffee {
    /**
     * 温度控制
     */
    private String temperature;

    /**
     * 浓缩
     */
    private String expresso;

    /**
     * 标签
     */
    private String label;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getExpresso() {
        return expresso;
    }

    public void setExpresso(String expresso) {
        this.expresso = expresso;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temperature='" + temperature + '\'' +
                ", expresso='" + expresso + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
