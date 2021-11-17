class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) { return 0; }
        int maxProfit = 0, minPrice = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(maxProfit < prices[i] - minPrice) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
