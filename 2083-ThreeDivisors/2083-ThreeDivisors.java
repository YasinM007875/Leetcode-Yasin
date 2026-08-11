// Last updated: 8/11/2026, 2:16:37 PM
class Solution {
    public boolean isThree(int n) {
       int count = 0;
        
        // Iterate from 1 to n to count divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            
            // Optimization: if count exceeds 3, we can stop early
            if (count > 3) return false;
        }
        
        // Return true only if count is exactly 3
        return count == 3; 
    }
}