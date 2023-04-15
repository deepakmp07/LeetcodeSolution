class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> al = new ArrayList<String>();
        int i =0;
        while(i++<n){
           if(i%3==0 && i%5==0){
               al.add("FizzBuzz");
           }
          else if(i%3==0){
              al.add("Fizz");
          }
          else if(i%5==0){
              al.add("Buzz");
          }
          else{
              al.add(i+"");
          }
        }
        return al;
    }
}