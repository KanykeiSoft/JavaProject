package BasicsSyntax;

public class BinarySearch {
    public static int binarySearchExample(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;

            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 11 ,13};
        int target = 11;
        int result = binarySearchExample(nums, target);
        if(result != -1){
            System.out.println("Число найдено на позиции:"  + result);
        }else {
            System.out.println("Число не найдено.");
        }
    }
}
