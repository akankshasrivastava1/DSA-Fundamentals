package Jan_6th;
import java.util.Stack;

public class ReverseStack {
    public static String reverse(String str)
    {
        if (str == null || str.equals("")) {
            return str;
        }
        Stack<Character> stack = new Stack<Character>();
 
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }
        int k = 0;
        while (!stack.isEmpty())
        {
            ch[k++] = stack.pop();
        }
        return String.copyValueOf(ch);
    }
 
    public static void main(String[] args)
    {
        String str = "Geekster";
 
        str = reverse(str);  
 
        System.out.println("The reversed string is " + str);
    }
}
