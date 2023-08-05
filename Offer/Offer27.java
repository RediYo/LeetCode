import ExtraNode.TreeNode;

public class Offer27 {

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
}
