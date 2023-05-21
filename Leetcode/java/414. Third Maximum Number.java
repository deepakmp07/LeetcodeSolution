class Solution {
    public int thirdMax(int[] nums) {
        int max = nums[0];
        long secmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                thirdmax = secmax;
                secmax = max;
                max = nums[i];
            }
            else if(nums[i]>secmax && nums[i]<max){
                thirdmax = secmax;
                secmax = nums[i];
            }
            else if(nums[i]<secmax && nums[i]>thirdmax){
                thirdmax = nums[i];
            }
        }
        if(thirdmax==Long.MIN_VALUE){
            return max;
        }
        return (int)thirdmax;
    }
}