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
        int[] array = {10, 24, 2, 45};
        int[] array1 = {2, 24, 45, 10};
        quick(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    static void quick(int[] array, int left, int right) {
        if (left>right){
            return;
        }

        int start = left;
        int end = right;

        int base = array[start];// {10, 2, 24, 45};
        while (start != end) {
            // 右边开始找到比基准值小的位置停下
            while (array[end] >= base && start < end) {
                --end;
            }
            // 左边开始找到比基准值大的位置停下
            while (array[start] <= base && start < end) {
                ++start;
            }
            int midlle = array[start];
            array[start] = array[end];
            array[end] = midlle;
        }

        array[left] =  array[start];
        array[start] = base;

        quick(array, left, end-1);
        quick(array, start+1, right);
    }
}
