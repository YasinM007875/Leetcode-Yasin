// Last updated: 9/11/2026, 9:27:42 AM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int ans  = Integer.MIN_VALUE;
        int max = nums[0];
        for(int j = k; j<n;j++){
            max = Math.max(max,nums[j-k]);
            ans = Math.max(ans,max+nums[j]);
        }
        return ans;
    }
}