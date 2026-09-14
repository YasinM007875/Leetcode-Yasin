// Last updated: 9/14/2026, 8:57:45 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int k = 2;
5
6        for (int i = 2; i < nums.length; i++) {
7
8            if (nums[i] != nums[k - 2]) {
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13
14        return k;
15    }
16}