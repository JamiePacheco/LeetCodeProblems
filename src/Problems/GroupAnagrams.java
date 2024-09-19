package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public boolean isAnagram(String s1, String s2) {

        HashMap<Character, Integer> equalityMap = new HashMap<>();

        for (char c : s1.toCharArray()) {
            if (!equalityMap.containsKey(c)) {
                equalityMap.put(c, 1);
            } else {
                equalityMap.put(c, equalityMap.get(c) + 1);
            }
        }

        for (char c : s2.toCharArray()) {
            if (!equalityMap.containsKey(c)) {
                return false;
            }
            equalityMap.put(c, equalityMap.get(c) - 1);
        }

        for (int i : equalityMap.values().stream().toList()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        int[] strStatus = new int[strs.length];

        List<List<String>> groups = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (strStatus[i] == 1) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            for (int j = i + 1; i < strs.length; j++) {
                if (strs[j].length() == strs[i].length() && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    strStatus[j] = 1;
                }
            }
            groups.add(group);
        }

        return groups;
    }


}
