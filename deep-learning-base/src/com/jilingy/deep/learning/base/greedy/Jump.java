package greedy;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2024/11/21 22:18
 */
public class Jump {
    public static boolean canJump(int[] nums) {
        int length = nums.length;
        int maxDis = 0;
        if (length==1){
            return true;
        }
        for (int i = 0; i < length; i++) {
            maxDis = Math.max(i + nums[i] , maxDis);
            if (i==maxDis){
                break;
            }
        }
        return maxDis >= length;
    }


    public static void main(String[] args) {
        int[] a = new int[]{2,0,0};
        System.out.println( canJump(a));
    }
}
