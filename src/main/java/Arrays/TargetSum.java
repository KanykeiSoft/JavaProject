package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {
    public int[] targetNum(int [] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if(map.containsKey(res)){
               return new int[] { map.get(res), i};

            }
            map.put(nums[i], i);
        }


        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        TargetSum sum = new TargetSum();
       int[] result =  sum.targetNum(nums, target);
        System.out.println(Arrays.toString(result));


    }
}

