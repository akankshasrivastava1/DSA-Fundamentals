package Jan_4th.Assignment;
import java.util.Arrays;
// Implement a Merge sort to sort the input array in asceding order

public class MergeAscending {
    public static void mergesort(int[] input, int start, int end) { 
        int mid = (start + end) / 2; 
        if (start < end) 
        { 
            mergesort(input, start, mid); 
            mergesort(input, mid + 1, end); 
        } 
         int i = 0, first = start, last = mid + 1; 
         int[] tmp = new int[end - start + 1]; 
         while (first <= mid && last <= end) 
         { 
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++]; 
         } 
         while (first <= mid)
         { 
            tmp[i++] = input[first++]; 
         } 
         while (last <= end)
         { 
            tmp[i++] = input[last++]; 
         } 
        i = 0; 
        while (start <= end)
        {
            input[start++] = tmp[i++];
        } 
    }
    public static void mergesort(int[] input) 
    {
        mergesort(input, 0, input.length - 1); 
    }
    public static void main(String[] args) { 
        System.out.println("mergesort"); 
        int[] input = { 22, 33, 65, 75, 44, 32, 76 };
        mergesort(input); 
        System.out.println(Arrays.toString(input)); 
    }      
}
