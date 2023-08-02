public class Code41 {
    
    public int firstMissingPositive(int[] nums) {

        //要实现复杂为O(n)，且只使用常数级别额外空间
        //考虑使用原nums数组进行，索引修改为nums.len-min(nums正整数)
        //遇到更小的正整数则对更大的正整数进行剪枝
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {//求最小正整数
            if(nums[i]>0){
                min=min<nums[i]?min:nums[i];
            }
        }
        return 0;
    }
}
