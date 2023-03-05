class Solution {
    public void rotate(int[] nums, int k) {
        int size = 0;
        int elem = nums.length;
        while(size!=k){
            elem--;
            size++;
            if(elem==0){
                elem = nums.length;
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i= elem;i<nums.length;i++){
            al.add(nums[i]);
        }
        System.out.print(al);
        for(int i=0;i<elem;i++){
            al.add(nums[i]);
        }
        int i=0;
       for(int a:al){
           nums[i++] = a;
       }
    }
}