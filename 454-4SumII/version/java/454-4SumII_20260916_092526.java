// Last updated: 9/16/2026, 9:25:26 AM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
4
5        for (int i = 0; i < nums1.length; i++) {
6            for (int j = 0; j < nums2.length; j++) {
7                int sum = nums1[i] + nums2[j];
8                map.put(sum, map.getOrDefault(sum, 0) + 1);
9            }
10        }
11
12        int ans = 0;
13
14        for (int i = 0; i < nums3.length; i++) {
15            for (int j = 0; j < nums4.length; j++) {
16                int sum = nums3[i] + nums4[j];
17
18                if (map.containsKey(-sum)) {
19                    ans += map.get(-sum);
20                }
21            }
22        }
23
24        return ans;
25    }
26}