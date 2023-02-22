package com.jilingy.deep.learning.base.test;


import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private List<Good> goodList;

    private PayContext payContext;

    public List<Good> addGood(Good good){

        if (Objects.isNull(goodList)){
            this.goodList= Collections.emptyList();
        }
        this.goodList.add(good);
        return goodList;
    }

    public double calculateTotalPrice (List<Good>  goodList){
        return goodList.stream().mapToDouble(Good::getPrice).sum();
    }

    private static volatile ShoppingCart instance = null;

    private ShoppingCart(List<Good> goodList) {
        this.goodList = goodList;
    }

    public static ShoppingCart getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (ShoppingCart.class) {
                if (Objects.isNull(instance)) {
                    instance = new ShoppingCart(getInstance().goodList);
                }
            }
        }
        return instance;
    }

    public void pay (UserInfo userInfo){
        payContext.executeStrategy(userInfo);
    }
}
