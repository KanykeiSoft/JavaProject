package Bank_app;

import java.util.*;

class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // чтобы не брать одно число дважды
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        // Базовый случай: если текущая перестановка готова
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current)); // добавляем копию
            return;
        }

        // Перебираем все числа
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // если уже использовали это число — пропускаем

            // Выбираем число
            current.add(nums[i]);
            used[i] = true;

            // Уходим в рекурсию
            backtrack(nums, current, used, result);

            // Возврат (отмена выбора)
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    // Пример запуска
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = s.permute(nums);
        System.out.println(res);
    }
}

