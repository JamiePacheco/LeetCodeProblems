package Problems.SlidingWindow;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        char[] sChars = s.toCharArray();
        HashSet<Character> encounteredChars = new HashSet<>();

        int subLength = 0;
        int sp = 0, ep = 0;

        while (ep <= s.length()) {
            if (!encounteredChars.contains(sChars[ep])) {
                encounteredChars.add(sChars[ep]);
                if (subLength < ep - sp + 1) subLength = ep - sp + 1;
                ep++;
            } else {
                encounteredChars.remove(sChars[sp]);
                sp++;
            }
        }

        return subLength;
    }

}
