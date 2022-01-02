package Dec_23rd;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n=arr.length;

            for(int i=1;i<n;i++){ // pick the element one by one to insert
                int key=arr[i];
                int j;

                for(j=i-1;j>=0;j--){
                    if(arr[j]>key){
                        arr[j+1]=arr[j];
                    }else{
                        break;
                    }
                }

                arr[j+1]=key;
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
