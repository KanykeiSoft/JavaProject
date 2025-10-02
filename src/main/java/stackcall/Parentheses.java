package stackcall;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        Parentheses p = new Parentheses();
        String[] tests = {
                "{[()]}",     // true
                "([)]",       // false
                "()[]{}",     // true
                "(",          // false
                "){",         // false
                "",           // true (пустая строка валидна)
                "(([]){})",   // true
                "(([]){})]"   // false
        };
        for (String t : tests) {
            System.out.printf("%-12s -> %s%n", t, p.isValid(t));
        }
    }
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
       for(char c : s.toCharArray()){
           if(c =='(' || c== '[' || c == '{'){
               stack.push(c);
               continue;
           }
              if( stack.isEmpty())return false;

           char  top = stack.peek();
           if ((c == ')' && top == '(') ||
                   (c == ']' && top == '[') ||
                   (c == '}' && top == '{')){
               stack.pop();
           }else {
               return false;
           }

       }
        return stack.isEmpty();
    }

}
