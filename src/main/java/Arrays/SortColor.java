package Arrays;

public class SortColor {

    public void colors(int[] nums) {
        int zeroInsertPos = 0;

        // Позиция для вставки следующего 2 (справа)
        int twoInsertPos = nums.length - 1;

        // Итератор по массиву
        int i = 0;

        // Пока середина не пересечётся с правой границей   {2, 0, 2, 1, 1, 0};
        while (i <= twoInsertPos) {
            if (nums[i] == 0) {
                // Если встретили 0 → ставим его в начало
                swap(nums, zeroInsertPos, i);
                zeroInsertPos++;
                i++; // можно увеличить, т.к. на место i попадает уже проверенный элемент
            } else if (nums[i] == 1) {
                // Если встретили 1 → он и так должен быть посередине
                i++;
            } else { // nums[i] == 2
                // Если встретили 2 → отправляем его в конец
                swap(nums, i, twoInsertPos);
                twoInsertPos--;
                // i не увеличиваем, т.к. на место i приехал новый элемент из конца,
                // и его ещё нужно проверить
            }
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        SortColor s = new SortColor();
        int[] nums = {2, 0, 2, 1, 1, 0};
        s.colors(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }

    }


}





