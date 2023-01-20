class Solution {
    public int removeDuplicates(int[] nums) {
       int count = 1;
            boolean flag = false;
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i ; j < nums.length; j++) {
                    if(nums[i]<nums[j]){
                        nums[i+1] = nums[j];
                        break;
                    }
                }
                System.out.print(nums[i]+" ");
            }
            int pos = nums.length;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        return j;
                    }
                }
            }
            return pos;
        }
}