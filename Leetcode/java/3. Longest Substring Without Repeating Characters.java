class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<String> hs = new HashSet<String>();
        int max = 0;
        if(s.length()==1){
            return 1;
        }
        int j;
        int i=0;
        boolean flag = false;
        while(i<s.length()){
         j=i;
        while(!flag&& j<s.length()){
            if(hs.add(s.charAt(j)+"")){
            }
            else{
                if(max<=hs.size()){
                    max = hs.size();
                }
               flag = true;
               hs.clear();
            }
            j++;
        }
        i++;
        flag = false;
    }
        return max;
    }
    }