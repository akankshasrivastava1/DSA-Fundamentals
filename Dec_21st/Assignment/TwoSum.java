package Dec_21st.Assignment;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum {
    
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        int sum = numbers[start] + numbers[end];
        while(sum != target){
            if(sum < target) start++;
            else end--;
            sum = numbers[start] + numbers[end];
        }
        return new int[]{start + 1, end + 1};
    }

    public static void main(String[] args){
        int [] nums = {2,7,11,15};
        int sum = nums[0] + nums[1];
        System.out.println(sum);
         
    }
    }

