class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int index = indices[i];
            char a = s.charAt(i);
            str.setCharAt(index,a);
        }
        return str.toString();
    }
}