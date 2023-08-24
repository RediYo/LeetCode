import ExtraNode.TreeNode;

public class Code101 {

    public boolean isSymmetric(TreeNode root) {

        return track(root.left, root.right);
    }

    public boolean track(TreeNode t1, TreeNode t2) {// 自上而下

        if ((t1 == null && t2 != null) || (t2 == null && t1 != null)) {
            return false;
        } else {
            if (t1 != null && t2 != null) {
                return t1.val == t2.val && track(t1.left, t2.right) && track(t1.right, t2.left);
            } else {
                return true;
            }
        }

    }
}
