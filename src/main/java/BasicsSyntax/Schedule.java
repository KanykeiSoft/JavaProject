package BasicsSyntax;



import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();  // номер урока

                int lessons = n * 45;

                int shortBreaks = (n - 1) - (n - 1) / 2;
                int longBreaks = (n - 1) / 2;

                int breaks = shortBreaks * 5 + longBreaks * 15;

                int totalMinutes = 9 * 60 + lessons + breaks;

                int hours = totalMinutes / 60;
                int minutes = totalMinutes % 60;

                System.out.println(hours + " " + minutes);
            }
        }




