package com.deepak;
class Solution {
=================================================================================================================
    public static int[] shuffle(int[] nums, int n) {
        int result[] = new int[n+n];
        int k=0;
        for(int i=0;i<n;i++){
            result[k++] = nums[i];
            result[k++] = nums[i+n];
        }
        return result;
    }
=================================================================================================================
    public static void main(String args[]){
        int[] nums = new int[]{2,5,2,3,4,7};
        int n = 3;
        int[] result = shuffle(nums,n);
        System.out.print("[");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i!=5){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}

