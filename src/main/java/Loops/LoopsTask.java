package Loops;

import java.util.Scanner;

public class LoopsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i ++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++){
                sum+= (int)(Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();

        }
    }
}
