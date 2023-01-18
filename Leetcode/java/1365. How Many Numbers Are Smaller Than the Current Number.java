package com.deepak;
=================================================================================================================
class Solution {
        public static int[] smallerNumbersThanCurrent(int[] nums) {
            int result[] = new int[nums.length];
            int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i] > nums[j]){
                        count++;
                    }
                }
            }
            result[i] = count;
            count=0;
        }
        return result;
        }
=================================================================================================================
    public static void main(String args[]) {
        int[] nums = new int[]{8,1,2,2,3};
        int result[] = smallerNumbersThanCurrent(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}

