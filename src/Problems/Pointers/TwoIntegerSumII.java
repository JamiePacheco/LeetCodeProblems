package Problems.Pointers;

public class TwoIntegerSumII {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0, rp = numbers.length-1;
        int[] indices = new int[2];

        while (lp < rp) {
            int sum = numbers[lp] + numbers[rp];
            if (sum == target) {
                indices[0] = lp+1;
                indices[1] = rp+1;
                break;
            }
            if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return indices;
    }
}
