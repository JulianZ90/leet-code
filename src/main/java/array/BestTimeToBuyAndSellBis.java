package array;

public class BestTimeToBuyAndSellBis {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int priceDifference = prices[i] - prices[i - 1];
            if (priceDifference > 0) {
                profit += priceDifference;
            }
        }

        return profit;
    }
}
