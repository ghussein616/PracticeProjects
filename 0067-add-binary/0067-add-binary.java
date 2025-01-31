public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;  // pointer for string a
        int j = b.length() - 1;  // pointer for string b
        int carry = 0;  // to hold the carry value during addition
        
        // Iterate while there's still a digit in either string or a carry to add
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;  // Start with the carry from the previous operation
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Convert char to int and add to sum
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';  // Convert char to int and add to sum
                j--;
            }
            
            result.append(sum % 2);  // Append the current bit (sum modulo 2)
            carry = sum / 2;  // Update the carry for the next iteration
        }
        
        // Since the result is built backwards, reverse it before returning
        return result.reverse().toString();
    }
}