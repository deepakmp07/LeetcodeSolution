class Solution {
    public int missingNumber(int[] nums) {
      int a = 0;
      int count = 0;
      int i=0;
      for(;i<nums.length;i++){
        count = nums[i]+count;
     a = a+i;
         }
      a = a+(i);
     return a-count;
     }
}