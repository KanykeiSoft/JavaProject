package BasicsSyntax;

import java.util.Scanner;

public class Factorial {
    // Рекурсивный метод для вычисления факториала
        public static int factorial(int n) {
            if (n == 0) {
                return 1; // базовый случай
            }
            return n * factorial(n - 1); // рекурсивный случай
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // создаём сканнер для ввода

            System.out.print("Введите число: ");
            int number = scanner.nextInt(); // считываем число

            int result = factorial(number); // вызываем рекурсивную функцию

            System.out.println("Факториал числа " + number + " равен: " + result);

            scanner.close(); // закрываем сканнер
        }
    }




