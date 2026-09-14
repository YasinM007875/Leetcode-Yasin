// Last updated: 9/14/2026, 8:50:59 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3
4        int low = 0;
5        int high = nums.length - 1;
6
7        while (low < high) {
8
9            int mid = low + (high - low) / 2;
10
11            if (mid % 2 == 1) {
12                mid--;
13            }
14
15            if (nums[mid] == nums[mid + 1]) {
16                low = mid + 2;
17            } else {
18                high = mid;
19            }
20        }
21
22        return nums[low];
23    }
24}