package MethodJ;

public class MinMaxFinder {

    public static void  printMaxNum(int[] number){
        if (number == null || number.length == 0) {
            return;
        }
        int maxNumber = number[0];
        for (int currentNumber : number){
            if(currentNumber > maxNumber){
                maxNumber =currentNumber;
            }
        }
        System.out.println("Max number " + maxNumber);
    }
    public static void printMinNum(int[] number){
        if (number == null || number.length == 0) {
            return;
        }
        int minNumber = number[0];

        for (int currentNumber : number){
            if(currentNumber < minNumber){
                minNumber =currentNumber;
            }
        }
        System.out.println("Max number " + minNumber);
    }



    public static void main(String[] args) {
        int[] numbers = {10,4,8,2,23,35,11,9,37};
        MinMaxFinder.printMaxNum(numbers);
        MinMaxFinder.printMinNum(numbers);

    }
}
