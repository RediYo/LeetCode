import ExtraNode.TreeNode;

public class Offer68_1 {

  boolean flag = true;
  TreeNode result;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (p.val > q.val) {
      track(root, q, p);
    } else {
      track(root, p, q);
    }
    return result;
  }

  public void track(TreeNode r, TreeNode p, TreeNode q) {
    if (r == null) {
      return;
    }
    if (r.val >= p.val && r.val <= q.val) {
      if (flag) {
        result = r;
        flag = false;
      }
    }
    if (r.val > p.val && r.val > q.val) {
      track(r.left, p, q);
    }
    if (r.val < p.val && r.val < q.val) {
      track(r.right, p, q);
    }
  }
}
