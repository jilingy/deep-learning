package com.jilingy.deep.learning.base.middle;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/8 17:22
 */
public class LongestPalindromeSolution {

    public String longestPalindrome(String s) {
        int maxLength = 0;
        int maxLeft = 0;
        int maxRight = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int left = s.length(); left >= 0; left--) {
            for (int right = left; right < s.length(); right++) {
                boolean b = s.charAt(left) == s.charAt(right);
                if (left == right || b && right - left <= 2 || dp[left + 1][right - 1] && b) {
                    dp[left][right] = true;
                    if (right - left + 1 > maxLength) {
                        maxLength = right - left + 1;
                        maxLeft = left;
                        maxRight = right + 1;
                    }

                }
            }
        }
        return s.substring(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        LongestPalindromeSolution longestPalindromeSolution = new LongestPalindromeSolution();
        System.out.println(longestPalindromeSolution.longestPalindrome("aaaa"));
        System.out.println(longestPalindromeSolution.longestPalindrome("babad"));
    }

}
