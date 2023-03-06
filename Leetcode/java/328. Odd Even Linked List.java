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
    public ListNode oddEvenList(ListNode head) {
        ListNode size = head;
        int siz = 1;
        while(size!=null){
            size = size.next;
            siz++;
        }
        if(siz<2){
            return head;
        }
        ListNode temp = null;
        ListNode result = null;
        ListNode even = head;
        ListNode odd = head.next;
        while(even!=null){
            result = new ListNode(even.val,result);
            System.out.print(result.val+" ");
            if(even.next==null){
                break;
            }
            else if(even.next.next==null){
                break;
            }
            even = even.next.next;
        }
         while(odd!=null){
            result = new ListNode(odd.val,result);
            System.out.print(result.val+" ");
            if(odd.next==null){
                break;
            }
            else if(odd.next.next==null){
                break;
            }
            odd = odd.next.next;
        }
        while(result!=null){
            temp = new ListNode(result.val,temp);
            System.out.println(temp.val);
            result = result.next;
        }
        return temp;
    }
}