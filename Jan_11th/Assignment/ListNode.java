package Jan_11th.Assignment;
//https://leetcode.com/problems/merge-two-sorted-lists/ 

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
    static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode SortedList = mergeTwoLists(l1, l2);
        printList(SortedList);
    }
}

