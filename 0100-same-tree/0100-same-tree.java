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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case 1: If both trees are empty, they are the same
        if (p == null && q == null) {
            return true;
        }
        
        // Base case 2: If one tree is empty and the other is not, they are not the same
        if (p == null || q == null) {
            return false;
        }
        
        // If the values of the current nodes are different, the trees are not the same
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
