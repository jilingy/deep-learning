package com.jilingy.deep.learning.base.middle;

public class MaxArea {
    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(array));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            int side = height[left] > height[right] ? height[right] : height[left];
            int width = right - left;
            if (side * width > area) {
                area = side * width;
            }
            if (height[left] >= height[right]) {
                right -= 1;
            } else if (height[left] < height[right]) {
                left += 1;
            }
        }
        return area;
    }
}
