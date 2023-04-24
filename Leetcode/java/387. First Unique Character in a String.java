class Solution {
    public int firstUniqChar(String s) {
        List<String> al = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i)+"");
        }
        while(s.length()>0){
            int prev = s.length();
            String f = s.charAt(0)+"";
            s = s.replace(s.charAt(0)+"","");
            int next = s.length();
            if(prev == next+1){
               return al.indexOf(f);
            }        
            }
        return -1;
    }
}