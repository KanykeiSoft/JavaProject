package BasicsSyntax;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a <= 100 && b <=100){
            double c = Math.sqrt(a * a + b * b);
            System.out.println(c);
        }
    }
}
