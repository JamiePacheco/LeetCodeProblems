package Problems.SlidingWindow;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 1) return profit;

        int buy = 0, sell = 1;
        while (buy < sell) {
            if (prices[buy] <= prices[sell]) {
                int diff = prices[sell] - prices[buy];
                if (diff > profit) profit = diff;
            } else {
                buy++;
            }

            if (sell < prices.length - 1){
                sell++;
            } else {
                buy++;
            }
        }
        return profit;
    }
}
