import java.util.ArrayList;
import java.util.List;

import ExtraNode.TreeNode;

public class Code98 { // 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。

    List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {

        // 中序遍历有序
        track(root);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void track(TreeNode t) {

        if (t == null) {
            return;
        }
        track(t.left);
        list.add(t.val);
        track(t.right);
    }
}

class Solution98 { // 进阶
    
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right==null){
            return true;
        }
        // 中序遍历有序
        return track(root);
    }

    public boolean track(TreeNode t) {

        if (t == null) {
            return true;
        }
        boolean left = track(t.left);
        if (t.val <= pre) {
            return false;
        }
        pre = t.val;
        boolean right = track(t.right);
        return left&&right;
    }
}
