class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set <List<Integer>>set =new HashSet<>();
        if(nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int sum=0;
        for (int i=0;i<nums.length-2;i++){
                int j=i+1;
                int k=nums.length-1;
                while (j<k){
                    sum= nums[i]+nums[j]+nums[k];
                    if (sum==0)
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                    if (sum<0)
                    j++;
                    else if (sum>0)
                    k--;
                }
        }
        return new ArrayList<>(set);
    }
}
//     public static void permute(int[] nums,int max,int sum,List<List<Integer>> all,List<Integer> al){
// if(al.size()==3){
//     if(sum==0){
//     all.add(new ArrayList<Integer>(al));
// }
// return;
// }
// for(int i=max;i<nums.length;i++){
//     if(i>max && nums[i]==nums[i-1]){
//         continue;
//     }
//     al.add(nums[i]);
//     permute(nums,i+1,sum+nums[i],all,al);
//     al.remove(al.size()-1);
// }
//     }
//         List<List<Integer>> all = new ArrayList<List<Integer>>();
//         List<Integer> al = new ArrayList<Integer>();
//         Arrays.sort(nums);
//         permute(nums,0,0,all,al);
//         System.out.print(all);
//         return all;