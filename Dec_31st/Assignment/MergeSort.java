package Dec_31st.Assignment;
import java.util.Arrays;
public class MergeSort {
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
        int[] input = { 2, 3, 6, 7, 8, 4 };
        mergesort(input); 
        System.out.println(Arrays.toString(input)); 
    }    
}
