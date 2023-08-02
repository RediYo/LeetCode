import java.util.Deque;
import java.util.LinkedList;

public class Code234 {
    
    public boolean isPalindrome(ListNode head) {

        Deque<Integer> deque = new LinkedList<>();
        ListNode p = head;
        while(p!=null){
            deque.push(p.val);
            p=p.next;
        }
        p=head;
        while(deque.size()!=0){
            if(p.val!=deque.pop()){
                break;
            }
            p=p.next;
        }
        if(deque.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
}
