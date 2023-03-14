class Solution {
     public static void comb(int[] candidates,int target,List<Integer> al,List<List<Integer>> ali ,int pos){
         if(pos == candidates.length){
             if(target == 0){
                 ali.add(new ArrayList<>(al));
             }
             return;
         }

        if(candidates[pos] <= target){
         al.add(candidates[pos]);
         int a = al.size();
         comb(candidates,target-al.get(a-1),al,ali,pos);
         a = al.size();
         al.remove(a-1);
          }
         comb(candidates,target,al,ali,pos+1);
     }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
List<List<Integer>> ali = new ArrayList<>();
comb(candidates,target,new ArrayList<>(),ali,0);
return ali;
    }
}