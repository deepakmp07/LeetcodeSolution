class Solution {
    public static void permute(int[] nums,List<Integer> al,int n,int pos,List<List<Integer>> all){
        if (al.size() >= 2 && isNonDecreasing(al)) {
            all.add(new ArrayList<>(al));
        }
        Set<Integer> used = new HashSet<>();
        for (int i = pos; i < n; i++) {
            if (used.contains(nums[i])) {
                continue;
            }
            if (al.size() == 0 || nums[i] >= al.get(al.size()-1)) {
                al.add(nums[i]);
                permute(nums, al, n, i+1, all);
                al.remove(al.size()-1);
                used.add(nums[i]);
            }
        }
    }
    
    private static boolean isNonDecreasing(List<Integer> al) {
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) < al.get(i-1)) {
                return false;
            }
        }
        return true;
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> all = new ArrayList<>();
        permute(nums, al, nums.length, 0, all);
        return all;
    }
}