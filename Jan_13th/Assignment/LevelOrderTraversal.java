package Jan_13th.Assignment;
//Level order traversal  in both (Recursive + Iterative)
import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
    public void iterativelevelOrderTraversal(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                root = queue.remove();
                Node lc = root.leftChild;
                Node rc = root.rightChild;
                if (lc != null) {
                    queue.add(lc);
                }
                if (rc != null) {
                    queue.add(rc);
                }
                System.out.print(root.data + " ");
            }
        }
    }

 public static void main(String[] args) {
     LevelOrderTraversal lo = new LevelOrderTraversal();
     Node root = lo.new BinaryTree().createTree();
     System.out.print("Level order traversal is : ");
     lo.iterativelevelOrderTraversal(root);
 }
 
 class BinaryTree {
     Node root;

  public BinaryTree() {
      root = null;
  }
  public Node createTree() {
      if (root == null) {
          root = new Node(12);
      }

      root.setLeftChild(new Node(23));
      root.setRightChild(new Node(18));
      root.getLeftChild().setLeftChild(new Node(11));
      root.getLeftChild().setRightChild(new Node(43));
      root.getRightChild().setRightChild(new Node(27));
      root.getRightChild().setLeftChild(new Node(12));
      root.getLeftChild().getLeftChild().setLeftChild(new Node(56));
      root.getLeftChild().getLeftChild().setRightChild(new Node(78));
      root.getRightChild().getLeftChild().setRightChild(new Node(98));
      root.getRightChild().getLeftChild().setLeftChild(new Node(32));
      return root;
    }
}
class Node {

    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public Node getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
} 

