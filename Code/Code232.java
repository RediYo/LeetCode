import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    Deque<Integer> stack1;//队列进
    Deque<Integer> stack2;//队列出

    public MyQueue() {
        stack1 = new ArrayDeque<Integer>();
        stack2 = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        while(!stack2.isEmpty()){
            stack1.addFirst(stack2.pollFirst());
        }
        stack1.addFirst(x);//添加到栈1开头，表示队列进入一个元素
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.addFirst(stack1.pollFirst());
        }
        return stack2.pollFirst();
    }
    
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.addFirst(stack1.pollFirst());
        }
        return stack2.peekFirst();
    }
    
    public boolean empty() {
        while(!stack1.isEmpty()){
            stack2.addFirst(stack1.pollFirst());
        }
        return stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */