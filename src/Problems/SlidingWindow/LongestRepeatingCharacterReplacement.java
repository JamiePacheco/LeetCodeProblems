package Problems.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        char[] sChars = s.toCharArray();
        int subLength = 0;
        HashMap<Character, Integer> charFreq = new HashMap<>();

        int sp = 0, ep = 0;
        while (ep < sChars.length) {
            if (!charFreq.containsKey(sChars[ep])) {
                charFreq.put(sChars[ep], 1);
            }


        }

        return subLength;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement l = new LongestRepeatingCharacterReplacement();
        System.out.println(l.characterReplacement("AAABABBABBB", 1));

    }
}
