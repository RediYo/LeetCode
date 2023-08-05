import ExtraNode.ListNode;

public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1=l1,p2=l2;
        if(p1!=null&&p2==null){
            return p1;
        }else if(p1==null&&p2!=null){
            return p2;
        }else if(p1==null&&p2==null){
            return null;
        }else{
            ListNode p;
            if(p1.val<p2.val){
                p=p1;
                p1=p1.next;
            }else{
                p=p2;
                p2=p2.next;
            }
            ListNode head=p;
            while(p1!=null&&p2!=null){
                if(p1.val<p2.val){
                    p.next=p1;
                    p=p.next;
                    p1=p1.next;
                }else{
                    p.next=p2;
                    p=p.next;
                    p2=p2.next;
                }
            }   
            if(p1!=null){
                p.next=p1;
            }
            if(p2!=null){
                p.next=p2;
            }
            return head;
        }
             
    }
}