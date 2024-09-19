package Problems;

import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (letters.containsKey(curr)) {
                letters.put(curr, letters.get(curr) + 1);
            } else {
                letters.put(curr, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char curr = t.charAt(j);
            if (letters.containsKey(curr)) {
                letters.put(curr, letters.get(curr) - 1);
            } else {
                return false;
            }
        }

        for (int k = 0; k < letters.keySet().size(); k++) {
            if (letters.values().stream().toList().get(k) != 0) {
                return false;
            }
        }

        return true;
    }
}
