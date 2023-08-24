import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import ExtraNode.TreeNode;

public class Code94 { // 94. 二叉树的中序遍历

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) { // 递归法

        track(root);
        return list;
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

class Solution {

    List<Integer> list = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) { // 迭代法

        // TODO 

        return null;
    }

}