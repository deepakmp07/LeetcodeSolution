class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int a: nums){
            if(!hs.add(a)){
                return true;
            }
        }
        return false;
    }
}