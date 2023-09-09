import ExtraNode.TreeNode;

/*
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的路径的数目。

路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 */
public class Code437 {

    int count=0;
    
    public int pathSum(TreeNode root, int targetSum) {

        //深度优先遍历
        track(root, targetSum);
        return count;
    }
    public void track(TreeNode p, int targetSum){

        if(p==null){
            return;
        }
        trackTarget(p, targetSum, 0);
        track(p.left, targetSum);
        track(p.right, targetSum);
    }
    public void trackTarget(TreeNode p, int targetSum, long currentSum){
        
        if(p==null){
            return;
        }
        if(currentSum+p.val==targetSum){
            count++;
        }
        trackTarget(p.left, targetSum, currentSum+p.val);
        trackTarget(p.right, targetSum, currentSum+p.val);
    }
}
