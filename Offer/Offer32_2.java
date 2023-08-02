import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Offer32_2 {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> intLists = new ArrayList<List<Integer>>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    TreeNode p = root;
    List<Integer> list = new ArrayList<>();
    int currentNodeNum = 1;
    int nextNodeNum = 0;
    while (queue.peek() != null) {
      p = queue.poll();
      list.add(p.val);
      currentNodeNum -= 1;
      if (p.left != null) {
        nextNodeNum += 1;
        queue.add(p.left);
      }
      if (p.right != null) {
        nextNodeNum += 1;
        queue.add(p.right);
      }
      if (currentNodeNum == 0) {
        intLists.add(list);
        currentNodeNum = nextNodeNum;
        nextNodeNum = 0;
        list = new ArrayList<>();
      }
    }
    return intLists;
  }
}
