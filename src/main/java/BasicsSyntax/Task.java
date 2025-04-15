package BasicsSyntax;

import java.util.Scanner;

//Входные данные
//Вводятся целые числа a и b. Гарантируется, что a не превосходит b.
//
//        Выходные данные
//Выведите все числа на отрезке от a до b, являющиеся полными квадратами.
//Если таких чисел нет, то ничего выводить не нужно.


public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        for (int i = a; i <= b; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) {
                System.out.print(i);
            }
        }


        }


    }

