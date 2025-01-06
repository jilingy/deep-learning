package common;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2025/1/6 21:49
 */
public class Quick {

    public static int partition(int[] l, int left, int right) {
        int pv = l[left];
        int lf =left;
        int rt = right;
        while (lf<rt){
            while (lf<rt && l[rt]>pv){
                rt--;
            }
            while (lf<rt && l[lf]<=pv){
                lf++;
            }
            swap(l, lf,rt);
        }
        swap(l, left,lf);
        return lf;
    }

    public static void swap(int[] l, int left, int right){
        int mid = l[left];
        l[left] = l[right] ;
        l[right]  = mid;
    }

    public static void quick(int[] l, int left, int right) {
        if (left>=right){
            return;
        }
        int partition = partition(l,left,right);
        quick(l, left, partition-1);
        quick(l, partition+1, right);

    }

    public static void main(String[] args) {
        int[] a = {2,1,2,4,5,35,4,6};
        quick(a, 0 , a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
