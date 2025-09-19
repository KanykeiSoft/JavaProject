package Arrays;

import java.util.Arrays;

public class Rotate {
    public void rotateNum(int[] nums, int k) {
        int n = nums.length;
        k%=n;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        Rotate r  =new Rotate();
        r.rotateNum(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
