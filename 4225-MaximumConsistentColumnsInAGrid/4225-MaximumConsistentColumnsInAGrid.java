// Last updated: 8/11/2026, 2:14:47 PM
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        int ans = 1;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                boolean ok = true;
                for(int r=0;r<m;r++){
                    if(Math.abs(grid[r][i]-grid[r][j])>limit) {
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}