package com.deepak;
class Solution4 {
    public static  int  numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1 ;j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    //System.out.println(nums[i]+"<="+nums[j]);
                    count++;
                }
            }
        }
        return count;
    }
     //   public static void main(String args[]){
            int[] nums = new int[]{1,2,3,1,1,3};
            System.out.print(numIdenticalPairs(nums));
        }  //
    }