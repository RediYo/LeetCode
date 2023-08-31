import ExtraNode.TreeNode;

public class Code543 {// 给你一棵二叉树的根节点，返回该树的 直径 。

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        // 转化为求每个节点两边高度之和的最大值
        track(root);
        return max;
    }

    public int track(TreeNode t) {

        if (t == null) {
            return 0;
        }

        int leftHigh = track(t.left);
        int rightHigh = track(t.right);
        int high = Math.max(leftHigh, rightHigh) + 1;
        max = Math.max(leftHigh + rightHigh, max);

        return high;
    }
}