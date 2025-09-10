package Arrays;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int [] {1,3,4,5,6,3,9};
        int k = 9;
        int result = numsOfSubarraysWithHashMap(arr,k);
        System.out.println("Количество подмассивов: " + result);

    }
    public static int numsOfSubarraysWithHashMap(int[] nums, int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currentSum = 0;
        // {1,3,4,5,6,3,9}
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            System.out.println("CurrentSum: "+ currentSum);
            int targetSum = currentSum - k;
            System.out.println("targetSum: " + targetSum);
            if(map.containsKey(targetSum)){
                count+= map.get(targetSum);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
        }
        System.out.println("count: " + count);
        return count;
    }
}