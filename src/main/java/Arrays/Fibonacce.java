package Arrays;

public class Fibonacce {
    public static int fib(int n) {
        if (n == 0) return 0;   // базовый случай 1
        if (n == 1) return 1;   // базовый случай 2
        return fib(n - 1) + fib(n - 2); // рекурсивный вызов
    }

    public static void main(String[] args) {
        int n = 4; // ← здесь можно задать число
        int result = fib(n);
        System.out.println("fib(" + n + ") = " + result);
    }


}
