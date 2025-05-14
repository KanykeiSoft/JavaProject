package BasicsSyntax;

import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i <n; i+=2){
            System.out.println(array[i] + " ");
        }

    }
}
