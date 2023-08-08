import ExtraNode.ListNode;

public class Code25 {

    public ListNode reverseKGroup(ListNode head, int k) {

        // 取k个节点，保留第k+1个节点
        // 对k个节点进行反转，接着循环此操作，直到节点为空或者不足k个节点
        ListNode L = new ListNode(-1);
        // ListNode p = head;
        L.next = head;
        ListNode p = L;
        ListNode tail = p;
        while (head != null) {
            int count = 0;
            ListNode pre = tail;
            p = pre;
            while (count < k) {
                p = p.next;
                count++;
                if (p == null) {
                    return L.next;
                }

            }
            head = p.next; // 第k个，即k+1前一个
            ListNode t = pre.next;
            pre.next = p.next;
            count = 0;
            while (t != null) {
                ListNode temp = t.next;
                if (count == 1) {
                    tail = t;
                }
                t.next = pre.next;
                pre.next = t;
                t = temp;
                count++;
            }
        }
        return L.next;
    }
}
