class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int num;
        int opo=0;
        int n=prices.length;
    
        for(int i=0;i<n;i++){
            if(prices[i]<min){
min=prices[i];
            }
            num=prices[i]-min;
if(num>opo){
    opo=num;
}
        }
return opo;
    }
}