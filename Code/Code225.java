import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {//225.用队列实现栈

    Deque<Integer> que1;//输入输出栈
    Deque<Integer> que2;//暂存栈

    public MyStack() {
        que1 = new ArrayDeque<>();
        que2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        que1.addLast(x);
    }
    
    public int pop() {
        if(que1.isEmpty()){
            while(!que2.isEmpty()){
                que1.addLast(que2.pollFirst());
            }
        }
        while(que1.size()!=1||que1.isEmpty()){
            que2.addLast(que1.pollFirst());
        }
        return que1.pollFirst();
    }
    
    public int top() {
        if(que1.isEmpty()){
            while(!que2.isEmpty()){
                que1.addLast(que2.pollFirst());
            }
        }
        while(que1.size()!=1||que1.isEmpty()){
            que2.addLast(que1.pollFirst());
        }
        return que1.peekFirst();
    }
    
    public boolean empty() {
        return que1.isEmpty()&&que2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */