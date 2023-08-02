import java.util.ArrayDeque;
import java.util.Deque;

public class Offer59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {//单调队列，队列中始终保持最大到小顺序（比新来元素小的出队列）

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.add(nums[i]);
        }
        int[] result = new int[nums.length-k+1];
        result[0]=deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if(nums[i-k]==deque.peekFirst()){//滑动窗口移除的为最大值
                deque.removeFirst();
            }
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.add(nums[i]);
            result[i-k+1]=deque.peekFirst();
        }
        return result;
    }
}