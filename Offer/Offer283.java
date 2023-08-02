public class Offer283 {
    public void moveZeroes(int[] nums) {

        //例：1 3 0 4 5 0
        // 1 3 4 5 0 0
        //1.从向前向后开始遍历，使用两个指针，一个指针遇到非0元素时停下，一个指针遇到0元素时停下，然后交换
        int p_n = 0;
        int p_0 = 0;
        while(p_0 <= nums.length-1){
        
            while(nums[p_0]!=0&&p_0<nums.length-1){
                p_0++;
            }

            if(p_0==nums.length-1){
                break;
            }
            
            while(nums[p_n]==0&&p_n<nums.length-1){
                p_n++;
            }


            if(p_0<p_n){
                int temp=nums[p_0];
                nums[p_0]=nums[p_n];
                nums[p_n]=temp;
            }
        }
    }
}
