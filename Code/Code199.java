import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ExtraNode.TreeNode;

/*
 * 给定一个二叉树的 根节点 root，
 * 想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */

public class Code199 {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode p = root;
        if (p != null) {
            queue.add(p);
        }
        int count = 0, pre = 1;
        while (!queue.isEmpty()) {
            if (pre == 1) {
                list.add(queue.peek().val);
            }
            p = queue.poll();
            pre--;
            if (p.left != null) {
                queue.offer(p.left);
                count++;
            }
            if (p.right != null) {
                queue.offer(p.right);
                count++;
            }
            if (pre == 0) {
                pre = count;
                count = 0;
            }
        }
        return list;

    }

}
