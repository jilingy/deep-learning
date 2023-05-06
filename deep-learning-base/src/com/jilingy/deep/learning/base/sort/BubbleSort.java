package com.jilingy.deep.learning.base.sort;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 45, 67, 2, 4};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tempt = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempt;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
