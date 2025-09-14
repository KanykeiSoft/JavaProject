package Arrays;

public class removeDuplicates {
    public int duplicate(int[] nums){
        int w = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[w-2]){
                nums[w] = nums[i];
                w++;
            }
        }
        return w;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        removeDuplicates r = new removeDuplicates();
        int res = r.duplicate(nums);

        for(int num: nums){
            System.out.print(num);
        }


    }
}
