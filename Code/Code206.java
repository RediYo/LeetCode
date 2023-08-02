import ExtraNode.ListNode;

public class Code206 {
    
    public ListNode reverseList(ListNode head) {

        if(head==null){
            return null;
        }
        ListNode L = new ListNode();
        ListNode p = head;
        L.next = p;
        while(p.next!=null){
            ListNode t = p.next;
            p.next=t.next;
            L.next = t;
            t.next = p;
        }
        return L.next;
    }
}
