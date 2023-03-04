class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        int max = 0;
        int elem = 0;
        for(int i: nums){
            if(hs.add(i)){
            int count = Collections.frequency(al, i);
            if(count>max){
                max = count;
                elem = i;
            }
            }

        }
        return elem;
    }
}