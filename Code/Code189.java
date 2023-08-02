public class Code189 {
    
    //189.轮转数组
    public void rotate(int[] nums, int k) {

        //1.保存后k个元素
        //2.将前n-k个元素进行后平移
        //3.将保存的k个元素放置在最前面
        //问题？如果nums元素比k小,nums[1,2,3] k=5 [1,2,3]，求余k
        if(nums.length<=k){
            k=k%nums.length;
        }
        int[] temp = new int[k];
        for (int i = nums.length-k, j=0; i < nums.length&&j<k; i++,j++) {
            temp[j]=nums[i];
        }
        for (int i = nums.length-1-k; i >= 0 ; i--) {
            nums[i+k]=nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i]=temp[i];
        }
    }
}
