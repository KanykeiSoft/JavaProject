package BasicsSyntax;

import java.util.Scanner;
//Входные данные
//Вводится число N, а затем N чисел.
//
//Выходные данные
//Подсчитайте и выведите, сколько среди данных N чисел нулей

//int sum = 0;                // переменная для хранения суммы
//
//        for (int i = 0; i < N; i++) {
//int number = scanner.nextInt();  // читаем очередное число
                   // добавляем к сумме
//        }
//
//                System.out.println(sum);

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                count++;

            }

        }
        System.out.println(count);  // выводим общее количество нулей
        sc.close();
    }
}











