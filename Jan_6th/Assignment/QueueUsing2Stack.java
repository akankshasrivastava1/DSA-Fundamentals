package Jan_6th;
import java.util.Stack;
public class QueueUsing2Stack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    private int front;
    
    public QueueUsing2Stack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        shiftStackElement();
        return st2.pop();
    }
    
    public int peek() {
        shiftStackElement();
        return st2.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
    
    
    private void shiftStackElement() {
        if(st2.isEmpty() && !st1.isEmpty()) {
            
            while(!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
    }
 
    public static void main(String[] args) { 
       QueueUsing2Stack qu = new QueueUsing2Stack(); 
       qu.push(3); 
       qu.push(4); 
       qu.peek(); 
       qu.pop(); 
       qu.empty(); 
    }
}
