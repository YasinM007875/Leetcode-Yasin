// Last updated: 9/11/2026, 9:28:14 AM
import java.util.Arrays;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = nums.length - 1; i >= 2; i--) {
            if (sum - nums[i] > nums[i]) {
                return sum;
            }
            sum -= nums[i];
        }

        return -1;
    }
}