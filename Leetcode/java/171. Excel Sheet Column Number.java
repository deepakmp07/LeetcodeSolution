class Solution {
    public int titleToNumber(String col) {
        int a =0;
        for(int i = 0;i<col.length();i++){
            int c = (char) col.charAt(i)-64;
            a = a*26;
            a = a+c;
        }
        return a;
    }
}