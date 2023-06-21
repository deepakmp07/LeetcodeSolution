class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int n = 0;
        switch(ruleKey){
            case "type":
                    n = 0;
                    break;
            case "color":
                    n = 1;
                    break;
            case "name":
                     n =2;
                     break;
        }
       for(int i=0;i<items.size();i++){
           List<String> ls = items.get(i);
           if(ls.get(n).equals(ruleValue)){
                 count = count+1;
           }
       }
       return count;
    }
}