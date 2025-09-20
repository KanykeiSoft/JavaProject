package Arrays;

import java.util.Arrays;

public class Rotate {
    public void rotateNum(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        // 1. Разворачиваем весь массив
        reverse(nums,0, n -1);

        // 2. Разворачиваем первые k элементов
        reverse(nums, 0, k-1);

        // 3. Разворачиваем оставшиеся элементы
        reverse(nums, k, n-1);


    }
    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        Rotate r  =new Rotate();
        r.rotateNum(nums, k);
       for(int num: nums){
           System.out.print(num + " ");
       }
    }
}
