package Jan_4th.Assignment;
import java.util.Arrays;
//Implement a Merge sort to sort the input array of chars in descending order.

public class MergeCharDesceding {
     public static void mergesort(char c[], int start, int end) { 
        int mid = (start + end) / 2; 
        if (start < end) 
        { 
            mergesort(c, start, mid); 
            mergesort(c, mid + 1, end); 
        } 
         int i = 0, first = start, last = mid + 1; 
         int[] tmp = new int[end - start + 1]; 
         while (first <= mid && last <= end) 
         { 
            tmp[i++] = c[first] < c[last] ? c[first++] : c[last++]; 
         } 
         while (first <= mid)
         { 
            tmp[i++] = c[first++]; 
         } 
         while (last <= end)
         { 
            tmp[i++] = c[last++]; 
         } 
        i = 0; 
        while (start <= end)
        {
            c[start++] = (char) tmp[i++];
        } 
    }
    public static void mergesort(char c[]) 
    {
        mergesort(c, 0, c.length - 1); 
    }
    public static void main(String[] args) { 
        System.out.println("mergesort"); 
        char[] c = { 'a', 'x', 'y', 'b', 'A', 'T', 't' };
        mergesort(c); 
        System.out.println(Arrays.toString(c)); 
    }      
}
