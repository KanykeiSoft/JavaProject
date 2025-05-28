package BasicsSyntax;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] balls = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            balls[i] = sc.nextInt();
        }
    }
}
