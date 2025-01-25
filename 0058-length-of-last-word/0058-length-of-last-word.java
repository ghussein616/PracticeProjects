public class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();
        
        // Find the index of the last space after trimming
        int lastSpaceIndex = s.lastIndexOf(" ");
        
        // If there is no space, the entire string is the last word
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        
        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}