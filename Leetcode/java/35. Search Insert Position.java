class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
            pos = i;
            return pos;
            }
            else 
            pos = nums.length;
        }
            return pos;

    }
}