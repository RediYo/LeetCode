import java.util.Arrays;

import ExtraNode.TreeNode;

public class Offer7 {

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    //中序遍历节点划分左右子树
    if (preorder.length == 0) {
      return null;
    }
    int pre = preorder[0];
    TreeNode t = new TreeNode(pre);
    int in = 0;
    for (int i = 0; i < inorder.length; i++) {
      if (inorder[i] == pre) {
        in = i;
      }
    }
    //以in为区间进行划分
    int[] left_1 = Arrays.copyOfRange(preorder, 1, in + 1);
    int[] right_1 = Arrays.copyOf(inorder, in);
    int[] left_2 = Arrays.copyOfRange(preorder, in + 1, preorder.length);
    int[] right_2 = Arrays.copyOfRange(inorder, in + 1, inorder.length);
    t.left = buildTree(left_1, right_1);
    t.right = buildTree(left_2, right_2);
    return t;
  }
}
