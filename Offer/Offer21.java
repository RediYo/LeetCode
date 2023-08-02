public class Offer21 {
    public int[] exchange(int[] nums) {
        //前后交换
        int even=0,odd=nums.length-1;
        while(even<odd) {
            for (int i = even; i < nums.length; i++) {
                if(nums[i]%2==0){
                    even=i;
                    break;
                }
            }
            for (int j = odd; j >= 0; j--) {
                if(nums[j]%2!=0){
                    odd=j;
                    break;
                }
            }
            if(even>odd){
                return nums;
            }
            int temp=nums[even];
            nums[even]=nums[odd];
            nums[odd]=temp;
            even++;
            odd--;
        }
        return nums;
    }
}