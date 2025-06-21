package LeetCode;

import java.util.Scanner;

public class NextGreatestLetter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите буквы через пробел (например: c f j):");
        String[] input = scanner.nextLine().split(" ");
        char[] letters = new char[input.length];
        for (int i =0; i < input.length; i++){
            letters[i] = input[i].charAt(0);
        }
        System.out.println("Введите целевую букву (target):");
        char target = scanner.next().charAt(0);
        char result = nextGreater(letters, target);
        System.out.println("Результат: " + result);

    }

    public static char nextGreater(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left == letters.length ? letters[0] : letters[left];
    }
}