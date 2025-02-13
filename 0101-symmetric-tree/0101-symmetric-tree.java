// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // If the tree is empty, it's symmetric
        if (root == null) {
            return true;
        }
        // Start the recursion to check symmetry between left and right subtrees
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both nodes are null, they are symmetric (base case)
        if (t1 == null && t2 == null) {
            return true;
        }
        
        // If one of the nodes is null and the other is not, they are not symmetric
        if (t1 == null || t2 == null) {
            return false;
        }
        
        // Check if the current nodes' values are the same, and recurse for their children
        return (t1.val == t2.val) &&
               isMirror(t1.left, t2.right) &&  // left child of t1 and right child of t2
               isMirror(t1.right, t2.left);    // right child of t1 and left child of t2
    }
}
