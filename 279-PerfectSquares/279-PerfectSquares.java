// Last updated: 9/11/2026, 9:34:41 AM

        class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        java.util.Arrays.fill(dp, n);
        dp[0] = 0;
        
        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Try every square j*j that is less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        return dp[n];
    }
}
        
    
