package BasicsSyntax;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num > 0){
                count++;

            }

        }
        System.out.println(count);
    }
}
