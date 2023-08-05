import ExtraNode.TreeNode;

public class Offer26 {

  public boolean isSubStructure(TreeNode A, TreeNode B) {

    return B != null && (isSubTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));

  }

  public boolean isSubTree(TreeNode A, TreeNode B) {

    if ((B == null && A != null) || (A == null && B != null)) {
      return false;
    }
    boolean left = false, right = false;
    if (A != null) {
      if (A.val == B.val) {
        left = isSubTree(A.left, B.left);
        right = isSubTree(A.right, B.right);
      }
      return left && right;
    }
    return false;
  }
}
