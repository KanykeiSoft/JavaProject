package DateTime;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  date (year-month-day): ");
        String input = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(input); // Парсим дату
            String dayOfWeek = date.getDayOfWeek()
                    .getDisplayName(TextStyle.FULL, new Locale("en")); // День недели по-русски

            System.out.println("This day is  " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("❗ is not correct! ");
        }
    }
}
