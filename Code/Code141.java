import java.util.HashSet;
import java.util.Set;

import ExtraNode.ListNode;

class LeetCode141 {

    public boolean hasCycle(ListNode head) {

        ListNode p = head;
        if(p==null||p.next==null){
            return false;
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
            return false;
        }else{
            return true;
        }
    }

}