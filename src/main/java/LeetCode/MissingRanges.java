package LeetCode;

import BasicsSyntax.Task;
import java.util.*;

public class MissingRanges{
    public static void main(String[] args) {
            MissingRanges s = new MissingRanges();

        int[] test = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missing = s.Tsk(test);
        System.out.println("Исходный массив:");
        for(int i = 0; i< test.length; i++){
            System.out.println(test[i] + (i == test.length -1 ? " ": ", "));
        }

        System.out.println("ПРОПУЩЕННОЕ ЧИСЛО" + missing);
    }
    public int Tsk(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums){
            numSet.add(n);
        }
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            if(!numSet.contains(i)){
                return n;
            }
        }
        return -1;
    }

}
