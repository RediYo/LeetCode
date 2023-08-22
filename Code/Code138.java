import java.util.HashMap;
import java.util.Map;

public class Code138 {

    public Node copyRandomList(Node head) {

        // 先构造一个全新链表，
        // 使用一个哈希表保存原链表的<p, 序列号>
        // 另一个哈希表遍历保存新链表<序列号, p>
        // 遍历根据旧表random来指导新表的指针
        Node L = new Node(-1);
        Node pre = L;
        Node p = head;
        Map<Node, Integer> map1 = new HashMap<>();
        Map<Integer, Node> map2 = new HashMap<>();
        int count = 0;
        while (p != null) {
            count++;
            Node t = new Node(p.val);
            map1.put(p, count);
            map2.put(count, t);
            pre.next = t;
            pre = t;
            p = p.next;
        }
        Node p2 = L.next, p1 = head;
        while (p1 != null) {
            if (p1.random != null) {
                int num = map1.get(p1.random);
                p2.random = map2.get(num);
            }else{
                p2.random = null;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return L.next;
    }
}

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
