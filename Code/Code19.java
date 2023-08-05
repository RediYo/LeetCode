import ExtraNode.ListNode;

public class Code19 {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode L = new ListNode(-1);
        L.next = head;
        ListNode p = head;
        ListNode pre = L;
        while(n>0){
            p=p.next;
            n--;
        }
        while(p!=null){
            p=p.next;
            pre=pre.next;
        }
        pre.next = pre.next.next;
        return L.next;
    }
}
