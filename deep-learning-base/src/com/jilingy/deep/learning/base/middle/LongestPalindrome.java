package com.jilingy.deep.learning.base.middle;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));

    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        boolean[][] dp = new boolean[length][length];
        int start = 0;
        int maxLength = 1;
        for (int right = 1; right < length; right++) {
            for (int left = 0; left < right; left++) {
                // 如果左右两边的字符不相等，保持dp里的false
                if (s.charAt(left) != s.charAt(right)) {
                    continue;
                }

                // 如果左右两边的字符相等，并且右边减去左边小于等于2：例如：aba，aa的情况，dp设置成true
                if (right - left <= 2) {
                    dp[left][right] = true;
                } else {
                    // 状态转移方程式
                    dp[left][right] = dp[left + 1][right - 1];
                }
                // 如果dp[left][right]为true以及右边减去左边大大于最大长度
                if (dp[left][right] && right - left >= maxLength) {
                    maxLength = right - left + 1;
                    start = left;

                }
            }
        }
        return s.substring(start, start + maxLength);
    }
}
