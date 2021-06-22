package ispalindrome;

import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String s = "ab@a";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }
}



