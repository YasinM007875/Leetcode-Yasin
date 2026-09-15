// Last updated: 9/15/2026, 2:56:43 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3
4        int left = 0;
5        int zeros = 0;
6        int max = 0;
7
8        for (int right = 0; right < nums.length; right++) {
9
10            if (nums[right] == 0) {
11                zeros++;
12            }
13
14            while (zeros > k) {
15
16                if (nums[left] == 0) {
17                    zeros--;
18                }
19
20                left++;
21            }
22
23            max = Math.max(max, right - left + 1);
24        }
25
26        return max;
27    }
28}