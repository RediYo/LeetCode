public class Code160 {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode pa=headA;
        ListNode pb=headB;
        while(pa!=pb){
            pa=pa.next;
            if(pa==null){
                pa=headB;
            }
            pb=pb.next;
            if(pb==null){
                pb=headA;
            }
        }
        return pa;
    }
}
