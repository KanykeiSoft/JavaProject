package Arrays;
//Input: nums = [9,12,5,10,14,3,10], pivot = 10
//Output: [9,5,3,10,10,12,14]

import java.util.Arrays;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        int insertPosition = 0;
        int pivotFreq = 0;
        for(int num: nums){
            if(num < pivot){
                result[insertPosition++] = num;
            }else if(num == pivot){
                pivotFreq++;

            }
        }
        while (pivotFreq > 0){
            result[insertPosition++] = pivot;
            pivotFreq--;

        }
        for(int num: nums){
            if(num > pivot){
                result[insertPosition++] = num;

            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums = new int[] {9,12,5,10,14,3,10};
        int pivot = 10;
        Solution s = new Solution();
        int[] res = s.pivotArray(nums, pivot);

        System.out.println(Arrays.toString(res));
    }

    }

