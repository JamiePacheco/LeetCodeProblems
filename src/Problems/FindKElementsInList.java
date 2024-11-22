package Problems;

import java.util.*;
import java.util.stream.Collectors;

public class FindKElementsInList {
        public static int[] topKFrequent(int[] nums, int k) {

            HashMap<Integer, Integer> counts = new HashMap<>();

            for (int num : nums) {
                counts.put(num, (counts.containsKey(num) ? counts.get(num) + 1 : 0));
            }

            int[][] instancePairs = new int[counts.keySet().size()][2];

            Integer[] countKeys = new Integer[counts.size()];
            countKeys = counts.keySet().toArray(countKeys);

            for (int i = 0; i < countKeys.length; i++) {
                instancePairs[i] = new int[]{countKeys[i], counts.get(countKeys[i])};
            }

            Arrays.sort(instancePairs, Comparator.comparingInt(instance -> instance[1]));
            int[] reducedArr = new int[k];
            for (int i = instancePairs.length-k; i < instancePairs.length; i++) {
                reducedArr[i-(instancePairs.length-k)] = instancePairs[i][0];
            }

            return reducedArr;
        }
}
