package Dec_23rd.Assignment;

public class SortedArray {
    public static int[] sortArray(int[] nums) {
    
        int temp = 0;        
        for (int i = 0; i < nums.length; i++) {     
            for (int j = i+1; j < nums.length; j++) {     
               if(nums[i] > nums[j]) {    
                   temp = nums[i];    
                   nums[i] = nums[j];    
                   nums[j] = temp;    
               }     
            }     
        }
        for (int i = 0; i < nums.length - 1; i++) 
        {
            System.out.print(nums+ ", ");
        }
        System.out.print(nums[nums.length - 1]);
        return nums;    
          
    }    
    public static void main(String[] args) { 
        int[] nums = {5, 2, 8, 7, 1};   
        sortArray(nums);    
    }
}
