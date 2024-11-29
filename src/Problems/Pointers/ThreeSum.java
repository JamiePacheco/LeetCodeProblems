package Problems.Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        int p1 = 0;
        while (p1 < nums.length) {
            if (nums[p1] > 0) break;
            if (p1 != 0 && nums[p1-1] == nums[p1]) {
                p1++;
                continue;
            }
            int partialSum = nums[p1]*(-1);
            int rp = nums.length-1, lp = p1+1;
            while (lp < rp) {
                int sum = nums[lp] + nums[rp];
                if (sum > partialSum) {
                    rp--;
                } else if (sum < partialSum) {
                    lp++;
                } else {
                    triplets.add(List.of(nums[p1], nums[lp], nums[rp]));
                    lp++;
                    rp--;
                    while(lp < rp && nums[lp] == nums[lp-1]) lp++;
                }
            }
            p1++;
        }
        return triplets;
    }
}
