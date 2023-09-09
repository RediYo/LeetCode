
/*
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，
满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 */

import ExtraNode.TreeNode;

public class Code236 {

    boolean vp = false, vq = false;
    TreeNode tNode;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // 最近根节点的左右子节点均已访问到了，设置两个访问变量
        track(root, p, q);
        return tNode;
    }

    public boolean track(TreeNode t, TreeNode p, TreeNode q) {

        if (t == null) {
            return false;
        }
        boolean isMe = false;
        if (t == p || t == q) {
            isMe = true;
        }
        boolean left = track(t.left, p, q);
        boolean right = track(t.right, p, q);
        boolean isFind = (left && right) || (left && isMe) || (right && isMe);
        if (isFind) {
            tNode = t;
            return true;
        }
        return isMe || left || right;

    }
}
