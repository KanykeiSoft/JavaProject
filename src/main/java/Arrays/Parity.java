package Arrays;

import java.util.Arrays;

public class Parity {
    public int[] sortByArray(int[] nums) {
        int n = nums.length;
        int even = 0; // указатель на чётные индексы (0,2,4,…)
        int odd = 1;  // указатель на нечётные индексы (1,3,5,…)

        while (even < n && odd < n) {
            if (nums[even] % 2 == 0) {
                // на чётном индексе чётное → всё правильно
                even += 2;
            } else if (nums[odd] % 2 != 0) {
                // на нечётном индексе нечётное → всё правильно
                odd += 2;
            } else {
                // оба стоят не на своих местах → меняем местами
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        Parity p = new Parity();
        int[] res = p.sortByArray(nums);

        System.out.println(Arrays.toString(res));
        // Вывод: [2, 3, 4, 7]
        // Чётные числа (2,4) на чётных индексах (0,2)
        // Нечётные числа (3,7) на нечётных индексах (1,3)
    }
}