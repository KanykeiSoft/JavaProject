package LeetCode;

import java.util.HashMap;

public class Pref {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // важный момент: перед стартом сумма 0 встречалась 1 раз

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num; // текущий prefix sum

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // нашли подходящий префикс
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(subarraySum(nums, k)); // должен вывести 2
    }
}
