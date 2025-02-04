public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Last index of the valid elements in nums1
        int j = n - 1;  // Last index of the valid elements in nums2
        int k = m + n - 1;  // Last index of nums1 (the total space available)

        // Merge the arrays from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];  // Place the larger element at position k
            } else {
                nums1[k--] = nums2[j--];  // Place the larger element at position k
            }
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to do anything if there are remaining elements in nums1
    }
}