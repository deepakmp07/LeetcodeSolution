class Solution {
    public String removeStars(String s) {
       Stack<String> st = new Stack<String>();
       for(int i=0;i<s.length();i++){
           if((s.charAt(i)+"").equals("*")){
               st.pop();
           }
           else{
           st.push(s.charAt(i)+"");

           }
       }
       String sol = "";
        for(String a:st){
           sol = sol+a;
       }
       return sol;
    }
}