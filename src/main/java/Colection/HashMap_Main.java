package Colection;

import java.util.HashMap;
import java.util.Stack;

public class HashMap_Main {

    public static void main(String[] args) {
        System.out.println("{}{} -----> " + areBalanced("{}{}"));
        System.out.println("{}}{}{} -----> " + areBalanced("{}}{}{}"));
        System.out.println("{{}}{} -----> " + areBalanced("{{}}{}"));

    }

    public static boolean areBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char charactor : str.toCharArray()) {
            if (charactor == '{') {
                stack.push(charactor);
            }
            else if (charactor == '}') {
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();

            }
        }
        return stack.isEmpty();
    }
}

