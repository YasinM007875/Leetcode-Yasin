// Last updated: 9/14/2026, 8:52:23 PM
1class Solution {
2    public int maxArea(int[] height) {
3
4        int left = 0;
5        int right = height.length - 1;
6        int max = 0;
7
8        while (left < right) {
9
10            int width = right - left;
11            int h = Math.min(height[left], height[right]);
12
13            int area = width * h;
14
15            max = Math.max(max, area);
16
17            if (height[left] < height[right]) {
18                left++;
19            } else {
20                right--;
21            }
22        }
23
24        return max;
25    }
26}