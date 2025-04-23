package BasicsSyntax;

import java.util.Scanner;
//Выходные данные
//Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).

public class NumberGraet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
    }
    }

