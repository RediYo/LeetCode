import ExtraNode.TreeNode;

public class Code104 {

    public int maxDepth(TreeNode root) {

        return track(root);
    }

    public int track(TreeNode p) {

        if (p != null) {
            int left = track(p.left);
            int right = track(p.right);
            return left >= right ? left + 1 : right + 1;
        } else {
            return 0;
        }
    }
}
