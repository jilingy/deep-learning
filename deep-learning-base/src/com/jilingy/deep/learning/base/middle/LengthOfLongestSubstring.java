package com.jilingy.deep.learning.base.middle;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/9 15:05
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();

        Set set = new HashSet<Character>();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while (start < length) {
            while (end < length && !set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
            }
            start=end-1;
            if (end > maxLength) {
                maxLength = end;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        lengthOfLongestSubstring.lengthOfLongestSubstring("abcabc");

    }
}
