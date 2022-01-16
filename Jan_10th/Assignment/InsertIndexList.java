package Jan_10th.Assignment;
//Insertion at any given position , provided it's index value.

public class InsertIndexList {
    Node head;
  static  class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		next=null;
    	}
}
static InsertIndexList insert(InsertIndexList l1,int data){
    Node new_node=new Node(data);
    if(l1.head==null){
        l1.head=new_node;
    }
    else{
        Node curr=l1.head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new_node;
    }
    return l1;
}
public static void InsertNth(InsertIndexList l1, int index) {
    Node curr=l1.head;
    int count=0;
    while(curr!=null) {
        if(count==index) {
            System.out.println(curr.data);
        }
        count++;
        curr=curr.next;
    }
}
public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
   public static void main(String[] args) {
    InsertIndexList ls = new InsertIndexList();
    insert(ls, 10);
    insert(ls, 11);
    insert(ls, 12);
    insert(ls, 13);
    insert(ls, 14);
    System.out.println("\nCreated Linked list is: ");
    ls.printList();
    System.out.println("\nLinked List after Insertion at position : ");
    ls.printList();
    InsertNth(ls, 2);
   }
}
