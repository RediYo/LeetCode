import java.util.HashSet;
import java.util.Set;

import ExtraNode.ListNode;

public class Code142 {
    
    public ListNode detectCycle(ListNode head) {
        
        ListNode p = head;
        if(p==null||p.next==null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while(p!=null){
            if(set.contains(p)){
                break;
            }else{
                set.add(p);
            }
            p=p.next;
        }
        if(p==null){
            return null;
        }else{
            return p;
        }
    }
}
