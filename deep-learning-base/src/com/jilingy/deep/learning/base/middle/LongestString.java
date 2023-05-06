package com.jilingy.deep.learning.base.middle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestString {
    public static void main(String[] args) {
        System.out.println(longestString(""));
    }

    public static int longestString(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String subResult = "";
            for (int j = i; j < length; j++) {
                String c = String.valueOf(s.charAt(j));
                // 如果不包含就添加
                if (!subResult.contains(c)) {
                    subResult += c;
                } else {
                    break;
                }
            }
            list.add(subResult);
        }
        return list.stream().max(Comparator.comparingInt(String::length)).get().length();
    }
}
