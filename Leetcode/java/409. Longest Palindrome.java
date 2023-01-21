class Solution {
    public int longestPalindrome(String s) {
        boolean set[] = new boolean[s.length()];
        int count = 0;
        int pali =0 ;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(set[i] == false){
                    if((s.charAt(i)+"").equals(s.charAt(j)+"")){
                        count++;
                       if(count%2==0){
                         pali = pali+2;
                       }
                       if(i!=j)
                       set[j] = true;
                    }
                }
            }
            System.out.print(count+" ");
            count = 0;
        }
        if(s.length()!= pali)
        return pali+1;
        else
        return pali;
    }
}