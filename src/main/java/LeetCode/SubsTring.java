package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class SubsTring {
    public static String longestNiceSubstring(String s){
        int n = s.length();
        String best = "";
        for(int i = 0; i < n; i++){
            Set<Character> seen = new HashSet<>();

            for(int j = i; j < n; j++){
                seen.add(s.charAt(j));
                if(IsNice(seen) && j - i +1 > best.length()){ //стало { 'a', 'A' }
                    best = s.substring(i, j+1);
                }

            }
        }
        return best;

    }
    public static boolean IsNice( Set<Character> seen){
        for(char c: seen){
            if(Character.isLetter(c)){
                char lower = Character.toLowerCase(c);
                char upper = Character.toUpperCase(c);
                if(!seen.contains(lower) || !seen.contains(upper)){
                    return  false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "zaAa";
        System.out.println(longestNiceSubstring(s));
    }
}
