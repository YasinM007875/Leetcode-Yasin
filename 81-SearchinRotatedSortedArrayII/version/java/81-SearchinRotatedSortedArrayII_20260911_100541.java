// Last updated: 9/11/2026, 10:05:41 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return true;
11            }
12            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
13                left++;
14                right--;
15            } 
16            else if (nums[left] <= nums[mid]) {
17                if (target >= nums[left] && target < nums[mid]) {
18                    right = mid - 1;
19                } else {
20                    left = mid + 1;
21                }
22            } 
23            else {
24                if (target > nums[mid] && target <= nums[right]) {
25                    left = mid + 1;
26                } else {
27                    right = mid - 1;
28                }
29            }
30        }
31
32        return false;
33    }
34}