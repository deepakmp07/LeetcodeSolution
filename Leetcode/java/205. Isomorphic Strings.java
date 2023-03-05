class Solution {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al1 = new ArrayList<String>();
        HashSet<String> hs = new HashSet<String>();
        HashSet<String> hs1 = new HashSet<String>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i)+"");
        }
        for(int i=0;i<t.length();i++){
            al1.add(t.charAt(i)+"");
        }
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(hs.add(s.charAt(i)+"")){
                count++;
                Collections.replaceAll(al,s.charAt(i)+"",count+"");
            }
        hs.add(count+"");
        }
        count= 0;
        for(int i=0;i<t.length();i++){
            if(hs1.add(t.charAt(i)+"")){
                count++;
                Collections.replaceAll(al1,t.charAt(i)+"",count+"");
            }
        hs1.add(count+"");
        }

if(al1.equals(al)){
    return true;
}     
return false;
    }
}