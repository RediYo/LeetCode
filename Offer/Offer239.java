import java.util.Deque;
import java.util.LinkedList;

public class Offer239 {
    
    public int[] maxSlidingWindow(int[] nums, int k) {

        //使用单调队列（队头到队尾，最大到最小）
        //单调入队：从左往右移动时，遍历元素比队尾元素大则队尾元素出队列，否则遍历元素从队尾入队列
        //k元素边界问题如何解决？1.形成k大小窗口 2.队列保存窗口值索引 3.遍历时元素单调入队，
        //后判断队首最大值索引是否在窗口中，如果在则为窗口最大值，如果不在则弹出后的窗口队首为最大值
        if(nums==null||nums.length==0){
            return null;
        }
        Deque<Integer> deque = new LinkedList<Integer>();
        //int left=0;
        deque.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            for (int j = deque.size()-1; j>=0; j--) {
                if(nums[i]>=deque.getLast()){
                    deque.removeLast();
                }else{
                    deque.addLast(nums[i]);
                    break;
                }
            }
            
        }
        return null;
    }
}
