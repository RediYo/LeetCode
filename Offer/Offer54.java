public class Offer54 {
    
    int result;
    public int kthLargest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        select(root, k);
        return result;
    }

    public void select(TreeNode p, int k){
        
        if(p.right!=null){
            select(p.right, k);
        }
        k--;
        if(k==0){
            result = p.val;
            return;
        }else if(k<0){
            return;
        }
        if(p.left!=null){
            select(p.left, k);
        }
    }
}