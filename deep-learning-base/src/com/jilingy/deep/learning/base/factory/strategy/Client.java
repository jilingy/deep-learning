package com.jilingy.deep.learning.base.factory.strategy;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2023-02-14
 */
public class Client {
    public  Double calculationPrice(String type, Double originalPrice, int amount) {

        // 银卡会员
        if (type.equals("silverMember")) {
            return (originalPrice * amount) - originalPrice * amount * 0.1;
        }
        // 金卡会员
        if (type.equals("goldenMember")) {
            return (originalPrice * amount) - originalPrice * amount * 0.2;
        }
        // 普通会员
        return originalPrice;
    }

    public static void main(String[] args) {
        Double silverMember = new Client().calculationPrice("silverMember", 30.00, 1);
        System.out.println("银卡会员消费一杯咖啡："+ silverMember);
        Double goldenMember = new Client().calculationPrice("goldenMember", 30.00, 1);
        System.out.println("金卡会员消费一杯咖啡："+ goldenMember);


    }
}
