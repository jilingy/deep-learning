package com.jilingy.deep.learning.base.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TemperatureAlert
 * @Author Jiling Yang
 * @Date 2023/5/17 20:29
 */
//4.0 1.5 1.0 0.5 0.0 -0.5 0.5 0.0 -1.0 -3.0 1.0 2.0 5.0
//-3.0 1.0 2.0 5.0 4.0 1.5 1.0 0.5 0.0 -0.5 0.5 0.0 -1.0
public class TemperatureAlert {
    private static final double freezing = 0.0;
    private static final double boiling = 100.0;
    private static final double fluctuating = 0.5;
    private static final String freezingKey = "freezing";
    private static final String unfreezingKey = "unfreezing";
    private static final String boilingKey = "boiling";
    private static final String unboilingKey = "unboiling";


    public static void main(String[] args) {
        // 控制台接受参数
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] numStr = str.split(" ");
        double[] numsDouble = new double[numStr.length];
        for (int i = 0; i < numStr.length; i++) {
            numsDouble[i] = Double.parseDouble(numStr[i]);
        }

        // 如果数组长度为1，不存在比较
        if (numsDouble.length == 1) {
            System.out.print(numsDouble[0]);
            return;
        }

        // 返回结果列表
        List<Object> result = new ArrayList<>();
        result.add(numsDouble[0]);
        String state = "";

        for (int i = 1; i < numsDouble.length; i++) {
            result.add(numsDouble[i]);
            if ((numsDouble[i - 1] > freezing) && (numsDouble[i] <= freezing) && !state.equals("freezing")) {
                result.add(freezingKey);
                state = freezingKey;
            } else if ((numsDouble[i - 1] <= freezing) && (numsDouble[i] > freezing + fluctuating)) {
                result.add(unfreezingKey);
            } else if ((numsDouble[i - 1] < boiling) && (numsDouble[i] >= boiling) && !state.equals("boiling")) {
                result.add(boilingKey);
                state = boilingKey;
            } else if (numsDouble[i - 1] >= boiling && numsDouble[i] < boiling - fluctuating) {
                result.add(unboilingKey);
            }
        }

        // 打印结果
        for (Object o : result) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
