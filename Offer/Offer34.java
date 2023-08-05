import java.util.ArrayList;
import java.util.List;

import ExtraNode.TreeNode;


public class Offer34 {

    List<List<Integer>> lists=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<Integer> list = new ArrayList<>();
        if(root==null){
            return null;
        }
        track(root, target, list);
        return lists;

    }

    public void track(TreeNode t, int target, List<Integer> list){

        if(t.left==null&&t.right==null){
            if(list.stream().reduce(t.val,(a,b)->a+b)==target){
                list.add(t.val);
                List<Integer> tempList= new ArrayList<>();
                for (Integer integer : list) {
                    tempList.add(integer);
                }
                lists.add(tempList);
            }else{
                return;
            }
        }
        list.add(t.val);
        if(t.left!=null){
            track(t.left, target, list);
            list.remove(list.size()-1);
        }
        if(t.right!=null){
            track(t.right, target, list);
        }

    }
}