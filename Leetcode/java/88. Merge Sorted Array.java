class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
       al.add(nums1[i]);
        }
         List<Integer> al1 = new ArrayList<Integer>();
         for(int i=0;i<n;i++){
       al1.add(nums2[i]);
        }
        al.addAll(al1);
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            nums1[i] = al.get(i);
        }
    }
}