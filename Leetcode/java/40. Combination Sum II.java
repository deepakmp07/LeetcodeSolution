class Solution {
    private void sum(int [] arr, int target, int idx,List<List<Integer>> ans, List<Integer> ds){
       
         if(target==0){
           ans.add(new ArrayList<>(ds));
       return;
       }

       for(int i=idx; i<arr.length; i++){
           if(i>idx && arr[i]==arr[i-1]) continue;
           if(arr[i]>target) break;

           ds.add(arr[i]);
           sum(arr,target-arr[i],i+1,ans, ds);
           ds.remove(ds.size()-1);
       }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(candidates);
        sum(candidates,target,0,ans,new ArrayList<>());
        return ans;

    }
}