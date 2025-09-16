package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {
    public int longest(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> characters = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (characters.contains(c)) {

                characters.remove(c);
                count += 2;
            } else {
                characters.add(c);
            }
        }
            if (!characters.isEmpty()) {
                count++;
            }
            return count;


    }
    public static void main(String[] args) {
        String s = "abccccdd";
        Palindrome p = new Palindrome();
        int res = p.longest(s);
        System.out.println(res);
    }
}
