import java.util.*;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        // Start the iterative inorder traversal
        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Pop the node from the stack and add to the result
            current = stack.pop();
            result.add(current.val);
            
            // Now visit the right subtree
            current = current.right;
        }
        
        return result;
    }
}