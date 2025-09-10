package Arrays;

public class RemoveNum {
    public int numRemove(int[] nums, int val){
        int w = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[w++] = nums[i];

            }

        }
        return w;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        RemoveNum p = new RemoveNum();
        int res = p.numRemove(nums, val);
        System.out.println(res);



    }
}
