package Jan_12th.Assignment;
//Sum all the nodes values and print the final sum on the screen

public class SumOfNode {
    static int sum=0;
    static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key=key;
            left=right=null;
        }
    }
    public static int SumofNode(Node root) {
        if(root==null) 
            return  0;
          System.out.print(root.key+" ");
           sum=sum+root.key;
           SumofNode(root.left);
           SumofNode(root.right);
           return sum;
      }
  
      public static void main(String[] args) {
          Node root=new Node(1);
          root.left=new Node(2);
          root.right=new Node(3);
          root.left.left=new Node(4);
          root.left.right=new Node(5);
          root.right.right=new Node(6);
     System.out.println("\nsum of Node: "+SumofNode(root));
  
    }
}
