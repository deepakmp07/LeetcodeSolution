class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();
        ListNode result = temp;
        temp.next = head;
        while(result!=null&& result.next!=null){
            if(result.next.val==val){
                result.next =  result.next.next;
            }
            else{
                result = result.next;
            }
        }
        return temp.next;
    }
}