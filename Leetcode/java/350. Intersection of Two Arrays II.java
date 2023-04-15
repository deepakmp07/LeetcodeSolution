class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int temp[] = new int[nums2.length];
    if(nums1.length<nums2.length){
        temp = nums1;
       nums1 = nums2;
       nums2 = temp;
    }
    ArrayList<Integer> al = new ArrayList<Integer>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int pos =  0;
    boolean flag = true;
    for(int i=0;i<nums1.length;i++){
        for(int j=pos;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                al.add(nums2[j]);
                pos=j+1;
                if(pos >= nums2.length){
                    i=nums1.length;
                }
                flag = false;
            }
            if(!flag){
                flag = true;
                break;
            }
        }
    }
    int sol[] = new int[al.size()];
    int a = 0;
    for(int p : al){
     sol[a++] = p;
    }
    return sol;
    }
}