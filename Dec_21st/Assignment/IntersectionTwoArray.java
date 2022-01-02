package Dec_21st.Assignment;

public class IntersectionTwoArray {
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        
         int m = nums1.length;
         int n = nums2.length;
         int i = 0, j = 0;
       
       while (i < m && j < n) {
            if (nums1[i] < nums2[j])
               i++;
            else if (nums2[j] < nums1[i])
               j++;
            else {
               System.out.print(nums2[j++]+" ");
               i++; 
            }
         }
      return nums2;
     }
     public static void main(String[] args){
      int nums1[] = {1,2,2,1};
      int nums2[] = {2,4};
      intersection(nums1, nums2);

     }
     
}

