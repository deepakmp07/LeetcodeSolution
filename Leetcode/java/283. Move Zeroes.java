class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
        }
        int p=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[p++]=nums[i];
           }
       }
       for(int i=p;i<nums.length;i++){
nums[i]=0;
       }
       for(int s : nums){
        System.out.print(s+" ");
       }
        }
    }