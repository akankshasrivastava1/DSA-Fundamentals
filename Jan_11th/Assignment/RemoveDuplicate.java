package Jan_11th.Assignment;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicate {
       int val;
       ListNode next;
       RemoveDuplicate() {}
       RemoveDuplicate(int val) { this.val = val; }
       RemoveDuplicate(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
   class Solution {
       public ListNode deleteDuplicates(ListNode head) {
           if(head == null || head.next == null)
               return head;
    
           ListNode p = head;
    
           while( p!= null && p.next != null){
               if(p.val == p.next.val){
                   p.next = p.next.next;
               }else{
                   p = p.next; 
               }
           }
    
           return head;
       }
   }
