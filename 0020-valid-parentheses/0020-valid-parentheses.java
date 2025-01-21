import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } 
            // If the character is a closing bracket, check if it matches the top of the stack
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // If the stack is empty, return false (no matching opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack and check if it matches the current closing bracket
                char topChar = stack.pop();
                if ((currentChar == ')' && topChar != '(') ||
                    (currentChar == '}' && topChar != '{') ||
                    (currentChar == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets have been matched, so return true.
        // If there are unmatched opening brackets, return false.
        return stack.isEmpty();
    }
}