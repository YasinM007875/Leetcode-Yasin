// Last updated: 9/11/2026, 9:34:43 AM
class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int ans=n*(n+1)/2;
        return ans-sum;
    }
}