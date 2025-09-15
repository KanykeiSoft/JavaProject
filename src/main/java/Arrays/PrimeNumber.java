package Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        int factor = 0;
        int square_root = (int) Math.floor(Math.sqrt(n));
        System.out.println("Number: " + n);
        System.out.println("Square root: " + square_root);
        for(int i = 1; i < square_root; i++){
            if(n % i == 0){
                factor+=2;
                System.out.println("n is divisible by " + i);
                if(i == square_root && i * i == n){
                    factor--;
                    System.out.println("n is a perfect square");
                }else{
                    System.out.println("n is divisible by " + (n / i));
                }
            }
        }
        System.out.println("Total number of divisors = " + factor);
    }
}
