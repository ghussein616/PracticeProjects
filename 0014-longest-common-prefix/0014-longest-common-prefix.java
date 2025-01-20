public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the whole first string is the common prefix
        String prefix = strs[0];
        
        // Compare this prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix by checking the common part with each string
            while (strs[i].indexOf(prefix) != 0) {
                // If the current prefix is not a prefix of the current string, reduce it
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}