import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // If the complement is found in the HashMap, return the indices
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            numMap.put(nums[i], i);
        }
        
        // If no solution is found (though the problem guarantees there is one), return an empty array
        return new int[] {};
    }
}
