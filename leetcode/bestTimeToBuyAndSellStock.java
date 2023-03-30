package leetcode;

public class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 ) return 0;
        int i = 0, j= i+1;
        int diff = 0;
        int maxDiff = 0;
        while(j<prices.length){
            if(prices[i]< prices[j]) {
                diff = prices[j] - prices[i];
                maxDiff = Math.max(maxDiff,diff);
            }else i=j;
            j++;    
        }
        return maxDiff;
    }
}
