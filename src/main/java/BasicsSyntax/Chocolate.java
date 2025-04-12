package BasicsSyntax;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int sum = n * m;
        if(k < sum  && k % n==0 || k % m == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
