package BasicsSyntax;

import java.util.Scanner;

public class SubStringF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
    }

    public void getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;    // 1

        for (int i = 1; i <= s.length() - k; i++) {    // 2
            String myWord = s.substring(i, i + k);
            if (smallest.compareTo(myWord) > 0) {
                smallest = myWord;
            } else if (largest.compareTo(myWord) < 0) {    // 3
                largest = myWord;
                System.out.println(largest);
            }
        }
    }
}

