import java.util.List;

public class Offer49 {
    
    public List<List<String>> groupAnagrams(String[] strs) {

        //1.按照字母排序，排序后的结果作为哈希表的key，值为字母异位词的列表

        
        return null;
    }

    void quickSort(String nums, int left, int right){//快速排序
        
        int i = left;
        int j = right;

        if(i>=j){
            return;
        }
        while(i<j){
            while(nums.charAt(j) >= nums.charAt(left) && i<j){
                j--;
            }
            while(nums.charAt(j) <= nums.charAt(left) && i<j){
                i++;
            }
            swap(nums, i, j);
        }
        swap(nums, i, left);
        quickSort(nums, left, i-1);
        quickSort(nums, i+1, right);
    }

    void swap(String nums, int i, int left){

        
    }
}
