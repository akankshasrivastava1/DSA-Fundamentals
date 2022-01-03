package Dec_31st.Assignment;
import java.util.Arrays;
public class QuickSort {
    static int partition(int[] a, int low , int hi)
    {
        int pivot = hi;
        int i =low;
        int j = hi-1;
        while(i<j)
        {
            if(a[i]<=a[pivot])
            {
                i++;
            }
            if(a[i]>a[pivot])
            {   
            if((a[i]>a[pivot]) && (a[j]<=a[pivot]))
            {
                int temp= a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;    
            }
            if(a[j]>a[pivot])
            {
                j--;
            }
            }
        }
        int temp= a[i];
        a[i]=a[pivot];
        a[pivot]=temp;
        return i;
    }
    static void quicksort(int[] a, int low, int hi)
    {
        if(low>=hi)
        {
            return;
        }
        int split = partition(a, low, hi);
        quicksort(a, low, split-1);
        quicksort(a, split+1, hi);
    }
    public static void main(String[] args) 
    {
        int a[] = {4, 6, 8, 5, 3, 4, 9, 0, 1};
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}

