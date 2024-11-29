package Problems.Pointers;

public class Palindrome {
    public boolean isPalindrome(String s) {

        int lp = 0, rp = s.length() - 1;
        char[] chars = s.toLowerCase().toCharArray();

        while (lp <= rp) {
            if (Character.isLetterOrDigit(chars[lp]) && Character.isLetterOrDigit(chars[rp])) {
                if (chars[lp] != chars[rp]) return false;
                lp++;
                rp--;
            } else {
                if (!Character.isLetterOrDigit(chars[lp])) lp++;
                if (!Character.isLetterOrDigit(chars[rp])) rp--;
            }
        }
        return true;
    }
}
