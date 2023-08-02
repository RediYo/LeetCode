public class Offer1 {
    
    public int[] twoSum(int[] nums, int target) {

        //1.数据排序
        //2.前后向中间移动
        int left = 0;
        int right = nums.length-1;
        quickSort(nums, left, right);
        while(left < right){
            if(nums[left] + nums[right] == target){
                return new int[]{left, right};
            }
            if(nums[left] + nums[right] < target){
                left++;
            }
            if(nums[left] + nums[right] > target){
                right--;
            }
        }
        return null;
    }

    void quickSort(int[] nums, int left, int right){//快速排序
        
        int i = left;
        int j = right;

        if(i>=j){
            return;
        }
        while(i<j){
            while(nums[j] >= nums[left] && i<j){
                j--;
            }
            while(nums[i] <= nums[left] && i<j){
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
