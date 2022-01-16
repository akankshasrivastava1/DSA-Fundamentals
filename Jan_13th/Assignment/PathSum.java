package Jan_13th.Assignment;
//https://leetcode.com/problems/path-sum/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false; 
        int expect=sum-root.val; 
        if(expect==0 && root.left==null && root.right==null) return true; 
        boolean left=hasPathSum(root.left, expect);
        boolean right=hasPathSum(root.right, expect);
        return left || right; 
    }
}