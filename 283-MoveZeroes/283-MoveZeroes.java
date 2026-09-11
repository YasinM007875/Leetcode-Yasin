// Last updated: 9/11/2026, 9:34:38 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }
}