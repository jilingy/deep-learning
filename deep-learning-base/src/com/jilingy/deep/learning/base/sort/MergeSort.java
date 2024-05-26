package com.jilingy.deep.learning.base.sort;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {2, 45, 67, 2, 4};
//        bubbleSort(array);
//        insertSort(array);
        mergeSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] array) {
        int lowIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j + 1 < array.length; j++) {
                if (array[j + 1] < array[j]) {
                    lowIndex = j + 1;
                }else{
                    continue;
                }
            }
            int mid = array[lowIndex];
            array[lowIndex] = array[i];
            array[i] = mid;
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (array[j] < array[j - 1]) {
                    int mid = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = mid;
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int mid = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = mid;
                }
            }
        }
    }
}
