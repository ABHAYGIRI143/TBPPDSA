class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten =0;
        int twenty = 0; 
        int coins=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) 
                five++;
            if(bills[i]==10) 
                ten++;
             if(bills[i]==20) 
                twenty++; 
            int change = bills[i]-5;
            if(change==0) 
                continue;
             while(change>=20 && twenty>0){
                change-=20;
                twenty--;
            } 
             while(change>=10 && ten>0){
                change-=10;
                ten--;
            }
             while(change>=5 && five>0){
                change-=5;
                five--;
            }
            if(change!=0) return false;
        }
        return true;
    }
}