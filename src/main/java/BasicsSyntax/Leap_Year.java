package BasicsSyntax;


import DateTime.DayTime;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Leap_Year {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();

      if ((input % 4 == 0 && input % 100 != 0) || (input % 400 == 0)) {
         System.out.println("YES");
      } else {
         System.out.println("NO");
      }
   }




}
