public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or has only one node, return it as is
        if (head == null) {
            return head;
        }
        
        ListNode current = head;
        
        // Traverse the list
        while (current != null && current.next != null) {
            // If the current node's value is the same as the next node's value
            if (current.val == current.next.val) {
                // Skip the next node by pointing to the node after it
                current.next = current.next.next;
            } else {
                // Otherwise, just move to the next node
                current = current.next;
            }
        }
        
        return head;
    }
}
