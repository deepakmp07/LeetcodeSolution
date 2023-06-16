class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int a = nums.length-1;
        for(int i=0;i<nums.length*2;i++){
            if(i>nums.length-1){
                arr[i] = nums[i-nums.length];
            }
            else{
            arr[i] = nums[i];
            }
        }
        return arr;
    }
}