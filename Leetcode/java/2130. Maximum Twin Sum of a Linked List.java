/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode test = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(test!=null){
            arr.add(test.val);
            test = test.next;
        }
        int i=0,j=arr.size()-1;
        int max =0;
        while(i<j){
            max = Math.max(arr.get(i)+arr.get(j),max);
            i++;
            j--;
        } 
        return max;
    }
}