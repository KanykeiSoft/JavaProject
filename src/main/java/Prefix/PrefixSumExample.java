package Prefix;

public class PrefixSumExample {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        System.out.println("sumRange(0, 2) = " + obj.sumRange(0, 2)); // ожидаем 1
        System.out.println("sumRange(2, 5) = " + obj.sumRange(2, 5)); // ожидаем -1
        System.out.println("sumRange(1, 3) = " + obj.sumRange(1, 3)); // ожидаем -2
        System.out.println("sumRange(4, 5) = " + obj.sumRange(4, 5));
        obj.printPrefix();// ожидаем 1

    }
}
