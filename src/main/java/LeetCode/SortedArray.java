package LeetCode;

public class SortedArray {
    public void findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid; // Найден элемент
                if (isFirst) {
                    right = mid - 1; // Продолжаем искать в левой части
                } else {
                    left = mid + 1; // Продолжаем искать в правой части
                }
            } else if (nums[mid] < target) {
                left = mid + 1; // Ищем в правой части
            } else {
                right = mid - 1; // Ищем в левой части
            }
        }

        if (result != -1) {
            System.out.println((isFirst ? "Первый" : "Последний") + " индекс элемента " + target + ": " + result);
        } else {
            System.out.println("Элемент " + target + " не найден.");
        }


    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0, right = nums.length - 1;

        // Найти первый индекс
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                result[0] = mid; // Найден первый индекс
                right = mid - 1; // Продолжаем искать в левой части
            }
        }

        left = 0;
        right = nums.length - 1;

        // Найти последний индекс
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                result[1] = mid; // Найден последний индекс
                left = mid + 1; // Продолжаем искать в правой части
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        SortedArray sortedArray = new SortedArray();
        sortedArray.findBound(nums, target, true); // Найти первый индекс
        sortedArray.findBound(nums, target, false); // Найти последний индекс
    }
}