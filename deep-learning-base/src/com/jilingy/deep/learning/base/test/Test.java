package com.jilingy.deep.learning.base.test;

import java.util.HashMap;

public class Test {
    public String numToString(int intValue) {
        try {
            if (intValue>Integer.MAX_VALUE || intValue<Integer.MIN_VALUE){
                return "";
            }
            int high = (intValue / 36) * 10;
            int low = intValue % 36;

            if (low <= 9) {
                if (low<0){
                    if (low >= -9) {
                        return String.valueOf(high + low);
                    }else {
                        low=Math.abs(low);
                        int num = (low - 10) + 65;
                        return String.valueOf((char) num);
                    }
                }
                return String.valueOf(high + low);
            } else {
                int num = (low - 10) + 65;
                return String.valueOf((char) num);
            }
        } catch (Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i +": "+ new Test().numToString(i));
        }

//        System.out.println(new Test().numToString(10));
//        System.out.println(new Test().numToString(46));

    }
}
