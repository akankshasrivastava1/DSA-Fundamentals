package Dec_29th.Assignment;
//Calculate the avg of elements of an array using recursive code

public class AvgArray {
    public static int findAvg(int a[], int n)
    {
        int sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
     
        return (int)sum / n;
    }
    public static void main(String[] args) {
    
        int arr [] = {1,2,3,4,5};
        int n = arr.length;
     
        System.out.println(findAvg(arr, n));
       
     }
}


