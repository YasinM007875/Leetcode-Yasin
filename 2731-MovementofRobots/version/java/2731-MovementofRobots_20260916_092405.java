// Last updated: 9/16/2026, 9:24:05 AM
1class Solution {
2    public int sumDistance(int[] nums, String s, int d) {
3        int n = nums.length;
4        long[] pos = new long[n];
5
6        for (int i = 0; i < n; i++) {
7            if (s.charAt(i) == 'R') {
8                pos[i] = (long) nums[i] + d;
9            } else {
10                pos[i] = (long) nums[i] - d;
11            }
12        }
13
14        java.util.Arrays.sort(pos);
15
16        long ans = 0;
17        long sum = 0;
18        long mod = 1000000007;
19
20        for (int i = 0; i < n; i++) {
21            ans = (ans + pos[i] * i - sum) % mod;
22            sum += pos[i];
23            sum %= mod;
24        }
25
26        return (int) ans;
27    }
28}