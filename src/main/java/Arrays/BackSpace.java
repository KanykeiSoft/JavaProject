package Arrays;

import BasicsSyntax.SubStringF;
import java.util.Stack;
//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".
//Example 2:
//
//Input: s = "ab##", t = "c#d#"
//Output: true
//Explanation: Both s and t become "".
public class BackSpace {
    public boolean backspaceCompare(String s, String t) {
  return back(s).equals(back(t));


    }
    public String back(String str){
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            if(c != '#'){
                sb.append(c);
            }else if(sb.length() > 0) sb.deleteCharAt(sb.length()-1);


        }
        return sb.toString();
    }

    public static void main(String[] args) {
                BackSpace a = new BackSpace();
                System.out.println(a.backspaceCompare("ab#c", "ad#c"));   // true  -> "ac" vs "ac"
                System.out.println(a.backspaceCompare("ab##", "c#d#"));   // true  -> "" vs ""
                System.out.println(a.backspaceCompare("a#c", "b"));       // false -> "c" vs "b"

                BackSpace b = new BackSpace();
                System.out.println(b.backspaceCompare("xy#z", "xzz#"));   // true  -> "xz" vs "xz"
            }
        }


