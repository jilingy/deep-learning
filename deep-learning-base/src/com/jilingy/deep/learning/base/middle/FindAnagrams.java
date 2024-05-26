package com.jilingy.deep.learning.base.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description 438. 找到字符串中所有字母异位词
 * @Author Jiling Yang
 * @Date 2023/5/11 22:54
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int shortLength = p.length();
        int longLength = s.length();
        if (longLength<shortLength){
            return list;
        }

        int slow=0;
        int fast=shortLength;
        while (fast!=longLength){
            int subResult=slow;
            List<String> p1 = Arrays.asList(p.split(""));
            while (slow<shortLength && p1.size()!=0){
                p1.remove(Character.toString(p.charAt(slow)));
                slow++;
            }
            if (p1.size()==0){
                list.add(subResult);
            }
        }


        return list;

    }
    public static void main(String[] args) {
        for (Integer anagram : new FindAnagrams().findAnagrams("cbaebabacd", "abc")) {
            System.out.println(anagram);
        }
    }
}
