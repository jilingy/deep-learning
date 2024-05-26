package com.jilingy.deep.learning.base.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Description 快速排序：hoare方法
 * @Author Jiling Yang
 * @Date 2023/5/6 11:33
 */
public class QuickSort2 {
    public static void main(String[] args) {
        //int[] array = {1, 4, 3, 1};
        int[] array = {4,5,6,3,1};
        quick(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    static void quick(int[] array, int left, int right) {
        if (left > right) {
            return;
        }

        int start = left;
        int end = right;
        int pivot = array[start];
        while (start < end) {
            while (array[end] >= pivot && start < end) {
                end--;
            }
            while (array[start] <= pivot && start < end) {
                start++;
            }

            int mid = array[start];
            array[start] = array[end];
            array[end] = mid;
        }

        array[left] =  array[end];
        array[end] = pivot;


        quick(array, left, end - 1);
        quick(array, end + 1, right);
    }
}
