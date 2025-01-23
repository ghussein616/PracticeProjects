public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // No elements in the array
        }
        
        // Pointer i to keep track of where to place the next unique element
        int i = 1;
        
        // Loop through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the previous one
            if (nums[j] != nums[j - 1]) {
                // Place it in the next available position
                nums[i] = nums[j];
                // Move the pointer for the unique elements
                i++;
            }
        }
        
        // Return the number of unique elements
        return i;
    }
}