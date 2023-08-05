import ExtraNode.ListNode;

public class Code2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 重点是进位问题
        ListNode L = new ListNode(-1);
        ListNode p = L;
        int pre = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + pre;
            if (sum >= 10) {
                pre = 1;
                sum = sum - 10;
            } else {
                pre = 0;
            }
            p.next = new ListNode(sum);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null || l2 != null) {
            ListNode node = (l2 == null) ? l1 : l2;
            
            while (pre != 0) {
                int sum = pre;
                if(node!=null){
                    sum = pre + node.val;
                }
            
                if (sum >= 10) {
                    pre = 1;
                    sum = sum - 10;
                } else {
                    pre = 0;
                }
                p.next = new ListNode(sum);
                p = p.next;
                if(node!=null){
                    node = node.next;
                }
            }
            p.next = node;
        }else{
            if(pre==1){
                p.next = new ListNode(1);
            }
        }

        return L.next;
    }
}
