class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        List<String> al = new ArrayList<String>();
        for(int i =0; i<t.length();i++){
            al.add(t.charAt(i)+"");
        }
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<al.size();j++){
            if((s.charAt(i)+"").equals(al.get(j))){
                al.remove(j);
                flag = true;
                break;
            }
        }
        if(!flag){
            return false;
        }
        flag = false;
        }
            return true;
        }
    }