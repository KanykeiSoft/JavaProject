package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayTime {
   private static int year;
   private static int month;
   private static int day;

    public static void getDay() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter date (yyyy-mm-dd): ");
            String input = scanner.nextLine();
            LocalDate date = LocalDate.parse(input);

            year = date.getYear();
            month = date.getMonthValue();
            day = date.getDayOfMonth();

           DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println("Day of the week: " + dayOfWeek);

        }catch (Exception e) {
            System.out.println("❗  Invalid format! Use yyyy-mm-dd");
        }

    }

}




