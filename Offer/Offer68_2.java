import ExtraNode.TreeNode;

public class Offer68_2 {

  boolean flag = true;
  TreeNode result;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    track(root, p, q);
    return result;
  }

  public boolean track(TreeNode r, TreeNode p, TreeNode q) {
    if (r == null) {
      return false;
    }

    boolean left = track(r.left, p, q);
    boolean right = track(r.right, p, q);
    boolean rb=flag;
    if ((r.val == p.val || r.val == q.val)) {
      rb = true;
    }
    if (
      ((r.val == p.val || r.val == q.val) && (left || right)) || (left && right)
    ) {
      if (flag) {
        result = r;
        flag = false;
      }
    }
    return rb;
  }
}
