import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class Code46 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        LinkedList<Integer> path = new LinkedList<>();
        backtrace(nums, path);
        return res;
    }

    public void backtrace(int[] nums, LinkedList<Integer> path){

        if(path.size()==nums.length){
            res.add(new LinkedList<>(path));
        }

        for (int i = 0; i < nums.length; i++) {
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            backtrace(nums, path);
            path.removeLast();
        }
    }
}
