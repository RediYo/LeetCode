import ExtraNode.TreeNode;

public class Offer28 {

  public boolean isSymmetric(TreeNode root) {
    TreeNode rootMirror = mirrorTree(root);
    return isSame(root, rootMirror);
  }

  public TreeNode mirrorTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirrorTree(root.left);
    mirrorTree(root.right);
    return root;
  }

  public boolean isSame(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return true;
    }
    if ((t1 == null && t2 != null) || (t1 != null && t2 == null)) {
      return false;
    }
    if (t1.val == t2.val) {
      return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    } else {
      return false;
    }
  }
}
