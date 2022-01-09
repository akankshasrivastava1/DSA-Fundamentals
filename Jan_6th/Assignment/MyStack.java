package Jan_6th;
import java.util.Stack;

public class MyStack {
    int min = -1;
        static int demoVal = 9999;
        Stack<Integer> stack = new Stack<Integer>();
    
        void getMin() {
            System.out.println("min is : " + min);
        }
    
        void push(int val) {
    
            if (stack.isEmpty() || val < min) {
                min = val;
            }
    
            stack.push(val * demoVal + min);
    
            System.out.println("pushed : " + val);
        }
    
        int pop() {
            if (stack.isEmpty()) {
                System.out.println("stack underflow");
                return -1;
            }
    
            int val = stack.pop();
    
            if (!stack.isEmpty())
    
                min = stack.peek() % demoVal;
            else
                min = -1;
            System.out.println("popped : " + val / demoVal);
            return val / demoVal;
        }
    
        int peek() {
            return stack.peek() / demoVal;
        }
    
        public static void main(String[] args) {
            MyStack s = new MyStack();
    
            int[] arr = { 3, 5, 6, 7, 4, 33, 0 };
    
            for (int i = 0; i < arr.length; i++) {
                s.push(arr[i]);
                s.getMin();
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                s.pop();
                s.getMin();
            }
        }       
}
