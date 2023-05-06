package com.jilingy.deep.learning.base.middle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @Description 28. 找出字符串中第一个匹配项的下标
 * @Author Jiling Yang
 * @Date 2023/5/5 10:12
 */
public class Haystack {
    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length()> haystack.length()){
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (i+needle.length()<=haystack.length()&&Objects.equals(haystack.substring(i,i+needle.length()), needle) ){
                return i;
            }else {
                continue;
            }
        }
        return -1;

    }
}
