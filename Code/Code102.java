import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import ExtraNode.TreeNode;

public class Code102 { // 二叉树的层序遍历
    
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        if(root==null){
            return lists;
        }
        Deque<TreeNode> qt =  new LinkedList<>();
        
        TreeNode p = root;
        qt.add(p);
        int precount = 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while(!qt.isEmpty()){
            TreeNode t = qt.remove();
            list.add(t.val);
            precount--;
            if(t.left!=null){
                qt.add(t.left);
                count++;
            }
            if(t.right!=null){
                qt.add(t.right);
                count++;
            }
            if(precount == 0){
                precount = count;
                count = 0;
                lists.add(list);
                list = new ArrayList<>();
            }
        }
        return lists;
    }
}
