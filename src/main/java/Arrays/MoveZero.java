package Arrays;

public class MoveZero {
    public int zeroToOne(int[] nums){
        if(nums == null || nums.length ==0){
            return 1;
        }
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] != 0){
               nums[r++] = nums[i];
           }
        }
        while(r< nums.length){
            nums[r++] = 0;
        }
        return r;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        MoveZero m = new MoveZero();

         m.zeroToOne(nums);
         for (int s: nums){
             System.out.print(s);
         }


    }
}
