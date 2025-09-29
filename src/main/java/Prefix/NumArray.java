package Prefix;

public class NumArray {
    private int[] prefix;
    public NumArray(int[] nums){
        int n = nums.length;;
        prefix = new int[n+1];
        prefix[0] = 0;

        for (int i = 0; i < n; i++){
            prefix[i+1]= prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right+1] - prefix[left];
    }
    public void printPrefix() {
        System.out.print("prefix = [ ");
        for (int val : prefix) {
            System.out.print(val + " ");
        }
        System.out.println("]");
    }
}
