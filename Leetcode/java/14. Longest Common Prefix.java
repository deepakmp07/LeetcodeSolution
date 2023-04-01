class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count = 0;
        String str = strs[0];
        String result="";
        int loc = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<str.length();j++){
                if((str.charAt(j)+"").equals(strs[i].charAt(j)+"")){
                    count++;
                    
                }
                else{
                    break;
                }
            }
            if(loc>=count){
                loc = count;
                result = strs[i];
            }
            count=0;
        }
        return strs[0].substring(0,loc);
    }
}