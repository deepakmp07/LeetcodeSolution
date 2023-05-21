class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<=k+i && j<nums.length;j++){
                   if(nums[i]==nums[j]){
                       return true;
                 }
              }
            }
            System.gc();
        return false;
    }
}