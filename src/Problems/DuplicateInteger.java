package Problems;

import java.util.HashMap;

public class DuplicateInteger {

    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> n = new HashMap<>();

        for (int i : nums) {
            if (n.get(i) != null) {
                return true;
            } else {
                n.put(i, 1);
            }
        }
        return false;

    }

}
