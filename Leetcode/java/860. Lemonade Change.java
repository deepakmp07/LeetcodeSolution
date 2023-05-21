class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;
        for(int i=0;i<bills.length;i++){
            switch(bills[i]){
            case 5 :
                f++;
                break;
            case 10 :
                if(f>0){
                    f--;  
                    t++;   
                }
                else{
                    return false;
                }
                break;
            case 20 :
                if(t>0 && f>0){
                    t--;
                    f--;
                }
                else if(f>2){
                     f=f-3;
                }
                else{
                    return false;
                }
                break;
        }
    }
        return true;
}
}