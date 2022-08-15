class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        
        while (i < N) {
            while (i < N && prices[i] >= prices[i + 1]) 
                i++;
            
            buy = prices[i];
            while (i < N && prices[i] < prices[i + 1])  
                i++;
            
            sell = prices[i];
            profit += sell - buy;
        }
        return profit;
    }

}
