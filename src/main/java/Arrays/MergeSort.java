package Arrays;
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

import java.util.Arrays;

public class MergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int tail1 = m-1;
        int tail2 = n -1;
        int insertPosition = m+n-1;
        while(tail2 >= 0){
            if(nums1[tail1] > nums2[tail2]){
                nums1[insertPosition--] = nums1[tail1--];
            }else{
                nums1[insertPosition--] = nums2[tail2--];

            }

        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        int m = 3;
        int n = 3;
        MergeSort solution = new MergeSort();
        solution.merge(nums1, m,nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
}
