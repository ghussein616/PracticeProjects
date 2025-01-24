public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // If the digit is less than 9, just increment it and return the result
                return digits;
            }
            digits[i] = 0;  // Set the current digit to 0 if it was 9 (carry over)
        }
        
        // If we finished the loop, it means all digits were 9 and we have a carry over.
        // So, we need to add a new leading 1 at the beginning of the array.
        int[] result = new int[n + 1];
        result[0] = 1;  // Set the first digit to 1
        return result;
    }
}