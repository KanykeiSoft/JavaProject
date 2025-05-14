package BasicsSyntax;

import java.util.Scanner;

public class TimeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int minutesInDay = n % 1440;
        int hours = minutesInDay / 60;
        int minutes = minutesInDay % 60;

        System.out.println(hours + " " + minutes);
    }
}
