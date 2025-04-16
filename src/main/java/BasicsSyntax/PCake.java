package BasicsSyntax;

//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить
//        за n пирожков.
//
//        Входные данные
//        Программа получает на вход три числа: a, b, n.
//
//        Выходные данные
//        Программа должна вывести два числа: стоимость покупки в рублях и копейках.

import java.util.Scanner;

public class PCake {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int kopeiki = a * 100 + b;
        int totalInKopecks = kopeiki * n;

        int totalRub = totalInKopecks / 100;
        int totalKop = totalInKopecks % 100;
        System.out.println(totalRub + " " + totalKop);
    }
}
