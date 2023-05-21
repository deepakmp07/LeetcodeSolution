class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,num=-1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]==nums2[j] && num!=nums1[i]){
               num = nums1[i];
               al.add(num);
            }
            else if(nums1[i]==nums2[j] && num == nums1[i]){
                i++;
                j++;
            }
        }
        i=0;
        int sol[] = new int[al.size()];
        System.out.print(al);
        for(int a:al){
            sol[i++] = a;
        }
        return sol;
        }
}