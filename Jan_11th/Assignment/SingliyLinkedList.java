package Jan_11th.Assignment;
//Find the kth element in a linked list from the end of singlly linked list in  1. Using two traversal 2. In single traversal (using 2 pointer approch).
public class SingliyLinkedList {
    public static void main(String a[]) {   
        Node ten = new Node(10);  
        Node twenty = new Node(20);  
        Node thirty = new Node(30);  
        Node fourty = new Node(40);  
        Node fifty = new Node(50);  
        Node sixty = new Node(60);      
        Node head = ten;  
        head.setNext(twenty);  
        twenty.setNext(thirty);  
        thirty.setNext(fourty);  
        fourty.setNext(fifty);  
        fifty.setNext(sixty);  
        System.out.println("2nd element from end in linked list : "  + getNthNodeFromEnd(head, 2));     
        System.out.println("3rd element from tail in linked list : "  + getNthNodeFromEnd(head, 3));      
        System.out.println("4th element from end in linked list : "  + getNthNodeFromEnd(head, 4));     
    }

public static Node getNthNodeFromEnd(Node head, int n){  
    Node fast = head;  Node slow = head;  
    for(int i = 1; i<=n; i++){  
        fast = fast.getNextNode();  
    }     // now let's start moving both fast and slow pointer  
    while(fast != null){  
        fast = fast.getNextNode();  
        slow = slow.getNextNode();   
    }     return slow;   
}   
}
class Node{   
    private Node next;  
    private int data;      
    public Node(int data){  
        this.data = data;   
    }     
    public int getData(){  
        return data;   
    }     
    public Node getNextNode(){  
        return next;   
    }     
    public void setNext(Node next){  
        this.next = next;   
    }      @Override   
    public String toString() {  
        return String.format("%d", data);   
    }   
}
        
