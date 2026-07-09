class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sellPrice = prices[j];
                max = Math.max(max, sellPrice - buyPrice);
            }
        }

        return max;
    }
}
