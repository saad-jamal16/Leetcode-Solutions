class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int maxProfit = 0;
        for(int right = 1; right < prices.length; right++){
            if(prices[right] < prices[left]){
                left = right;
            }else{
                int crntProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit,crntProfit);
            }
        }
        return maxProfit;
        
    }
}