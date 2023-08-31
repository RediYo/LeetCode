import ExtraNode.TreeNode;

/*
 * 给定两个整数数组 preorder 和 inorder ，
 * 其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，
 * 请构造二叉树并返回其根节点。
 */
public class Code105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int pre_i, int pre_j,
            int in_i, int in_j) {

        if(pre_i>pre_j||in_i>in_j){
            return null;
        }
        int mid = preorder[pre_i];
        int i = in_i;
        // 分割 inorder
        while (mid != inorder[i]) {
            i++;
        }
        // 分割 preorder
        int leftNum = i - in_i; // 计算当前节点左子树元素数量以用于preorder分割
        TreeNode t = new TreeNode(mid);
        t.left = build(preorder, inorder, pre_i + 1, pre_i + leftNum, in_i, i - 1);
        t.right = build(preorder, inorder, pre_i + leftNum + 1, pre_j, i + 1, in_j);

        return t;

    }
}
