package Jan_12th.Assignment;
//Get the count of nodes in a Binary tree.

public class CountNodes {
    static class node {
 
        int data;
        node left;
        node right;
    };
   
    static int left_height(node node)
    {
        int ht = 0;
        while (node!=null) {
            ht++;
            node = node.left;
        }
        return ht;
    }
    static int right_height(node node)
    {
        int ht = 0;
        while (node!=null) {
            ht++;
            node = node.right;
        }
        return ht;
    }
    static int TotalNodes(node root)
    {
  
        if (root == null)
            return 0;
     
        int lh = left_height(root);
        int rh = right_height(root);
     
        if (lh == rh)
            return (1 << lh) - 1;
     
        return 1 + TotalNodes(root.left)
               + TotalNodes(root.right);
    }
     
    static node newNode(int data)
    {
        node Node = new node();
        Node.data = data;
        Node.left = null;
        Node.right = null;
        return (Node);
    }

    public static void main(String[] args)
    {
        node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(9);
        root.right.right = newNode(8);
        root.left.left.left = newNode(6);
        root.left.left.right = newNode(7);
     
        System.out.print(TotalNodes(root));
     
    }
}
