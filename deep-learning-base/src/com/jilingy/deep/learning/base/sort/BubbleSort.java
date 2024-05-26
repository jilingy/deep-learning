package com.jilingy.deep.learning.base.sort;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {2, 45, 67, 2, 4, 8, 1};
        int[] array = {2, 1, 1, 1, 2};
//        bubbleSort(array);
//        insertSort(array);
//        selectSort(array);
        //mergeSort(array);

        int[] array1 = {1,1,1,1,1};
        int[] array2 = {2, 1, 1, 1, 2};
        int[] array3 = {4, 6};
        quickSort(array1, 0, array1.length - 1);
        quickSort(array2, 0, array2.length - 1);
        quickSort(array3, 0, array3.length - 1);

        for (int i : array1) {
            System.out.print(i);
            System.out.println();
        }
//        for (int i : array2) {
//            System.out.print(i);
//            System.out.println();
//        }
//        for (int i : array3) {
//            System.out.print(i);
//            System.out.println();
//        }
    }

    // 选到最小的数字下标换到前面
    public static void selectSort(int[] array) {
        int lowIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j + 1 < array.length; j++) {
                if (array[j + 1] < array[j]) {
                    lowIndex = j + 1;
                } else {
                    continue;
                }
            }
            int mid = array[lowIndex];
            array[lowIndex] = array[i];
            array[i] = mid;
        }
    }

    // 一个个数字往前插
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

    public static void mergeSort(int[] array) {
        // 5/2=2 ,3/2=3
        //    int[] array = {2, 45, 67, 2, 4};
        int mid = array.length / 2;
        int[] result = new int[array.length];

        int left = 0;
        int right = mid + 1;
        int start = 0;

        while (start < result.length && start <= mid) {
            if (array[right] <= array[left]) {
                result[start] = array[right];
                start++;
                right++;
            } else {
                result[start] = array[left];
                start++;
                left++;
            }
        }

        while (left <= mid) {
            result[start] = array[left];
            start = start + 1;
            left = left + 1;
        }

        while (start < right) {
            result[start] = array[left];
            start = start + 1;
            left = left + 1;
        }

        for (int i : array) {
            System.out.println(i);
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

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int start = left;
        int end = right;
        int pivot = array[left];
        while (start < end) {
            while (start < end && array[end] >= pivot) {
                end--;
            }
            while (start < end && array[start] <= pivot) {
                start++;
            }
            int mid = array[start];
            array[start] = array[end];
            array[end] = mid;
        }
        array[left] = array[start];
        array[start] = pivot;

        quickSort(array, left, start);
        quickSort(array, start + 1, right);

    }
}

