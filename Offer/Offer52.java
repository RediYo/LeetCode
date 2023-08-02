import ExtraNode.ListNode;

public class Offer52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pa=headA,pb=headB;
        while(pa!=null&&pb!=null){
            if(pa.next.val!=pb.next.val){

            }
        }
        return pb;
    }
}