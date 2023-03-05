class Solution {
    public int search(int[] nums, int target) {
        int a = nums.length;
        while(a--!=0){
         if(nums[a]==target)
         return a;
        }
        return -1;
    }
}