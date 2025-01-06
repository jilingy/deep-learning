package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2024/11/22 23:33
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                a[i] = 0;
            } else if (i == 1) {
                a[i] = 1;
            } else if (i == 2) {
                a[i] = 2;
            } else {
                a[i] = a[i - 1] + a[i - 2];
            }

        }
        return a[n];
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
