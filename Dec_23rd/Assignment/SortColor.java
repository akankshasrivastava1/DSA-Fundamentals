package Dec_23rd.Assignment;

public class SortColor {
    public static int[] sortColors(int[] nums) {
    int len = nums.length;
        int zero=0,one=0,two=0;
        for(int i=0;i<len;i++){
            if(nums[i] == 0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }else{
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[i] = 0;
        }
        for(int i=zero;i<zero+one;i++){
            nums[i] = 1;
        }
        for(int i=zero+one;i<len;i++){
            nums[i] = 2;
        }
        return nums;
     
    }
    static void printArray(int nums[], int len)
    {
        for (int i = 0; i < len; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) { 
        int nums[] = { 2,0,2,1,1,0 };
        int len = nums.length;
        sortColors(nums);
        System.out.println("Array after seggregation ");
        printArray(nums, len);
    
    }
} 
