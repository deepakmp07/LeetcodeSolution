class Solution {
    public int binaryGap(int n) {
        System.out.print(Integer.toBinaryString(n));
        String str = Integer.toBinaryString(n);
        int first = 0,max = 0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)+"").equals("1")){
                 max = Math.max(i-first,max);
                 first =  i;
            }
        }
        return max;
    }
}