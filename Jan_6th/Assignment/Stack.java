package Jan_6th.Assignment;
import java.util.ArrayDeque;
import java.util.Queue;
//Using 2 queue implement a stack
    class Stack<T>{
    Queue<T> q1, q2;
 
    public Stack()
    {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    void add(T data)
    {
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }
 
        q1.add(data);
 
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public T poll()
    {
        if (q1.isEmpty())
        {
            System.out.println("Underflow!");
            System.exit(0);
        }
 
        T front = q1.peek();
        q1.poll();
 
        return front;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };
        Stack<Integer> s = new Stack<Integer>();
        for (int key: keys) {
            s.add(key);
        }
 
        for (int i = 0; i <= keys.length; i++) {
            System.out.println(s.poll());
        }
    }
}

