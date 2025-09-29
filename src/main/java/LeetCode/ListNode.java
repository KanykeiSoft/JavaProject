package LeetCode;

import java.util.Arrays;

public class ListNode {

    public static void main(String[] args) {

        // Example of binary search on a sorted array
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Index of target: " + result);





      //write me some code where use web api


        }
}
