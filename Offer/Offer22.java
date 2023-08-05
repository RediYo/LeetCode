import ExtraNode.ListNode;

public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode pk=head;
        for (int i = 1; i <= k-1; i++) {
            pk=pk.next;
        }
        ListNode p=head;
        while(pk.next!=null){
            p=p.next;
            pk=pk.next;
        }
        return p;

    }
}