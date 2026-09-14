// Last updated: 9/14/2026, 8:50:36 PM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3
4        int low = 0;
5        int high = 0;
6
7        for (int w : weights) {
8            low = Math.max(low, w);
9            high += w;
10        }
11
12        while (low < high) {
13
14            int mid = low + (high - low) / 2;
15
16            int countDays = 1;
17            int currentWeight = 0;
18
19            for (int w : weights) {
20
21                if (currentWeight + w > mid) {
22                    countDays++;
23                    currentWeight = 0;
24                }
25
26                currentWeight += w;
27            }
28
29            if (countDays <= days) {
30                high = mid;
31            } else {
32                low = mid + 1;
33            }
34        }
35
36        return low;
37    }
38}