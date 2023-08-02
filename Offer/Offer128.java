public class Offer128 {
    
    public int longestConsecutive(int[] nums) {

        //1.快速排序
        int left = 0;
        int right = nums.length-1;
        quickSort(nums, left, right);
        //2.最小值到最大值依次进行查找连续数字

        return 0;
    }
    void quickSort(int[] nums, int left, int right){

        if(left >= right){
            return;
        }
        int i=left, j=right;
        while(i < j){
            while(i<j&&nums[j]>=nums[left]){
                j--;
            }
            while(i<j&&nums[i]<=nums[left]){
                i++;
            }
            swap(nums, i, j);
        }
        swap(nums, i, left);
        quickSort(nums, left, i-1);
        quickSort(nums, i+1, right);
        
    }
    void swap(int[] nums, int i, int left){

        int temp = nums[i];
        nums[i] = nums[left];
        nums[left] = temp;
    }
}
