package Problems.Pointers;

public class ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int maxArea = 0;
        int maxL = 0, maxR = 0;
        int lp = 0, rp = heights.length-1;

        while (lp < rp) {
            if (heights[lp] > maxL) maxL = heights[lp];
            if (heights[rp] > maxR) maxR = heights[rp];
            int area = Math.min(maxL, maxR) * (rp - lp);
            if (area >= maxArea) maxArea = area;

            if (maxL < maxR) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxArea;
    }

}
