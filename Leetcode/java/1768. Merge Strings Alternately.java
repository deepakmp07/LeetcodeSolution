class Solution {
    public String mergeAlternately(String word1, String word2){
        int a=0;
        int b=0;
        String sol = "";
while(a<=word1.length() || b<=word2.length()){
    if(a<word1.length()){
sol = sol+word1.charAt(a);
    }
    if(b<word2.length())
sol = sol+word2.charAt(b);
a++;
b++;
}
return sol;
    }
}