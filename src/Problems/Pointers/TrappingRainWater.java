package Problems.Pointers;

import java.util.Stack;

public class TrappingRainWater {
    public int trap(int[] height) {
        int p1 = -1, p2 = 0;
        int maxArea = 0, currArea = 0;
        while (p2 < height.length) {
            int currBlockHeight = height[p2];
            if (p1 != -1) {
                if (currBlockHeight >= height[p1]) {
                    maxArea += currArea;
                    currArea = 0;
                    p1 = p2;
                } else {
                    currArea += (height[p1] - currBlockHeight);
                    if (currBlockHeight > 0 && currArea  > (currBlockHeight )) {
                        int subArea = (p2 - p1 - 1) * currBlockHeight;
                        maxArea += subArea;
                        currArea -= subArea;
                    }
                }
            } else if (currBlockHeight > 0) {
                p1 = p2;
            }
            p2++;
        }
        return maxArea;
    }

    public int trap2(int[] height) {
        int p1 = -1, p2 = 0;
        int maxArea = 0, currArea = 0;
        int filledArea = 0;
        while (p2 < height.length) {
            int currBlock = height[p2];

            if (p1 != 1) {
                if (currBlock >= height[p1]) {
                    maxArea += currArea;
                    currArea = 0;
                    p1 = p2;
                } else {
                    filledArea += currBlock;
                }
            } else if (currBlock > 0){
                p1 = p2;
            }
            p2++;
        }
        return maxArea;
    }

    public int trap3(int[] height) {
        int p1 = 0, p2 = height.length - 1;
        int maxL = height[p1], maxR = height[p2];
        int totalArea = 0;
        while (p1 < p2) {
            int minMax = Math.min(maxL, maxR);
            if (minMax == maxL) {
                p1++;
                int difference = maxL - height[p1];
                if (difference < 0) {
                    maxL = height[p1];
                    continue;
                }
                totalArea += difference;
            } else {
                p2--;
                int difference = maxR - height[p2];
                if (maxR - height[p2] < 0) {
                    maxR = height[p2];
                    continue;
                }
                totalArea += difference;
            }
        }
        return totalArea;
    }

    public static void main(String[] args) {
        TrappingRainWater t = new TrappingRainWater();
        int[] height={0,2,0,3,1,0,1,3,2,1};
        t.trap(height);
    }
}
