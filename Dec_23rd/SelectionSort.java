package Dec_23rd;

import java.util.Arrays;
import java.util.ArrayList;

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex=i;

            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            if(minIndex!=i){
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }

    }
public static void main(String[] args) {
    int[] arr = {12, 5, 3, -1};
    int k=2;
           // bubbleSort(arr);
           //insertionSort(arr);
          //selectionSort(arr);
    Arrays.sort(arr);
    System.out.println("=======================================================");
    System.out.println(Arrays.toString(arr));

    // find Kth smallest element


    System.out.println(arr[k]);

// kth largest element
    int n=arr.length;
    System.out.println(arr[n-k]);

    ArrayList<String> list=new ArrayList<>();
    list.add("aka");
    list.add("sri");
    

    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }

    list.remove(2);
}

}
