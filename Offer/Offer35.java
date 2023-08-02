
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

public class Offer35 {

  public Node copyRandomList(Node head) {
    if (head == null) return null;
    Node p = head;
    Node head_2 = new Node(p.val);
    Node q = head_2;
    while (p.next != null) {
      q.next = new Node(p.next.val);
      p = p.next;
      q = q.next;
    }
    p = head;
    q = head_2;
    while (p != null) {
      Node tp = head, tq = head_2;
      while (tp != null) {
        if (p.random != tp) {
          tp = tp.next;
          tq = tq.next;
        } else {
          break;
        }
      }
      q.random = tq;
      p = p.next;
      q = q.next;
    }
    return head_2;
  }
}
