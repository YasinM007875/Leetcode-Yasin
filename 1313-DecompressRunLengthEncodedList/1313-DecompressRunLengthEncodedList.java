// Last updated: 9/11/2026, 9:30:56 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq > 0) {
                ans[index] = val;
                index++;
                freq--;
            }
        }

        return ans;
    }
}