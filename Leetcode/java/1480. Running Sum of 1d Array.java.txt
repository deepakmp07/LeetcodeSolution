package com.deepak;
class Main1{
    static public int[] runningSum(int[] nums) {
        int result[] =  new int[nums.length];
        int a = nums.length;
        int sum=0;
       for(int i=0;i<a;i++) {
           sum = 0;
           for (int j = 0; j < i + 1; j++) {
               sum = sum + nums[j];
           }
           result[i] = sum;
           System.out.println(result[i]);

       }
       return result;
    }
    public static void main(String args[]) {
        int nums[] = new int[]{1,2,3,4};
        int[] result = runningSum(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
