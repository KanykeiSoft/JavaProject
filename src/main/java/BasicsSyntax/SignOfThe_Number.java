package BasicsSyntax;

//В математике функция sign(x) (знак числа) определена так:
//sign(x) = 1,   если x > 0,
//sign(x) = -1, если x < 0,
//sign(x) = 0,   если x = 0.
//
//Для данного числа x выведите значение sign(x).


import java.util.Scanner;

public class SignOfThe_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input > 0){
            System.out.println("1");
        }if(input < 0){
            System.out.println("-1");
        }if (input == 0){
            System.out.println("0");
        }
    }
}
