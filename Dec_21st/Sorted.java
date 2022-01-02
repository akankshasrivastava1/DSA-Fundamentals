package Dec_21st;

public class Sorted {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }
    
    private static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    private static Node SortedArray(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
   
        Node root = new Node(arr[mid]);
        // elements to the left of mid forms the left subtree
        root.left = SortedArray(arr, start, mid - 1);
        // elements to the right of mid forms the right subtree
        root.right = SortedArray(arr, mid + 1, end);
        // return root
        return root;
    }
    public static void main(String[] args) {
        // Example 1
        int arr1[] = new int[] {1, 2, 3, 4, 5};
        Node root1 = SortedArray(arr1, 0, arr1.length - 1);
        preorder(root1);
        System.out.println();
        // Example 2
        int arr2[] = new int[] {7, 11, 13, 20, 22, 41};
        Node root2 = SortedArray(arr2, 0,arr2.length - 1);
        preorder(root2);
        System.out.println();
    }
}
