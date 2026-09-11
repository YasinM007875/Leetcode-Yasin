// Last updated: 9/11/2026, 9:32:33 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int[] ans = new int[2];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                ans[0] = i;
            } else if (freq[i] == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
}