package BasicsSyntax;

import java.util.Scanner;

public class Factorial {
    // Рекурсивный метод для вычисления факториала
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            }
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(factorial(n));

        }
    }




