class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max_return=0;
        int min=prices[0];
        int index=0;
       for(int i=0;i<n;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        if(prices[i]-min>max_return){
            max_return=prices[i]-min;
        }
       }
       return max_return;
    }
}