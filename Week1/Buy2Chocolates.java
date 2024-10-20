class Solution {
    public int buyChoco(int[] prices, int money) {
        int small=Integer.MAX_VALUE;
         int secsmall=Integer.MAX_VALUE;
         for(int i=0;i<prices.length;i++){
            if(prices[i]<small){
                 secsmall=small;
                
                small=prices[i];
               

            }
            else if(prices[i]<secsmall){
                secsmall=prices[i];
            }
         }
         int n=(small+secsmall);
         if(n<=money){
            return money-n;
         }
         return money;

        
    }
}