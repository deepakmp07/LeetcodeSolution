class Solution {
    public int passThePillow(int n, int time) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean flag = true;
        int i=0;
        while(time-->=0){
          if(flag){
            i++;
          }
          else{
              i--;
          }
          if(i==n){
              flag = false;
          }
          else if(i==1){
              flag = true;
          }
        }
        return i;
    }
}