import ExtraNode.TreeNode;

public class Code108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        return track(nums, 0, nums.length - 1);
    }

    TreeNode track(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode p = new TreeNode(nums[mid]);
        p.left = track(nums, left, mid - 1);
        p.right = track(nums, mid + 1, right);
        return p;
    }
}
