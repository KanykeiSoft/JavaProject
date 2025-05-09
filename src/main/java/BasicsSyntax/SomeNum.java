

import java.util.Scanner;

public class SomeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int d = sc.nextInt();
       int curr = 1;
       int sum = 0;
       for (int i = 0; i <= d; i++) {
           sum += curr;
           curr *= 2;


       }
        System.out.println(sum);

    }
}
