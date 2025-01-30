public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] < target) {
                left = mid + 1;  // Search the right half
            } else {
                right = mid - 1;  // Search the left half
            }
        }

        return left;  // If target is not found, 'left' will be the correct insert position
    }
}