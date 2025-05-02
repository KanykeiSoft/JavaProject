package BasicsSyntax;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String reversed = "";
        for (int i = n.length() - 1; i >= 0; i--){
            char c = n.charAt(i);
            reversed = reversed + c;

        }
        if(n.equals(reversed)){
            System.out.println("Its polindrome");
        }else{
            System.out.println("not polindrome");
        }
    }
}
