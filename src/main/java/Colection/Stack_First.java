package Colection;

import java.util.Stack;

public class Stack_First {
    public static boolean areBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char charactor : str.toCharArray()) {
            if (charactor == '{') {
                stack.push(charactor);
            } else if (charactor == '}') {
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();

            }
        }
        return stack.isEmpty();
    }
}
