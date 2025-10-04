package Palindromme;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return true;
        int left = 0, right = s.length() - 1;
        while (left < right){
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
        char cl = Character.toLowerCase(s.charAt(left));
        char cr = Character.toLowerCase(s.charAt(right));
        if (cl != cr) return false;

        left++;
        right--;
    }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println(test1 + " → " + isPalindrome(test1)); // true
        System.out.println(test2 + " → " + isPalindrome(test2));

    }
}
