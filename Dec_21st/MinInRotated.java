package Dec_21st;

public class MinInRotated {
    public static void main(String[] args) {

        int[] nums = {4,5,6,1,2,3};
        
        int start = 0;
        int end = nums.length-1;
        
        if(nums[start] < nums[end]){
            System.out.println(nums[0]);
        }
        
        if(nums.length < 2) System.out.println(nums[0]);
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if((mid < end) && nums[mid] > nums[mid + 1]){
            	 System.out.println(mid+1);
                
            }else if((mid > start) && nums[mid] < nums[mid-1]){
            	System.out.println(mid);
            }else if(nums[start] < nums[mid]){

                start = mid + 1;
            }else{
                
                end = mid - 1;
            }
        }
        
    }
}
