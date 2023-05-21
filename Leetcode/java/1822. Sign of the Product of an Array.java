class Solution {
    public int arraySign(int[] nums) {
        int neg = 1;
            for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
                 return 0;
             }
             if(nums[i]<0){
                 if(neg>0){
                     neg = -1;
                 }
                 else{
                     neg = 1;
                 }
             }
    }
    return  neg;
}
}