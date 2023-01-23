class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> al =  new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                al.add(nums[i]);
            }
        }
        int i=0;
               for(int a : al){
                 nums[i] = a;
                 i++;
               }
                return al.size();
    }
}