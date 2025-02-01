public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int low = 1, high = x;
        int result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (mid == x / mid) {  // Perfect square, return mid
                return mid;
            } else if (mid < x / mid) {  // mid * mid < x, so move the low bound
                low = mid + 1;
                result = mid;  // Save mid as the best candidate for sqrt
            } else {  // mid * mid > x, so move the high bound
                high = mid - 1;
            }
        }
        
        return result;  // Return the largest integer whose square is <= x
    }
}
