import ExtraNode.TreeNode;

public class Code226 {
    
    public TreeNode invertTree(TreeNode root) {
        
        track(root);
        return root;
    }

    public void track(TreeNode p) {

        if (p != null) {
            TreeNode tmp =p.left;
            p.left = p.right;
            p.right = tmp;
            track(p.left);
            track(p.right);
        } else {
            return;
        }
    }
}
