package array;

public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int delta = 0;
        int priceToBuy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < priceToBuy){
                priceToBuy = currentPrice;
            } else {
                int currentDelta = currentPrice - priceToBuy;
                if(currentDelta > delta) {
                    delta = currentDelta;
                    profit = delta;
                }
            }
        }
        return profit;
    }
}
