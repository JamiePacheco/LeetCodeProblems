package Problems.ArraysHashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        //put the nums in a set for fast lookup
        for (int num : nums) {
            numSet.add(num);
        }

        int len = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int localLength = 1;
                int n = num;
                while (numSet.contains(++n)){
                    localLength++;
                }
                if (localLength > len) len = localLength;
            }
        }
        return len;
    }
}
