package BasicsSyntax;

import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();  // Считываем вещественное число a
        int n = sc.nextInt();
         double sum = 1.0;
        double term = 1.0;

        for(int i =1; i <=n; i++){
            term *= a;
            sum += term;

        }
        System.out.println(sum);
    }
}
