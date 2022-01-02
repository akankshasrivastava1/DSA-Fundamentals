package Dec_23rd;

import java.util.Arrays;

// Time Complexity : O(n^2)
// Space Complexity: O(1)

public class BubbleSort {
    
    public static void bubblesort(int [] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){  // each time this loop will fix one max element at its correct position
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){  // ASC    DSC-> arr[j]<arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 3, -1};
               // bubbleSort(arr);
               //insertionSort(arr);
              //selectionSort(arr);
        Arrays.sort(arr);
        System.out.println("=======================================================");
        System.out.println(Arrays.toString(arr));
    }
}

