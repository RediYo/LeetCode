import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Offer32_1 {

  public int[] levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    TreeNode p = root;
    List<Integer> list = new ArrayList<>();
    while (queue.peek() != null) {
      p = queue.poll();
      list.add(p.val);
      if (p.left != null) {
        queue.add(p.left);
      }
      if (p.right != null) {
        queue.add(p.right);
      }
    }
    return list.stream().mapToInt(Integer::valueOf).toArray();
  }
}
