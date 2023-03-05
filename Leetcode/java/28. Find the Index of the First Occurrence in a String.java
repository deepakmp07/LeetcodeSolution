class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
         String replace = haystack.replace(needle,"0");
         return replace.indexOf("0");
        }
        return -1;
    }
}