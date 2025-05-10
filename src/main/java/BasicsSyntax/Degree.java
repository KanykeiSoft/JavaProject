
package BasicsSyntax;
import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= N; i++){
            result*=2;
        }
        System.out.println(result);
    }
}
