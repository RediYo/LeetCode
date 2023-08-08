import ExtraNode.ListNode;

public class Code24 {
    
    public ListNode swapPairs(ListNode head) {

        //奇偶数节点分离
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode p = head, o=odd, e=even;
        int count = 1;
        while(p!=null){
            if(count%2==1){
                o.next=p;
                o=o.next;
            }else{
                e.next=p;
                e=e.next;
            }
            p=p.next;
        }
        //奇数节点插入偶数节点
        o=odd.next;
        e=even.next;
        while(o!=null){
            ListNode eTemp = e.next;
            e.next=o;
            o=o.next;
            o.next = eTemp;
            e = eTemp;
        }
        return even.next;
    }
}
