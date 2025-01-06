package common;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2024/11/23 21:37
 */
public class Easy {
    /**
     * 283. 移动零
     */
    public static void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int mid = nums[right];
                nums[right] = nums[left];
                nums[left] = mid;
                left++;
            }
            right++;
        }
    }

    /**
     * 11. 盛最多水的容器
     */
    public static int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int maxWater = 0;
        while (left < right) {
            maxWater = Math.max(maxWater, Math.min(nums[left], nums[right]) * (right - left));
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }


    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,3,12};
        moveZeroes(a);
        System.out.println(a);
    }
}
