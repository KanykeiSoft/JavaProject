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
}
