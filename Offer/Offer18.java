 //Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {

        
        if(head==null){
            return null;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode pre=head;
        ListNode p=pre.next;
        while(p!=null){
            if(p.val==val){
                pre.next=p.next;
                p=pre.next;
                return head;
            }else{
                pre=pre.next;
                p=p.next;
            }
        }
        return head;
    }
}