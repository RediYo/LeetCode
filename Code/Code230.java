import ExtraNode.TreeNode;

/*
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，
 * 请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 */

public class Code230 {

    int seq = 0;
    int kVal = 0;

    public int kthSmallest(TreeNode root, int k) {

        track(root, k);
        return kVal;
    }

    public void track(TreeNode t, int k) {

        if (t == null) {
            return;
        }
        track(t.left, k);
        seq++;
        if (seq == k) {
            kVal = t.val;
            return;
        }
        track(t.right, k);
    }
}

/*
 * 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，
 * 你将如何优化算法？
 */
class Solution230 {
    public int kthSmallest(TreeNode root, int k) {

        return 0;
    }
}
