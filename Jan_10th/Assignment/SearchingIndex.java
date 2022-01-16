package Jan_10th.Assignment;
//Searching a given element and returning it's index value if the element is found or else return -1
public class SearchingIndex {
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    //Represent the head and tail of the singly linked list  
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
    
    public int searchNode(int data) {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
          
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + i);  
        else  
            System.out.println("Element is not present in the list"); 
            return -1; 
    }  
      
    public static void main(String[] args) {  
        SearchingIndex sList = new SearchingIndex();  
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
          
        //Search for node 2 in the list  
        sList.searchNode(2);  
        //Search for a node  in the list  
        sList.searchNode(7);  
    }  
}
