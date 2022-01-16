package Jan_10th.Assignment;
//Deletion at any given position , provided it's index value.

public class DeleteIndexList {
    static Node head; 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    void deleteNode(int position)
    {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
 
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
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
        DeleteIndexList ls = new DeleteIndexList();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        System.out.println("\nCreated Linked list is: ");
        ls.deleteNode(2); // Delete node at position 2
        ls.printList();
        System.out.println("\nLinked List after Deletion at position 2: ");
        ls.printList();
    }
}

