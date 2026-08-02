class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i<prices.length; i++){
                // min price ke liyeeee
                if(prices[i] < minprice ){
                 minprice =prices[i];
                }

                int profit = prices[i] - minprice;

                // profit ke liyee
                if(max < profit ){
                    max = profit;
                }
        }

        return max;

    }
}