public class Offer39 {
    public int majorityElement(int[] nums) {

        int count=1;
        int index=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(index==nums[i]){
                count++;
            }else{
                count--;
                if(count<=0){
                    index=nums[i];
                    count=1;
                }
            }
        }
        return index;
    }
}