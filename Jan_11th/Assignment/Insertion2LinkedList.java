package Jan_11th.Assignment;
//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Insertion2LinkedList {
    Node head1, head2;
    static class Node {
        int val;
        Node next;
        Node (int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
    
    int getCount(Node node)
    {
        Node current = node;
        int count = 0;
 
        while (current != null) {
            count++;
            current = current.next;
        }
 
        return count;
    }
    

    public static void main(String args[])
    {
        Insertion2LinkedList list = new Insertion2LinkedList ();
 
        // creating first linked list
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
 
        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
 
        System.out.println("The node of intersection is " + list.getCount(head1, head2));
    }
}
