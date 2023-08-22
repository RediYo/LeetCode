import ExtraNode.ListNode;

public class Code148 {
    
    public ListNode sortList(ListNode head) {

        //插入排序方法对链表进行排序
        if(head==null){
            return null;
        }
        ListNode L = head;
        while(L.next!=null){
            ListNode p = L;
            int min = Integer.MAX_VALUE;
            ListNode temp = p;
            while(p!=null){
                if(p.val<min){
                    temp = p;
                    min = p.val;
                }
                p = p.next;
            }
            //交换最小值到前面
            int val = L.val;
            L.val = temp.val;
            temp.val = val;
            L = L.next;
        }

        return head;
    }
}
