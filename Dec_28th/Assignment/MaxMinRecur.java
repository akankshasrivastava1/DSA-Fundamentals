package Dec_28th.Assignment;

public class MaxMinRecur {
    public static int MinRec(int A[], int n)
    {
      if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], MinRec(A, n-1));
    }
    public static int MaxRec(int A[], int n)
    {
      if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], MaxRec(A, n-1));
    }
    public static void main(String args[])
    {
        int A[] = {1,-1,0,2,-2,3,-3,4,-4};
        int n = A.length;
       
        System.out.println("Minimum of element = " +MinRec(A, n));
        System.out.println("Maximum of element = " +MaxRec(A, n));
    }
}

