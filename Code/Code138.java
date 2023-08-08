public class Code138 {
    
    public Node copyRandomList(Node head) {
        
        //先构造一个全新链表，
        //使用一个哈希表保存原链表的<random, p> <p, 序列号>
        //另一个哈希表遍历保存新链表<序列号, p>
        //遍历根据旧表random来指导新表的指针
        return null;
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
