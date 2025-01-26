public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Pointer to track where to place the next valid element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; // Place the valid element at the current position
                index++; // Increment the position for the next valid element
            }
        }
        
        return index; // The length of the array after removal
    }
}