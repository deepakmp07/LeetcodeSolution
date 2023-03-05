class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int a:nums){
            System.out.println(a*a);
            al.add(a*a);
        }
        Collections.sort(al);
        int[] arr = new int[al.size()];
        int i =0;
        for (int a:al){
            arr[i++] = a;
        }
        return arr;
    }
}