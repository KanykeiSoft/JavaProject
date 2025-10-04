package Arrays;

public class EuclideanGCD {

    public static int gcd(int a, int b){
        while (b != 0) {      // пока b не станет 0
            int r = a % b;    // остаток
            a = b;            // новое a = старое b
            b = r;            // новое b = остаток
        }
        return a; // когда b == 0, a — это НОД
    }
        //gcd(a,b)=gcd(b,amodb)
        //рекурсивно
//        if(b == 0){



        //return  gcd(b, a % b);
    
    public static void main(String[] args) {
        int a = 24;
        int b = 15;
        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);

    }
}
