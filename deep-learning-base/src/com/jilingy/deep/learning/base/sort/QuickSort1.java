package com.jilingy.deep.learning.base.sort;

/**
 * 快速排序：挖坑法
 *
 * 不稳定，初始序列有序或基本有序时，时间复杂度降为O(n^2)。
 */
public class QuickSort1 {
    static int[] quick_sort(int array[], int l, int r) //返回调整后基准数的位置
    {
        //Swap(array[l], array[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
        int i = l, j = r, x = array[l];

        while (i < j) {
            // 必须while因为这个while是为了循环移动右边的指针
            // 必须and一个条件判断当前j这个位置是否大于基准值，大于才能向左走
            while (i < j && array[j] >= x) {
                j--;
            }

            /**
             * 跳出循环说明：1. i不再小于j 2.右指针小于当前的基准值
             * 如果i不小于j：就没必要交换了，说明两个指针是同一个位置了
             * 如果i小于j：右指针小于当前的基准值，把左指针留下的坑补上 并且 左指针向右移动1次
             */
            if (i<j){
                array[i] = array[j];
                i++;
            }

            // 必须while因为这个while是为了循环移动左边的指针
            // 必须and一个条件判断当前j这个位置是否大于基准值，小于才能向右走
            while (i < j && array[i] < x) {
                i++;
            }

            /**
             * 跳出循环说明：1. i不再小于j 2.左指针大于当前的基准值
             * 如果i不小于j：就没必要交换了，说明两个指针是同一个位置了
             * 如果i小于j：左指针大于当前的基准值，把右指针留下的坑补上 并且 右指针向左移动1次
             */
            if (i<j){
                array[j] = array[i];
                j--;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 12};
        for (int i : quick_sort(array, 0, array.length-1)) {
            System.out.println(i);
        }

    }
}
