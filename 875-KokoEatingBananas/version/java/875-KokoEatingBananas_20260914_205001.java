// Last updated: 9/14/2026, 8:50:01 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3
4        int low = 1;
5        int high = 0;
6
7        for (int pile : piles) {
8            high = Math.max(high, pile);
9        }
10
11        while (low < high) {
12
13            int mid = low + (high - low) / 2;
14            long hours = 0;
15
16            for (int pile : piles) {
17                hours += (pile + mid - 1) / mid;
18            }
19
20            if (hours <= h) {
21                high = mid;
22            } else {
23                low = mid + 1;
24            }
25        }
26
27        return low;
28    }
29}