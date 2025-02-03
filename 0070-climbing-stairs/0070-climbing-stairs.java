public class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        
        int prev1 = 1;  // Number of ways to reach step 1
        int prev2 = 2;  // Number of ways to reach step 2
        
        // Calculate ways for steps 3 to n
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;  // Move prev2 to prev1
            prev2 = current;  // Update prev2 to current
        }
        
        return prev2;  // prev2 will store the number of ways to reach step n
    }
}