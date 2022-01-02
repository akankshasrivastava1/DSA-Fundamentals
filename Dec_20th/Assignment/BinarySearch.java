package Dec_20th.Assignment;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length -1, mid;
        while(start <= end){
            mid = (start + end)/2;
            if (nums[mid] == target)
                return mid;
            if(target < nums[mid]){
                end = mid-1;
            }else
                start = mid+1;
        }
        return -1;
        
    }
    public static void main(String[] args){
       
        int [] nums = {-1,0,3,5,9,12};
        int find = search(nums, 9);
        System.out.println(find);
         
    }
}

  /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}*/

