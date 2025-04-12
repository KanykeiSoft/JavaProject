package BasicsSyntax;


import DateTime.DayTime;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

//Требуется определить, является ли данный год високосным. (Напомним, что год является високосным,
// если его номер кратен 4, но не кратен 100, а также если он кратен 400.)
//
//Входные данные
//Вводится единственное число - номер года (целое, положительное, не превышает 30000).
//
//Выходные данные
//Требуется вывести слово YES, если год является високосным и NO - в противном случае.
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
