// Last updated: 9/14/2026, 8:47:49 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] result = new int[]{-1, -1};
4        result[0] = findBound(nums, target, true);
5        if (result[0] != -1) {
6            result[1] = findBound(nums, target, false);
7        }
8        
9        return result;
10    }
11
12    private int findBound(int[] nums, int target, boolean isFirst) {
13        int left = 0;
14        int right = nums.length - 1;
15        int bound = -1;
16
17        while (left <= right) {
18            int mid = left + (right - left) / 2;
19
20            if (nums[mid] == target) {
21                bound = mid;
22                if (isFirst) {
23                    right = mid - 1; 
24                } else {
25                    left = mid + 1;  
26                }
27            } else if (nums[mid] < target) {
28                left = mid + 1;
29            } else {
30                right = mid - 1;
31            }
32        }
33
34        return bound;
35    }
36}