package Set_simple;

import java.util.HashMap;
import java.util.HashSet;

public class Set_Main {
    public static HashSet<Integer> removeDuplicate(int[] arr){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        boolean isAdded;
        for (int num: arr){
            isAdded = uniqueNumbers.add(num);
            if (!isAdded){
                System.out.println("Duplicate number " + num + " Not added in the set");
            }
        }
        return uniqueNumbers;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,45,67,89,80,90,4};
        HashSet<Integer> uniqueNumbers = Set_Main.removeDuplicate(arr);
        System.out.println("Unique number");
        for (int num : uniqueNumbers){
            System.out.print(num + " ");
        }




    }
}
