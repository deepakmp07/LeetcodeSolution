class Solution {
    public int reverse(int x) {
        long cal = x;
        boolean flag = false;
        if(cal<0){
            cal = ~(cal-1);
            flag = true;
        }
        long result = 0;
     while(cal>0){
        result = result*10+cal%10;
        cal = cal/10;        
     }
    if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
        return 0;
    }
    else if (!flag){
        return (int)result;
    }
     return (int)~(result-1);      
    }
}