package Problems;

import java.util.ArrayList;
import java.util.HashMap;

public class FindKElementsInList {
    public static int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer> freqList = new ArrayList<Integer>();

        HashMap<Integer, Integer> occur = new HashMap<>();

        for (int i : nums) {
            if (occur.containsKey(i)) {
                occur.put(i, occur.get(i) + 1);
                continue;
            }
            occur.put(i, 0);
        }

        return freqList.stream().mapToInt(i -> i).toArray();
    }
}
