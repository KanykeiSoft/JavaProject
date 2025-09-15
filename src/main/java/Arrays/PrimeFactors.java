package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static List<Integer> primeFactors(int n){
        List<Integer> prime_factors = new ArrayList<>();
        int squareRoot = (int) Math.floor(Math.sqrt(n));
        for(int i = 2; i <= squareRoot; i++){
            if(n % 2==0){
                while (n % i ==0){
                    n/= i;
                    prime_factors.add(i);
                }
            }
        }
        if (n > 1){
            prime_factors.add(n);
        }
        return prime_factors;
    }
    public static void main(String[] args) {
        int n;
        Integer fromArgs = null;
         if(fromArgs != null){
             n = fromArgs;
         }else{
             Scanner sc = new Scanner(System.in);
             System.out.print("Введите n: ");
             n = sc.nextInt();
         }
        List<Integer> factors = primeFactors(n);
        System.out.println("Простые множители " + n + ": " + factors);

    }
}
