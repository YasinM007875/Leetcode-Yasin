// Last updated: 9/16/2026, 10:02:40 AM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int left = 0;
4        int right = 0;
5
6        for (int num : nums) {
7            left = Math.max(left, num);
8            right += num;
9        }
10
11        while (left < right) {
12            int mid = left + (right - left) / 2;
13
14            int sum = 0;
15            int parts = 1;
16
17            for (int num : nums) {
18                if (sum + num > mid) {
19                    parts++;
20                    sum = num;
21                } else {
22                    sum += num;
23                }
24            }
25
26            if (parts <= k) {
27                right = mid;
28            } else {
29                left = mid + 1;
30            }
31        }
32
33        return left;
34    }
35}