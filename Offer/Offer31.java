import java.util.ArrayDeque;
import java.util.Deque;

public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        //指针index指示数组栈的位置
        //思路：使用栈Stack进行模拟
        Deque<Integer> deque=new ArrayDeque<>();
        int j=0;
        for (int i = 0; i < pushed.length; i++) {
            deque.add(pushed[i]);
            while(!deque.isEmpty()&&deque.peekLast()==popped[j]){
                deque.removeLast();
                j++;
            }
        }
        if(deque.isEmpty()){
            return true;
        }
        return false;

    }
}