package LeetCode;

import java.util.Scanner;

public class RemoveArrayDuplicate {
    public int removeDuplicates(int[] nums){
        int n = nums.length;
        if(n ==0){
            return 0;
        }
        int j =1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveArrayDuplicate ar = new RemoveArrayDuplicate();
        ar.removeDuplicates(nums);

    }
}
