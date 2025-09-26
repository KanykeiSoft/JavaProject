package Arrays;

public class EuclideanGCD {

    public static int gcd(int a, int b){
//        while(b != 0){
//            int r = a % b;
//            a = b;
//            b = r;
        //gcd(a,b)=gcd(b,amodb)
        //рекурсивно
        if(b == 0){
            return a;
       }

        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 15;
        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);

    }
}
