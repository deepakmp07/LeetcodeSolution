public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1 = headA;
        ListNode head2 = headB;
        int i = 0;
        int j =0 ;
        int size = 0;
        while(headA!=null){
            headA = headA.next;
            i++;
        }
        while(headB!=null){
            headB = headB.next;
            j++;
        }
        int count = 0;
        if(i>j){
            count = i-j;
            for( i=0;i<count;i++){
                head1 = head1.next;
            }
        }
        else{
        count = j-i;
        for( i=0;i<count;i++){
                head2 = head2.next;
            }
        }
       while(head1!= head2){
        //System.out.println(head1.val+" "+head2.val);
             head1 = head1.next;
             head2 = head2.next;
       }
       return head1;
}
}
