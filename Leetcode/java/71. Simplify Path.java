class Solution {
    public String simplifyPath(String path) {
        Stack<String> al = new Stack<String>();
        for(String a:path.split("/")){
            if(a.equals("..")){
                if(al.size()>0){
                     al.pop();
                }
            }
            else if(!a.equals(".")){
              if(a.length()>0){
                  String sol = "/"+a;
                  al.push(sol);
              }
            }
        }
        if(al.size()<1){
            al.add("/");
        }
        String so = "";
        for(String a:al){
           so = so+a;
        }
        return so;
    }
}