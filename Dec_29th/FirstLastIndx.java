package Dec_29th;

class FirstIndex {
    public static void FindFirst(int[] arr, int index)
    {   
        int n=-1;
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == index) {
                n=i;
                break;
            }
            i++;
        }
         
        System.out.println("Index of "+index+" is : " +n);
    }

    public static void FindLast(int[] arr, int index)
    {   
        int i = 0, n=-1;
        while(i < arr.length) {
            if(arr[i] == index) {
                n=i;
            }
            i++;
        }
         
        System.out.println(" last Index of "+index+" is : "+n);
    }
public class FirstLastIndx{

}