package Jan_10th.Assignment;

public class PrintGivenIndex {
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
      
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
        }  
    }  
    public void display(PrintGivenIndex sList, int index) {  
        Node current = sList.head;  
        int count = 0;
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of singly linked list: ");  
        while(current != null) {
            if(count>=index) { 
            System.out.print(current.data + " ");  
            }
            count++;
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        PrintGivenIndex sList = new PrintGivenIndex();  
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
        sList.addNode(5);
        sList.addNode(6);
        sList.addNode(7);
        sList.addNode(8);
        //Displays the nodes present in the list  
        sList.display(sList, 3);  
    }
}
