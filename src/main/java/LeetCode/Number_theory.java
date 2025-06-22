package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_theory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prime = new ArrayList<>();
        int org = n;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i ==0){
                System.out.println(i + " делит " + n);
                while (n % i ==0){
                    n /= i;
                    prime.add(i);
                    System.out.println("Делим на " + i + " → теперь n = " + n);
                }
            }
        }
        if (n > 1) {
            prime.add(n);
            System.out.println(n + " — остаток, тоже простой множитель");
        }
    }
}
