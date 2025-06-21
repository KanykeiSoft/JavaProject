package LeetCode;

import java.util.Scanner;

public class Number_OfTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int factors = 0;
        int square_root = (int) Math.sqrt(n); // √100 = 10

        for (int i = 1; i <= square_root; i++) {
            if (n % i == 0) {
                int j = n / i; // вторая половина пары
                if (i == j) {
                    factors += 1;
                    System.out.println("Один делитель: " + i);
                } else {
                    factors += 2;
                    System.out.println("Пара делителей: " + i + " и " + j);
                }
            }
        }

        System.out.println("Общее количество делителей: " + factors);
    }
    }

