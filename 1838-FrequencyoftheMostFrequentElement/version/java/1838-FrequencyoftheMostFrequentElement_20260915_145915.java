// Last updated: 9/15/2026, 2:59:15 PM
1import java.util.*;
2
3class Solution {
4    public int maxFrequency(int[] nums, int k) {
5
6        Arrays.sort(nums);
7
8        int left = 0;
9        long sum = 0;
10        int max = 1;
11
12        for (int right = 0; right < nums.length; right++) {
13
14            sum += nums[right];
15
16            while ((long) nums[right] * (right - left + 1) - sum > k) {
17                sum -= nums[left];
18                left++;
19            }
20
21            max = Math.max(max, right - left + 1);
22        }
23
24        return max;
25    }
26}